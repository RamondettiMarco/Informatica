public class Libro {
    //ATTRIBUTI
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    private final double COSTO_FISSO = 5.5;

    //METODI
    public Libro(String titolo, String autore, int numeroPagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public Libro(Libro libro){
        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.numeroPagine = libro.getNumeroPagine();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public static void setCostoPagina(double costo){
        costoPagina = costo;
    }

    public static double getCostoPagina(){
        return costoPagina;
    }

    public double prezzo(){
        return COSTO_FISSO + (numeroPagine * costoPagina);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", COSTO_FISSO=" + COSTO_FISSO +
                '}';
    }
}
