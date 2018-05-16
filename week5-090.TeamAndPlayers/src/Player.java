public class Player {

     private String name;
     private int amountOfGoals;

     public Player(String name){
         this.name = name;
         amountOfGoals = 0;
     }

     public Player(String name, int amountOfGoals){
         this.name = name;
         this.amountOfGoals = amountOfGoals;
     }

     public String getName(){
         return name;
     }

     public int goals(){
         return amountOfGoals;
     }

    @Override
    public String toString(){
         String player = String.format("Player: %s, goals %d",name,amountOfGoals);
         return player;
     }


}
