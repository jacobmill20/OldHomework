package hw;

public class WellFormedExpression {
	static boolean isWellFormed(String s) {
		MyStack<Character> stack = new MyStack<Character>();
		char ch;
		for(int i=0; i<s.length();i++) {
			ch = s.charAt(i);
//			System.out.println(ch);				
			/************************************************
			 if ch is a opening bracket, then push it to the stack
			 else if ch is a closing bracket
					if stack is empty, return false
					if stack.pop() does not match the closing bracket, return false
			 else ignore (do nothing)
			************************************************/
			if (ch == '(' || ch == '[' || ch == '{')
				stack.push(ch);
			switch(ch) {
				case ')':
					if(stack.isEmpty())
						return false;
					if(stack.pop() != '(')
						return false;
					break;
				case ']':
					if(stack.isEmpty())
						return false;
					if(stack.pop() != '[')
						return false;
					break;
				case '}':
					if(stack.isEmpty())
						return false;
					if(stack.pop() != '{')
						return false;
					break;
			}
		}
		if(!stack.isEmpty())
			return false;	
		return true;
	}
	public static void main(String[] args) {
//		MyStack<Character> st = new MyStack<Character>();
//		st.push(new Character('a'));
//		st.push('b');
//		System.out.println(st.pop());
//		System.out.println(st.isEmpty());
//		System.out.println(st.pop() == 'a');
		
		System.out.println(isWellFormed("(ab)")); // good
		System.out.println(isWellFormed("(1+2)[]{3* 4}")); // good
		System.out.println(isWellFormed("([]){}")); // good
		System.out.println(isWellFormed("(((())))")); // good
		System.out.println(isWellFormed("]")); // bad
		System.out.println(isWellFormed("( xx [xxx) xx]")); // bad
		System.out.println(isWellFormed("(()")); // bad
		System.out.println(isWellFormed("())")); // bad
	}
}

