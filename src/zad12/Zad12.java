/**
 * 
 */
/**
 * @author User
 *
 */
package zad12;
public class Zad12 {

	private static float temperature;

	public static void main(String[] args) {
		
		temperature = 22.2f;
        byte day = 13;
        short year = 2018;

        float temperature3 = temperature;
		double temperature2 = temperature3;
        int day2 = day;
        long year2 = year;
        
        Double temperature_wrapper = new Double(temperature2);
        Integer day_wrapper = new Integer(day2);
        Long year_wrapper = new Long(year2);

        System.out.println("Porownania dla temperatury");
        System.out.println(temperature2 == temperature_wrapper);
        System.out.println(temperature2 != temperature_wrapper);
        System.out.println(temperature_wrapper.equals(temperature2));

        System.out.println("Porownania dla dnia");
        System.out.println(day2 == day_wrapper);
        System.out.println(day2 != day_wrapper);
        System.out.println(day_wrapper.equals(day2));

        System.out.println("Porownania dla roku");
        System.out.println(year2 == year_wrapper);
        System.out.println(year2 != year_wrapper);
        System.out.println(year_wrapper.equals(year2));
        
        System.out.println("Porownania dla temperatury float do opakowanej");
        System.out.println(temperature3 == temperature_wrapper);
        System.out.println(temperature3 != temperature_wrapper);
        System.out.println(temperature_wrapper.equals(temperature3));
        
        temperature_wrapper = new Double(20.5);
        day_wrapper = new Integer(30);
        year_wrapper = new Long(2019);
        
	}

}