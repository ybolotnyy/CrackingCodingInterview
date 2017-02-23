package main.java.edu.byn.linkedLists;

/**
 * Created by ybolotnyy on 2/22/17.
 */
public class RemoveDupes {
  public static void main(String[] args) {
    LinkedList list = new LinkedList(20, 5);
    list.printLinkedList();
    list.removeDupes();
    list.printLinkedList();
  }
}
