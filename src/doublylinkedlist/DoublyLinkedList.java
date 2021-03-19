package doublylinkedlist;

import java.util.Iterator;

public class DoublyLinkedList<Item> implements Functions<Item>,Iterable<Item>{
	
	private Node<Item> head;
	private Node<Item> tail;
	private int length=0;

	@Override
	public void addToFront(Item item) {
		Node<Item> newNode=new Node<Item>();
		newNode.data=item;
		newNode.previous=null;
		newNode.next=head;
		
		if(head==null) {
			tail=newNode;
		} else {
			head.previous=newNode;
		}
		head=newNode;
		this.length++;
		
	}

	@Override
	public void removeFromFront() {
		if (head==null) {
			throw new IndexOutOfBoundsException("Nothing to be removed");
		} else if (this.length==1) {
			head=null;
			tail=null;
		} else { 
		head=head.next;
		head.previous=null; }
		this.length--;
	}

	@Override
	public void addToRear(Item item) {
		Node<Item> newNode=new Node<Item>();
		newNode.data=item;
		newNode.next=null;
		newNode.previous=tail;
		
		if(tail==null) {
			head=newNode;
		}else {
			tail.next=newNode;
		}
		tail=newNode;
		
		this.length++;
	}

	@Override
	public void removeFromRear() {
		if(head==null) {
			throw new IndexOutOfBoundsException("Nothing to be removed");
		}else if(this.length==1) {
			head=null;
			tail=null;
		} else {
		tail=tail.previous;
		tail.next=null; }
		this.length--;
		
	}
	
	private class DoublyLinkedListIterator implements Iterator<Item> {

		Node<Item> current=head;
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public Item next() {
			Item item=current.data;
			current=current.next;
			
			return item;
		}
		
		
	}
	
	

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new DoublyLinkedListIterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.length;
	}
	

}
