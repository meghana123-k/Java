import java.util.Scanner;

class EmployeeInfo {
	int[] emp_no = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
	String[] emp_name = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
	String[] join_date = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
	char[] dc = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
	String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
	int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
	int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 29000};
	int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
}
class Designation {
	char[] dc = {'e', 'c', 'k', 'r', 'm'};
	String[] desig = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
	int[] da = {20000, 32000, 12000, 15000, 40000};
}
public class Project1 {
	public static String getDesig(EmployeeInfo emp, Designation des, int index, int[] daHolder) {
		for(int i = 0; i < des.dc.length; i++) {
			if(emp.dc[index] == des.dc[i]) {
				daHolder[0] = des.da[i];
				return des.desig[i];
			}
		}
		return "";
	}
	public static int getSalary(EmployeeInfo emp, Designation des, int index, int da) {
		return emp.basic[index] + emp.hra[index] + da - emp.it[index];
	}

	public static void printDetails(EmployeeInfo emp, Designation des, int index) {
		int[] daHolder = new int[1];
		String desig = getDesig(emp, des, index, daHolder);
		int salary = getSalary(emp, des, index, daHolder[0]);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%d\t%-15s\t%-15s\t%-15s\t%d\n",emp.emp_no[index],emp.emp_name[index],emp.dept[index],desig,salary);
		System.out.println("--------------------------------------------------------------------");
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you ID: ");
		int id = sc.nextInt();
		EmployeeInfo emp = new EmployeeInfo();
		Designation des = new Designation();
		boolean isFound = false;
		for(int i = 0; i < emp.emp_no.length; i++) {
			if(id == emp.emp_no[i]) {
				isFound = true;
				printDetails(emp, des, i);
			}
		}
		if(!isFound) {
			System.out.println("There is no employee with empid: "+id);
		}
		sc.close();
	}
}
