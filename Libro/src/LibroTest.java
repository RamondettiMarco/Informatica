public class LibroTest {
    public static void main(String[] args) {
        Libro l1 = new Libro("Pinocchio", "C. Collodi", 150);
        Libro l2 = new Libro("Pollicino", "C. Perrault", 80);

        System.out.println("Costo pagina: " +Libro.getCostoPagina());
        System.out.println(l1.getTitolo()+ ": " +l1.prezzo());
        System.out.println(l2.getTitolo()+ ": " +l2.prezzo());

        System.out.println("-----------------------------------------------");

        Libro.setCostoPagina(0.1);
        System.out.println("Costo pagina: " +Libro.getCostoPagina());
        System.out.println(l1.getTitolo()+ ": " +l1.prezzo());
        System.out.println(l2.getTitolo()+ ": " +l2.prezzo());
        Libro l3 = new Libro(l2);
        System.out.println(l3);
    }
}
