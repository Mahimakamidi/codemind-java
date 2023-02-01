import java.util.*;
import java.lang.Math;
class area
{
    public static void main(String args[])
    {
        
    int a,b,c;
    float r,s;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    s=(float)(a+b+c)/2;
    r=(s*(s-a)*(s-b)*(s-c));
    System.out.format("%.2f",Math.sqrt(r));
    }
}