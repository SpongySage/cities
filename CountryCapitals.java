import java.util.HashMap;

public class CountryCapitals
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        // Add keys and values - countries and capitalCities
        capitalCities.put("New Zealand", "Wellington");
        capitalCities.put("Australia", "Canberra");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("New Zealand"));
    }
    
    /**
     * Constructor for objects of class CountryCapitals
     */
    public CountryCapitals()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        // put your code here
        
    }
}
