import java.io.*;
class mirror
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  int r,c,t;
  System.out.println("Enter the number of rows ");
  r=Integer.parseInt(z.readLine());
  System.out.println("Enter the number of columns ");
  c=Integer.parseInt(z.readLine());
  int a[][]=new int[r][c];
  int b[][]=new int[r][c];
  for(int i=0;i<r;i++)
  {
   t=c-1;
   for(int j=0;j<c;j++)
   {
    a[i][j]=Integer.parseInt(z.readLine());
    b[i][t]=a[i][j];
    --t;
   }
 }
   System.out.println("Original matrix ");
   for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
     System.out.print(a[i][j]+"\t");
     }
     System.out.println();
    }
    System.out.println("Mirror Image ");
    for(int i=0;i<r;i++)
    {
     for(int j=0;j<c;j++)
     {
       System.out.print(b[i][j]+"\t");
       }
       System.out.println();
      }
     }
    }
        
