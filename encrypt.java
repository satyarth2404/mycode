import java.io.*;
import java.util.*;
class encrypt
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  String s,part=" ";
  System.out.println("Enter the encoded message ");
  s=z.readLine();
  StringBuffer str=new StringBuffer(s);
  str.reverse();
  StringBuffer strn=new StringBuffer();
  for(int i=0;i<str.length();)
  {
   part=str.substring(i,i+2);
   int ip=Integer.parseInt(part);
   if((ip>=65 && ip<=90) || (ip>=97 && ip<=99))
   {
    strn.append((char)ip);
    i+=2;
   }
   else if(ip<65 || ip>90)
      {
      if(ip==32)
       {            
        strn.append((char)ip);
        i+=2;
        }
        else
        {
        if(ip>12)
        {
         System.out.println("Invalid Code");
         i+=2;
         }
        }
       }
        if(ip<=12)
        {
         part=str.substring(i,i+3);
         ip=Integer.parseInt(part);
         if(ip>=100 && ip<=122)
         {
          strn.append((char)ip);
          i+=3;
         }
         else
         {
          System.out.println("Invalid Code");
          i+=2;
          }
         }
        }
        String s1=strn.toString();
        System.out.println("Output: "+s1);
       }
      }

