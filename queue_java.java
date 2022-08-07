import java.util.ArrayDeque;
import java.util.Deque;

public class queue_java {
    public static void main(String[] args){
        Deque<String> colors = new ArrayDeque<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for (String color : colors) {
            System.out.println(color);
        }
        colors.add("white");

        for (String color : colors) {
            System.out.println(color);
        }

    }
    

    

    
    
}
