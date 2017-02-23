package main.java.edu.byn.linkedLists;

import java.util.Hashtable;

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

  public LinkedList(int nodesCount, int offset) {
    first = null;
    for (int i = 0; i < nodesCount; i++) {
      insertFirst(i % offset); // modulus produces dupes
    }
  }

  public Node getFirstNode() {
    return first;
  }

  public int getData(Node n) {
    return n.data;
  }

  public void insertFirst(int val) {
    Node newNode = new Node(val);
    newNode.next = first;
    first = newNode;
  }

  public void printLinkedList() {
    Node currentNode = first;
    System.out.println("\nLinkedList from first to last");
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

  public void removeDupes() {
    Node previous = null;
    Node current = first;
    Hashtable hashtable = new Hashtable();
    while (current != null) {
      if (hashtable.containsKey(current.data)) {
        previous.next = current.next;
      } else {
        hashtable.put(current.data, true);
        previous = current;
      }
      current = current.next;
    }
  }
}

