import java.lang.*;
class Difference{
	public int calculateDifference(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum=sum+(int)Math.pow(i,2);
	}
		return sum;	
	}
}
class Lab6{
	public static void main(String[] args){
		Difference diff=new Difference();
		int x=diff.calculateDifference(10);
		System.out.println(x);
	}
}



		