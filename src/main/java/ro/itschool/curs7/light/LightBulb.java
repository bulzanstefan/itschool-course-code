package ro.itschool.curs7.light;

public class LightBulb implements Lumineers {
    private boolean electricity;

    @Override
    public void on() {
        this.electricity = true;
    }

    public String hello() {
        return "Hello";
    }

    @Override
    public void off() {
        this.electricity = false;
    }

    @Override
    public boolean isLit() {
        return electricity;
    }
}
