// Singleton Design Pattern
// agar humko humare project mein kisi object ko ek hi baar create karna ho fir baar baar use karna ho
// Tabhi hum Singleton Design Pattern ka use karte hai
// Samjho humare ek JDBC Connection h CRUD wale APP m, usme DB sey jb hum connection create karte hai 
// to humko usko ek baar create kar sakte hai Singleton Design Pattern sey
public class Samosa {
	// yaha humne ek Samosa type ka samosa variable banaya hai , jisko aage hum use karke check karsakte hai 
	// ki object pahle sey created hai ya nhi 
	// created field to storre object private
	private static Samosa samosa;
	// Humko Ek private Constructor banana Padega
	private Samosa() {
		// class ka constructor
		// Iska Object humne Example.java m kara hai
		
	}
//	public static synchronized Samosa getSamosa() {
		// if we create two threads and both check samosa == null same time so they both create the new obj
		// hence we used synchronized keyword which do Method Synchronized
		// but this will make whole method lock 
	// isilye hum synchronized block to method k ander use karenge
	public static Samosa getSamosa() {
		if(samosa==null) {
			synchronized (Samosa.class) {
				if(samosa==null) {
					samosa = new Samosa();
			}
		}
		return samosa;
	}
	// humne isko SingletonExampl m use kiya hai 
	// isko hum kahte hai Lazy way of creating Singleton Object
}
