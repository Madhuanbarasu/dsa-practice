package Arrays;
import java.util.Scanner;
public class Twosum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                   System.out.print(i +" "+ j);
                   found=true;
                   break;

                }



            }
            if(found) break;



        }
        if(!found){
            System.out.print(" ");
        }


    }

}
