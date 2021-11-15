public class TrenoTest {
    public static void main(String[] args) {
        Treno t = new Treno("Trenitalia", "Prima", 220, "15.30", "16.45");
        System.out.println("Compagnia: " +t.getCompagnia());
        System.out.println("Classe: " +t.getClasse());
        System.out.println("Velocità: " +t.getVelocita() +"km/h");
        System.out.println("Partenza: " +t.getPartenza());
        System.out.println("Arrivo: " +t.getArrivo());
    }
}
