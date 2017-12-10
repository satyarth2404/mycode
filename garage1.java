import java.io.*;
import java.util.*;
class garage1
{
	static int top_r=-1,top_g=-1;
	static int truck_id[]=new int[20];
	static int grg[]=new int[20];
	public static void main(String ar[])throws Exception
	{
		DataInputStream z=new DataInputStream(System.in);
		int ch,ti,n;
		String c;
		do
		{
			System.out.println("Enter your choice 1.Line up the trucks on the road 2.Enter into Garage 3.Exit from garage 4.Show Trucks");
			ch=Integer.parseInt(z.readLine());
			switch(ch)
			{
				case 1:
					on_road();
					break;
				case 2:
					System.out.println("Enter the number of vehicles you want to enter into the garage");
					n=Integer.parseInt(z.readLine()); 
                                        for(int i=1;i<=n;i++)
					enter_garage(truck_id[top_r]);
					break;
				case 3:
					System.out.println("Enter the truck id of the vehicle you want ot exit");
					ti=Integer.parseInt(z.readLine());
					exit_garage(ti);
					break;
				case 4:
					show_trucks();
					break;
			 }
			 System.out.println("Do you want to continue? (Y/N)");
			 c=z.readLine();
			}
			while(c.equalsIgnoreCase("Y"));
		}
		public static void on_road()throws Exception
		{
			DataInputStream z=new DataInputStream(System.in);
			int n;
			System.out.println("Enter the number of vehicles you want to lineup");
			n=Integer.parseInt(z.readLine());
			System.out.println("Enter the truck id of the vehicles you want to lineup");
			for(int i=0;i<n;i++)
			{
				truck_id[i]=Integer.parseInt(z.readLine());
				top_r++;
			}
		}
		public static void enter_garage(int ti)
		{
		 grg[++top_g]=truck_id[top_r];
         truck_id[top_r]=0;
         top_r--;
         }
         public static void exit_garage(int ti)
         {
		  if(grg[top_g]==ti)
		  {
			  truck_id[++top_r]=grg[top_g];
                          grg[top_g]=0;
			  top_g--; 
		   }
		   else
		   System.out.println ("Truck "+ti+" cannot be moved");
		  }
		  public static void show_trucks()
		  {
			  System.out.println("The trucks on road are :");
			  for(int i=0;i<=top_r;i++)
			  System.out.println(truck_id[i]);
			  System.out.println("The trucks inside the garage are: ");
			  for(int i=0;i<=top_g;i++)
			  System.out.println(grg[i]);
			}
		}
            
