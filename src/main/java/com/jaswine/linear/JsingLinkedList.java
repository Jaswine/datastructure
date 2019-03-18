package com.jaswine.linear;


/**
 * 单向链表
 *
 * @author Jaswine
 */
public class JsingLinkedList<T> {

	/** 第一个元素 */
	private Node first = null;


	/** 添加到首位 */
	void addFirst(T item){
		Node node = new Node(item, null);
		addFirst(node);
	}
	/** 添加到首位 */
	void addFirst(Node node){
		if (first ==null){
			first = node;
		}else {
			node.next = first;
			first = node;
		}
	}

	/** 添加到最后 */
	void addLast(T item){
		Node<T> node = new Node<>(item, null);
		addLast(node);
	}

	/** 添加到最后 */
	void addLast(Node lastNode){
		if (first == null){
			first = lastNode;
			return;
		}
		Node node = first;
		while (node.next != null){
			node = node.next;
		}
		node.next = lastNode;
	}

	/** 插在中间 */
	void add(Node taget,T item){
		Node<T> node = new Node<>(item, null);
		add(taget,node );
	}

	/** 插在中间 */
	void add(Node taget,Node node){
		node.next = taget.next;
		taget.next = node;
	}

	/** Value获得Node */
	Node findNodeByValue(T value){
		Node node = first;

		while (node != null && node.item != value){
			node = node.next;
		}
		return node;
	}

	/** index获得Node(0开始) */
	Node findNodeByIndex(int index){
		Node node = first;
		int i = 0;
		while (node != null && i != index){
			node = node.next;
			i++;
		}

		return node;
	}

	/** item获得index*/
	int findIndexByNode(T item){
		// 链表中没有节点
		if (first == null){
			return -1;
		}
		// 从第一个节点开始
		Node node = first;
		int i = 0;

//		node != null && node.item != item
		while (true){
			if (node.item == item){
				return i;
			}
			node = node.next;
			i++;
			if (node == null){
				return -1;
			}
		}
//		return i;
	}

	static class Node<T>{
		 T item;
		 Node next;

		 Node(T item,Node next){
		 	this.item = item;
		 	this.next = next;
		 }

		 Node(Node next){
		 	this.next = next;
		 }
	}

	public static void main(String[] args) {
		JsingLinkedList<String> linkedList = new JsingLinkedList<>();

//		linkedList.addFirst("jasmine1");
//		linkedList.addFirst("jasmine2");
//		linkedList.addFirst("jasmine3");
//		linkedList.addFirst("jasmine4");
//		linkedList.addFirst("jasmine5");
//		linkedList.addFirst("jasmine6");
//		linkedList.addFirst("jasmine7");

		linkedList.addLast("jasmine1");
		linkedList.addLast("jasmine2");
		linkedList.addLast("jasmine3");
		linkedList.addLast("jasmine4");
		linkedList.addLast("jasmine5");
		linkedList.addLast("jasmine6");
		linkedList.addLast("jasmine7");

		linkedList.add(linkedList.findNodeByValue("jasmine4"),"jasmine4_1" );

		/* item查node */
		System.out.println(linkedList.findNodeByValue("jasmine2").item);
		/* index查node */
		System.out.println(linkedList.findNodeByIndex(3).item);
		/* node查index */
		System.out.println(linkedList.findIndexByNode("jasmine"));


	}
}
