package abstractfactory;

public class FactoryProducer {
 public static AbstractFactory getFactory(String factory) {
	 
	 if(factory.equals("CARPAINT")) {
		 return new CarPaintFactory();
	 }
	 if(factory.equals("CARS")) {
		 return new CarFactory();
 }
	 return null;
 }
}
