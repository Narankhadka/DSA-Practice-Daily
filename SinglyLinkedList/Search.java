package SinglyLinkedList;

public class Search {

  public class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public  Node head;
  public  Node tail;
  public static int size;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    // next = head
    newNode.next = head;
    head = newNode;
  }

  public void print() {
      if (head==null) {
          System.out.println("LL is empty");
          return;
        }
     Node temp = head;
    while (temp != null) {
      System.out.print(temp.data +" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public int itrSearch(int key)
  {
    Node temp=head;
    int i=0;
    while (temp!=null) {
    
        if (temp.data==key) { //found
            return i;
        }
        temp=temp.next;
        i++;
        
    }
    return -1; // Not found
  }

  public static void main(String[] args) {
    Search llSearch=new Search();
    llSearch.addFirst(12);
    llSearch.addFirst(2);
    llSearch.addFirst(23);
    llSearch.print();
    
   int idx= llSearch.itrSearch(2);
   System.out.println(idx);
  }
}
