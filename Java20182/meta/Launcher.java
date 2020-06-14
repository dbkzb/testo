package meta;

public class Launcher {

    public static void main(String[] args) {

        String[] l = {"C", "Pascal", "Perl", "Java"};
        JavaProgrammer p = new JavaProgrammer();

        p.name = "Max Mustermann";
        p.department = "Entwicklung";
        p.age = 32;
        p.languages = l;
        p.linesofcode = 55000;
        p.jdk12 = true;
        p.swing = false;

        System.out.println(p);
    }
}
