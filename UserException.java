import java.io.*;
import java.util.*;
class blooderr extends Exception{
    String m;
    blooderr(String h){
        m = h;
    }
    public String toString(){
        return m;
    }
}
class blood{
    float weight;
    int age;
    void check() throws Exception{
        try {
            DataInputStream d = new DataInputStream(System.in);
            System.out.print("Enter the weight of the Person: ");
            weight = Float.parseFloat(d.readLine());
            System.out.print("Enter the age of the Person: ");
            age = Integer.parseInt(d.readLine());
            if(weight >= 50 && age >=18)
                System.out.println("You are eligible");
            else
                throw new blooderr("You are not eligible for blood donation");
        } catch (blooderr e) {
            System.out.println(e);
        }
    }
}
class UserException{
    public static void main(String[] args) throws Exception{
        blood b = new blood();
        b.check();
    }
}