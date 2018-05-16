import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        BirdDatabase database = new BirdDatabase();
        while(true){
            System.out.print("?");
            String command = reader.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                database.addBird(reader);
            }
            if(command.equals("Observation")){
                database.observe(reader);

            }
            if(command.equals("Statistics")){
                database.Statistics();
            }
            if(command.equals("Show")){
                database.show(reader);
            }
        }
    }
}
            



