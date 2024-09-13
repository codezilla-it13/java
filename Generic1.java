import java.util.*;
class Generic1 {
    public static <E> void findMax(E[] elements){
        Arrays.sort(elements);
        System.out.println("The Maximum Element is " + elements[elements.length-1]);
    }
    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'F', 'A', 'I', 'Z', 'U', 'L'};
        Double[] doubleArray = {1.5, 2.5, 3.9, 22.5, 9.0};
        findMax(intArray);
        findMax(charArray);
        findMax(doubleArray);
    }
}
