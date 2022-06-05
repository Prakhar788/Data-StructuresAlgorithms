public class ArbitaryNode {
    Node head;
    public static class Node
    {
        int data;
        Node next,arbit;

        Node(int data){
            this.data = data;
            next = null;
            arbit=null;
        }
    }
    public static Node sort(Node head)
    {
        if (head==null || head.next == null)
            return head;

        Node mid = findMid(head);
        Node head2 = mid.next;
        mid.next = null;
        Node temp1 = sort(head);
        Node temp2 = sort(head2);
        return  merge(temp1, temp2);
    }
    static Node merge(Node head1, Node head2)
    {
        Node list = new Node(-1);
        Node temp = list;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return list.next;
    }
    static Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node arbitary(Node head)
    {
        if(head==null)
            return head;
        Node head1=sort(head);
        Node temp =head1;
        while(temp.next!=null)
        {
            temp.arbit=temp.next;
            temp=temp.next;
        }
        temp.arbit=null;
        return head1;
    }
    void printList(Node node)
    {
        System.out.println("Traversal using Next Pointer");
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    void printList2(Node anode)
    {
        System.out.println("\nTraversal using Arbit Pointer");
        while (anode != null)
        {
            System.out.print(anode.data + " ");
            anode = anode.arbit;
        }
    }
    public static void main(String[] args)
    {
        ArbitaryNode list = new ArbitaryNode();
        list.head = new Node(5);
        list.head.next = new Node(10);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(3);
        list.printList(list.head);
        Node ahead = arbitary(list.head);
        list.printList2(ahead);
    }
}