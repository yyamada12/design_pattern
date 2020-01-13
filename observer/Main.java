public class Main {
    public static void main(String args[]) {
        Teacher teacher = new Teacher();
        Taro taro = new Taro();
        taro.addObserver(teacher);
        taro.run(3);
        teacher.printRecords();
        taro.run(5);
        teacher.printRecords();
    }

}