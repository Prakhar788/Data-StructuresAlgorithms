// Java program to remove duplicates from unsorted
// linked list

class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to remove duplicates from an
	unsorted linked list */
	void remove_duplicates(Node head)
	{
		Node curr=head;
        while(curr!=null && curr.next!=null){
            Node temp=curr;
            while(temp.next!=null){
                if(curr.data==temp.next.data){
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }

            }
        }
        curr=curr.next;
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(12);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next.next
			= new Node(10);

		System.out.println(
			"Linked List before removing duplicates : \n ");
		list.printList(head);

		list.remove_duplicates();
		System.out.println("");
		System.out.println(
			"Linked List after removing duplicates : \n ");
		list.printList(head);
	}
}

