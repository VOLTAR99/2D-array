import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row:");
        int r = sc.nextInt();
        System.out.println("Enter the size of column:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the sorted elements:");   //already sorted array is given as mentioned in question
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the targeted number:");
        int x=sc.nextInt();
        int count=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==x){
                    System.out.println("Row:"+i);
                    System.out.println("Column:"+j);
                    count++;
                }
            }
        }
        if(count<0){
            System.out.println("-1");
        }
    }
}
