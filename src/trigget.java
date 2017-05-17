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
				 A=trig.sinLawSide(A, b, B);
				 System.out.format("\nangle a is %,.02f degress",A);
			//System.out.format("your answer is %,.02f",answer1);
			
			//System.out.println("enter alpha angle"); 
			//double A = in.nextDouble();
			//System.out.println("enter alpha length");
			//double a=in.nextDouble();
			//System.out.println("enter side b length");
			//double b=in.nextDouble();
			//double answer2=trig.sinLawAngle(A, a, b);
			//System.out.format("your answer is %,.02f",answer2+" degrees");

			//System.out.println("enter length a");
			//double A = in.nextDouble();
			//System.out.println("enter length b");
			//double b=in.nextDouble();
			//System.out.println("enter angle c");
			//double c=in.nextDouble();
			//double answer3=trig.cosLawSide(A, b, c);
			//		System.out.format("your answer is %,.02f",answer3);
			//		System.out.println("enter the side length you want to find the angle with");
			//		double a=in.nextDouble();
			//		System.out.println("enter length b");
			//			double b=in.nextDouble();
			//		System.out.println("enter length a");
			//		double c=in.nextDouble();
			//		double answer4=trig.cosLawAngle(a, b, c);
			//		System.out.format("the angle of your selected side length is %,.02f",answer4);
		}
	}
}




	

