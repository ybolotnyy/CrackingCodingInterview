package main.java.edu.byn.utils;

/**
 * Created by ybolotnyy on 2/22/17.
 */
public class LinkedList {
  public Node first;

  public LinkedList(){
    first = null;
  }

  public LinkedList(int nodesCount) {
    first = null;
    for (int i = 0; i < nodesCount; i++) {
      insertFirst(i);
    }
  }

  public void insertFirst(int val) {
    Node newNode = new Node(val);
    newNode.next = first;
    first = newNode;
  }

  public void printLinkedList() {
    Node currentNode = first;
    System.out.println("LinkedList from first to last");
    while (currentNode != null) {
      System.out.printf("-> %d ", currentNode.data);
      currentNode = currentNode.next;
    }
  }

  public class Node {
    int data;
    Node next;

    private Node(int val) {
      data = val;
    }
  }

}

