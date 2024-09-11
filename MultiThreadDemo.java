import java.util.*;
class SquareThread extends Thread{
    public int n;
    public SquareThread(int no){
        this.n = no;
        System.out.println("Square Thread Started");
        start();
    }
    public void run(){
        System.out.println("The Square of the Random Number " + n + " is " + (n*n));
    }
}
class CubeThread extends Thread{
    public int n;
    public CubeThread(int no){
        this.n = no;
        System.out.println("Cube Thread Started");
        start();
    }
    public void run(){
        System.out.println("The Cube of the Random Number " + n + " is " + (n*n*n));
    }
}
class RandThread extends Thread{
    public RandThread(){
        start();
    }
    public void run(){
        int v = 0;
        Random r = new Random();
        try {
            for(int i = 1; i <= 10; i++){
                v = r.nextInt(100);
                System.out.println("Generated Random Number is: " + v);
                if(v%2 == 0)
                    new SquareThread(v);
                else
                    new CubeThread(v);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Random Number Thread Interrupted");
        }
    }
}
public class MultiThreadDemo{
    public static void main(String[] args){
        RandThread r = new RandThread();
    }
}