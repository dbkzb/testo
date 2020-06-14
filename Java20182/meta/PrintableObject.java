package meta;

import java.lang.reflect.*;
import java.util.Arrays;

public class PrintableObject extends Object {

    @Override
    public String toString() {

        String r = "";
        Class c = this.getClass();
        Object o = null;

        while (c != null) {

            for (Field f : c.getDeclaredFields()) {

                r += f.getName() + ": ";

                try {

                    o = f.get(this);

                    if (o.getClass().isArray()) {

                        r += Arrays.toString((String[]) o) + "\n";

                    } else {

                        r += o.toString() + "\n";
                    }

                } catch (IllegalAccessException e) {

                    e.printStackTrace();
                }
            }

            c = c.getSuperclass();
        }

        return r;
    }
}
