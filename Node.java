class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queue {
    private Node front, rear;
    public Queue() {
        this.front = this.rear = null;
    }
   public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {  
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        int value = front.data;
        front = front.next;

        if (front == null) {  
            rear = null;
        }
        return value;
    }
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }
    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
