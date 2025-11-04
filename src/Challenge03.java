import java.util.Scanner;
import java.util.Random;

public class Challenge03 {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10)+ 1;
        int num = 0;
        System.out.print("enterez un nombre entre 1 et 10 : ");

        if(input.hasNextInt()){
            num = input.nextInt();
        }else {
            System.out.print("entrez un nombre !!!");
            input.close();
            return;
        }
        while ( num != randomNumber){

            if(num < randomNumber){
                System.out.print(" Trop petit ! Essayez encore.");
            }else {
                System.out.print(" Trop grand ! Essayez encore.");
            }

            System.out.print("enterez un nombre entre 1 et 10");
            if(input.hasNextInt()){
                num = input.nextInt();
            }else {
                System.out.print("entrez un nombre !!!");
                input.close();
                return;
            }

        }
        System.out.println("Bravo ! Vous avez trouvé le bon nombre : " + randomNumber);
        input.close();
    }
}
