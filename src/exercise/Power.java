package exercise;

public class Power {
	public static int power(int num,int exp) {
		if(exp==0) {
			return 1;
		}
		return num*power(num,exp-1);
	}
}
