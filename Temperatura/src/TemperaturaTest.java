import java.util.Scanner;

public class TemperaturaTest {
    public static void main(String[] args) {
        Temperatura t = new Temperatura(18);
        Scanner a = new Scanner(System.in);
        System.out.println("Inserisci la temperatura in gradi Centrigradi: ");
        int c = a.nextInt();
        t.setGradiC(c);
        System.out.println("La temperatura in gradi Centrigradi è: " +t.getGradiC());
        t.setGradiF();
        System.out.println("La temperatura in gradi Fahrenheit è: " +t.getGradiF());

        //SECONDO OGGETTO
        System.out.println("-------------------------------------------------------");
        Temperatura t2 = new Temperatura(0);
        System.out.println("Inserisci la temperatura in gradi Centrigradi: ");
        int c1 = a.nextInt();
        t2.setGradiC(c1);
        System.out.println("La temperatura in gradi Centrigradi è: " +t2.getGradiC());
        t2.setGradiF();
        System.out.println("La temperatura in gradi Fahrenheit è: " +t2.getGradiF());

        if(t2.equals(t)){
            System.out.println("L'oggetto1 e l'oggetto 2 Sono UGUALI");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 Sono DIVERSI");
        }
    }
}
