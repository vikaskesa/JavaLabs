import java.util.*;
class Lab2_1{
	static int getSecondSmallest(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int temp=0;
				if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;}
}
}
		return arr[1];
}
	public static void main(String[] args){
		int arr[]={5,8,10,18,9,6};
		int x=Lab2_1.getSecondSmallest(arr);
		System.out.println(x);
	}
}