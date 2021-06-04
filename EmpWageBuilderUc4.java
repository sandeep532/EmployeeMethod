public class EmpWageBuilderUc4{
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME =2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int Working_Days_Per_Month=20;
public static final int Working_Hours_Per_Day=8;
	public static int EmployeeSwitchcase(){
		int empHrs;
		int empWage=0;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				System.out.println("Employee is Part Time");
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				System.out.println("Employee is Full Time");
				break;
			default:
				empHrs = 0;
		}
		empWage = empHrs*EMP_RATE_PER_HOUR;
		return empWage;
	}
	public static void main(String args[]){
		System.out.println(EmployeeSwitchcase());
	}

		
		

}