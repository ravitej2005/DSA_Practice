//Removing nodes from Linked list

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

class prog4 {
  static void createLinkedList(Node first) {
    Node current = first;
    Node next = null;
    int i = 2;
    while (i < 7) {
      next = new Node(i, null);
      current.next = next;
      current = next;
      next = null;
      i++;
    }
  }

  static Node removeFirst(Node first){
    return first.next;
  }

  static void removeLast(Node first){
    Node temp = first;
    while (temp.next.next!=null) {
      temp = temp.next;
    }
    temp.next = null;
  }

  static void removeAtIndex(Node first, int index){
    Node current = first;
    int i = 1;
    while (i<index) {
      current = current.next;
      i++;
    }
    Node temp = current.next != null ? current.next.next : null;
    current.next = null;
    current.next = temp;
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

    first = removeFirst(first);
    printLinkedList(first);

    removeLast(first);
    printLinkedList(first);
    
    removeAtIndex(first, 2);
    printLinkedList(first);

  }
}