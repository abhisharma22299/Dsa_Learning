//package StackImplementation;
//
//import java.util.Stack;
//
//public class ReverseStack {
//	public static void pushAtBottom(int data, Stack<Integer> s) {
//		if (s.isEmpty()) {
//			s.add(data);
//			return;
//
//		}
//
//		int top = s.pop();
//		pushAtBottom(data, s);
//		s.push(top);
//
//	}
//
//	// reverse
//	public static void reverse(Stack<Integer> s) {
//		if (s.isEmpty()) {
//			return;
//
//		}
//		int top = s.pop();
//		reverse(s);
//		pushAtBottom(top, s);
//	}
//
//	public static void main(String[] args) {
//
//		Stack<Integer> s = new Stack<>();
//		s.push(1);
//
//		s.push(2);
//
//		s.push(3);
//
//		pushAtBottom(10, s);
//
//		reverse(s);
//
//		while (!s.isEmpty()) {
//
//			System.out.println(s.peek());
//
//			s.pop();
//
//		}
//
//	}
//}
