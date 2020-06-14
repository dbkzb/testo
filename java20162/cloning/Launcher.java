package cloning;

public class Launcher {

    public static void main(String[] args) throws CloneNotSupportedException {
	
	IntegerStack s1 = new IntegerStack(1);
	
	for (int i = 0; i < 10; i++) {
	    
	    s1.push(i);
	}
	
	IntegerStack s2 = s1.clone();
	
	s1.pop();
	s1.push(100);
	
	System.out.println(s1.pop()); // Ausgabe: 100
	System.out.println(s2.pop()); // Ausgabe: 9

	// Bei einer flachen Kopie würden beide Stacks dasselbe Array referenzieren,
	// sodass statt 9 ebenfalls 100 ausgegeben würde.
    }
}
