import java.util.*;
class Lab2_3{
	int arr[]={10,8,3,5,8,16};
	static int[] getSorted(int[] arr){
		int arr1[]=new int[10];
		for(int i=arr.length;i<=0;i++){
			arr1[i]=arr[i];
			}
		for(int i=0;i<arr1.length;i++){
			for(int j=i+1;j<arr1.length;j++){
				int temp=0;
				if(arr1[i]>arr1[j]){
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
}
		return (arr1);
}
	public static void main(String[] args){
		int arr[]={10,8,3,5,8,16};

		int arr2=Lab2_3.getsorted(arr);
		for(int i=0;i<=arr.length;i++){
			System.out.println(arr2[i]);
		}
		}
	}	
		
		
				