public class Jedi extends Character {

    public Jedi(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.printf(name + " swings lightsaber!");
    }

    public void meditate() {
        System.out.println(name + " mediterer");
    }
}
