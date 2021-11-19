public class GarageTest {
    public static void main(String arg[]){
        Garage garage = new Garage(12, 265, 12);

        //LIVELLI
        int livelli = garage.get_livelli();
        System.out.println("Numero livelli: "+livelli+".");

        //POSTO AUTO
        garage.set_postoAuto(58);
        int posto = garage.get_postoAuto();
        System.out.println("Numero posto auto: "+posto+".");

        //TIPO AUTO
        String tipoAuto = "automobile";
        garage.set_tipoAuto(tipoAuto);
        String tipo = garage.get_tipoAuto();
        System.out.println("Tipo auto: "+tipo+".");

        //ABBONAMENTO
        System.out.println("-Abbonamento rilasciato.");
        garage.setAbbonamento();

        //POSTI TOTALI/LIBERI/OCCUPATI
        int pTotali = garage.getPostiTotali();
        System.out.println("Posti totali: "+pTotali+".");
        garage.setPostiOccupati(123);
        int pOccupati = garage.getPostiOccupati();
        System.out.println("Posti occupati: "+pOccupati+".");
        garage.setPostiLiberi();
        int pLiberi = garage.getPostiLiberi();
        System.out.println("Posti liberi: "+pLiberi+".");

        //CALCOLO PREZZO TOTALE
        garage.set_totTempo(8);
        garage.set_tempoPermanenza(18);
        garage.setCalcolaTempo();
        float tempo = garage.getCalcolaTempo();
        System.out.println("Prezzo senza applico della penale: "+tempo+".");

        //APPLICO PENALE
        garage.applicoPenale();
        float prezzoConPenale = garage.get_prezzoConPenale();
        System.out.println("Prezzo con penale(se necessaria): "+prezzoConPenale+".");


    }

}
