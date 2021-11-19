import java.util.Scanner;

public class TrenoTest {
    public static void main(String[] args) {
        Treno t = new Treno("Trenitalia", "Prima", 220, "15.30", "16.45");
        System.out.println("Compagnia: " +t.getCompagnia());
        System.out.println("Classe: " +t.getClasse());
        System.out.println("Velocità: " +t.getVelocita() +"km/h");
        System.out.println("Partenza: " +t.getPartenza());
        System.out.println("Arrivo: " +t.getArrivo());

        //SECONDO TRENO
        System.out.println("-------------------------------------");
        System.out.println("Secondo Treno: ");
        Scanner a = new Scanner(System.in);
        System.out.println("inserisci la velocita in km/h: ");
        int v = a.nextInt();
        Treno t2 = new Treno("Trenitalia", "Prima", v, "15.30", "16.45");

        if(t2.equals(t)){
            System.out.println("L'oggetto1 e l'oggetto 2 Sono UGUALI");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 Sono DIVERSI");


        }
    }
}
