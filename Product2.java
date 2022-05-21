import java.util.Scanner;
class Product2
{
 int p_code;
 double price;
 String pname;;./
 Product2(int a, String b, double c)
   {
    p_code=a;
	price=c;
    pname=b;
   }
   static void calc(double g,double h,double i)
   {
	   if(g<h && g<i)
		   System.out.print("1st product has lowest price");
	   else if(h<g && h<i)
		   System.out.print("2nd product has lowest price");
	   else
		   System.out.print("3rd product has lowest price");
   }
   

public static void main(String args[])
{  
  Scanner s=new Scanner(System.in);
  int a,d,m;
  String b,e,n;
  Double c,f,p;
	  System.out.print("Enter the code of 1st product:");
	  a=s.nextInt();
	  System.out.print("Enter the name of 1st product:");
      b=s.next();
	  System.out.print("Enter the price of 1st product:");
      c=s.nextDouble();
	  System.out.print("Enter the code of 2nd product:");
	  d=s.nextInt();
	  System.out.print("Enter the name of 2nd product:");
      e=s.next();
	  System.out.print("Enter the price of 2nd product:");
      f=s.nextDouble();
	  System.out.print("Enter the code of 3rd product:");
	  m=s.nextInt();
	  System.out.print("Enter the name of 3rd product:");
      n=s.next();
	  System.out.print("Enter the price of 3rd product:");
      p=s.nextDouble();
      Product2 ob1=new Product2(a,b,c);
	  Product2 ob2=new Product2(d,e,f);
	  Product2 ob3=new Product2(m,n,p);
	  calc(ob1.price,ob2.price,ob3.price);
	  }
	  }