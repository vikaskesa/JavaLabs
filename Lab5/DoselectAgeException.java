class InvalidAgeException extends Exception{
	InvalidAgeException(){
		super();
	
}
}
class DoselectAgeException{
	public static void main(String[] args){
		int age=20;
	try{
		if(age<18){
			System.out.println("Exception occured");
			throw new InvalidAgeException();
			
			}
		else{
			System.out.println("Elgible for voting");
		}
		}
	catch(Exception e){
		System.out.println("Enter the correct age");
		}
	}
}