import java.util.Objects;

public class Giocatori {
    //ATTRIBUTI
    private String nome;
    private double battuta;
    private int eta;

    //METODI
    public Giocatori(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    public Giocatori(String nome, int eta, double valore){
        this.nome = nome;
        this.eta = eta;
        this.battuta = valore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBattuta() {
        return battuta;
    }

    public void setBattuta(double battuta) {
        this.battuta = battuta;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Giocatori{" +
                "nome: " + nome + "\n" +
                "battuta: " + battuta + "\n" +
                "eta: " + eta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        int a = ((Giocatori)o).getEta();
        double b = ((Giocatori)o).getBattuta();
        String c = ((Giocatori)o).getNome();
        return(this.eta == a && this.battuta == b && c.compareTo(this.nome) == 0);
    }

}
