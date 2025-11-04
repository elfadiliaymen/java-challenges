import java.util.Scanner;

public class challenge01 {
        public static void main( String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Entrez votre nom :");
            String fname = input.next();
            System.out.println("Bonjour," + fname);
            input.close();
    }
}
