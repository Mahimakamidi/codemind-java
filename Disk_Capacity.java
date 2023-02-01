import java.util.*;
class disk
{
    public static void main(String args[])
    {
        int t,s,b,d;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        d=s*b*t*2*512;
        System.out.println(d);
    }
}