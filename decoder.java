import java.io.*;
import java.util.*;
class decoder
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  String s1,s,s2="";
  char a='Z',b='A',t=' ';
  System.out.println("Enter the string= ");
  s1=z.readLine();
  int c,l,i,j,d;
  System.out.println("Enter the shift value:");
  d=Integer.parseInt(z.readLine());
  c=d-1;
  s=s1.toUpperCase();
  l=s.length();
  if(c>26)
  {
   System.out.println("Invalid Shift Value");
  }
  else
  {
  for(i=0;i<l;i++)
  {
   char ch=s.charAt(i);
   j=(int)ch+c;
   if(j<=(int)a)
   {
    int ch1=(int)ch+c;
    t=(char)ch1;
    if(t>=65 && t<=90)
    s2=s2+t;
   }
   else
   {
    int m=c-((int)a-(int)ch);
    int k=m+(int)b-1;        
    t=(char)k;
    if(t>=65 && t<=90)
    s2=s2+t;
   }
   t= ' ';
   }
   System.out.println();
   System.out.println("DECODED TEXT=");
   StringTokenizer k=new StringTokenizer(s2,"QQ");
   int m=k.countTokens();
   String s3="";
   for(int q=1;q<=m;q++)
   {
    s3=k.nextToken();
    System.out.print(s3+" ");
  }
 }
 }
}
