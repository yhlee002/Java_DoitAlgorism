package chap10_tree;

// 모든 노드를 키 값의 내림차순으로 정렬하는 출력하는 메서드 작성
public class p392_Q_1 {
  // Node 클래스 내부에 있는 함수라고 가정하기 위해 기본적인 member만 가짐
  private class Node<K, V> {
    private K key;
    private V value;

    private Node<K, V> left;
    private Node<K, V> right;
    private Node<K, V> root;
  }
  private void printReverse(Node node) {
    if (node != null) {
      printReverse(node.right);
      System.out.println(node.right.key + " " + node.key + " " + node.left.key + " ");
      printReverse(node.left);
    }
  }
}
