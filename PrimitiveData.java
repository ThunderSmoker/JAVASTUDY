import java.io.*;

public class PrimitiveData {
    public static void main(String[] args) {
        String filename = "primitivedata.txt";
        
        // Writing data to file
        writeToFile(filename);
        
        // Reading data from file
        readFromFile(filename);
    }
    
    // Writing data to file
    public static void writeToFile(String filename) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filename));
            
            // Writing primitive data types
            dataOutputStream.writeInt(10);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeChar('A');
            
            dataOutputStream.close();
            
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    
    // Reading data from file
    public static void readFromFile(String filename) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filename));
            
            // Reading primitive data types
            int intValue = dataInputStream.readInt();
            double doubleValue = dataInputStream.readDouble();
            boolean booleanValue = dataInputStream.readBoolean();
            char charValue = dataInputStream.readChar();
            
            dataInputStream.close();
            
            System.out.println("Data read from the file:");
            System.out.println("Int Value: " + intValue);
            System.out.println("Double Value: " + doubleValue);
            System.out.println("Boolean Value: " + booleanValue);
            System.out.println("Char Value: " + charValue);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}

