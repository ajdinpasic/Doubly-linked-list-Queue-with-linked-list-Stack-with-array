package queue;

public class LinkedList<Item> implements Functions<Item>{
	
	private int size=0;
	private Node<Item> tail;
	private Node<Item> head;

	@Override
	public void enqueue(Item item) {
		
		
		 Node<Item> newNode=new Node<Item>();
		 newNode.data=item;

		if(isEmpty()) {
			head=newNode;
			tail=newNode;
		} else {
			tail.next=newNode;
			tail=newNode;
		}
		this.size++;
	}

	@Override
	public Item dequeue() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Nothing to be removed");
		}
		Item item=head.data;
		head=head.next;
		this.size--;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return this.size==0;
	}

	@Override
	public int count() {
		return this.size;
	}
	
	

}
