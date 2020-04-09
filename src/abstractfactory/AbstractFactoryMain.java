package abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {


		AbstractFactory carFactory = FactoryProducer.getFactory("CARS");
        Cars honda = carFactory.getCars("HONDA");
        honda.build();
        
        AbstractFactory carPaintFactory = FactoryProducer.getFactory("CARPAINT");
        CarPaint chrome = carPaintFactory.getCarPaint("MATTGREEN");
        chrome.paint();
		
	}

}
