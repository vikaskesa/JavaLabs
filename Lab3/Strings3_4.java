class Strings3_4 {
	static int modifyNumber(int number1){
		StringBuffer sb = new StringBuffer();
		String str = Integer.toString(number1);
		for (int i = 0; i < str.length() - 1; i++) {
			int difference = (int) (str.charAt(i) - str.charAt(i + 1));
			sb.append(Math.abs(difference));
		}
		sb.append((int) Math.abs(str.charAt(str.length() - 1) - str.charAt(0)));
		return Integer.parseInt(sb.toString());
	}
        

    public static void main(String[] args) {

        int number2=Strings3_4.modifyNumber(158396);
	System.out.println(number2);
}
}
      