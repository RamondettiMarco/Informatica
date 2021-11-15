public class Televisore{

    //attributi caratteristiche apparecchio

    private int pollici;
    private String schermo;
    private String colore;

    //attributi stato apparecchio

    private int canale;
    private int volume;
    private int luminosita;
    private boolean acceso;

    //getter/setter
    //Televisore(int pollici, String schermo, String colore);
    public int getPollici() {return pollici;}
    private void set_pollici(int p) {pollici = p;}
    public String getColore(){return colore;}
    private void set_colore(String c) {colore = c;}
    public String getSchermo() {return schermo;}
    private void set_schermo(String s){schermo = s;}
    public int getCanale(){return canale;}
    public int getVolume(){return volume;}
    public int getLuminosita(){return luminosita;}
    public boolean isAcceso() {return acceso;}
    public void set_canale(int c) {if(c>0 && c<99) canale = c;}

    //operazioni

    public void accendi(){acceso = true;}
    public void spegni(){acceso = false;}
    public void canaleSuccessivo(){if(canale<99) canale++;}
    public void canalePrecedente(){if(canale>0) canale--;}
    public void alzaVolume(){if(volume<50) volume++;}
    public void abbassaVolume(){if(volume>0) volume--;}
    public void aumentaLuminosita(){if(luminosita<80) luminosita++;}
    public void diminuisciLuminosita(){if(luminosita>0) luminosita--;}

    //costruttore

    public Televisore (int pollici, String schermo, String colore){
        set_pollici(pollici);
        set_schermo(schermo);
        set_colore(colore);
        canale = 1;
        volume = 10;
        luminosita = 40;
        acceso = false;
    }
}
