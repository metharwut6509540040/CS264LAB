package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Integer> stack = new ArrayList<>();
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		return stack.size();
	}


	public void pushElementToTop(int a) {
		stack.add(a);
	}
	
	public Integer top() {
		if(isEmpty()) {
			return null;
		}
		return stack.get(stack.size()-1);
	}
	
	public Integer pop() {
		if(isEmpty()) {
		return null;
		}
		return stack.remove(stack.size()-1);
	}

	
}