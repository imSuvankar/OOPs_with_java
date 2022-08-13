import java.util.Arrays;

public class asgmt_3_7 {
    public static void main(String[] args) {
        int[][] x = {{1,2},{3,4}};
        int[][] y = {{5,6},{7,8}};
        int[][] z = new int[x[0].length][x[1].length];
        
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                z[i][j] = (x[i][j] + y[i][j]);
        }
        System.out.printf(Arrays.toString(z[0]) + Arrays.toString(z[1]));
    }
}