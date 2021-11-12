public class FiguraGeometrica{
    private int numeroLati;

    public FiguraGeometrica(int numLati){
        this.numeroLati = numLati;
        //il "this" è il riferimento a "se stesso" (all'oggetto)
    }

    //metodo accessore -> getter
    public int getNumeroLati(){
        return this.numeroLati;
    }

    //metodo accessore -> setter
    public void setNumeroLati(int n){
        numeroLati = n;
    }
@Override
    public String toString() {
        return "FiguraGeometrica {numeroLati: "+this.numeroLati+"}";
    }
}