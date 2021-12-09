public class Mensola {
    //ATTRIBUTI
    private static final int MAX_NUM_VOLUMI = 15;
    private Libro volumi[];

    //COSTRUTTORI
    public Mensola(){
        volumi = new Libro[MAX_NUM_VOLUMI];
    }

    public Mensola(Mensola mensola){
        volumi = new Libro[MAX_NUM_VOLUMI];
        for(int i = 0; i < MAX_NUM_VOLUMI; i++){
            if(mensola.getVolume(i) != null){
                volumi[i] = mensola.getVolume(i);
            }
        }
    }

    //METODI
    public int setVolume(Libro libro, int i){
        if((i < 0) || (i > MAX_NUM_VOLUMI)){
            return -1; //posizione non valida
        }
        if(volumi[i] != null){
            return -2; //posizione occupata
        }
        volumi[i] = libro;
        return i;
    }

    public Libro getVolume(int i){
        if((i < 0) || (i > MAX_NUM_VOLUMI)){
            return null; //posizione non valida
        }
        return volumi[i];
    }

    public int rimuoviVolume(int i){
        if((i < 0) || (i > MAX_NUM_VOLUMI)){
            return -1; //posizione non valida
        }
        if(volumi[i] == null){
            return -2; //posizione vuota
        }
        volumi[i] = null;
        return i;
    }

    public int getNumVolumi(){
        int n = 0;
        for(int i = 0; i < MAX_NUM_VOLUMI; i++){
            if(volumi[i] != null){
                n++;
            }
        }
        return n;
    }

    public boolean cercaTitolo(String titolo){
        for(int i = 0; i < MAX_NUM_VOLUMI; i++){
            if(volumi[i] != null){
                return true;
            }
        }
        return false;
    }
    public int getNumMAxVolumi(){
        return MAX_NUM_VOLUMI;
    }
}
