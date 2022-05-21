import java.util.Scanner;
class ComplexNumber
{
	double re,im;
	ComplexNumber(double r,double im)
	{
		re=r;
		im=im;
		}
		static void com(double a,double b,double c,double d)
		{
			a=a+b;
			c=c+d;
			System.out.print("sum="+a+"+"+c+"i");
		}
	public static void main(String args[])
	{  
	Scanner s=new Scanner(System.in);
    Double im1,im2,r1,r2;
	System.out.print("Enter the real part of 1st number:");
	r1=s.nextDouble();
	System.out.print("Enter the imaginary part of 1st number:");
    im1=s.nextDouble();
	System.out.print("Enter the real part of 2nd number:");
	r2=s.nextDouble();
	System.out.print("Enter the imaginary part of 2nd number:");
    im2=s.nextDouble();
	ComplexNumber sm=new ComplexNumber(r1,im1);
	ComplexNumber sn=new ComplexNumber(r2,im2);
	com(r1,r2,im1,im2);
	  }
	  }