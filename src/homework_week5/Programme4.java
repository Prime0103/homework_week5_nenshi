package homework_week5;

import java.util.ArrayList;

public class Programme4
{
    public static void main(String[] args) {
        Programme4 p4 = new Programme4(); // create an object for class
        p4.colours();   // call the method with help of object
    }

    public void colours()  // no return type with no parameters method
    {
        ArrayList<String> colorName = new ArrayList();
        colorName.add("Black");
        colorName.add("Red");
        colorName.add("Purple");
        colorName.add("Yellow");
        colorName.add("White");

        // using foreach loop
        for (String str : colorName)
        {
            System.out.println(str);
        }
    }
}
