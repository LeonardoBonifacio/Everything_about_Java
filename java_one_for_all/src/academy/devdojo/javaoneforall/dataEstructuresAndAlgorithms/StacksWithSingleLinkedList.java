package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

import java.util.EmptyStackException;


// Stack is a linear data structure that follows a particular order in which the operations are performed.
// The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO implies that the element that is inserted last, 
// comes out first and FILO implies that the element that is inserted first, comes out last.

public class StacksWithSingleLinkedList {// outer class

    private class ListNode {// Inner Class
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

    }

    private ListNode top;
    private int length;

    public StacksWithSingleLinkedList() {
        this.top = null;
        this.length = 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;

    }

    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top.data;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public static void main(String[] args) {
        StacksWithSingleLinkedList stack = new StacksWithSingleLinkedList();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
