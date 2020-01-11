public class Nitta implements Colleague {
    private String name = "新田";
    private int tension;
    private Colleague secretLover = null;
    private LoveMediator mediator = Saito.getInstance();

    public String getName() {
        return name;
    }

    public void setSecretLover(Colleague colleague) {
        this.secretLover = colleague;
    }

    public void needsAdvice() {
        this.tension = mediator.consultation(this, secretLover);
    }

    public void react() {
        if (this.tension > 80) {
            System.out.println("わーい");
        } else {
            System.out.println("ふーむ");
        }
    }
}