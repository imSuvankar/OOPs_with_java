public class reverse_array {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4}, temp;

        for (int i = 0, j = arr.length - 1; i<arr.length/2; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}