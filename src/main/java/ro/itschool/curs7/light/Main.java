package ro.itschool.curs7.light;

public class Main {
    public static void main(String[] args) {
        OilLamp oilLamp = new OilLamp();
        oilLamp.gennieHello();

        LightBulb lightBulb = new LightBulb();

        showTheLight(lightBulb);
        showTheLight(oilLamp);
    }

    private static void showTheLight(Lumineers lumineer) {
        System.out.println(lumineer.isLit());
    }
}
