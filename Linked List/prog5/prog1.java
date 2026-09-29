class Node {
  int data;
  Node next;

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  @Override
  public String toString() {
    return "Data : " + data + "\nAddress of next : " + System.identityHashCode(next);
  }
}

class prog1 {
  static Node createLinkedList(int[] arr) {
    if (arr == null || arr.length == 0) return null;

    Node first = new Node(arr[0], null);
    Node current = first;
    Node next = null;
    for (int i = 1; i < arr.length; i++) {
      next = new Node(arr[i], null);
      current.next = next;
      current = next;
      next = null;
    }
    return first;
  }

  static void printLinkedList(Node first) {
    Node current = first;
    while (current != null){
      System.out.println(current.data);
      current = current.next;
    }
      System.out.println();
  }

  static void findMid(Node head){
    Node current = head;
    Node mid = head;
    int i = 1;
    while (current!=null) {
      if (i%2==0) {
        mid = mid.next;
      }
      i++;
      current = current.next;
    }
    System.out.println(mid.data);
  }

  public static void main(String[] args) {
    Node first = createLinkedList(new int[]{1,2,4,6,8,1,10,3});
    // printLinkedList(first);
    findMid(first);
  }
}