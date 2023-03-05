import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[5][5];
        // System.out.println("Enter an Element into the Array");
        for (int i = 0; i < 5; i++) {
            for(int j=0;j < 5;j++){
                System.out.println("Enter an Element into the Array");
                arr[i][j]=sc.nextInt();
            }
        }
        // Left Diagonal
        int leftSum=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j){
                    leftSum=leftSum+arr[i][j];
                }
            }
        }
        // Right Diagonal
        int i=0,j=4,rightSum=0;
        while(i<5 && j>=0){
            rightSum=rightSum+arr[i][j];
            System.out.println(arr[i][j]);
            i++;
            j--;
        }
        for(int k=0;k<5;k++){
            for(int l=0;l<5;l++){
                System.out.print(arr[k][l]+ " ");
            }
            System.out.println();
        }
        System.out.println("Left Diagonal Sum is "+ leftSum);
        System.out.println("Right Diagonal Sum is "+ rightSum);
    }
}
