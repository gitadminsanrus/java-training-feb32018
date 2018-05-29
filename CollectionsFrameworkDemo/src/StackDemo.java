import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Size of stack = " + stack.size());
		Object obj = stack.pop();
		System.out.println("Popped value from stack = " + obj);
		
		Object obj1 = stack.peek();
		System.out.println("Top element on the stack is " + obj1);
		System.out.println("Size of stack = " + stack.size());
		
//		Iterator it = stack.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
