package Lecture42;

// fixed si
public class Queue {
    int[] arr;
    int rear;
    int front;
    int currentSize;
    int maxSize;

    public Queue(int defaultSize) {
        arr = new int[defaultSize];
        front = 0;
        rear = 0;
        maxSize = defaultSize;
    }

    public void push(int x) {
        // also known as enqueue
        if (!full()) {
            arr[rear] = x;
            rear = (rear + 1) % maxSize;
            currentSize++;
        } else {
            System.out.println("Can't push as queue is full.");
        }
    }

    public void pop() {
        // also known as dequeue
        if (!empty()) {
            front = (front + 1) % maxSize;
            currentSize--;
        } else {
            System.out.println("Can't pop as queue is empty.");
        }
    }

    public boolean empty() {
        return currentSize == 0;
    }

    public boolean full() {
        return currentSize == maxSize;
    }

    public int getFirst() {
        if (empty()) {
            System.out.println("Queue is empty:");
            return -1;
        }
        return arr[front];
    }
}
