import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountPNF {
    public static void main(String[] args) {
        String filename = "countPNF.txt";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int positiveCount = 0;
            int negativeCount = 0;
            int fractionalCount = 0;
            
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split(" ");
                
                for (String number : numbers) {
                    double value = Double.parseDouble(number);
                    
                    if (value > 0) {
                        positiveCount++;
                    } else if (value < 0) {
                        negativeCount++;
                    }
                    
                    if (value != (int) value) {
                        fractionalCount++;
                    }
                }
            }
            
            reader.close();
            
            System.out.println("Positive Numbers Count: " + positiveCount);
            System.out.println("Negative Numbers Count: " + negativeCount);
            System.out.println("Fractional Numbers Count: " + fractionalCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
