
import java.io.*;

class Node
{
	int data;
	Node left, right;

	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class BinaryTree{
	
Node root;
int floor;
int ceil;


public void floorCeilBSTHelper(Node root,
							int key)
{
	while (root != null)
	{
		if (root.data == key)
		{
			ceil = root.data;
			floor = root.data;
			return;
		}

		if (key > root.data)
		{
			floor = root.data;
			root = root.right;
		}
		else
		{
			ceil = root.data;
			root = root.left;
		}
	}
	return;
}

public void floorCeilBST(Node root, int key)
{
	

	floor = -1;
	ceil = -1;

	floorCeilBSTHelper(root, key);

	System.out.println(key + " " +
					floor + " " + ceil);
}
 

public static void main(String[] args)
{
	BinaryTree tree = new BinaryTree();
	tree.root = new Node(8);
	tree.root.left = new Node(4);
	tree.root.right = new Node(12);
	tree.root.left.left = new Node(2);
	tree.root.left.right = new Node(6);
	tree.root.right.left = new Node(10);
	tree.root.right.right = new Node(14);
	
	for(int i = 0; i < 16; i++)
	{
		tree.floorCeilBST(tree.root, i);
	}
}
}
