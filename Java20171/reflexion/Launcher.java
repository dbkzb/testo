package reflexion;

import java.lang.reflect.*;

public class Launcher {

    public static void main(String s[]) throws Exception {

        Class c = Class.forName("reflexion.Test");
        Object o = c.newInstance();

        Method m = c.getDeclaredMethod("method1");
        Object r = m.invoke(o);

        System.out.println(r.toString());
    }
}
