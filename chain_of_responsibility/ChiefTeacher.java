
public class ChiefTeacher extends Responsible {
    private Level responsibleLevel = new Level(3);

    public ChiefTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    protected boolean beAbleToJudge(Question question) {
        return question.level.lessThan(responsibleLevel);
    }

    protected void judge(Question question) {
        System.out.println("質問は「" + question.content + "」ですね。");
        System.out.println("それに対する答えは、、「YES」。");
    }
}
