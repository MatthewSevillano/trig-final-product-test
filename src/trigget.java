import java.util.Scanner;
import trig.Trig;
public class trigget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Trig trig=new Trig();
		System.out.println("welcome to the trig! give me what you have. \nEnter 0 if you have no info for that letter");
			System.out.println("enter side A angle");
			double A = in.nextDouble();
			System.out.println("enter side a length");
			double a=in.nextDouble();
			System.out.println("enter side B angle");
			double B=in.nextDouble();
			System.out.println("enter side b length");
			double b=in.nextDouble();
			System.out.println("enter side C angle");
			double C = in.nextDouble();
			System.out.println("enter side c length");
			double c=in.nextDouble();
			if (A !=0 && a!= 0&& b!=0){
				 B=trig.sinLawAngle(A, a, b);
				System.out.format("angle b is %,.02f degress",B);
				 C=180-(A+B);
				 System.out.format("\nangle c is %,.02f degress",C);
				 c=trig.sinLawSide(A, a, C);
				 System.out.format("\nside c is %,.02f",c);
			
			} if (a!=0 && b!=0 && C!=0){
				c=trig.cosLawSide(C, b, a);
				System.out.format("c is %,.02f",c);
				A=trig.sinLawAngle(C,b,c);
				System.out.format("\nA is %,.02f degress",A);
			} if (B!=0 && b!=0 && c!=0){
				c=trig.cosLawSide(B, b, c);
				System.out.format("c is %,.02f",c);
			}
		}
	}