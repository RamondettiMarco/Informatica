public class Aereo  {

    private String nome;
    private double velocita;
    private double peso;
    private String colore;

    public Aereo(String nome, double velocita, double peso, String colore)
    {
        setNome(nome);
        setVelocita(velocita);
        setPeso(peso);
        setColore(colore);
    }
    public String getNome() {return nome;}
    private void setNome(String n) {nome = n;}
    public double getVelocita() {return velocita;}
    private void setVelocita(double v) {velocita = v;}
    public double getPeso() {return peso;}
    private void setPeso(double p) {peso = p;}
    public String getColore() {return colore;}
    private void setColore(String c) {colore = c;}

    @Override
    public boolean equals(Object x){
        String n = ((Aereo)x).getNome();
        double v = ((Aereo)x).getVelocita();
        double p = ((Aereo)x).getPeso();
        String c = ((Aereo)x).getColore();
        return(c == this.colore && n == this.nome && v == this.velocita && p == this.peso);
    }
}
