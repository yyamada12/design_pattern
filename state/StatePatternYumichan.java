public class StatePatternYumichan {
    private State state = null;

    private void changeState(State state) {
        this.state = state;
    }

    public String morningGreet() {
        return this.state.morningGreet();
    }

    public String getProtectionForCold() {
        return this.state.getProtectionForCold();
    }

    public static void main(String args[]) {
        StatePatternYumichan yumi = new StatePatternYumichan();
        yumi.changeState(new BadMoodState());
        System.out.println(yumi.morningGreet());
        yumi.changeState(new OrdinaryMoodState());
        System.out.println(yumi.getProtectionForCold());
    }
}