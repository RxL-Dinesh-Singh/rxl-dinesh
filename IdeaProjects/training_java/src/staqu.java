import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class staqu {
    public static void main(String[] args) {

        Stack <Integer> s1 = new Stack<>();
        for (int i=0; i<5; i++){
            s1.push(i);
        }
        System.out.println(s1);

        // pop method to remove elements, it removes elements from last (LIFO)

        s1.pop();
        System.out.println(s1);


        // get method to access elements by indexes
        System.out.println(s1.get(0));

        // peek method to view element, it shows the last elements

        System.out.println(s1.peek());


        //queue implementation

        Queue <Integer> q1 = new LinkedList<>();
        for (int i =2; i<10; i++){
            q1.add(i);
        }
        System.out.println(q1);

        // peek method shows the first element

        System.out.println(q1.peek());

        // removes the element entered first in the queue

        System.out.println(q1.poll());




    }

    }
