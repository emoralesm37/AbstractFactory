package AbstractFactory;


//concretando Fabrica 2
public class SpainFactory implements InternationalFactory{

	@Override
	public Language createLanguage() {
		// TODO Auto-generated method stub
		return new Spanish();
	}

	@Override
	public CapitalCity createCapital() {
		// TODO Auto-generated method stub
		return new Madrid();
	}
	

}
