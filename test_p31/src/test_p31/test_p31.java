package test_p31;
public class test_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.showsum();
		Car car1=new Car();
		car1.setcar(1234, 20.5);
		Car.showsum();
		Car car2=new Car();
		car2.setcar(4567,30.5);
	}
	static class Car
	{
		public static int sum=0;
		private int num;
		private double gas;
		public Car()
		{
			num=0;
			gas=0.0;
			sum++;
			System.out.println("生產了車子");
		}
		public void setcar(int n,double g)
		{
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"將汽油量設為"+gas);
		}
		public static void showsum()
		{
			System.out.println("車子總共有"+sum+"台");
		}
		void show()
		{
			System.out.println("車號是"+this.num);
			System.out.println("汽油量是"+this.gas);
		}
	}

}
