import java.util.Scanner;

public class Ques3 {
    static int sum(int[][] arr,int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
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
        System.out.println("Enter the starting range:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the ending range:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int sum=sum(arr,r1,c1,r2,c2);
        System.out.println("The sum is:"+sum);
    }
}
