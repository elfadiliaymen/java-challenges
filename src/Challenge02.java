import java.util.Scanner;

public class Challenge02 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("entrez un nombre :");
        int num = 0;
        if(input.hasNextInt()){
           num = input.nextInt();
        }else{
            System.out.println("Veuillez entrer un nombre valide !");
            input.close();
        }
        for( int i = num ; i > 0 ; i--){
            System.out.println(i);
        }
        input.close();
    }
}
