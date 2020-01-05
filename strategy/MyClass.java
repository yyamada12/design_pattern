public class MyClass {
    private Comparator comparator = null;

    public MyClass(Comparator comparator) {
        this.comparator = comparator;
    }

    public int compare(Human h1, Human h2) {
        return comparator.compare(h1, h2);
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(new AgeComparator());
        Human h1 = new Human("Taro", 172, 63, 25);
        Human h2 = new Human("Jiro", 168, 72, 23);
        System.out.println(myClass.compare(h1, h2));
    }
}