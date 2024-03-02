package Arrays;

public class Print_Diagnal_Array {
    public static void main(String[] args) {
        int [][] arr_2d = new int[3][3];
        arr_2d[0][0] = 1; // This should print
        arr_2d[0][1] = 2;
        arr_2d[0][2] = 3;
        arr_2d[1][0] = 4;
        arr_2d[1][1] = 5;// This should print
        arr_2d[1][2] = 6;
        arr_2d[2][0] = 7;
        arr_2d[2][1] = 8;
        arr_2d[2][2] = 9;// This should print

        for (int i = 0; i < arr_2d.length; i++) {
            System.out.println(arr_2d[i][i]);
        }
    }
}
