package test_p22;
public class test_p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.setnumgas(1234,20.5);
		car1.show();	
		System.out.println("指定不正確的汽油量[-10,0]看看");
		car1.setnumgas(1234,-10);
		car1.show();
	}
	static class Car
	{
		private int num;
		private double gas;
		public void setnumgas(int n,double g)
		{
			if(g>0 && g<100)
			{
				num=n;
			    gas=g;
			    System.out.println("將車號設為"+num+"將汽油量設為"+gas);
			}
			else
			{
				 System.out.println(g+"不是正確的汽油量");
				 System.out.println("無法變更汽油量");
			}
		}
		public void show()
		{
			System.out.println("車號是"+num);
			System.out.println("汽油量"+gas);
		}
	}
}
