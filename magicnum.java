import java.io.*;
class magicnum
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  int n,sum=0,sum1=0,m,m1;
  System.out.println("Enter a number ");
  n=Integer.parseInt(z.readLine());
  do
  {
   m=n%10;
   sum=sum+m;
   n=n/10;
   }
   while((n%10)!=0);
   if((sum/10)!=0)
   {
    do
    {
     m1=sum%10;
     sum1=sum1+m1;
     sum=sum/10;
    }
    while((sum%10)!=0);
    }
    if(sum1==1)
    System.out.println("Magic number");
    else
    System.out.println("Not a magic number");
    }
  }