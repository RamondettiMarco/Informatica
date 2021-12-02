import java.util.*;

public class GiocatoriTest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Inserisci il nome del giocatore: ");
        String nome = a.nextLine();
        System.out.println("Inserisci l'età del giocatore: ");
        int eta = a.nextInt();
        System.out.println("Inserisci il valore di battuta del giocatore: ");
        double valore = a.nextDouble();
        Giocatori g1 = new Giocatori(nome, eta, valore);
        System.out.println(g1);

        //SECONDO OGGETTO
        System.out.println("--------------------------------------------------");
        System.out.println("Secondo giocatore: ");
        Scanner b = new Scanner(System.in);
        System.out.println("Inserisci il nome del giocatore: ");
        String nome2 = b.nextLine();
        System.out.println("Inserisci l'età del giocatore: ");
        int eta2 = a.nextInt();
        System.out.println("Inserisci il valore di battuta del giocatore: ");
        double valore2 = a.nextDouble();
        Giocatori g2 = new Giocatori(nome2, eta2, valore2);
        System.out.println(g2);

        if(g2.equals(g1)){
            System.out.println("L'oggetto1 e l'oggetto2 sono UGUALI");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 sono DIVERSI");
        }
    }
}
