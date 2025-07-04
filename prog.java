import java.util.Scanner;
public class Evenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner();
        System.out.print("Enetr no");
        int no=sc.nextInt();
        if(no%2==0){
            System.out.print(no + "is even");
        }
        else{
            System.out.print(no + "is odd");

        }
        sc.close();
    }
}