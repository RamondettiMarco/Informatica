import java.util.*;

public class TelecomandoTest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Inserire il volume massimo del televisore: ");
        int v_max = a.nextInt();

        System.out.println("Inserire il canale massimo del televisore: ");
        int c_max = a.nextInt();

        Telecomando t = new Telecomando(v_max, c_max);
        int canale;
        c_max = t.get_c_max();
        v_max = t.get_v_max();
        System.out.println("Inserire lo stato della televisione (1 se acceso, 0 se spento): ");
        int s = a.nextInt();
        while(s == 1){
            System.out.println("TELEVISORE ACCESO");
            //inserire il canale
            do{
                System.out.println("Inserisci il canale: ");
                canale = a.nextInt();
            } while (canale > c_max);
            t.set_canale(canale);
            System.out.println("Canale: "+canale+".");

            System.out.println("se vuoi aumentare il canale premi 1, se vuoi diminuire premi -1, se vuoi " +
                    "impostare un canale premi 0");
            int p = a.nextInt();
            if(p == 1){
                t.canaleSuccessivo();
                canale = t.get_canale();
                System.out.println("Canale successivo: "+canale+".");
            } else if(p == -1){
                t.canalePrecedente();
                canale = t.get_canale();
                System.out.println("Canale precedente: "+canale+".");
            } else if (p == 0){
                int c2;
                System.out.println("Inserisi il canale: ");
                c2 = a.nextInt();
                t.set_canale(c2);
                canale = t.get_canale();
            }

            //VOLUME
            int volume;
            do {
                System.out.println("Inserisci il volume: ");
                volume = a.nextInt();
            } while (volume > v_max);
            t.set_volume(volume);
            volume = t.getVolume();
            System.out.println("Volume: "+volume+".");

            System.out.println("se vuoi aumentare il volume premi 1, se vuoi diminuire premi -1, se vuoi " +
                    "mettere il muto premi 0");
            int v = a.nextInt();
            if(v == 1){
                t.alzaVolume();
                volume = t.getVolume();
                System.out.println("Aumento volume: "+volume+".");
            } else if (v == -1){
                t.abbassaVolume();
                volume = t.getVolume();
                System.out.println("Diminuisco volume: "+volume+".");
            } else if(v == 0){
                t.mettiMuto();
                volume = t.getVolume();
                System.out.println("MUTO, volume: "+volume+".");
            }


            System.out.println("\nInserire lo stato della televisione (1 se acceso, 0 se spento): ");
            s = a.nextInt();
        }
        System.out.println("TELEVISORE SPENTO");

        //********************************************************************************************
        //secondo oggetto
        System.out.println("\n*****************************\nSECONDO OGGETTO");
        System.out.println("Inserire il volume massimo del televisore: ");
        int v_max2 = a.nextInt();

        System.out.println("Inserire il canale massimo del televisore: ");
        int c_max2 = a.nextInt();

        Telecomando t2 = new Telecomando(v_max2, c_max2);
        int canale2;
        c_max2 = t2.get_c_max();
        v_max2 = t2.get_v_max();
        System.out.println("Inserire lo stato della televisione (1 se acceso, 0 se spento): ");
        int s2 = a.nextInt();
        while(s2 == 1){
            System.out.println("TELEVISORE ACCESO");
            //inserire il canale
            do{
                System.out.println("Inserisci il canale: ");
                canale2 = a.nextInt();
            } while (canale2 > c_max2);
            t2.set_canale(canale2);
            System.out.println("Canale: "+canale2+".");

            System.out.println("se vuoi aumentare il canale premi 1, se vuoi diminuire premi -1, se vuoi " +
                    "impostare un canale premi 0");
            int p2 = a.nextInt();
            if(p2 == 1){
                t2.canaleSuccessivo();
                canale2 = t2.get_canale();
                System.out.println("Canale successivo: "+canale2+".");
            } else if(p2 == -1){
                t2.canalePrecedente();
                canale2 = t2.get_canale();
                System.out.println("Canale precedente: "+canale2+".");
            } else if (p2 == 0){
                int c3;
                System.out.println("Inserisi il canale: ");
                c3 = a.nextInt();
                t2.set_canale(c3);
                canale2 = t2.get_canale();
            }

            //VOLUME
            int volume2;
            do {
                System.out.println("Inserisci il volume: ");
                volume2 = a.nextInt();
            } while (volume2 > v_max2);
            t2.set_volume(volume2);
            volume2 = t2.getVolume();
            System.out.println("Volume: "+volume2+".");

            System.out.println("se vuoi aumentare il volume premi 1, se vuoi diminuire premi -1, se vuoi " +
                    "mettere il muto premi 0");
            int v2 = a.nextInt();
            if(v2 == 1){
                t2.alzaVolume();
                volume2 = t2.getVolume();
                System.out.println("Aumento volume: "+volume2+".");
            } else if (v2 == -1){
                t2.abbassaVolume();
                volume2 = t2.getVolume();
                System.out.println("Diminuisco volume: "+volume2+".");
            } else if(v2 == 0){
                t2.mettiMuto();
                volume2 = t2.getVolume();
                System.out.println("MUTO, volume: "+volume2+".");
            }


            System.out.println("\nInserire lo stato della televisione (1 se acceso, 0 se spento): ");
            s2 = a.nextInt();
        }
        System.out.println("TELEVISORE SPENTO");

        if(t2.equals(t)){
            System.out.println("Gli oggetti sono uguali");
        } else {
            System.out.println("Gli oggetti sono diversi");
        }

    }
}
