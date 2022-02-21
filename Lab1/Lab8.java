import java.lang.*;
class Lab8{
	static boolean checkNumber(int n){
		int i=1;
		while((int)Math.pow(2,i)<n){
			i++;
		}
		if((int)Math.pow(2,i)==n)
			return true;	
		return false;
	}
	public static void main(String[] args){
		boolean x=Lab8.checkNumber(8);
		System.out.println(x);
}
		}