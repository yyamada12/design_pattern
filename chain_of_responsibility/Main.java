public class Main {
    public static void main(String args[]) {
        Responsible nakagawa = new Student("中川");
        Responsible rookie = new ClassTeacher("新人先生");
        Responsible veteran = new ChiefTeacher("ベテラン先生");
        nakagawa.setNext(rookie).setNext(veteran);
        nakagawa.putQuestion(new Question("おやつはいくらまで？", new Level(1)));
        nakagawa.putQuestion(new Question("バナナはおやつに入りますか？", new Level(2)));
        nakagawa.putQuestion(new Question("携帯電話持って行ってよい？", new Level(3)));
    }
}