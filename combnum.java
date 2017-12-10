//ISC Board 2015
import java.io.*;
class combnum
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  int M,N,num=0;
  System.out.print("INPUT : M=");
  M=Integer.parseInt(z.readLine());
  System.out.print("        N=");
  N=Integer.parseInt(z.readLine());
  if(M<100 || M>10000 || N>100)
  {
   System.out.print("OUTPUT:  INVALID INPUT");
  }
  else
  {
   int sum=0,dig=0;
   for(int i=M;i<=10000;i++)
   {
     num=i;
     while(num>0)
     {
      dig=num%10;
      sum=sum+dig;
      num=num/10;
     }
     if(sum==N)
     {
      System.out.println("OUTPUT: The required number="+i);
      String no=Integer.toString(i);
      int l1=no.length();
      System.out.println("      Total number of digits="+l1);
      sum=0;
      break;
     }
    sum=0;
    }
   }
  }
 }
