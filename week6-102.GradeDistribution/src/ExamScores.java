import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExamScores {

    private Map<Integer,Integer> scores;
    private int accepted;
    private int total;

    public ExamScores(int accepted, int total){
        scores = new HashMap<Integer, Integer>();
        this.accepted = accepted;
        this.total = total;
    }

    public void addGrade(int score){
        if(score>=0&&score<=60){
            total++;
            accepted+=(grade(score)!=0)?1:0;
            if(scores.containsKey(grade(score))){
                scores.put(grade(score),scores.get(grade(score))+1);
            }
            else{
                scores.put(grade(score),1);
            }
        }
    }

    public int grade(int score){
        if(score>=50){
            return 5;
        }
        if(score>=45){
            return 4;
        }
        if(score>=40){
            return 3;
        }
        if(score>=35){
            return 2;
        }
        if(score>=30){
            return 1;
        }
        return 0;
    }

    public void printGrades(){
        System.out.println("Grade Distribution:");
        for(int i = 5; i>=0; i--){
            System.out.print(i + ": ");
            if(scores.containsKey(i)){
                for(int j = 0; j<scores.get(i); j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("Acceptance percentage: " + ((double)accepted/total)*100);
    }

}

