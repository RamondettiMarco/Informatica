public class CentroDiRicerca{
    private int numTeam;
    private String area;
    private int numJunior;
    private String senior;
    private String responsabile;
    private String progetto;
    private int nArea;


    //getter/setter
    public void set_numTeam(int nT) {numTeam = nT;} //numero di team
    public int get_numTeam() {return numTeam;}
    public void set_area(String a) {area = a;}   //area del progetto
    public String getArea(){return area;}
    public void set_responsabile(String r){responsabile = r;}    //responsabile
    public String get_responsabile(){return responsabile;}

    public void set_numJunior(int n){numJunior = n;}    //numero junior
    public int get_numJunior(){return numJunior;}

    public void set_senior(String s){senior = s;}    //senior
    public String get_senior(){return senior;}


    public int get_NumArea() {return nArea;}   //
    public void set_Area(int nA){nArea = nA;}

    @Override
    public boolean equals(Object x){
        int t = ((CentroDiRicerca)x).get_numTeam();
        int j = ((CentroDiRicerca)x).get_numJunior();
        int a = ((CentroDiRicerca)x).get_NumArea();
        return(t == this.numTeam && j == this.numJunior && a == this.nArea);
    }
}
