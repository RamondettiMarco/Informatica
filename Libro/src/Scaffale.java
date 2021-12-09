public class Scaffale {
    //ATTRIBUTI
    private static final int NUM_RIPIANI = 5;
    private Mensola ripiani[];

    //COSTRUTTORI
    public Scaffale(){
        ripiani = new Mensola[NUM_RIPIANI];
        for(int i = 0; i < NUM_RIPIANI; i++){
            ripiani[i] = new Mensola();
        }
    }

    public Scaffale(Scaffale scaffale){
        Libro libro;
        ripiani = new Mensola[NUM_RIPIANI];
        for(int i = 0; i < NUM_RIPIANI; i++){
            ripiani[i] = new Mensola();
            for(int j = 0; j < ripiani[i].getNumMAxVolumi(); j++){
                libro = scaffale.getLibro(i, j);
                if(libro != null){
                    ripiani[i].setVolume(libro, j);
                }
            }
        }
    }

    //METODI
    public Libro getLibro(int ripiano, int posizione){
        if((ripiano < 0) || (ripiano > NUM_RIPIANI)){
            return null; //ripiano non valido
        }
        return ripiani[ripiano].getVolume(posizione);
    }

    public int setLibro(Libro libro, int ripiano, int posizione){
        if((ripiano < 0) || (ripiano > NUM_RIPIANI)){
            return -1; //ripiano non valido
        }
        if(ripiani[ripiano].setVolume(libro, posizione) < 0){
            return -2; //posizione nel ripiano non vuota o non valida
        }
        return 1; //inserimento effettuato
    }

    public int rimuoviLibro(int ripiano, int posizione){
        if((ripiano < 0) || (ripiano > NUM_RIPIANI)){
            return -1; //ripiano non valido
        }
        if(ripiani[ripiano].rimuoviVolume(posizione) < 0){
            return -2; //posizione nel ripiano non vuota o non valida
        }
        return 1; //eliminazione effettuato
    }

    public int getNumRipiani(){
        return NUM_RIPIANI;
    }

    public int getNumMaxLibri(){
        int n = 0;
        for(int i = 0; i < NUM_RIPIANI; i++){
            n += ripiani[i].getNumMAxVolumi();
        }
        return n;
    }

    public int getNumeLibri(){
        int n = 0;
        for(int i = 0; i < NUM_RIPIANI; i++){
            n += ripiani[i].getNumVolumi();
        }
        return n;
    }

    public int getNumLibri(int ripiano){
        if((ripiano< 0) || (ripiano > NUM_RIPIANI)){
            return -1; //ripiano non valido
        }
        return ripiani[ripiano].getNumVolumi();
    }
}

