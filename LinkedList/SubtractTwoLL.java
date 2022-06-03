
class LinkedList {
	static Node head; // head of list
	boolean borrow;

	
	static class Node {
		int data;
		Node next;

		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	
	int getLength(Node node)
	{
		int size = 0;
		while (node != null) {
			node = node.next;
			size++;
		}
		return size;
	}

	
	Node paddZeros(Node sNode, int diff)
	{
		if (sNode == null)
			return null;

		Node zHead = new Node(0);
		diff--;
		Node temp = zHead;
		while ((diff--) != 0) {
			temp.next = new Node(0);
			temp = temp.next;
		}
		temp.next = sNode;
		return zHead;
	}

	
	Node subtractLinkedListHelper(Node l1, Node l2)
	{
		if (l1 == null && l2 == null && borrow == false)
			return null;

		Node previous
			= subtractLinkedListHelper(
				(l1 != null) ? l1.next
							: null,
				(l2 != null) ? l2.next : null);

		int d1 = l1.data;
		int d2 = l2.data;
		int sub = 0;

		
		if (borrow) {
			d1--;
			borrow = false;
		}

		
		if (d1 < d2) {
			borrow = true;
			d1 = d1 + 10;
		}

		
		sub = d1 - d2;

		
		Node current = new Node(sub);

		
		current.next = previous;

		return current;
	}

	
	Node subtractLinkedList(Node l1, Node l2)
	{
	
		if (l1 == null && l2 == null)
			return null;

		
		int len1 = getLength(l1);
		int len2 = getLength(l2);

		Node lNode = null, sNode = null;

		Node temp1 = l1;
		Node temp2 = l2;

		
		if (len1 != len2) {
			lNode = len1 > len2 ? l1 : l2;
			sNode = len1 > len2 ? l2 : l1;
			sNode = paddZeros(sNode, Math.abs(len1 - len2));
		}

		else {
			
			while (l1 != null && l2 != null) {
				if (l1.data != l2.data) {
					lNode = l1.data > l2.data ? temp1 : temp2;
					sNode = l1.data > l2.data ? temp2 : temp1;
					break;
				}
				l1 = l1.next;
				l2 = l2.next;
			}
		}

		
		borrow = false;
		return subtractLinkedListHelper(lNode, sNode);
	}

	
	static void printList(Node head)
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	
	public static void main(String[] args)
	{
		Node head = new Node(1);
		head.next = new Node(0);
		head.next.next = new Node(0);

		Node head2 = new Node(1);

		LinkedList ob = new LinkedList();
		Node result = ob.subtractLinkedList(head, head2);

		printList(result);
	}
}


