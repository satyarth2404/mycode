import java.io.*;
class minprice
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  int num;
  System.out.println("Enter the number of shops ");
  num=Integer.parseInt(z.readLine());
  int a[]=new int[num];
  for(int i=0;i<num;i++)
  {
   System.out.println("Enter the price by shop "+(i+1));
   a[i]=Integer.parseInt(z.readLine());
  }
   int min=a[0];
  for(int i=0;i<num;i++)
  { 
   if(a[i]<min)
   min=a[i];
  }
  System.out.println("Minimum price is "+min);
  }
 }