
public class Student extends Responsible {

    public Student(String responsiblePerson) {
        super(responsiblePerson);
    }

    protected boolean beAbleToJudge(Question question) {
        return false;
    }

    protected void judge(Question question) {
    }
}
