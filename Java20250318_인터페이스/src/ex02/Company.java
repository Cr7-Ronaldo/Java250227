package ex02;

public class Company {

	public static void main(String[] args) {
		/*Employee[] employees = new Employee[5];
		employees[0]=new Secretary("Dule",1,"secretary",800);
        employees[1]=new Sales("Tuxi",2,"sales",1200);*/
        Employee[] employees = {new Secretary("Duke",1,"secretary",800),
        		new Sales("Tuxi",2,"sales",1200)};
        
        System.out.println("name\t\tdepartmant\t\tsalary\t\textra pay");
        System.out.println("---------------------------------------------------------------------");
        Company.printEmployee(employees,false);        
        System.out.println();
        
        System.out.println("name\t\tdepartmant\t\tsalary\t\t tax\t\t extra pay");
        System.out.println("---------------------------------------------------------------------------------");
        Company.printEmployee(employees, true);
       
	}

	
    public static void printEmployee(Employee[] emp,boolean isTax) {
    	//객체의 정보를 출력한다.(실행 결과를 참조)
    	//isTax의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하며 처리한다.
    
    for(Employee e : emp) {
    	System.out.printf(
    			"%-17s%-10s%18d",e.getName(),e.getDepartment(),e.getSalary() );
        if(isTax) {
        	System.out.printf("%15.1f",e.tax());
        }
    	
        if(e instanceof Sales) {
        	Sales s = (Sales)e;
        	System.out.printf("%20.2f",s.getExtraPay());
        }
        System.out.println();
    }
    }
}
