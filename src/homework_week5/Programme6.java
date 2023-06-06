package homework_week5;

import java.util.ArrayList;

public class Programme6
{
    public static void main(String[] args)
    {
        My_method();
    }


    public static void My_method() {
        ArrayList<String> list = new ArrayList();
        list.add("London");
        list.add("New Zealand");
        list.add("America");
        list.add("China");
        list.add("India");

        System.out.println("The ArrayList is : " + list.get(3));
    }
}
