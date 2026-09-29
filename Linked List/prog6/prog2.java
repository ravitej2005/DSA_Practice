import linkedlist.*;
class prog2 {
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
    LinkedListUtil ls = new LinkedListUtil();
    Node first = ls.createLinkedList(new int[]{1,2,4,6,8,1,10,3});
    first = reverseNode(first);
    ls.printLinkedList(first);
  }
}