import java.util.List;

public abstract class Teacher {
    List students = null;

    public abstract void visit(Home studentHome);

    public abstract void visit(TanakaHome studenthome);

    public abstract void visit(SuzukiHome studentHome);

    public List getStudentList() {
        return students;
    }

}