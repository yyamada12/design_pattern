import java.util.HashMap;
import java.util.Map;

public class Wadayama {
    private static Map<String, Calc.Memento> map = new HashMap<>();

    public static void main(String args[]) {
        Calc calc = new Calc();
        for (int i = 1; i <= 5; i++) {
            calc.plus(i);
        }
        System.out.println(calc.getTemp());
        map.put("5までの足し算", calc.createMemento());

        Calc calc2 = new Calc();
        calc2.setMemento(map.get("5までの足し算"));
        for (int i = 6; i <= 10; i++) {
            calc2.plus(i);
        }
        System.out.println(calc2.getTemp());
        map.put("10までの足し算", calc.createMemento());
    }
}