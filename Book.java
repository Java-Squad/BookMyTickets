package bookmytickets;

import java.util.Scanner;

public class Book {


private static boolean Mainmenu= true;
private static boolean Submenu= true;
public static int tickets=100;
public static Scanner s=new Scanner(System.in);
static int n=s.nextInt();
//public static int n;
public static int c;
//public static int d1;
public static int tmep;
public static int d1=tickets-n;

public static void book(int n)
{
	System.out.println(" ");
	System.out.println(" ");
	System.out.print("Enter the tickets: ");
	//n=s.nextInt();
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(n +" tickets are booked");
	System.out.println(" ");
	System.out.println(" ");
	int d1=tickets-n;
	System.out.println("Remaing Tickets: "+d1);
}
	
public static void cancel(int c,int d1)
{
	System.out.print("Enter cancel tickets: ");
	c=s.nextInt();
	System.out.println(" ");
	System.out.println(" ");
	int temp=d1+c;
	System.out.println(c +" Tickets are cancelled");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Total tickets "+temp);
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(Mainmenu)
		{
			while(Submenu)
			{
				System.out.println("Welcome to Bookmymovie ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("B: Book a ticket");
                System.out.println(" ");
                System.out.println("C: cancel ticket ");
                System.out.println("  ");
                System.out.println(" ");
				
                Scanner sc=new Scanner(System.in);
                String select=sc.next();
                
                switch(select)
                {
                case "B":
                        book(n);            	
                	break;
                	
                	
                case "C":
                	cancel(n,d1);
                
                break;
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Would like to start another option \n\n1 Yes  \n\n2 No");
                System.out.println(" ");
                System.out.println(" ");
                
                if(sc.nextInt()==1)
                {
                	Submenu=true;
                }
                else
                {
                	Submenu=false;
                }
                Submenu=true;
                
                System.out.println(" ");
                System.out.println("Would like continue another program \n\n1 Yes  \n\n2 No");
                System.out.println(" ");
                System.out.println(" ");
                
                if(sc.nextInt()==1)
                {
                	Mainmenu=true;
                }
                else
                {
                	System.out.println(" ");
                	System.exit(0);
                }
                
			}
		}
	}

}
