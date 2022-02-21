import java.util.*;
class Lab6_5{
	static int getSecondSmallest(Integer[] arr){
		List<Integer> a1 = Arrays.asList(arr);
		Collections.sort(a1);
		Integer i=a1.get(1);
		return i;
			}
	public static void main(String[] args){
		Integer arr[]={10,15,8,10,4,5};
		int j=Lab6_5.getSecondSmallest(arr);
		System.out.println(j);
		}
	}		