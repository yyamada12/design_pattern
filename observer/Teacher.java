import java.util.HashMap;
import java.util.Map;

public class Teacher implements Observer {

    private Map<String, Integer> runRecord = new HashMap<>();

    @Override
    public void update(String name, int count) {
        runRecord.put(name, count);
    }

    public void printRecords() {
        for (String name : runRecord.keySet()) {
            System.out.println(name + ":" + runRecord.get(name));
        }
    }

}