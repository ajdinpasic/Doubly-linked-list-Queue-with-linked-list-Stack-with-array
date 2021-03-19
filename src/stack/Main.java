package stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> ss=new Stack<Integer>();
		ss.push(10);
        ss.push(20);
        ss.push(30);
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println("----");
        System.out.println(ss.count());
        System.out.println("----");

	}

}
