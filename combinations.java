import java.io.*;
class combinations
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  int num,t;
  System.out.println("Enter the number =");
  num=Integer.parseInt(z.readLine());
  for(int i=0;i<num;i++)
  {
   t=0;
  for(int j=i;j<num;j++)
  {
   t+=j;
   if(t==num)
   {
    for(int k=i;k<=j;k++)
    {
    System.out.print(k+"\t");
    }
    System.out.println();
   }
  }
 }
}
}
  
