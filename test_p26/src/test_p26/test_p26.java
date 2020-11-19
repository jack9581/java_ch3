package test_p26;
public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.show();
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
		void show()
		{
			System.out.println("車號是"+this.num);
			System.out.println("汽油量是"+this.gas);
		}
	}

}
