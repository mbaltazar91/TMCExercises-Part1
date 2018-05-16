
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while(true){
            System.out.println("name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name,studentNumber));
        }
        for(Student s : list){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for(Student s : list){
            if(s.getName().contains(searchTerm)){
                System.out.println(s);
            }
        }
    }
}
