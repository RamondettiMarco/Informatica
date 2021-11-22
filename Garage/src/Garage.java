import java.util.Objects;

public class Garage{
    private int livelli;
    private int postoAuto;
    private String tipoAuto;
    private Boolean abbonamento;
    private float tempoPermanenza;
    private float totOra;
    private int postiLiberi;
    private int postiTotali;
    private int postiOccupati;
    private float prezzoTot;
    private int penale;
    public Garage (int livelli, int postiTotali, int penale){
        set_livelli(livelli);
        setPostiTotali(postiTotali);
        setPenale(penale);

    }

    //getter/setter
    public int get_livelli() {return livelli;}
    private void set_livelli(int l ) {livelli = l;}
    public int get_postoAuto(){return postoAuto;}
    public void set_postoAuto(int p) {postoAuto = p;}

    public String get_tipoAuto() {return tipoAuto;}
    public void set_tipoAuto(String t){tipoAuto = t;}

    public void set_totTempo(float t){totOra = t;}
    public void setAbbonamento(){abbonamento = true;}
    public void set_tempoPermanenza(float t){tempoPermanenza = t;}
    public void setCalcolaTempo(){prezzoTot = tempoPermanenza * totOra;}
    public float getCalcolaTempo(){return prezzoTot;}

    private void setPostiTotali(int p){postiTotali = p;}
    public void setPostiOccupati(int p){postiOccupati = p;}
    public void setPostiLiberi(){postiLiberi = postiTotali-postiOccupati;}

    public int getPostiLiberi(){return postiLiberi;}
    public int getPostiOccupati(){return  postiOccupati;}
    public int getPostiTotali(){return  postiTotali;}


    private void setPenale(int p){penale = p;}
    public void applicoPenale(){if(tempoPermanenza>8) prezzoTot = prezzoTot + penale;}
    public float get_prezzoConPenale(){return prezzoTot;}

   @Override
    public boolean equals(Object x){
        int liv = ((Garage)x).get_livelli();
        int postoAuto = ((Garage)x).get_postoAuto();
        String tipoAuto = ((Garage)x).get_tipoAuto();
        int postiLiberi = ((Garage)x).getPostiLiberi();
        int postiOccupati = ((Garage)x).getPostiOccupati();
        float prezzoTot = ((Garage)x).get_prezzoConPenale();
        return (liv == this.livelli && postoAuto == this.postoAuto && tipoAuto == this.tipoAuto
                && postiLiberi == this.postiLiberi && postiOccupati == this.postiOccupati
                && prezzoTot == this.prezzoTot);
   }
}
