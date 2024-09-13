import java.io.*;
import java.util.*;
class WritetoFile{
    public static void main(String[] args) {
        try {
            FileWriter fwrite = new FileWriter("D:\\CSE 015\\Data Structure\\Sample Text.txt");
            fwrite.write("This is a Sample file");
            fwrite.close();
            System.out.println("Content is Succesfully wrote to the file");
            File f1 = new File("D:\\CSE 015\\Data Structure\\Sample Text.txt");
            Scanner dataReader = new Scanner(f1);
            System.out.println("Read the file Contents are: ");
            while(dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            System.out.println("The absolute path of a file " + f1.getAbsolutePath());
            System.out.println("The File Length: " + f1.length());
            System.out.println("The File Access Read Mode: " + f1.canRead());
            System.out.println("The File Access Write Mode: " + f1.canWrite());
            dataReader.close();
        } catch (IOException e) {
            System.out.println("Unexpected error Occurred");
            e.printStackTrace();
        }
    }
}