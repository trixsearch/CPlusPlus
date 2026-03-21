public class Jalebi {
	private static Jalebi ekJalebi = new Jalebi();
	private Jalebi() {}
	public static Jalebi getJalebi() {
		return ekJalebi;
	}
}