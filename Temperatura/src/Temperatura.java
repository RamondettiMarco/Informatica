import java.util.Objects;

public class Temperatura {
    private int tempC;
    private int tempF;

    //COSTRUTTORE
    public Temperatura(int temp){
        this.tempC = temp;
    }

    public int getGradiC() {
        return tempC;
    }

    public void setGradiC(int gradi) {
        tempC = gradi;
    }
    public void setGradiF(){
        tempF = 32 + (9 * this.tempC / 5);
    }
    public int getGradiF(){
        return tempF;
    }

    @Override
    public boolean equals(Object o) {
        int tC = ((Temperatura)o).getGradiC();
        int tF = ((Temperatura)o).getGradiF();
        return(tC == this.tempC && tF == this.tempF);
    }

}
