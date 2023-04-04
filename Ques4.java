import java.util.Scanner;

public class Ques4 {
    static void reverse(int[][] arr,int r,int c){
        int[][] arr1=new int[r][c];
        int start=0,end=0;
        for(int i=0;i<r;i++){
            for(int j = c-1; j>=0; j--){
                arr1[start][end]=arr[i][j];
                end++;
            }
            start++;
            end=0;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(arr1[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row:");
        int r=sc.nextInt();
        System.out.println("Enter the size of column:");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        reverse(arr,r,c);
    }
}

//or we could use this method
//        for(int i = 0; i < n; i++){
//        int a = 0;
//        int b = m-1;
//        while(a < b){
//        int temp = mat[i][a];
//        mat[i][a] = mat[i][b];
//        mat[i][b] = temp;
//        a++;
//        b--;
//        }
//        }
