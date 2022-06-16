public class DeQueueArray {
    protected int dequeue[];
    private static final int Default_size=10;
    int rear =-1;
    DeQueueArray()

    {
        this(Default_size);
    }
    DeQueueArray(int size)
    {
        this.dequeue =new int[size];
    }
    public void addrear(int x)
    {
        if(isfull())
            System.out.println("Queue is full");
        else
        {
            rear++;
            dequeue[rear]=x;
        }
    }
    public void addfront(int x)
    {
        if(isfull())
            System.out.println("Queue is full");
        else
        {
            for (int i = 1; i < rear; i++) {
                dequeue[i]= dequeue[i-1];
            }
            dequeue[0]=x;
            rear++;
        }
    }
    public int removefront()
    {
        int x=-1;
        if(isempty())
            System.out.println("Queue is empty");
        else
        {
            x= dequeue[0];
            for (int i = 1; i < rear; i++) {
                dequeue[i-1]= dequeue[i];
            }
            rear--;
        }
        return x;
    }
    public int removerear()
    {
        int x=-1;
        if(isempty())
            System.out.println("Queue is empty");
        else
        {
            x= dequeue[rear--];
        }
        return x;
    }
    public int peek()
    {
        if(isempty())
            System.out.println("Queue is empty");
        return dequeue[0];
    }

    private boolean isfull() {
        return rear == dequeue.length-1;
    }

    private boolean isempty() {
        return rear ==-1;
    }

    public static void main(String[] args) {
        DeQueueArray queue=new DeQueueArray(8);
        queue.addfront(10);
        queue.addfront(20);
        System.out.println(queue.peek());
        System.out.println(queue.removefront());
        queue.addfront(30);
        queue.addrear(40);
        queue.addrear(50);
        queue.addrear(60);
        System.out.println(queue.removerear());
        System.out.println(queue.peek());
        System.out.println(queue.removefront());
        queue.addfront(70);
        System.out.println(queue.removefront());
    }
}
