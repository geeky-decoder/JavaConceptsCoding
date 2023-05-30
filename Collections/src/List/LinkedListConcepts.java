package List;

import List.LearnLinkedList.Node;

/*
 * LinkedList is a class which implements List as well as Queue Interface, therefore it has methods of both interfaces 
 * LinkedList consists of Nodes where each node contains data and address of next node(Singly LL)
 * Can be used as List, Stack and Queue
 * Can contains duplicate elements and null entries
 * Dynamic collection as it can grow whenever needed
 * It is unsynchronized (not Thread-Safe)
 */
class LearnLinkedList {
    /*
     * Head Node
     */
    Node headNode;

    /*
     * Node structure of Singly LL
     */
    class Node {
        int data;
        Node nextAddr;

        Node(int data) {
            this.data = data;
            this.nextAddr = null;
        }
    }

    public void printLinkedList() {
        Node tempNode = headNode;
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.nextAddr;
        }
        System.out.println("null");
    }
}

public class LinkedListConcepts {
    public static void main(String[] args) {
        LearnLinkedList linkedList = new LearnLinkedList();
        Node firstNode = linkedList.new Node(10);
        linkedList.headNode = firstNode;
        Node seconNode = linkedList.new Node(20);
        firstNode.nextAddr = seconNode;

        linkedList.printLinkedList();
    }
}
