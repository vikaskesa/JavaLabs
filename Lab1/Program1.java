
import java.util.Scanner;
class cube{
	int n;
	cube(int n){
		this.n=n;
}
	public void cube(){
		int c=n*n*n;
		System.out.println("The cube of "+n+" is :"+c);

}
}

class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		cube c=new cube(n);
		c.cube();
}
}	
	