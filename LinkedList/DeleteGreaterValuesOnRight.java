class Solution
{
    public Node reverse(Node head) {
        Node prev = null, next = null, curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    Node compute(Node head)
    {
        Node newhead=reverse(head);
        Node temp=newhead;
        int max=Integer.MIN_VALUE;
        Node dummy=new Node(-1);
        Node d=dummy;
        while(temp!=null ){
            if(temp.data>=max){
                max=temp.data;
                d.next=temp;
                d=d.next;
            }
            temp=temp.next;
        }
        d.next=null;
        return reverse(dummy.next);
    }
}
  