package AbstractFactory;


//Concretando Fabrica 1
public class EnglandFactory implements InternationalFactory{

	@Override
	public Language createLanguage() {
		// TODO Auto-generated method stub
		return new English();
	}

	@Override
	public CapitalCity createCapital() {
		// TODO Auto-generated method stub
		return new London();
	}

}
