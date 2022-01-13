package StacksQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        //CustomStack st = new CustomStack(5);
        DynamicStack st = new DynamicStack(5);
        st.push(34);
        st.push(35);
        st.push(1);
        st.push(345);
        st.push(432);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
