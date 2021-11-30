vimport java.util.*;

public class LanciTest {
    public static void main(String[] args) {
        Lanci l = new Lanci();
        Scanner a = new Scanner(System.in);
        System.out.println("scegli testa o croce: ");
        String scelta = a.nextLine();
        int contTesta = 0;
        int contCroce = 0;

        for(int i = 0; i < 5; i++){
            double tc = (Math.random() * 2);
            int b = ((int)tc);
            System.out.print("Testa o Croce: ");

            if(b == 1){
                System.out.println("Testa");
                contTesta++;
            }else{
                System.out.println("Croce");
                contCroce++;
            }

            l.setTesta(contTesta);
            l.setCroce(contCroce);

        }
        System.out.println("Numero di volte che è uscito CROCE: " +l.getCroce());
        System.out.println("Numero di volte che è uscito TESTA: " +l.getTesta());

        if (scelta == "testa"){
            if(l.getTesta() > l.getCroce()){
                System.out.println("HAI VINTO");
            }else{
                System.out.println("HAI PERSO");
            }
        }else{
            if(l.getCroce() > l.getTesta()){
                System.out.println("HAI VINTO");
            }else{
                System.out.println("HAI PERSO");
            }
        }


    }
}
