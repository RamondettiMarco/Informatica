public class TelevisoreTest {
    public static void main(String[] args) {
        Televisore tv = new Televisore(20, "HD", "nero");
        System.out.println("Informazioni generiche televisore:");
        System.out.println("Pollici: " +tv.getPollici());
        System.out.println("Schermo: " +tv.getSchermo());
        System.out.println("Colore: " +tv.getColore());
        tv.accendi();
        System.out.println("Televisore acceso: " +tv.isAcceso());
        System.out.println("Luminosità:" +tv.getLuminosita());
        tv.aumentaLuminosita();
        System.out.println("Luminosità attuale: " +tv.getLuminosita());
        tv.set_canale(5);
        System.out.println("Canale: " +tv.getCanale());
        tv.canaleSuccessivo();
        System.out.println("Nuovo Canale: " +tv.getCanale());
        System.out.println("Volume: " +tv.getVolume());
        tv.abbassaVolume();
        System.out.println("Volume attuale: " +tv.getVolume());
        tv.spegni();
        System.out.println("Televisore acceso: " +tv.isAcceso());


    }
}
