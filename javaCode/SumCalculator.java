public class SumCalculator implements Runnable{

	@Override
	public void run() {
		long sum=0;
		for(int i=0;i<500000000;i++) {
			sum+=1;
		}
		System.out.println("your sum is "+sum);
		
	}
	
}