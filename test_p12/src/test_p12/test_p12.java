package test_p12;
public class test_p12 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Car car1=new Car();
			car1.num=1234;
			car1.gas=20.5;
			car1.showcar();
		}
		static class Car
		{
			int num;
			double gas;
			
			void show()
			{
				System.out.println("車號是"+num);
				System.out.println("汽油量是"+gas);
			}
			void showcar()
			{
				System.out.println("開始顯示車輛資料");
				this.show();
			}
	}

}
