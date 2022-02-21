class trail{
	public static void main(String[] args){
		String locationNameSalary="HYDNMKIRAN-KUMARSAL25";
		String location=locationNameSalary.substring(0,3);
		String name=locationNameSalary.substring(5,16);
		String salary=locationNameSalary.substring(19,21);
		System.out.println(location);
		System.out.println(name);
		System.out.println(salary);
		String a="000";
		salary=salary+a;
		System.out.println(salary);
		}
	}
