class Intersect
{
    int length(Node head){
        Node temp=head;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        return l;
    }
	int intersectPoint(Node head1, Node head2)
	{
        int l1=length(head1);
        int l2=length(head2);
    
        int d=0;
        Node ptr1;
        Node ptr2;
        if(l1>l2){
            d=l1-l2;
            ptr1=head1;
            ptr2=head2;
            
        }
        else{
            d=l2-l1;
            ptr1=head2;
            ptr2=head1;
        }
        while(d!=0){
            ptr1=ptr1.next;
            if(ptr1==null){
                return -1;
            }
            d--;
        }
        while(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
                return ptr1.data;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return -1;
	}
}



// public class Solution {
    
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
//     ListNode dummy1 = headA;
//     ListNode dummy2 = headB;
    
   
//     while(dummy1 != dummy2){
        
        
//         if(dummy1 != null){
            
//             dummy1 = dummy1.next;
//         }else{
           
//             dummy1 = headB;
//         }
//         if(dummy2 != null){
           
//             dummy2 = dummy2.next;
//         }else{
           
//             dummy2 = headA;
//         }
//     }
   
//     return dummy2;
// }
// }