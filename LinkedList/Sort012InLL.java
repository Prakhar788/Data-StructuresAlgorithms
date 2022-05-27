class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }
        Node First=new Node(-1);
         Node zero = First;
        Node Second=new Node(-2);
        Node one = Second;
        Node Third=new Node(-3);
        Node two = Third;
        Node curr=head;
        while(curr!=null){
        if(curr.data==0){
            zero.next=curr;
            zero=zero.next;
        }
        else if(curr.data==1){
            one.next=curr;
            one=one.next;
        }
        else{
            two.next=curr;
            two=two.next;
        }
        curr=curr.next;
        }
        zero.next = (Second.next != null)? (Second.next): (Third.next);
        one.next = Third.next;
        two.next = null;
 
        
        return First.next;  
        
    }
}