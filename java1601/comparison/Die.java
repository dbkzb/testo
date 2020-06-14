package comparison;

import java.util.*;

/**
 * A playing die.
 */
public class Die {

    public static final int DEFAULT_SIDES = 6;

    private static Random generator = new Random();

    // The sides numbered 1 to n. 
    private int sides;
    // The result which is the top side.
    private int result;

    public Die() {
	
	this(Die.DEFAULT_SIDES);
    }

    public Die(int sides) {

        this.sides = sides;
        this.result = 1;
    }

    public Die(int sides, int result) {
	
	assert (sides > 1) && (1 <= result) && (result <= sides) : "Violation of precondition";

        this.sides = sides;
        this.result = result;
    }

    public void roll() {

	// All sides have uniform probablity of being rolled.
	this.result = Die.generator.nextInt(this.sides) + 1;
    }

    public boolean equals(Object o) {

	boolean r = true;
	
        if (o == null) {
            
            r = false;
            
        } else if (this.getClass() != o.getClass()) {
            
            r = false;
            
        } else {

            Die d = (Die) o;
            
            r = (this.result == d.result) && (this.sides == d.sides);
        }

        return r;
    }

    public String toString() {

	return "Sides: " + this.sides + " Result: " + this.result;
    }
}
