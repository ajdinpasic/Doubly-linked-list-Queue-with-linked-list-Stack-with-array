package queue;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.enqueue("AA");
		System.out.println(ll.dequeue());
		ll.enqueue("BB");
		System.out.println(ll.dequeue());
		ll.enqueue("CC");
		ll.enqueue("DD");
		ll.enqueue("EE");
		System.out.println(ll.dequeue());
		System.out.println(ll.count());
		
	}

}
