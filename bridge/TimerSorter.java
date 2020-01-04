public class TimerSorter extends Sorter {
    public TimerSorter(SortImpl sortImpl) {
        super(sortImpl);
    }

    public void timerSort(Object obj[]) {
        long start = System.currentTimeMillis();
        sort(obj);
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }

    public static void main(String[] args) {
        TimerSorter timerSorter = new TimerSorter(new QuickSortImpl());
        Object[] obj = { "hoge", "fuga" };
        timerSorter.timerSort(obj);
    }
}