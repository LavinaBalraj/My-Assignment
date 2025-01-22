package week1.day3;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num[]= {1, 4,3,2,8, 6, 7};
 int j=1;
 Arrays.sort(num);
 for(int i=0;i<num.length-1;i++) {
	 if(j!=num[i]) {
		 System.out.println("Missing element is:" +j);
		 break;
	 }
	 j++;
 }
	}

}
