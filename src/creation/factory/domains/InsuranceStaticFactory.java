package creation.factory.domains;

public class InsuranceStaticFactory {

	public static Insurance getInstance(int key){
		switch (key) {
		case 1:
			return new LifeInsurance("Ramesh",100000, "EN");

		case 2:
			return new HealthInsurance("Rakesh", 50000, InsuranceType.FAMILYFLOATER);
			
		default:
			return new VehilceInsurance("John", 800000, Vehicles.BIKE);
		}
	}
}
