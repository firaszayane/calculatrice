import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bienvenue dans la calculatrice !");
        System.out.println("Entrez le premier nombre:");
        double nombre1=scanner.nextDouble();
        System.out.println("Entrez le deuxiéme nombre:");
        double nombre2=scanner.nextDouble();

        System.out.println("quelle opération souhaiter-vous effectuer ?");
        System.out.println("1. Addition (+)");
        System.out.println("2. soustracion(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");
        int x=scanner.nextInt();

        double resultat=0;
        switch (x) {
            case 1:
                resultat= calculatrice.addition(nombre1, nombre2);
                break;
            case 2:
                resultat= calculatrice.soustraction(nombre1, nombre2);
                break;
            case 3:
                resultat= calculatrice.multiplication(nombre1, nombre2);
                break;
            case 4:
                try{
                    resultat=calculatrice.division(nombre1, nombre2);
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    return;
                }
                break;

            default:
            System.out.println("choix invalide");
                break;

        }
        System.out.println("le resultat de l'operation est : "+resultat);

    }
}