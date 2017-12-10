/* NAME-SATYARTH SHUKLA
  INDEX NO.-2650001 */
import java.io.*;
class magicsq
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  int n,s1=0,s2=0,s3=0,f1=0,f2=0;
  System.out.println("Enter the size of matrix");
  n=Integer.parseInt(z.readLine());
  int a[][]=new int[n][n];
  System.out.println("Enter the elements of matrix");
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    a[i][j]=Integer.parseInt(z.readLine());
   }
  }
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    s1=s1+a[i][j];
    s2=s2+a[j][i];
   }
   if(i==0 && s1==s2)
   {
    f1=s1;
    f2++;
    s1=0;s2=0;
   }
   else if((i!=0) && (s1==s2) && (f1==s1))
   {
    s1=0;s2=0;
    f2++;
   }
   else
   {
    f2=0;
    break;
   }
  }
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(i==j)
    s3=s3+a[i][j];
   }
  }
  if(f2==n && f1==s3)
  System.out.println("MAGIC SQUARE");
  else
  System.out.println("NOT A MAGIC SQUARE");
  }
 }


