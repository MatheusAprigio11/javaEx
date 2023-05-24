import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        int[] fibonacci = new int[20];

        int primeiro = 0;
        int segundo = 1;

        fibonacci[0] = primeiro;
        fibonacci[1] = segundo;

        for (int i=1; i<20; i++){
            segundo = primeiro + segundo;
            primeiro = segundo - primeiro;
            fibonacci[i] = primeiro;
        }
        System.out.println(Arrays.toString(fibonacci));
    }
}