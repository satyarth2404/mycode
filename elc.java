import java.io.*;
 class elc 
 {
  public static void main(String[] args)throws Exception 
  {
        DataInputStream z=new DataInputStream(System.in);
        double I,M=0.0,mass;
        System.out.println("Enter the value of current passed in amperes ");
        I=Double.parseDouble(z.readLine());
        System.out.println("Enter the time for which current was passed in seconds ");
        int time,n=1;
        time=Integer.parseInt(z.readLine());
        String el;
        System.out.println("Enter element's chemical formula which has to be electroplated ");
        el=z.readLine();
        if(el.equals("Cu"))
        {
        M=63.546;
        n=2;
	    }
        else if(el.equals("Zn"))
        {
		M=65.38;
		n=2;
	     }   
        else if(el.equals("Ag"))
        {
		M=107.87;
		n=1;
         }
        else if(el.equals("Au"))
	    {
		 M=197;
		 n=1;
	   }
	   else if(el.equals("Pt"))
	   {
		M=195.084;
		n=2;
	}
	   else if(el.equals("Ni"))
	   {
		M=58.69;
		n=2;
	}
	else;
	mass=(M*I*time)/(96500*n);
	System.out.println("The mass of "+el+" deposited is "+(mass*1000)+" grams");
}
}