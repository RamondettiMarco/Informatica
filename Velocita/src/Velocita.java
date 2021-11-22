import java.util.Objects;

public class Velocita {
    private double vel;
    private double vel2;

    public Velocita(){
        this.vel = 0;
    }

    public double getVel_Km_h() {
        return vel;
    }

    public void setVel_Km_h(int vel) {
        this.vel = vel;
    }

    public double getVel_m_s() {
        return vel2;
    }

    public void setVel_m_s() {
        double convertitore = 3.6;
        this.vel2 = (this.vel / convertitore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Velocita velocita = (Velocita) o;
        return Double.compare(velocita.vel, vel) == 0 && Double.compare(velocita.vel2, vel2) == 0;
    }

}
