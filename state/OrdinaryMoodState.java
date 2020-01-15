public class OrdinaryMoodState implements State {

    @Override
    public String morningGreet() {
        return "おっす";
    }

    @Override
    public String getProtectionForCold() {
        return "走る";
    }

}