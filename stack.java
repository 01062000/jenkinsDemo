class Stack{
	int n;
	int [] stack;
	int top;

	Stack(int n){
		this.n = n;
		stack = new int[n];
		top = -1;
	}

	void push(int d){
		if(top == n-1)
			System.out.println("Stack Overflow");
		else{
			top++;
			stack[top] = d;
		}
	}

	void pop(){
		if(empty())
			System.out.println("Stack Underflow");
		else{
			stack[top] = -1;
			top--;
		}
	}

	int top(){
		return stack[top];
	}

	public boolean empty(){
		return (top == -1) ? true : false;
	}
}

class useStack{
	public static void main(String args[]){
		Stack S = new Stack(5);
		S.push(3);
		S.push(4);
		S.push(1);
		S.push(9);
		S.push(5);
		S.pop();
		//S.pop();
		//S.pop();
		//S.pop();
		S.pop();
		S.pop();
	
		while(!S.empty()){
			System.out.println(S.top());
			S.pop();
		}
	}
}