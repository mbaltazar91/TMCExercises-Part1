import java.util.Random;

public class NightSky {
    private int height;
    private int width;
    private double density;
    private int starsInLastPrint;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        Random random = new Random();
        for(int i = 0; i<width; i++){
            double star = random.nextDouble();
            if(star<=density){
                System.out.print("*");
                starsInLastPrint++;
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print(){
        starsInLastPrint = 0;
        for(int i = 0; i<height; i++){
            printLine();
        }
    }
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}
