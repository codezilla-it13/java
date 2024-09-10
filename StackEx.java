import java.io.*;
class EXCE extends Exception{
    String s;
    EXCE(String s,int i){
        this.s = s;
    }
    public String toString(){
        return s;
    }
}
class Stack{
    int top;
    int a[];
    final int MAX = 6;
    Stack(){
        top = -1;
        a = new int[MAX];
    }
    @SuppressWarnings("deprecation")
    void push() throws Exception
    {
        try{
            if(top == MAX-1)
                throw new EXCE("STACK FULL",0);
            else{
                DataInputStream d= new DataInputStream(System.in);
                top++;
                System.out.print("Enter the element to be insert in stack: ");
                a[top] = Integer.parseInt(d.readLine());
            }
        } catch(EXCE e){
            System.out.print(e);
        }
    }
    void pop(){
        try{
            if(top == -1)
                throw new EXCE("STACK EMPTY",1);
            else{
                System.out.println("Removed Element from stack: " + a[top]);
                top--;
            }
        }
        catch(EXCE e){
            System.out.print(e);
        }
    }
    void display(){
        if(top == -1)
            System.out.println("The Stack is empty");
        else{
            System.out.println("The stack elements are: ");
            for(int i = 0; i <= top; i++)
                System.out.print(a[i] + " ");
        }
    }
}
class StackEx{
    public static void main(String a[]) throws Exception
    {
        int ch;
        Stack s = new Stack();
        DataInputStream d = new DataInputStream(System.in);
        do{
            System.out.print("\nStack Operations are:\n1.Push\n2.POP\n3.Display\nEnter the choice: ");
            ch = Integer.parseInt(d.readLine());
            switch(ch){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }
        }while(ch <= 3);
    }
}