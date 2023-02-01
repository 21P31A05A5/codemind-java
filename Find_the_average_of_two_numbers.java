import java.util.Scanner;
class first
{
    public static void main(String args[])
    {
        int p,q;
        float r;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        r=(float)(p+q)/2;
        System.out.format("%.4f",r);
    }
}