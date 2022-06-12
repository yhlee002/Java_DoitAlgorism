package chap10_tree;

import java.util.Comparator;

/*
  p378 Ex10-1[A]
  p379 Ex10-1[B]
  p380 Ex10-1[C]
  p383 Ex10-1[D]
  p385 Ex10-1[E]
  p389 Ex10-1[F]
  p391 Ex10-1[G]
 */

public class p378_Ex10_1 {

  private static class Node<K, V> {
    private K key;
    private V value;
    private Node<K, V> left;
    private Node<K, V> right;

    private Node<K, V> root;
    private Comparator<? super K> comparator = null;

    Node(K key, V value, Node<K, V> left, Node<K, V> right) {
      this.key = key;
      this.value = value;
      this.left = left;
      this.right = right;
    }

    public Node() {
      root = null;
    }

    public Node(Comparator<? super K> comparator) {
      this.comparator = comparator;
    }

    public int comp(K key1, K key2) {
      return comparator == null ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public V search(K key) {
      Node<K, V> p = root;

      while (true) {
        if (p == null) {
          return null;
        }
        int cond = comp(key, p.getKey());
        if (cond > 0) { // key > p.getKey()
          p = p.left;
        } else if (cond < 0) { // key < p.getKey()
          p = p.right;
        } else { // key == p.getKey()
          return p.getValue();
        }
      }
    }

    public boolean addNode(Node<K, V> root, Node<K, V> node) {
      Node<K, V> p = root;

      int cond = comp(node.getKey(), p.getKey());
      if (cond == 0) { // key가 동일할 시 생성 불가
        return false;
      } else if (cond > 0) {
        if (p.right == null) {
          p.right = node;
        } else {
          addNode(p.right, node);
        }
      } else { // cond < 0
        if (p.left == null) {
          p.left = node;
        } else {
          addNode(p.left, node);
        }
      }
      return true;
    }

    public void add(K key, V value) {
      if (root == null) {
        this.root = new Node<>(key, value, null, null);
      } else {
        addNode(root, new Node<>(key, value, null, null));
      }
    }

    public boolean remove(K key) {
      Node<K, V> p = root;
      Node<K, V> parent = null;
      boolean isLeftNode = false;

      if (p == null) return false;

      while (true) {
        int cond = comp(key, p.getKey());
        if (cond == 0) { // 일치 시
          break;
        } else if (cond < 0) {
          isLeftNode = true;
          parent = p;
          p = p.left;
        } else {
          isLeftNode = false;
          parent = p;
          p = p.right;
        }
      }

      // p 제거
      if (p.left == null) {
        if (p == root) {
          root = p.right;
        } else if (isLeftNode) {
          parent.left = p.right;
        } else {
          parent.right = p.right;
        }
      } else if (p.right == null) {
        if (p == root) {
          root = p.left;
        } else if (isLeftNode) {
          parent.left = p.left;
        } else {
          parent.right = p.left;
        }
      } else { // 좌측 서브트리(p.left를 root node로 삼는 트리)에서 가장 큰 수(항상 right node)
        parent = p;
        Node<K, V> left = p.left;
        isLeftNode = true;
        while (left.right != null) {
          parent = left;
          left = left.right;
          isLeftNode = false;
        }

        p.key = left.getKey();
        p.value = left.getValue();
        if (isLeftNode) { // 이동되는 노드 제거(left.right == null이라는 전제)
          parent.left = left.left;
        } else {
          parent.right = left.left;
        }
      }
      return true;
    }

    public void printSubTree(Node node) {
      if (node != null) {
        printSubTree(node.left);
        System.out.println(node.key + " " + node.value);
        printSubTree(node.right);
      }
    }

    public void print() {
      printSubTree(root);
    }

  }

}
