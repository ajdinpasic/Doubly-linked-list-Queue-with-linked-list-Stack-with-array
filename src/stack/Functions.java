package stack;

public interface Functions<Item> {
	void push(Item item);
	Item pop();
	boolean isEmpty();
	int count();
	void resize(int newCapacity);

}
