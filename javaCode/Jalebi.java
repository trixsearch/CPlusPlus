public class Jalebi {
	
//	yaha hum eager way sey ekJalebi naam ka Jalebi type ka object create kar rahe hai 
	// but dikkat ye hai ki isme hum pahle hi obj create kar rahe hai bhale hi iska use ho ya na ho
	private static Jalebi ekJalebi = new Jalebi();
	private Jalebi() {}
	public static Jalebi getJalebi() {
		return ekJalebi;
	}
}