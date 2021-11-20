import java.util.*;

public class CentroDiRicercaTest {
    public static void main(String[] args) {
        CentroDiRicerca centro = new CentroDiRicerca();

        //NUMERO TEAM
        centro.set_numTeam(5);
        int numTeam = centro.get_numTeam();
        System.out.println("Numero team: "+numTeam+".");

        for(int i=0; i<numTeam; i++){
            System.out.println(" ");
            //SENIOR
            String nomeSenior = "Elisa";
            centro.set_senior(nomeSenior);
            String senior = centro.get_senior();
            System.out.println("Nome senior: "+senior+".");
            centro.set_Area(5);

            //JUNIOR
            centro.set_numJunior(4);
            int junior = centro.get_numJunior();
            System.out.println("Numero junior: "+junior+".");

            //RESPONSABILE
            String nomeResponsabile = "Marco";
            centro.set_responsabile(nomeResponsabile);
            String responsabile = centro.get_responsabile();
            System.out.println("Nome responsabile: "+responsabile+".");

            //AREA PROGETTO
            String area = "Informatica";
            centro.set_area(area);
            String areaProgetto = centro.getArea();
            System.out.println("Area del progetto: "+areaProgetto+".");
        }

        //SECONDO OGGETTO
        Scanner a = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("Secondo centro di ricerca: ");
        CentroDiRicerca c2 = new CentroDiRicerca();
        System.out.println("Inserisci il numero di Team: ");
        int team = a.nextInt();
        c2.set_numTeam(team);
        System.out.println("Inserisci il numero di junior: ");
        int j = a.nextInt();
        c2.set_numJunior(j);
        System.out.println("Inserisci il numero dell'area: ");
        int area = a.nextInt();
        c2.set_Area(area);

        if(c2.equals(centro)){
            System.out.println("L'oggetto1 e l'oggetto 2 Sono UGUALI");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 Sono DIVERSI");
        }
    }
}
