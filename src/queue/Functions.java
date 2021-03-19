package queue;

public interface Functions<Item> {
	void enqueue(Item item);
	Item dequeue();
	boolean isEmpty();
	int count();

}
