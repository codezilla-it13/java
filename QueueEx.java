class Queue
{
    private static int front, rear, capacity;
    private static int queue[];
    Queue(int size)
    {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }
    static void queueEnqueue(int item)
    {
        if (capacity == rear)
        {
            System.out.printf("\nQueue is full\n");
            return;
        }
        else
        {
            queue[rear] = item;
            rear++;
        }
        return;
    }
    static void queueDequeue()
    {
        if (front == rear)
        {
            System.out.printf("\nQueue is empty\n");
            return;
        }
        else
        {
            for (int i = 0; i < rear- 1; i++)
            {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
        return;
    }
    static void queueDisplay()
    {
        int i;
        if (front == rear)
        {
            System.out.printf("Queue is Empty\n");
            return;
        }
        for (i = front; i < rear - 1; i++)
        {
            System.out.printf("%d, ", queue[i]);
        }
        System.out.printf("%d", queue[i]);
        return;
    }
    static void queueFront()
    {
        if (front == rear)
        {
            System.out.printf("Queue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element: %d", queue[front]);
        return;
    }
}
public class QueueEx
{
    public static void main(String[] args)
    {
        Queue q = new Queue(4);
        System.out.print("Initial Queue: ");
        q.queueDisplay();
        for(int i=1; i<5; i++)
            q.queueEnqueue(i*5);
        System.out.print("Queue after Enqueue Operation:");
        q.queueDisplay();
        q.queueDequeue();
        System.out.printf("\nQueue after Dequeue:");
        q.queueDisplay();
        q.queueFront();
    }
}
