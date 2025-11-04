import java.util.Scanner;

public class Challenge04 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int solde = 0;
        int num = 0;
        boolean active = true;

        while (active){
            System.out.println("1. Consulter le solde\n2. Dépôt\n3.Retrait\n4. Quitter \n choisisez votre option : ");
            if(input.hasNextInt()){
             num = input.nextInt();
            }else {
                System.out.println("entrez un nombre");
                input.close();
            }


            switch (num){
                case 1 :
                    System.out.println("le solde est : " +solde);
                    break;

                case 2 :
                    System.out.println("entrez un montant :");
                    if (input.hasNextInt()) {
                        int depot = input.nextInt();
                        if (depot > 0) {
                            solde += depot;
                            System.out.println("Dépôt réussi !");
                        } else {
                            System.out.println("Montant invalide !");
                        }
                    }else{
                       System.out.println("enetez un nombre");
                       input.next();
                    }
                    break;

                case 3 :
                    System.out.println("entrez un montant :");
                    if (input.hasNextInt()) {
                        int retrait = input.nextInt();
                        if (retrait > 0 && retrait <= solde) {
                            solde -= retrait;
                            System.out.println("Retrait réussi !");
                        } else if (retrait > solde) {
                            System.out.println("Solde insuffisant !");
                        } else {
                            System.out.println("Montant invalide !");
                        }
                    }else{
                        System.out.println("enetez un nombre");
                        input.next();
                    }

                    break;

                case 4 :
                    active = false;
                    input.close();
                    break;

            }


        }
    }

}
