package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

import java.util.NoSuchElementException;

// Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence.
// Therefore, in a doubly linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer) ,
// pointer to the previous node (previous pointer). In a singly linked list, we could traverse only in one direction,
// because each node contains address of the next node and it doesn't have any record of its previous nodes. However, 
// doubly linked list overcome this limitation of singly linked list. 
// Due to the fact that, each node of the list contains the address of its previous node,
// we can find all the details about the previous node as well by using the previous address stored inside the previous part of each node.
public class DoublyLinkedList {// Outer Class DoublyLinkedList

    private static class ListNode {// innerClass ListNode
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public ListNode removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("This DoublyLinkedList is Empty");
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("This DoublyLinkedList is Empty");
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public void DisplayForwardDirection() {
        if (head == null)
            return;
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void DisplayBackwardDirection() {
        if (tail == null)
            return;
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.removeFirst();
        dll.removeLast();
        dll.DisplayForwardDirection();
    }
}
