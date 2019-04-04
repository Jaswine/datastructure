package com.jaswine.linear;

/**
 * 栈数据结构
 *
 * <p>使用链表实现的栈数据结构</p>
 *
 * @author Jaswine
 */
public class JlinkedStack<T> {

	private Node<T> top = null;


	void push(Node node){

		if (top == null){
			top = node;
			return;
		}

		node.next = top;
		top = node;
	}

	Node pop(){
		Node node = top;
		top = top.next;
		return node;
	}


	private static class Node<T>{
		T item;
		Node<T> next;

		Node(T item, Node next){
			this.item = item;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		JlinkedStack<String> stack = new JlinkedStack<>();

		stack.push(new Node("j1", null));
		stack.push(new Node("j2", null));
		stack.push(new Node("j3", null));
		stack.push(new Node("j4", null));
		stack.push(new Node("j5", null));
		stack.push(new Node("j6", null));


		System.out.println(stack.pop().item);
		System.out.println(stack.pop().item);
		System.out.println(stack.pop().item);
		System.out.println(stack.pop().item);
		System.out.println(stack.pop().item);
		System.out.println(stack.pop().item);
	}

}
