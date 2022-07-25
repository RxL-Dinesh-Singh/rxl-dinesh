import java.util.ArrayList;

public class arryalist {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        // adding elements to the list

        animals.add("dog");
        animals.add("cat");
        animals.add("fish");
        animals.add("zebra");
        System.out.println(animals);


        ArrayList <String> ani = new ArrayList<>();
        ani.add("lion");
        ani.add("tiger");

        // adding a new list to the list

        animals.addAll(ani);
        System.out.println(animals);

        // removing elements from list

        animals.remove(0);
        System.out.println(animals);

        // get method

        System.out.println(animals.get(0));




    }
}
