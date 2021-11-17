
public class Stack {

	private int top;
	private int maxSize;
	private int array[];
	
	public Stack(int size) {
		maxSize=size;
		top=-1;
		array=new int[maxSize];
	}
	    
	public void push(int k) {
	  array[++top]=k;	
	}
	
	public int pop() {
		int p=array[top--];
		int ar[]=new int[array.length-1];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=array[i];
		}
		array=ar;
		return p;
	}
	
	public int peek() {
	 return array[top];
	}
	
	public boolean isEmpty() {
	  if(top==-1)
		  return true;
	  return false;
	}
	public boolean isFull() {
		if(top==maxSize-1)
			return true;
		return false;
	}
	
}
