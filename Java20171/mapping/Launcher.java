package mapping;

public class Launcher {
    
    public static void main(String[] args) {
        
        System.out.println("Startup.");

        Account a = new Account();
        DTO d = new DTO();
        Assembler as = new Assembler();
        
        as.account = a;
        as.dto = d;
        
        System.out.println(d);

        as.assemble();
        
        System.out.println(d);
        
        System.out.println("Shutdown.");
    }
}
