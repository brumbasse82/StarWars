public class Character {
    protected String name;
    protected int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void action() {
        System.out.println("Character is doing something..");
    }

    public void showInfo(){
        System.out.println("Navn: " + name);
        System.out.println("Alder: " + age);
    }

    final void goLive() {
        System.out.println("Hey bloggen");
    }
}
