import java.util.*;
class average
{
    public static void main(String args[])
    {
        int a,b;
        float r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        r=(float)(a+b)/2;
        System.out.format("%.4f",r);
    }
}