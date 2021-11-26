import java.util.Scanner;

public class ProgrammiPCTest{
    public static void main(String[] args) {
        //PRIMO OGETTO
        ProgrammiPC PC = new ProgrammiPC("word", "office", 11.0, "Windows", 2017);
        System.out.println(PC);

        //SECONDO OGGETTO
        System.out.println("--------------------------------------------------------------------------------------------------");
        Scanner a = new Scanner(System.in);
        System.out.println("Inserisci l'anno del secondo oggetto: ");
        int anno = a.nextInt();
        Scanner v = new Scanner(System.in);
        System.out.println("Inserisci la versione del secondo oggetto: ");
        double versione = v.nextDouble();
        ProgrammiPC PC2 = new ProgrammiPC("word", "office", versione, "Windows", anno);
        System.out.println(PC2);

        if(PC2.equals(PC)){
            System.out.println("L'oggetto1 e l'oggetto 2 hanno l'anno UGUALE");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 hanno l'anno DIVERSO");
        }
    }
}
