package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

// A singly linked list is a type of linked list that is unidirectional, that is, it can be traversed in only one direction from head to the last node (tail).
// Each element in a linked list is called a node.A single node contains data and a pointer to the next node which helps in maintaining the structure of the list.
// The first node is called the head;it points to the first node of the list and helps us access every other element in the list.
// The last node,also sometimes called the tail,points to NULL which helps us in determining when the list ends.
public class SingleLinkedList {
    private ListNode head;// first elemente of my SingleLinkedList

    private static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void displaySingleLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int lengthOfSingleLinkedList() {
        if (head == null)
            return 0;
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertInTheBeginOfTheSingleLinkedList(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertInTheEndOfTheSingleLinkedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertInTheGivenPositionInTheSingleLinkedList(int data, int position) {
        ListNode newNode = new ListNode(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int count = 1;
        ListNode previous = head;
        while (count < position - 1) {
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        newNode.next = current;
        previous.next = newNode;

    }

    public ListNode deleteFirstNode() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLastNode() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null; // break the chain
        return current;
    }

    public void deleteNodeInTheGivenPositionInTheSingleLinkedList(int position) {
        if (position == 1) {
            head = head.next;
            return;
        }
        ListNode previous = head;
        int count = 1;
        while (count < position - 1) {
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
    }

    public boolean isThisDataInTheSingleLinkedList(int searchKey) {
        if (head == null) {
            return false;
        }

        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverseSingleLinkedList() {
        if (head == null)
            return head;
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public ListNode getNthNodeFromTheEndOfTheSingleLinkedList(int NthNode) {
        if (head == null)
            return head;
        if (NthNode <= 0 || NthNode > lengthOfSingleLinkedList())
            throw new IllegalArgumentException("Invalid value from node position. n = " + NthNode);
        ListNode mainPointer = head;
        ListNode referencePointer = head;
        int count = 0;
        while (count < NthNode) {
            referencePointer = referencePointer.next;
            count++;
        }

        while (referencePointer != null) {
            referencePointer = referencePointer.next;
            mainPointer = mainPointer.next;
        }
        return mainPointer; // return the Nth node from the end of the SingleLinkedList
    }

    public void removeDuplicatesFromSortedSingleLinkedList() {
        if (head == null) {
            System.out.println("This SingleLinkedList don't has nodes whatsoever");
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void insertNodeIntheSortedSingleLinkedList(int value) {
        if (head == null) {
            System.out.println("This SingleLinkedList don't has nodes whatsoever");
            return;
        }
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data < newNode.data) {
            previous = current;
            current = current.next;
        }
        newNode.next = current;
        previous.next = newNode;
    }

    public void removeKeyFromSingleLinkedList(int key) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        previous.next = current.next;
    }

    public void createALoopInTheSingleLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public boolean isThereALoopInTheSingleLinkedList() {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
        // createALoopInTheSingleLinkedList();
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // |______________|
    }

    public ListNode getStartingNodeFromALoop() {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                ListNode temp = head;
                while (temp != slowPointer) {
                    temp = temp.next;
                    slowPointer = slowPointer.next;
                }
                return temp; // starting node of the loop
            }
        }
        return null;
    }

    public void removeLoopFromSingleLinkedList() {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                ListNode temp = head;
                while (temp.next != slowPointer.next) {
                    temp = temp.next;
                    slowPointer = slowPointer.next;
                }
                slowPointer.next = null;
                return;
            }
        }
    }

    public static ListNode mergeTwoSortedSingleLinkedList(ListNode a, ListNode b) {
        // a is the first SingleLinkedList(Sorted)
        // b is the second SingleLinkedList(Sorted)
        // aux is a variable for holding the reference for the new sorted
        // SingleLinkedList
        // tail is a variable which holds the next elements (sorted elements), and
        // harbor the final of the SingleLinkedList
        ListNode aux = new ListNode(0);
        ListNode tail = aux;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return aux.next;
    }

    public static ListNode sumTwoSingleLinkedList(ListNode a, ListNode b) {
        // carry is a variable for hold the rest of the sum, because one node can hold
        // only numbers with one digit
        ListNode aux = new ListNode(0);
        ListNode tail = aux;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            a = (a != null) ? a.next : null;
            b = (b != null) ? b.next : null;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return aux.next;
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

    }

}
