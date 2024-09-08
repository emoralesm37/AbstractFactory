package AbstractFactory;

public class InternationProvider {

	public static Language createLanguaje(Country country) {
		
		switch (country) {
		
		case ENGLAND:
			return new English();
		case SPAIN:
			return new Spanish();
		default:
			throw new IllegalArgumentException("Invalid country: " + country);
		}
	}
	
	public static CapitalCity createCapital(Country country) {
		switch (country) {
		case ENGLAND:
			return new London();
		case SPAIN:
			return new Madrid();
		default:
			throw new IllegalArgumentException("Invalid country: " + country);
		}
	}
}
