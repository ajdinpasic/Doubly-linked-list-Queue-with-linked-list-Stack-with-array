package doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll=new DoublyLinkedList<Integer>();
		//dll.removeFromRear();
		dll.addToFront(1);
		dll.removeFromFront();
		dll.addToRear(10);
		System.out.println("--------");
		System.out.println(dll.size());
		System.out.println("--------");
		
		for (Integer i:dll) {
			System.out.println(i);
		}

	}

}
