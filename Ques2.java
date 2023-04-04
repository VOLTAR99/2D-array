import java.util.Scanner;

public class Ques2 {
    static int[][] _2darray(int[] arr1, int r,int c) {
        int index=0;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                    arr[i][j] = arr1[index];
                    index++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row:");
        int r=sc.nextInt();
        System.out.println("Enter the size of column:");
        int c=sc.nextInt();
//        int[][] arr=new int[r][c];
        int[] arr1=new int[r*c];
        System.out.println("Enter the elements:");
        for(int i=0;i< arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i< arr1.length;i++){
            System.out.println(+arr1[i]);
        }
        int[][] arr=_2darray(arr1,r,c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
