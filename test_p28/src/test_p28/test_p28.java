package test_p28;
public class test_p28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.show();
		Car car2=new Car(1234,25.0);
		car2.show();
		
	}
	static class Car
	{
		private int num;
		private double gas;
		public Car()
		{
			num=0;
			gas=0.0;
			System.out.println("生產了車子");
		}
		public Car(int n,double g)
		{
			this();
			num=n;
			gas=g;
			System.out.println("生產了車號是"+num+"汽油量是"+gas+"的車子");
		}
		void show()
		{
			System.out.println("車號是"+this.num);
			System.out.println("汽油量是"+this.gas);
		}
	}
}
