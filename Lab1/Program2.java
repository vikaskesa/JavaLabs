import java.util.Scanner;
class Traffic{
	String Light;
	Traffic(String Light){
		this.Light=Light;
}

	public void signal(){
			if(Light.equals("red")){
				System.out.println("Stop!");	
			}
			else if(Light.equals("yellow")){
				System.out.println("ready!");
			}
			else {
				System.out.println("go!");	
			}
}
		
}
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String Light =sc.next();
		Traffic t=new Traffic(Light);
		t.signal();
	}
}
			