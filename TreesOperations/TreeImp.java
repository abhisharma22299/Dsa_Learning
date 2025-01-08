package TreesOperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeImp {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	static class BinaryTree {

		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);

			newNode.right = buildTree(nodes);
			return newNode;
		}

		public static void preOrder(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

		public static void inOrder(Node root) {
			if (root == null) {
				return;
			}
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

		public static void postOrder(Node root) {
			if (root == null) {
				return;
			}
			inOrder(root.left);
			inOrder(root.right);
			System.out.print(root.data + " ");
		}

		// LevelOrder

		public static void levelOrder(Node root) {

			if (root == null) {
				return;

			}

			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while (!q.isEmpty()) {
				Node currNode = q.remove();
				if (currNode == null) {
					System.out.println();
					if (q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}

				}

				else {
					System.out.print(currNode.data + " ");
					if (currNode.left != null) {
						q.add(currNode.left);

					}
					if (currNode.right != null) {
						q.add(currNode.right);
					}
				}

			}

		}

		public static int countNodes(Node root) {
			if (root == null) {
				return 0;
			}
			int left = countNodes(root.left);
			int right = countNodes(root.right);
			return left + right + 1;

		}

		public static int sumOfNodes(Node root) {
			if (root == null) {
				return 0;
			}
			int sumLeft = sumOfNodes(root.left);
			int sumRight = sumOfNodes(root.right);
			return sumLeft + sumRight + root.data;

		}

		public static int height(Node root) {
			if (root == null) {
				return 0;
			}
			int heightLeft = height(root.left);
			int heightRight = height(root.right);
			return Math.max(heightLeft, heightRight) + 1;

		}

		public static int diameter(Node root) {
//	time complexity O(N^2)
			if (root == null) {
				return 0;
			}
			int diam1 = diameter(root.left);
			int diam2 = diameter(root.right);
			int diam3 = height(root.left) + height(root.right) + 1;

			return Math.max(diam3, Math.max(diam1, diam2));
		}

		static class Treeinfo {
			int ht;
			int diam;

			Treeinfo(int ht, int diam) {
				this.ht = ht;
				this.diam = diam;
			}
		}

		public static Treeinfo diameter2(Node root) {
			// O(N)
			if (root == null) {
				return new Treeinfo(0, 0);
			}
			Treeinfo left = diameter2(root.left);
			Treeinfo right = diameter2(root.right);
			int myHeight = Math.max(left.ht, right.ht) + 1;
			int diam1 = left.diam;
			int diam2 = right.diam;
			int diam3 = left.ht + right.ht + 1;
			int mydiam = Math.max(Math.max(diam1, diam2), diam3);
			Treeinfo myinfo = new Treeinfo(myHeight, mydiam);

			return myinfo;
		}

		public static void printInRange(Node root, int X, int Y) {
			if (root == null) {
				return;

			}
			if (root.data >= X && root.data <= Y) {
				printInRange(root.left, X, Y);
				System.out.print(root.data + " ");
				printInRange(root.right, X, Y);
			} else if (root.data >= Y) {
				printInRange(root.left, X, Y);
			} else {
				printInRange(root.right, X, Y);
			}
		}

		public static void printPath(ArrayList<Integer>path) {
			for(int i=0;i<path.size();i++) {
				System.out.print(path.get(i)+"->");
			}
			System.out.println();
		}
		public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
		
			if(root==null) {
				return;
			}
			
			path.add(root.data);
			if(root.left==null && root.right ==null) {
				printPath(path);
			}else {
				printRoot2Leaf(root.left, path);
				printRoot2Leaf(root.right, path);
			}
			printRoot2Leaf(root.left, path);
			printRoot2Leaf(root.right, path);
			path.remove(path.size()-1);
		}

		public static void main(String[] args) {

			int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
			BinaryTree tree = new BinaryTree();
			Node root = tree.buildTree(nodes);
			preOrder(root);
			System.out.println();
			inOrder(root);
			System.out.println();
			postOrder(root);
			System.out.println();
			levelOrder(root);

			System.out.println(tree.countNodes(root));
			System.out.println(tree.sumOfNodes(root));
			System.out.println(tree.height(root));
			System.out.println(diameter2(root).diam);
			inOrder(root);
			System.out.println();
			printInRange(root, 1, 10);
			System.out.println();
	printRoot2Leaf(root, new ArrayList<>());
		}
	}
}
