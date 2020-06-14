package logging;

import java.util.logging.*;

public class Calculator {

    public int divide(int a, int b) {

        int c = 0;
        
        try {

            c = a / b;
            
        } catch (ArithmeticException e) {

            Launcher.logger.log(Level.SEVERE, "Division by zero.", e);
        }
        
        return c;
    }
}
