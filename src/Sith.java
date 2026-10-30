public class Sith extends Character {

    public Sith(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println(name + " bruger mørke kræfter");
    }
}
