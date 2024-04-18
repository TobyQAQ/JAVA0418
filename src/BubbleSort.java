public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{44, 27, 19, 41, 10};
        for (int k = 0; k < a.length - 1; k++) {
            for (int j = 0; j < args.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
