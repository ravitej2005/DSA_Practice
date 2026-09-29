//Adding nodes in Linked list

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

class prog3 {
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

  static Node addNodeAtStart(Node first){
    Node temp = new Node(0, first);
    return temp;
  }

  static void addNodeAtIndex(Node first, int index){
    //Adding node at index(argument)
    Node current = first;
    Node newNode = new Node(10, null);
    int i = 0;
    while (i<2) {
      current = current.next;
      i++;
    }
    Node temp = current.next;
    current.next = null;
    newNode.next = temp;
    current.next = newNode;
  }

  static void addNodeAtEnd(Node first){
    Node current = first;
    while (current.next!=null) {
      current = current.next;
    }
    Node newNode = new Node(20, null);
    current.next = newNode;
  }

  // static void printLinkedList(Node first) {
  //   Node current = first;
  //   while (current != null){
  //     System.out.println(current.data);
  //     current = current.next;
  //   }
      // System.out.println();
  // }


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

    first = addNodeAtStart(first);
    printLinkedList(first);

    addNodeAtIndex(first, 3);
    printLinkedList(first);

    addNodeAtEnd(first);
    printLinkedList(first);
  }
}