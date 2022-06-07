import java.util.Stack;

public class StackArray {
    protected int stack[];
    private static final int Default_size=10;
    int tos=-1;
    StackArray()
    {
        this(Default_size);
    }
    StackArray(int size)
    {
        this.stack=new int[size];
    }
    public void push(int x)
    {
        if(isfull())
            System.out.println("Stack overflow");
        else
        {
            tos++;
            stack[tos]=x;
        }
    }
    public int pop()
    {
        int x=-1;
        if(isempty())
            System.out.println("Stack underflow");
        else
        {
            x=stack[tos--];
        }
        return x;
    }
    public int peek()
    {
        if(isempty())
            System.out.println("Stack underflow");
        return stack[tos];
    }

    private boolean isfull() {
        return tos==stack.length-1;
    }

    private boolean isempty() {
        return tos==-1;
    }

    public static void main(String[] args) {
        StackArray stack=new StackArray(8);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}