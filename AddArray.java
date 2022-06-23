public class SumArray {
    static int sumArray(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length;i++) {
            sum =sum + arr[i];
        }
        return sum;
    }

    public static void main(String[]args) {
        int arr[] ={14,16,70,13};
        System.out.println(sumArray(arr));
    }
}
