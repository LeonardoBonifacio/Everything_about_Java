package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

import java.util.NoSuchElementException;

// In a circular Singly linked list, the last node of the list contains a pointer to the first node of the list. 
// We can have circular singly linked list as well as circular doubly linked list.
// We traverse a circular singly linked list until we reach the same node where we started. 
// The circular singly liked list has no beginning and no ending. There is no null value present in the next part of any of the nodes.
// Circular linked list are mostly used in task maintenance in operating systems.
// There are many examples where circular linked list are being used in computer science including browser surfing where a record of pages visited
// in the past by the user, is maintained in the form of circular linked lists and can be accessed again on clicking the previous button.
public class CircularSingleLinkedList {

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    private ListNode last;
    private int length;

    public CircularSingleLinkedList() {
        this.last = null;
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void createCircularSingleLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        this.last = fourth;
        length = 4;

    }

    public void displayAllElements() {
        if (last == null)
            return;
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.println(first.data);

    }

    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public int removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("This Circular Single Linked List is Empty");
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        length--;
        return temp.data;
    }

    public static void main(String[] args) {
        CircularSingleLinkedList csll = new CircularSingleLinkedList();
        csll.insertLast(1);
        csll.insertLast(8);
        csll.insertLast(10);
        System.out.println(csll.removeFirst());
        csll.displayAllElements();
        System.out.println(csll.getLength());
    }
}
