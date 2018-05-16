import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> list;
    private int maxSize;

    public Team(String name){
        this.name = name;
        list = new ArrayList<Player>();
        maxSize = 16;
    }

    public String getName(){
        return name;
    }

    public void addPlayer(Player player){
        if(size()<maxSize) {
            list.add(player);
        }
    }

    public void printPlayers(){
        for(Player p : list){
            System.out.println(p);
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return list.size();
    }

    public int goals(){
        int total = 0;
        for(Player p : list){
            total+=p.goals();
        }
        return total;
    }
}
