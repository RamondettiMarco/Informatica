public class Treno {

    private String compagnia;
    private String classe;
    private int velocita;
    private String partenza;
    private String arrivo;

    public Treno(String compagnia, String classe, int velocita, String partenza, String arrivo)
    {
        setCompagnia(compagnia);
        setClasse(classe);
        setVelocita(velocita);
        setPartenza(partenza);
        setArrivo(arrivo);

    }
    public String getCompagnia() {return compagnia;}
    private void setCompagnia(String comp) {compagnia = comp;}
    public String getClasse() {return classe;}
    private void setClasse(String c) {classe = c;}
    public int getVelocita()  {return velocita;}
    private void setVelocita(int v) {velocita = v;}
    public String getPartenza() {return partenza;}
    private void setPartenza(String p) {partenza = p;}
    public String getArrivo() {return arrivo;}
    private void setArrivo(String a) {arrivo = a;}
}