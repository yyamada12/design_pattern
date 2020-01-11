public class Nakai implements Colleague {
    private String name = "中井";
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
}