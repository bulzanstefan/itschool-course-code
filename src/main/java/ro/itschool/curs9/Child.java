package ro.itschool.curs9;

public class Child extends Parent {

    public Child() {
        this(10);
    }

    public Child(int age) {
        super(age);
    }

    @Override
    protected String say() {
        return "Child says something";
    }

    protected String say(String message, String voice) {
        return "Child says " + message + " with voice " + voice;
    }

    @Override
    public Child doSomething() {
        super.doSomething();
        System.out.println("Child: do something!");
        return null;
    }

    @Override
    public String toString() {
        return "Child with age " + getAge();
    }
}
