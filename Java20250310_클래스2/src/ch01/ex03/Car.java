package ch01.ex03;


public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private static int count;
	
	static String companyState = "GM";
	
	
	public static void runState() {
		//정적 메소드 안에서 사용할수 있는 변수 및 메소드는
		//static이 붙어있는 정적메소드 정적 변수만 사용가능.
		
		
		System.out.println("Static Run()");
      count++;
      companyState="toyota";
//      company = "현대"//접근 불가
//      run();
	
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	public Car() {
		this("현대","그랜저","검정",250);
		
		System.out.println(++Car.count+"객체생성");
	}
	
	public Car(String company) {
		this.company=company;
	}
	public Car(String company,String model) {
		//this.company=company;
		//this.model=model;
		this(company,model,"검정",250);

	}
	
	
	public void run() {
		System.out.println(company+" 달린다.");

	
	
	}
	public Car(String company,String model,String color,int maxSpeed) {
		this.company = company;
		this.model = model;
        this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);

	}
	
}
