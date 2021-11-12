public class FiguraTest{
    public static void main(String args[]){
        FiguraGeometrica figura = new FiguraGeometrica(3);
        int numLati = figura.getNumeroLati();
        System.out.println("Numero Lati: " +numLati);

        figura.setNumeroLati(4);
        numLati = figura.getNumeroLati();
        System.out.println("Nuovo numero lati:" +numLati);
        System.out.println(figura);

        //oppure stampare senza la variabile numLati
        System.out.println("Nuovo numero lati: " +figura.getNumeroLati());

        //assegna e stampa un numero di lati incrimentale fino ad 8
        for(int i = figura.getNumeroLati(); i < 9; i++){
            figura.setNumeroLati(i);
            System.out.println("Numero lati incrementato a: " +figura.getNumeroLati());
            System.out.println(figura);
        }
    }
}