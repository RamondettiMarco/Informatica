import java.util.Scanner;

public class AereoTest {
    public static void main(String[] args) {
        Aereo a = new Aereo("Alitalia", 200, 2, "bianco");
        System.out.println("Nome: " +a.getNome());
        System.out.println("Velocità: " +a.getVelocita() +"km/h");
        System.out.println("Peso: " +a.getPeso() +"tonnellate");
        System.out.println("Colore: " +a.getColore());

        //SECONDO OGGETTO
        System.out.println("------------------------------------------------------------");
        System.out.println("Secondo Aereo: ");
        Scanner o = new Scanner(System.in);
        System.out.println("inserisci la velocita in km/h: ");
        double v = o.nextDouble();
        System.out.println("Inserisci il peso");
        double p = o.nextDouble();
        Aereo a2 = new Aereo("Alitalia", v, p, "bianco");

        if(a2.equals(a)){
            System.out.println("L'oggetto1 e l'oggetto 2 Sono UGUALI");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 Sono DIVERSI");
        }
    }
}
