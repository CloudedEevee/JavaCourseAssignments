import java.util.ArrayList;
public class ExceptionsLists {

    public static void main(String[] args) {

        ArrayList<Object> thisList = new ArrayList<Object>();
        thisList.add("13");
        thisList.add("hello world");
        thisList.add(48);
        thisList.add("Goodbye World");

        System.out.println(String.format("Processing............................."));
        for (int i = 0; i < thisList.size(); i++) {
            try {
                Integer castedValue = (Integer) thisList.get(i);
            }
            catch (ClassCastException e) {
                System.out.println(String.format(">>>>>>>>>>ERROR<<<<<<<<<< \n%s", e));
                System.out.println(String.format("Error at index: %d", i));
                System.out.println(String.format("Value: %s \n", thisList.get(i)));
            }
        }
        System.out.println(String.format(".............................Processing Done."));



    }

}