package doublylinkedlist;

public interface Functions<Item> {
	void addToFront(Item item);
	void removeFromFront();
	void addToRear(Item item);
	void removeFromRear();
	int size();

}
