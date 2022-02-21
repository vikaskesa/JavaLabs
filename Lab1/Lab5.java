class Calculate{
	public int calculateSum(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			if((i%3==0)||(i%5==0)){
				sum=sum+i;

				}
			}
		return sum;
		}
		
	}

class Lab5{
	public static void main(String []args){
		Calculate cal=new Calculate();
		int p=cal.calculateSum(15);
		System.out.println(p);
		}
	}

	
			