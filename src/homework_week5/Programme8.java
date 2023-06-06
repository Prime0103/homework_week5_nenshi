package homework_week5;

import java.util.HashSet;

public class Programme8
{
    public static void main(String[] args)
    {
        Programme8 p8 = new Programme8();
        p8.useHash();
    }
    public void useHash() {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " found in the set");
            } else {
                System.out.println(i + " not found in the set");
            }
        }
    }
}
