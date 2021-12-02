import java.util.*;
import java.lang.String;

public class Triangolo {
    private String tipo;
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(String tipo, double lato1, double lato2, double lato3){
        this.tipo = tipo;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    public Triangolo(Triangolo t){
        this.tipo = t.getTipo();
        this.lato1 = t.getLato1();
        this.lato2 = t.getLato2();
        this.lato3 = t.getLato3();
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLato1() {
        return this.lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return this.lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return this.lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }

    public double perimetro(Triangolo t){
        double perimetro = 0;
        double l1 = t.getLato1();
        double l2 = t.getLato2();
        double l3 = t.getLato3();
        perimetro = l1 + l2 + l3;
        return perimetro;
    }

    @Override
    public String toString(){
        return ("Tipo: " +tipo+ "\nLato1: " +lato1+ "\nLato2: " +lato2+ "\nLato3: " +lato3);
    }

    @Override
    public boolean equals(Object x){
        String t = ((Triangolo)x).getTipo();
        double l1 = ((Triangolo)x).getLato1();
        double l2 = ((Triangolo)x).getLato2();
        double l3 = ((Triangolo)x).getLato3();

        return (this.lato3 == l3 && this.lato2 == l2 && this.lato1 == l1 && t.compareTo(this.tipo) == 0 );
    }

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("inserire tipo: ");
        String tipo = a.nextLine();
        System.out.println("inserire lato 1: ");
        double l1 = a.nextDouble();
        System.out.println("inserire lato 2: ");
        double l2 = a.nextDouble();
        System.out.println("inserire lato 3: ");
        double l3 = a.nextDouble();

        Triangolo t = new Triangolo(tipo, l1, l2, l3);
        double perimetro = t.perimetro(t);
        System.out.println("Perimetro: " +perimetro);
        System.out.println(t.toString());
        System.out.println("Secondo Triangolo");
        Triangolo t2 = new Triangolo(t);
        System.out.println(t2.toString());
        if(t.equals(t2) == true){
            System.out.println("I due triangoli sono UGUALI");
        }else{
            System.out.println("I due triangoli sono DIVERSI");
        }
    }
}
