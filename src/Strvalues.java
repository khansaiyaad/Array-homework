import java.util.ArrayList;
import java.lang.String;

    public class Strvalues {

        public static void main(String[] args)
        {
            ArrayList<String>
                    list1 = new ArrayList<>();
            list1.add("apple");
            list1.add("banana");
            list1.add("chickoo");
            list1.add("papaya");
            System.out.println("List1: "
                    + list1);
            ArrayList<String>
                    list2 = new ArrayList<>();
            list2.add("apple");
            list2.add("banana");
            list2.add("pear");
            System.out.println("List2: "
                    + list2);
            // Find the common elements
            list1.retainAll(list2);
            System.out.println("Common elements: "
                    + list1);
        }
    }



