import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {

    private ArrayList<Bird> birds;


    public BirdDatabase() {
        birds = new ArrayList<Bird>();

    }

    public void addBird(Scanner reader) {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String lName = reader.nextLine();
        birds.add(new Bird(name, lName));
    }

    public void observe(Scanner reader) {
        System.out.print("What was observed:? ");
        String n = reader.nextLine();
        boolean found = false;
        for (Bird b : birds) {
            if (b.getName().equals(n)) {
                b.addObservation();
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Is not a bird!");
        }
    }

    public void Statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void show(Scanner reader) {
        System.out.print("What? ");
        String n = reader.nextLine();
        for (Bird b : birds) {
            if (b.getName().equals(n)) {
                System.out.println(b);

            }
        }
    }
}


