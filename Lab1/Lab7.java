class Lab7{
	static boolean checkNumber(int number){
		boolean flag=false;
		int cdigit=number%10;
		number=number/10;
		while(number>0){
			if(cdigit<=number%10){
			flag=true;
			break;
		}
		cdigit=number%10;
		number=number/10;
		}
		return flag;
	}
	public static void main(String[] args){
		boolean x=Lab7.checkNumber(134468);
		System.out.println(x);
		}
	}