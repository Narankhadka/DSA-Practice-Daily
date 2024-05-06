import java.util.LinkedList;

public class FrameworksInLL { //JFC
  public static void main(String[] args) {
    // create - objects int , floaat , boolean -> Interger ,FLoat, Booelan
      LinkedList <Integer> ll=new LinkedList<>();

      //add
      ll.addFirst(1);
      ll.addLast(2);
      ll.addFirst(0);
      // 0->1->2
      System.out.println(ll);
      ll.removeLast();
      ll.removeFirst();
      System.out.println(ll);

  }
}
