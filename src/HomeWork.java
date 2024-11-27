import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        System.out.println("example for for");
        for (int i = 0; i <= 30; i+=2) {

            if (i==30) {
                System.out.print(i+".");
                break;
            }
            System.out.print(i+",");
        }

        System.out.println("example for while");

        int countWhile = 0;
        while (countWhile <= 30) {
            System.out.println(countWhile);
            countWhile+=2;
        }

        System.out.println("for:");

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }

        }
        System.out.println("for each");

        for (int[] rows:arr){
//            System.out.println(Arrays.toString(rows));
            for (int numbers:rows){
                System.out.println(numbers);
            }
        }

    }
}
