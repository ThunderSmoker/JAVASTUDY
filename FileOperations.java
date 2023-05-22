
import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        // Create a file
        createFile("example.txt");

        // Read a file
        readFile("example.txt");

        // Delete a file
        deleteFile("example.txt");

        // Get file path
        String filePath = getFilePath("example.txt");
        System.out.println("File Path: " + filePath);

        // Get absolute path
        String absolutePath = getAbsolutePath("example.txt");
        System.out.println("Absolute Path: " + absolutePath);

        // Get last modification time
        long lastModifiedTime = getLastModifiedTime("example.txt");
        System.out.println("Last Modified Time: " + lastModifiedTime);

        // Check write and execute permissions
        boolean canWrite = checkWritePermission("example.txt");
        boolean canExecute = checkExecutePermission("example.txt");
        System.out.println("Write Permission: " + canWrite);
        System.out.println("Execute Permission: " + canExecute);

        // Create a directory for the current file
        createDirectoryForFile("example.txt");
    }

    // Create a file
    public static void createFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Read a file
    public static void readFile(String filename) {
        try {
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Delete a file
    public static void deleteFile(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Get file path
    public static String getFilePath(String filename) {
        File file = new File(filename);
        return file.getPath();
    }

    // Get absolute path
    public static String getAbsolutePath(String filename) {
        File file = new File(filename);
        return file.getAbsolutePath();
    }

    // Get last modification time
    public static long getLastModifiedTime(String filename) {
        File file = new File(filename);
        return file.lastModified();
    }

    // Check write permission
    public static boolean checkWritePermission(String filename) {
        File file = new File(filename);
        return file.canWrite();
    }

    // Check execute permission
    public static boolean checkExecutePermission(String filename) {
        File file = new File(filename);
        return file.canExecute();
    }

   
    // Create a directory for the current file
    public static void createDirectoryForFile(String filename) {
        File file = new File(filename);
        String directoryPath = file.getParent();

        if (directoryPath != null) {
            File directory = new File(directoryPath);

            if (directory.mkdirs()) {
                System.out.println("Directory created: " + directory.getPath());
            } else {
                System.out.println("Failed to create the directory.");
            }
        } else {
            System.out.println("The file does not have a parent directory.");
        }
    }

}
