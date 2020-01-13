public class Taro extends Subject {

    private int totalCount = 0;
    private String name = "Taro";

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(name, totalCount);
        }
    }

    public void run(int count) {
        totalCount += count;
        this.notifyObserver();
    }

}