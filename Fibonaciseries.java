package week1.day2;

public class Fibonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=1,b=0,c=0;
		System.out.println(b);
		System.out.println(a);
		for(i=0;i<8;i++) {
			c=a+b;
			b=a;
			a=c;
			System.out.println(c);
		}
	}

}
