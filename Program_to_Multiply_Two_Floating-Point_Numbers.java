import java.util.Scanner;
class first
{
    public static void main(String args[])
    {
        float p,q;
        Scanner sc=new Scanner(System.in);
        p=sc.nextFloat();
        q=sc.nextFloat();
        System.out.format("%.2f",p*q);
    }
}