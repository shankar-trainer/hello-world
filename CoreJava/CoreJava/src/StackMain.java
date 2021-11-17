
public class StackMain {

	public static void main(String[] args) {
		Stack stack=new Stack(5);

		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());

		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
//		stack.push(15);

		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		System.out.println("peek "+stack.peek());
		
		System.out.println("popping ");
		for (int i = 0; i <5; i++) {
			System.out.println(stack.pop());
		}
		
		System.out.println(stack.isEmpty());
		
	}
}
