import java.util.Scanner;
public class RecursionExample2 {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num:");
        int num=sc.nextInt();
        System.out.println("the fibonacci of "+num+":");
        for(int  i=0;i<num;i++)
        {
            System.out.println(fibonacci(i)" ");
        }

    }
}
