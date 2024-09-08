package AbstractFactory;

import java.util.Arrays;
import java.util.List;

//concretando el Producto B1
public class London implements CapitalCity{

	@Override
	public int getPopulation() {
		// TODO Auto-generated method stub
		return 8900000;
	}

	@Override
	public List<String> ListTopAttractions() {
		// TODO Auto-generated method stub
		return Arrays.asList("Tower Birdge", "Buckingham Palace", "Big BEn");
	}
	
}
