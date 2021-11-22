public class Telecomando {
    private int canale;
    private boolean acceso;
    private int volume;
    private int volume_max;
    private int canale_max;

    public Telecomando(int v, int c){
        set_v_max(v);
        set_c_max(c);
    }

    //public boolean isAcceso(boolean a){return a;}


    public void set_canale(int c) {if(c>0 && c<canale_max) canale = c;}
    public int get_canale(){return canale;}
    public void canalePrecedente(){if(canale>0) canale--;}
    public void canaleSuccessivo(){if(canale<canale_max) canale++;}
    public void set_volume(int v) {if(v>0 && v<volume_max) volume = v;}
    private void set_c_max(int c){canale_max = c;}
    public int get_c_max(){return canale_max;}

    public int getVolume(){return volume;}
    public void alzaVolume(){if(volume<volume_max) volume++;}
    public void abbassaVolume(){if(volume>0) volume--;}
    public void mettiMuto(){if (volume != 0) volume = 0;}
    private void set_v_max(int v){volume_max = v;}
    public int get_v_max(){return volume_max;}

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
