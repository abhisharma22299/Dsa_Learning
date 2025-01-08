package examPrepSem2;
import java.util.Scanner;
class TemperatureBelowNormalException extends Exception {
    public TemperatureBelowNormalException(String message) {
        super(message);
    }
}
class NormalTemperatureException extends Exception {
    public NormalTemperatureException(String message) {
    
        super(message);
    	System.out.println("step5");
    }
}
class TemperatureIsHighException extends Exception {
    public TemperatureIsHighException(String message) {
        super(message);
    }
}
public class TemperatureCheck {
    public static void checkTemperature(double temperature) throws TemperatureBelowNormalException, NormalTemperatureException, TemperatureIsHighException {
        if (temperature < 20.0) {
        	System.out.println("step2");
            throw new TemperatureBelowNormalException("Temperature Below Normal");
        } else if (temperature >= 20.0 && temperature <= 40.0) {
        	System.out.println("step3");
            throw new NormalTemperatureException("Normal Temperature");
        } else if (temperature > 40.0) {
            throw new TemperatureIsHighException("Temperature is High");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        
        try {
        	System.out.println("step1");
            checkTemperature(temperature);
            
        } catch (TemperatureBelowNormalException e) {
            System.out.println(e.getMessage());
        } catch (NormalTemperatureException e) {
            System.out.println(e.getMessage());
        } catch (TemperatureIsHighException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}

