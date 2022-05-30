//Given a Linked list, rearrange it such that converted list should be of the form a < b > c < d > e < f .. 
//where a, b, c are consecutive data node of linked list and such that the order of linked list is sustained.
class Solution{
	public static Node zigZag(Node head){
        Node temp=head;
        int t,f=0;
        while(temp!=null && temp.next!=null){
            if(f==0){
                if(temp.next.data<temp.data){
                    t=temp.next.data;
                    temp.next.data=temp.data;
                    temp.data=t;
                }
                f=1;
                
            }
            else if(f==1){
                if(temp.next.data>temp.data){
                    t=temp.next.data;
                    temp.next.data=temp.data;
                    temp.data=t;
                }
                f=0;
            }
            temp=temp.next;
        }
        return head;
    }
}