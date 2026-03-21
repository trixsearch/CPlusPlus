
public class SingletonLazyExample {
	public static void main(String[] args) {
//		new Samosa();
		// agar aapne uper wali like likhi toh error through kar dega ki constructor Samosa is not visible
		// humne pahle hi private kar diya tha usko
		
//		abhi hum apne object ko get kar sakte hai jo ki humare samosa hai 
		
		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
		
		
		Jalebi j1 = Jalebi.getJalebi();
        Jalebi j2 = Jalebi.getJalebi();
        Jalebi j3 = Jalebi.getJalebi();

        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());
        System.out.println(j3.hashCode());
		
	}
}