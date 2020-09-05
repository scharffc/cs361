/**
 * 
 */
package mystacksol;

/**
 * @author cscharff
 *
 */

// Stack using generics

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
		T popElt = theStack.val;
		theStack = theStack.next;
		return popElt;
	}

	public void push(T v) {
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack<Integer> s = new MyStack<Integer>();
		s.push(1);
		s.push(2);
		s.pop();
		s.push(5);
		
		Person p1 = new Person("Jose", "Guerra");
		Person p2 = new Person("Diana", "Smith");
		MyStack<Person> sp = new MyStack<Person>();
		sp.push(p1);
		sp.push(p2);
	}

}
