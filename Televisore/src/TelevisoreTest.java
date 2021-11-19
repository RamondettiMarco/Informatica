import java.util.*;

public class TelevisoreTest {
    public static void main(String[] args) {
        Televisore tv = new Televisore(20, "HD", "nero");
        Scanner a = new Scanner(System.in);
        System.out.println("Informazioni generiche televisore:");
        System.out.println("Pollici: " +tv.getPollici());
        System.out.println("Schermo: " +tv.getSchermo());
        System.out.println("Colore: " +tv.getColore());
        tv.accendi();
        System.out.println("Televisore acceso: " +tv.isAcceso());
        System.out.println("Luminosità:" +tv.getLuminosita());
        tv.aumentaLuminosita();
        System.out.println("Luminosità attuale: " +tv.getLuminosita());
        System.out.println("Inserisci canale: ");
        int c = a.nextInt();
        tv.set_canale(c);
        System.out.println("Canale: " +tv.getCanale());
        tv.canaleSuccessivo();
        System.out.println("Nuovo Canale: " +tv.getCanale());
        System.out.println("Volume: " +tv.getVolume());
        tv.abbassaVolume();
        System.out.println("Volume attuale: " +tv.getVolume());
        tv.spegni();
        System.out.println("Televisore acceso: " +tv.isAcceso());

        //SECONDO OGGETTO, VALORI INSERITI DALL'UTENTE
        System.out.println("--------------------------------------------------------");
        System.out.println("Secondo televisore: ");
        Televisore tv2 = new Televisore(32, "AMOLED", "Bianco");
        System.out.println("Inserisci canale: ");
        int canale = a.nextInt();
        tv2.set_canale(canale);
        System.out.println("Inserisci luminosità: ");
        int luminosita = a.nextInt();
        tv2.set_Luminosita(luminosita);
        System.out.println("Inserisci volume: ");
        int volume = a.nextInt();
        tv2.set_Volume(volume);
        tv2.accendi();

        if(tv2.equals(tv)){
            System.out.println("L'oggetto1 e l'oggetto 2 Sono UGUALI");
        }else{
            System.out.println("L'oggetto1 e L'oggetto2 Sono DIVERSI");
        }
    }
}
