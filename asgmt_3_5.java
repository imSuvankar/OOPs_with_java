public class asgmt_3_5 {
    public static void main(String[] args) {
        int[] x = {1,3,6,4,7,9,2,8,5};
        int temp;
        for(int i = 0; i < x.length-1; i++) {
            for(int j = 0; j < x.length-1-i; j++) {
                if (x[j] > x[j+1]) {
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        for (int i : x)
            System.out.print(i + ", ");
    }
}