class Lab2_2{
static int[] sortStrings(int[] arr){
	int n = arr.length;
	 int[] b = new int[n]; 
	int j=n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }

		return b;
	}
public static void main(String[] args) {

		int[] arr = new int[] {12,30,18,50,38};
		int a[]=sortStrings(arr);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			}
}
}