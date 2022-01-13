package StacksQueue;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {

        //STACK
        Stack<Integer>st = new Stack<>();
        st.push(34);
        st.push(35);
        st.push(1);
        st.push(345);

        // It returns the element that is popped
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        //QUEUE
        Queue<Integer>qu = new LinkedList<>();
        qu.add(3);
        qu.add(4);
        qu.add(12);
        qu.add(34);
        qu.add(422);

        //It just returns the head of the queue
        System.out.println(qu.peek());
        //It removes the head of the queue and return the element
        System.out.println(qu.remove());

        //DEQUE
        Deque<Integer> dq = new ArrayDeque();
        dq.add(89);
        dq.addLast(45);
        dq.removeFirst();

    }
}
