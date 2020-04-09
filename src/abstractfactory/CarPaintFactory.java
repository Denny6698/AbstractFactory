package abstractfactory;

public class CarPaintFactory extends AbstractFactory {

	
	@Override
	CarPaint getCarPaint(String carpaint) {
		
		if(carpaint.equals("CHROME")) {
			return new Chrome();
		}
		
	
		if(carpaint.equals("MATTGREEN")) {
			return new MattGreen();
	}

		return null;
		}
	@Override
	Cars getCars(String cars) {
		
		return null;
	}

}
