package StacksQueue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue qu = new CustomQueue(5);
        qu.insert(3);
        qu.insert(4);
        qu.insert(12);
        qu.insert(34);
        qu.insert(422);

        qu.display();
    }
}
