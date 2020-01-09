public class ClassTeacher extends Responsible {
    private Level responsibleLevel = new Level(2);

    public ClassTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    protected boolean beAbleToJudge(Question question) {
        return question.level.lessThan(responsibleLevel);
    }

    protected void judge(Question question) {
        System.out.println("質問は「" + question.content + "」だな。");
        System.out.println("300円までだ。");
    }

}