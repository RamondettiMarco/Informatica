import java.util.*;

public class LanciTest {
    public static void main(String[] args) {
        Lanci l = new Lanci();
        Scanner a = new Scanner(System.in);
        System.out.println("scegli testa[1] o croce[0]: ");
        int scelta = a.nextInt();
        int contTesta = 0;
        int contCroce = 0;

        for(int i = 0; i < 5; i++){
            double tc = (Math.random() * 2);
            int b = ((int)tc);
            System.out.println("Testa o Croce: " +b);

            if(b == 1){
                contTesta++;
            }else{
                contCroce++;
            }

            l.setTesta(contTesta);
            l.setCroce(contCroce);

        }
        System.out.println("Numero di volte che è uscito CROCE: " +l.getCroce());
        System.out.println("Numero di volte che è uscito TESTA: " +l.getTesta());

        if (scelta == 1){
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
