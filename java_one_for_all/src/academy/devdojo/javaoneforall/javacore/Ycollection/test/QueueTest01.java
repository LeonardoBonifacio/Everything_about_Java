package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.PriorityQueue;// Object
import java.util.Queue;//IInterface that extends Collection

public class QueueTest01 {
    public static void main(String[] args) {
        // A collection designed for holding elements prior to processing
        // Queue needs that the objects that you are putting inside be Comparable
        // Because through the comparable you are going to define the Priority
        // Queues typically, but do not necessarily, order elements in a
        // FIFO (first-in-first-out) manner. Among the exceptions are
        // priority queues, which order elements according to a supplied
        // comparator, or the elements' natural ordering, and LIFO queues (or
        // stacks) which order the elements LIFO (last-in-first-out).
        // Java is going to decide who's first(FIFO) thorough the Comparable or
        // Comparator
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");// add if this not go over to the capacity provide for this Queue
        queue.add("A");// the default capacity is 11
        queue.add("B");// throw an Exception if this fail

        for (String string : queue) {
            System.out.println(string);
        }
        System.out.println("-------");
        // Everything always based in your compareTo method or Comparator
        // System.out.println(queue.peek());// returns the head(first element)
        // System.out.println(queue.poll());// Retrieves and removes the head of this
        // queue
        // System.out.println(queue.remove());
        // Retrieves and removes the head of this queue. This method differs from {@link
        // #poll() poll()}
        // only in that it throws an exception if
        // this queue is empty
        // System.out.println(queue.offer("D"));// return true if this insert and not
        // throw an Exception if this go over
        // for the capacity of this queue, instead of this returns false

        while (!queue.isEmpty()) {
            // when we are removing objects from a queue the priority is applied, based on
            // the Comparable or Comparator present
            // In this case we are removing this Objects in order alphabetic
            System.out.println(queue.poll());
        }
    }
}
