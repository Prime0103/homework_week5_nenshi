package homework_week5;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5
{
    public static void main(String[] args)
    {
        iterate_Method();   // Direct method  calling
    }

    public static void iterate_Method()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
