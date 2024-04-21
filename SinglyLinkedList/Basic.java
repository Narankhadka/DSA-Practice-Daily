package SinglyLinkedList;

public class Basic {

  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // size will be by defulat 0

  public void addFirst(int data) {
    //step 1 - create a new node
    Node newNode = new Node(data);
    size++;
    // check if it is empty or not
    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step 2 - make new node next = head;
    newNode.next = head;
    // step 3 - make head = newNode
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    // base cased
    if (head == null) {
      head = tail = newNode;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("LinkedList is Empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println();
  }

  public void addMiddle(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    // when i = idx-1
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFisrt() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public void removeLast() {
    if (size == 0) {
      System.out.println("LL is empty");
    } else if (size == 1) {
      head = tail = null;
    }
    Node temp = head;
    int i = 0;
    while (i < size - 2) {
      temp = temp.next;
      i++;
    }
    temp.next = null;
    tail = temp;
  }

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }
    return idx + 1;
  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  public void reverse() {
    Node prNode = null;
    Node curNode = tail = head;
    Node nextNode;
    while (curNode != null) {
      nextNode = curNode.next;
      curNode.next = prNode;
      prNode = curNode;
      curNode = nextNode;
    }
    head = prNode;
  }

  public void deleteNthNodeFromEnd(int n) {
    // calculating size
    int sz = 0;
    Node tempNode = head;
    while (tempNode != null) {
      tempNode = tempNode.next;
      sz++;
    }
    // check if we have to delete the head node n==size because its from reverse
    if (n == sz) {
        head=head.next;
    }
    // other case
    // sz-n
    int  i=1;
    int iToFind=sz-n;
    Node prNode=head;
    while (i<iToFind) {
      prNode=prNode.next;
      i++;
    }
    prNode.next=prNode.next.next;
  }

  public static void main(String[] args) {
    // Method add()
    //  remove ()
    // print ()
    //search
    Basic ll = new Basic();
    // ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    ll.print();
    // ll.removeLast();
    // System.out.println();
    // ll.print();
    // System.out.println();
    // System.out.println(ll.recSearch(2));
    // ll.reverse();
    // ll.print();
    ll.deleteNthNodeFromEnd(2);
    ll.print();

  }
}
