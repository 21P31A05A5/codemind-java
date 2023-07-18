import java.util.*;
public class fibb{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int s=1;
        while(n>f){
           // System.out.print(f+" ");
            int t=f;
            f=s;
            s=t+f;
            
        }
        if(f==n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}