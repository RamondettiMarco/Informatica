import java.util.Scanner;

public class VelocitaTest {
    public static void main(String[] args) {
        Velocita v = new Velocita();
        Scanner a = new Scanner(System.in);
        System.out.println("inserisci la velocita in km/h: ");
        int k = a.nextInt();
        v.setVel_Km_h(k);

        v.setVel_m_s();
        System.out.println("velocita in m/s: " +v.getVel_m_s());

        //SECONDO OGGETTO
        System.out.println("-------------------------------------------------------");
        System.out.println("Secondo oggetto: ");
        Velocita v2 = new Velocita();
        System.out.println("inserisci la velocita in km/h: ");
        int k2 = a.nextInt();
        v2.setVel_Km_h(k2);

        v2.setVel_m_s();
        System.out.println("velocita in m/s: " +v2.getVel_m_s());

        if(v2.equals(v)){
            System.out.println("L'oggetto1 e l'oggetto 2 Sono UGUALI");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 Sono DIVERSI");
        }
    }
}
