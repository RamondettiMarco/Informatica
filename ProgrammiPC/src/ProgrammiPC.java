
/*Progettare mediante un diagramma UML e implementare in linguaggio Java una classe i cui oggetti rappresentano programmi per computer.
        Ogni oggetto deve avere almeno i seguenti attributi: denominazione, produttore, versione, sistema operativo, anno. La classe deve avere almeno i seguenti metodi:
        􀁭 costruttore che ha come parametri denominazione, produttore, versione, sistema operativo, anno;
        􀁭 costruttore di copia;
        􀁭 getDenominazione, getProduttore, getVersione, getSistema e getAnno che restituiscono i valori degli attributi;
        􀁭 setDenominazione, setProduttore, setVersione, setSistema e setAnno che modificano i valori degli attributi;
        􀁭 toString che restituisce una stringa con tutti i dati dell’oggetto su cui è invocato;
        􀁭 compareAnno che consente di confrontare l’anno di rilascio del programma con l’anno di rilascio di un altro programma. Inserire nella classe un metodo main che consenta di verificarne tutte le funzionalità.
        */

import java.util.Objects;

public class ProgrammiPC {
    //ATTRIBUTI
    private String denominazione;
    private String produttore;
    private double versione;
    private String SO;
    private int anno;

    //METODI
    public ProgrammiPC(String denominazione, String produttore, double versione, String SO, int anno){
        this.anno = anno;
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.SO = SO;
        this.versione = versione;
    }

    public ProgrammiPC(ProgrammiPC PC){
        this.anno = PC.anno;
        this.denominazione = PC.denominazione;
        this.produttore = PC.produttore;
        this.SO = PC.SO;
        this.versione = PC.versione;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public double getVersione() {
        return versione;
    }

    public void setVersione(double versione) {
        this.versione = versione;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "ProgrammiPC {" +
                "Denominazione: " + denominazione + "\n" +
                "Produttore: " + produttore + "\n" +
                "Versione: " + versione + "\n" +
                "SO: " + SO + "\n" +
                "Anno: " + anno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        int a = ((ProgrammiPC)o).getAnno();
        return (a == this.anno);
    }

}
