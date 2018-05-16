import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> book;

    public Phonebook(){
        book = new ArrayList<Person>();
    }

    public void add(String name, String number){
        book.add(new Person(name,number));
    }

    public void printAll(){
        for(Person p : book){
            System.out.println(p);
        }
    }

    public String searchNumber(String name){
        for(Person p : book){
            if(p.getName().equals(name)){
                return p.getNumber();
            }
        }
        return "number not known";
    }
}


