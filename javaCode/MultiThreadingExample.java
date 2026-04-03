//public class MultiThreadingExample {
//	public static void main(String[] args) {
//		long startTime = System.currentTimeMillis();
//		long sum =0;
//		for(int i=0;i<1000000000;i++) {
//			sum+=1;
//		}
//		int count=0;
//		for(int i=0;i<=5000000;i++) {
//			if(i%10==7) {
//				count++;
//			}
//		}
//		System.out.println("Sum and Count will be : "+sum+" "+count);
//		System.out.println("Totla time Take " + (System.currentTimeMillis()-startTime));
//	}
//}	

// Hum Uper do kaam kar rahe hai dono k dono kaam independent hai ek dusre se

// Ab hum isko Multithreading k sath mein karenge
// Since we know to create a new Thread , we can Either extend our class to Thread Class
// or implement runnable interface

public class MultiThreadingExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		NumberCounter threadNoEkCounter = new NumberCounter();
		// iske baad hum seedhe his isko start kar sakte h
//		threadNoEkCounter.start();
		
		SumCalculator sumCalcKaObj = new SumCalculator();
		Thread threadNoDoSum =  new Thread(sumCalcKaObj);
//		threadNoDoSum.start();


threadNoEkCounter.start();
		threadNoDoSum.start();
		
		try {
			threadNoDoSum.join();
			threadNoEkCounter.join();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("Totla time Take " + (System.currentTimeMillis()-startTime));
	}
}	