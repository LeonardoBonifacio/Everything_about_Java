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

    public int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public boolean isValidParenthesis(String string) {
        // given a string only with brackets, determine if the input string is valid
        // an input string is valid if
        // - Open brackets must be closed by same type of brackets
        // - Open brackets must be closed in correct order
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (top == '(' && c == ')' || top == '{' && c == '}' || top == '[' && c == ']') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String nome = "Leonardo";
        System.out.println(reverseString(nome));
    }
}
