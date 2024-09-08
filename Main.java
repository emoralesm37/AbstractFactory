package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		//En la siguiente linea unicamente se DEBE de cambiar el Pais
		//ya sea SPAIN por ENGLAND o viceversa
		//para que este le proveea de información de cada una de ellas
				
		Country country = Country.SPAIN;
		Language language = InternationProvider.createLanguaje(country);
		CapitalCity capital = InternationProvider.createCapital(country);
		
		System.out.println("Country:" + country);
		System.out.println("Capital: " + capital.getClass().getSimpleName());
		
		language.greet();
		System.out.println("Población/Population: " + capital.getPopulation());
		System.out.println("Atracciones/Attractions: " + capital.ListTopAttractions());
		
	}

}
