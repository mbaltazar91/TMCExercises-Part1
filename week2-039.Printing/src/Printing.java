public class Printing {

    public static void printStars(int amount) {
        for(int i = 0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        for(int i = 0; i<height; i++){
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for(int i = 0; i<size; i++){
            printStars(i+1);
        }
    }

    public static void main(String[] args) {


    }

}
