package A_LEARNING.ARRAY;
public class ARrays {
    public static void main(String[] args) {
        int[][] dot = {
            {1,57}, {2,78}, {3,35}, {4, 10},
        };

        for(int m = 0; m < dot.length; m++){
            for(int o = 0 ; o < dot[m].length ; o++){
                System.out.print(dot[m][o] + " ");
            }
            System.out.println();
        }
    }
}
