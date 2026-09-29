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

    Node head = new Node(arr[0], null);
    Node current = head;

    for (int i = 1; i < arr.length; i++) {
      Node next = new Node(arr[i], null);
      current.next = next;
      current = next;
    }
    return head;
  }

  static void printLinkedList(Node first) {
    Node current = first;
    while (current != null){
      System.out.println(current.data);
      current = current.next;
    }
      System.out.println();
  }

  static Node reverseNode(Node head){
    if (head.next==null) {
        return head;
    }
    Node current = head;
    Node temp1 = head.next;
    Node temp2 = temp1.next;
    while (temp1!=null) {
        temp1.next = current;
        current = temp1;
        temp1 = temp2;
        temp2 = temp2 != null ? temp2.next : null;
    }
    head.next = null;
    head=current;
    return head;
  }

  public static void main(String[] args) {
    Node first = createLinkedList(new int[]{1,2,4,6,8,1,10,3});
    first = reverseNode(first);
    printLinkedList(first);
  }
}