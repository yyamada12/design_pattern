import java.util.HashMap;
import java.util.Map;

public class Saito implements LoveMediator {
    private static Saito saito = new Saito();

    private Saito() {
    }

    public static Saito getInstance() {
        return saito;
    }

    private Map<Colleague, Map<Colleague, Integer>> colleagueRelationMap = new HashMap<>();

    public void addColleagueRelation(Colleague from, Colleague to, int possibility) {
        Map<Colleague, Integer> tempMap;
        if (colleagueRelationMap.containsKey(from)) {
            tempMap = colleagueRelationMap.get(from);
        } else {
            tempMap = new HashMap<>();
        }
        tempMap.put(to, possibility);
        colleagueRelationMap.put(from, tempMap);
    }

    public int consultation(Colleague colleagueInLove, Colleague secretLover) {
        if (colleagueRelationMap.containsKey(secretLover)
                && colleagueRelationMap.get(secretLover).containsKey(colleagueInLove)) {
            return colleagueRelationMap.get(secretLover).get(colleagueInLove);
        }
        return -1;
    }
}