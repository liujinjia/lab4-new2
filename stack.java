/**
 * Design a java class that encapsulate the data structure Stack (Last in First out). 
	The class has 2 methods:
	(push): method for adding items to stack, 
	the push operation adds items to the top of the list
	(pop): method for retrieving items from the stack. 
	The pop operation removes an item from the top of the list, 
	and returns its value to the caller.
	In the case of overflow the user should be informed with a message
	In the case of underflow, the user should be informed with a message 
	& a value of zero is returned.

	Assumptions: The stack will hold up to 10 integer values.
 * @author liujinjia
 *
 */
import java.util.*;
public class stack {
	List<Integer> stack = new ArrayList<Integer>();
	
	public void push(int[] n){
		if(n.length+stack.size() > 10){
			System.out.println("The stack is overflow.");
		}
		
		else{
		for(int i = 0; i < n.length; i++){
			stack.add(n[i]);
			
		}
		System.out.println(stack);
		}
	}
	public int pop(){
		if(stack.size() == 0){
			System.out.println("The stack is underflow.");
			return 0;
		}
		else{
		int result = stack.indexOf(0);
		stack.remove(0);
		
		System.out.println(stack);
		return result;
		}
	}
	public static void main(String[] args){
		stack s = new stack();
		
		int[] a = {1,2,3};
		//int[] b = {2,2,3,4,5,6,7,12,23,45,5,6,7,8,9,10};
		
		s.push(a);
		
		
		
		
	}

}
