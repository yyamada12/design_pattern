public class Main{
    public static void main(String args[]){
        Teacher you = new MyTeacher();
        you.createStudentList();
        you.callStudents();
        VeteranTeacher he = new VeteranTeacher();
        he.createStudentList();
        he.callStudents();
    }
}    