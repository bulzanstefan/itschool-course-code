package ro.itschool.curs7.light;

public class OilLamp implements Lumineers, GennieHome {
    private boolean fire;

    @Override
    public void on() {
        this.fire = true;
    }

    @Override
    public void off() {
        this.fire = false;
    }

    @Override
    public boolean isLit() {
        return fire;
    }

    public void addOil(int liters) {
    }

    @Override
    public String gennieHello() {
        return "Hello Will!";
    }
}
