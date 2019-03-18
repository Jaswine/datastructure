package com.jaswine.linear;

/**
 * 双向链表
 *
 * @author Jaswine
 */
public class JdoubleLinkedList<T> {

	private Node first = null;


	/** 插在第一位 */
	void addFirst(T item){
		Node<T> node = new Node<>(item, null, null);
		addFirst(node);
	}

	/** 插在第一位 */
	void addFirst(Node firstNode){
		if (first == null){
			first = firstNode;
		}else {
			firstNode.next = first;
			first = firstNode;
		}
	}

	/** 插在最后 */
	void addLast(T item){
		Node<T> node = new Node<>(item, null, null);
		addLast(node);
	}

	/** 插在最后 */
	void addLast(Node lastNode){
		if (first == null){
			first = lastNode;
		}else {
			Node node = first;
			while (node.next != null){
				node = node.next;
			}
			node.next = lastNode;
		}
	}

	/** 插在某节点之前 */
	void addBefore(Node target,T item){
		Node<T> node = new Node<>(item, null, null);
		addBefore(target,node );
	}

	/** 插在某节点之前 */
	void addBefore(Node target,Node node){
		node.next = target;
		node.pre = target.pre;
		target.pre = node;
	}

	/** 插在某节点之后 */
	void addAfter(Node target,T item){
		Node<T> node = new Node<>(item, null, null);
		addAfter(target,node );
	}

	/** 插在某节点之后 */
	void addAfter(Node target,Node node){
		node.next = target.next;
		node.pre = target;
		target.next = node;
	}

	static class Node<T>{
		T item;
		Node pre;
		Node next;

		Node(T item,Node pre,Node next){
			this.item = item;
			this.pre = pre;
			this.next = next;
		}
	}

}
