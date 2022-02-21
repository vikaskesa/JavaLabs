class Strings3_2{
	public static String getImage(String str){
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		StringBuilder reverse=sb.reverse();
		return reverse.toString();
		
		}
	public static void main(String []args){
		String str="hello";
		String x=Strings3_2.getImage(str);
		System.out.println(str+"|"+x);
		}
	}s
		