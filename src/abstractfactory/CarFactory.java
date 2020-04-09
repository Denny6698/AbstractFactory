package abstractfactory;

public class CarFactory extends AbstractFactory{

	
	@Override
	CarPaint getCarPaint(String carpaint) {
		return null;
	}

	@Override
	Cars getCars(String cars) {


		if(cars.equals("TOYOTA")) {
			return new Toyota();
		}
		if(cars.equals("HONDA")) {
			return new Honda();
	}
	return null;

}
}


