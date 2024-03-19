package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

// A singly linked list is a type of linked list that is unidirectional, that is, it can be traversed in only one direction from head to the last node (tail).
// Each element in a linked list is called a node.A single node contains data and a pointer to the next node which helps in maintaining the structure of the list.
//The first node is called the head;it points to the first node of the list and helps us access every other element in the list.
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

    public void displaySingleLinkedList() {
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

    public void insertInTheGivenPositionOfTheSingleLinkedList(int data, int position) {
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

    public ListNode deleteFirstNode(){
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        // sll.head = new ListNode(10);// alocate 10 to the first space of my
        // SingleLinkedList
        // ListNode second = new ListNode(1); // creating the second node of my
        // SingleLinkedList
        // ListNode third = new ListNode(8); // creating the third node of my
        // SingleLinkedList
        // ListNode fourth = new ListNode(11); // creating the fourth node of my
        // SingleLinkedList

        // // Now we will connect them together to form a chain
        // sll.head.next = second; // 10 -> 1
        // second.next = third; // 10 -> 1 -> 8
        // third.next = fourth; // 10 -> 1 -> 8 -> 11 -> null

        // Inserting elements to the begin of my SingleLikedList
        sll.insertInTheBeginOfTheSingleLinkedList(10);
        sll.insertInTheBeginOfTheSingleLinkedList(8);
        sll.insertInTheBeginOfTheSingleLinkedList(1);

        // Inserting elements to the end of my SingleLinkedList
        sll.insertInTheEndOfTheSingleLinkedList(12);

        // Inserting elements to a given position of my SingleLinkedList
        sll.insertInTheGivenPositionOfTheSingleLinkedList(11, 4);

        // Deleting the first node of my SingleLinkedList
        // sll.deleteFirstNode();
        int sizeTemp = sll.lengthOfSingleLinkedList();

        sll.displaySingleLinkedList();
        
        for (int i = 1; i <= sizeTemp; i++) {
            System.out.println("Delete the node -> " + sll.deleteFirstNode().data);
        }

        // Printing the elements of my SingleLinkedList
        sll.displaySingleLinkedList();

        // Printing the lenght of my SingleLinkedList
        System.out.println("The length of my SingleLinkedList is " + sll.lengthOfSingleLinkedList());
    }

}
