package binarySerach;

public class BinarySearchImpl {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}

	}

	public static Node insert(Node root, int value) {

		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (root.data > value) {

			root.left = insert(root.left, value);
		} else {

			root.right = insert(root.right, value);
		}

		return root;
	}

	public static void inorder(Node root) {

		if (root == null) {

			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}

	public static boolean search(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.data > key) {
			return search(root.left, key);

		} else if (root.data == key) {
			return true;
		} else {
			return search(root.right, key);
		}
	}

	public static Node delete(Node root, int val) {
		if (root.data > val) {

				root.left = delete(root.left, val);
		}
		else if (root.data < val) {
			root.right = delete(root.right, val);
		}

		else {
			if (root.left == null && root.right == null) {

				return null;
			}
			if (root.left == null) {
				return root.right;

			} else if (root.right == null) {
				return root.left;
			}

			// case 3
			Node IS = inorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}

		return root;
	}

	public static Node inorderSuccessor(Node root) {

		while (root.left != null) {
			root = root.left;
		}

		return root;
	}

	public static void printInRange(Node root,int X,int Y) {
		if(root==null) {
				return;
		}
		if(root.data >= X && root.data <=Y) {
			printInRange(root.left, X, Y);
		System.out.print(root.data+" ");
		printInRange(root.right, X, Y);
		
		}
		else if(root.data >= Y) {
			printInRange(root.left, X, Y);
			System.out.print(root.data+" ");
		}
		else {
			printInRange(root.right, X, Y);
			System.out.print( root.data+" ");
		}
	}
	public static void main(String[] args) {
		int values[] = { 5, 1, 3, 4, 2, 7 ,129,1323,12,};
		Node root = null;
		for (int i = 0; i < values.length; i++) {

			root = insert(root, values[i]);
		}

		inorder(root);

//		delete(root, 1);
//		System.out.println();
//		inorder(root);
		System.out.println();
printInRange(root, 1, 2);
	}
}
