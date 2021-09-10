package practice;

abstract class Customer{
	final public void dD() {
		System.out.println("ssd");
	}
	abstract void cD();
}


public class Practice1 extends Customer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display(null,"dsdsd");
		//Customer c=new Test2();
		//c.cD();
		int num1=2;
		int num2=3;
		int sum=++num1+num2++;
		System.out.println(++sum*10);
		System.out.println(sum++*10);

	}
	
	public  void cD() {
		dD();
		
	}

}
