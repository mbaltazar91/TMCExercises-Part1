import java.util.Arrays;

public class Main {

    public static int[] copy(int[] array){
        int[] copy = new int[array.length];
        for(int i = 0; i<array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array){
        int[] reverseCopy = new int[array.length];
        int index = 0;
        while(index < array.length) {
            for (int i = array.length - 1; i >= 0; i--) {
                reverseCopy[index] = array[i];
                index++;
            }
        }
        return reverseCopy;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);


        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "reversed: " + Arrays.toString(reverse));
    }
    
}
