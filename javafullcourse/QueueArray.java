class QueueArray {
    private int[] queue;   // Array to store queue elements
    private int front, rear, size, capacity;

    // Constructor to initialize the queue
    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue operation: Insert element at the rear
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular queue implementation
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued.");
    }

    // Dequeue operation: Remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // Move front to next position
        size--;
        return item;
    }

    // Peek operation: Get the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Display all elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method to test queue operations
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5); // Create a queue of size 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        queue.enqueue(60);
        queue.display();

        System.out.println("Front element: " + queue.peek());
    }
}
