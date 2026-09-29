//Printing linked list with recursion

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

class prog2 {
  static void createLinkedList(Node first) {
    Node current = first;
    Node next = null;
    int i = 2;
    while (i < 5) {
      next = new Node(i, null);
      current.next = next;
      current = next;
      next = null;
      i++;
    }
  }

  static void printLinkedList(Node current) {
    if(current!=null){
      System.out.println(current.data);
      current = current.next;
      printLinkedList(current);
    } else{
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Node first = new Node(1, null);
    createLinkedList(first);
    printLinkedList(first);
  }
}