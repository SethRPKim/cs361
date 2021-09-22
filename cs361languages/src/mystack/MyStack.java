/**
 * 
 */
package mystack;

/**
 * @author Seth K. and Sam V.
 *
 */
// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T popOut = theStack.val;
		theStack = theStack.next;
		return popOut;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v,theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> integer = new MyStack<Integer>();
		integer.push(1);
		integer.push(2);
		integer.pop();
		integer.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<String> Person = new MyStack<String>();
		Person.push("Seth K.");
		Person.push("Chistelle Scharff");
	}

}
