import java.io.*;
import java.util.*;
class milkboot
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
 
  int n,sum=0,sum1=0,a,q,r;
  String s2="";
  System.out.println("Enter the number of farms ");
  n=Integer.parseInt(z.readLine());
  String s[]=new String[n];
  for(int i=0;i<n;i++)
  {
   s[i]=z.readLine();
  }
  for(int i=1;i<=n;i++)
  {
   StringTokenizer s1=new StringTokenizer(s[i-1]);
   int k=s1.countTokens();
   for(int j=1;j<=k;j++)
   {
   s2=s1.nextToken();
   if(j==1)
   sum=sum+(Integer.parseInt(s2));
   if(j==3)
   {
    a=Integer.parseInt(s2);
    sum1=sum1+a;
    }
    }
    }
    q=sum1/1000;
    sum=sum+q;
    r=sum1%1000;
    System.out.println("Total quantity is "+sum+" litres "+r+" ml");
    }
   }
