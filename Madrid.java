package AbstractFactory;

import java.util.Arrays;
import java.util.List;

//concretando el Producto B2
public class Madrid implements CapitalCity{

	@Override
	public int getPopulation() {
		// TODO Auto-generated method stub
		return 3200000;
	}

	@Override
	public List<String> ListTopAttractions() {
		// TODO Auto-generated method stub
		return Arrays.asList("Royal Palce", "Prado Museum", "Retiro Pack");
	}

}
