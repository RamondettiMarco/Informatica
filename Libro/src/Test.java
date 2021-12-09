public class Test {
    public static void main(String[] args) {
        Scaffale scaffale = new Scaffale();
        Libro libro;

        Libro l1 = new Libro("Pinocchio", "C. Collodi", 150);
        Libro l2 = new Libro("Pollicino", "C. Perrault", 80);
        Libro l3 = new Libro("La bella addormentata nel bosco", "C.Perrault", 50);

        //MENSOLA 0
        scaffale.setLibro(l1, 0, 10);
        scaffale.setLibro(l2, 0, 0);

        //TEST MENSOLA 1
        libro = new Libro("Cappuccetto rosso", "F.lli Grimm", 150);
        scaffale.setLibro(libro, 1, 1);

        //TEST ERRORI
        if(scaffale.setLibro(l3, 10, 0) == -1){
            System.out.println("mensola non valida");
        }
        if(scaffale.setLibro(l3, 0, 20) == -2){
            System.out.println("mensola non valida o non libera");
        }
        if(scaffale.setLibro(l3, 0, 10) == -2){
            System.out.println("mensola non valida o non libera");
        }

        //MENSOLA 1
        scaffale.setLibro(l3, 1, 0);

        //CONTENUTO MENSOLE
        for(int i = 0; i < scaffale.getNumRipiani(); i++){
            for(int j = 0; j < scaffale.getNumLibri(j); j++){
                libro = scaffale.getLibro(i, j);
                if(libro != null){
                    System.out.println("Ripiano: "+i+ "Posizione: "+j+ "-> "+libro.getTitolo()+ " "+libro.prezzo()+ "€");
                }
            }
        }

    }
}
