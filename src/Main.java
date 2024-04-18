public class Main {
    public static void main(String[] args) {
/*
        int[][] a = new int[][]{{2, 3, 4, 5}, {8, 8, 4, 3}, {4, 6, 8, 4}};
        //列印列
        System.out.println((a.length));
        //列印行
        System.out.println(a[0].length);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                System.out.print(a[i][j] + ",");

            }
            System.out.println();
        }
*/
        int[][] grades = new int[][]{{80, 70}, {78, 90}, {87, 88}, {99, 70}, {66, 40}};
        for (int i = 0; i < grades.length; i++) {
            System.out.println("第" + (i+1) + "位的英文成績是：" + grades[i][0]);
        }

    }
}