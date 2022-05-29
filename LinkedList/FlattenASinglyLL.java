

import java.io.*;


public static node FlattenList(Node head){
    if(head==null)
{
    return;
}
Node temp=null;
Node last=head;
while(last.next!=null){
    last=last.next;
}
Node curr=head;
while(curr!=last){
    if(curr.child!=null){
        last.next=curr.child;
//making child the last node
temp=curr.child;
while(temp.next!=null){
    temp=temp.next;
     }
last=temp;
  }
curr=curr.next;
}
}