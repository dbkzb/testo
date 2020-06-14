package cloning;

public class IntegerStack implements Cloneable {

    private int[] buffer;
    private int top;
    
    public IntegerStack(int max) {
	
	this.buffer = new int[max];
	this.top = -1;
    }
    
    public void push(int value) {

	this.top++;
	this.buffer[top] = value;
    }
    
    public int pop() {
	
	int r = this.buffer[top];
	this.top--;
	
	return r;
    }

    public IntegerStack clone() throws CloneNotSupportedException {
	
	// Shallow copy.
	IntegerStack st = (IntegerStack) super.clone();
	
	if (st != null) {

	    // Deep copy.
	    st.buffer = this.buffer.clone();

	} else {

	    System.out.println("Could not clone. The integer stack is null.");
	}
	
	return st;
    }
}
