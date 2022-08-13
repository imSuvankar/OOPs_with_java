public class asgmt_3_1 {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 200, 12, 17, 28, 100, 100 };
        int target = 128, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("%d + %d = %d\n", i, j, i+j);
                    sum += 1;
                    break;
                }
            }
        }
        if (sum == 0)
            System.out.println("null value");
    }
}