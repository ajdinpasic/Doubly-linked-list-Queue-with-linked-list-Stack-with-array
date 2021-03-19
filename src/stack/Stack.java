package stack;

public class Stack<Item> implements Functions<Item>{
	
	@SuppressWarnings("unchecked")
	private Item[] qArray= (Item[]) new Object[1];
	private int top=0;
	
	@Override
	public void push(Item item) {
		if (this.top == qArray.length) {
			resize(2*qArray.length); }
			
		qArray[top] = item;
		this.top++;
	
	}
	@Override
	public Item pop() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Nothing to be removed");
		}
		this.top--;
        Item item = qArray[top];
        qArray[top] = null;
        if (this.top > 0 && this.top == qArray.length / 4) {
        	
            resize(qArray.length / 2);
        }
        return  item;
	}
	@Override
	public boolean isEmpty() {
		return this.top==0;
		
	}
	@Override
	public int count() {
		return this.top;
	}
	
	@Override
	public void resize(int newCapacity) {
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[]) new Object[newCapacity];
        for (int i = 0; i < top; i ++){
           temp[i] = qArray[i];
        }

        qArray = temp;
		
	}
	/*public void pprint() {
		for (Item i:qArray) {
			if(i!=null) {

			System.out.println(i); }
		} 
	} */
	

	
	
	

}
