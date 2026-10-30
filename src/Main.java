import java.util.ArrayList;

void main() {
    List<Character> character = new ArrayList<>();
    character.add(new Character("Lucas", 25));
    character.add(new Jedi("Kevin", 25));
    character.add(new Sith("Albert", 30));
    character.add(new Droid("Hans", 30));
    character.add(new CloneTrooper("Robert", 28));

    for(Character c : character) {
        c.showInfo();
        if (c instanceof Jedi) {
            ((Jedi) c).meditate();
        }
        c.action();
        System.out.println();
    }

    
}
