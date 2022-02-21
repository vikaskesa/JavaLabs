import java.util.Scanner;
class NameException extends Exception{
	NameException(){
		super();
		}
}
class Lab5_2{
	public static void main(String[] args){
		//Scanner sc=new Scanner(System.in);
		//String firstName=sc.nextLine();
		//String lastName=sc.nextLine();
		String firstName="";
		String lastName="";
		try{
			if((firstName.equals("")) && (lastName.length()==0)){
				System.out.println("Exception occured");
				throw new NameException();
				}
			else{
			   System.out.println(firstName+" "+lastName);
                   }
		}
		catch(Exception e){
			System.out.println("Enter correct name ");
			}
		}
	}