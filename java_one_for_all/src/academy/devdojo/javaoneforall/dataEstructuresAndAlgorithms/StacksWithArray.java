package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

import java.util.Stack;

public class StacksWithArray {

    private int top;
    private int[] arr;

    public StacksWithArray(int capacity) {
        this.top = -1;
        this.arr = new int[capacity];

    }

    public StacksWithArray() {
        this(10);
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isFull() {
        return this.arr.length == size();
    }

    public boolean isEmpty() {
        return this.top < 0;
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("Stack is Full!!!");
        }
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return this.arr[top];
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String nome = "Leonardo";
        System.out.println(reverseString(nome));
    }
}
