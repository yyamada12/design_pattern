public class Main {
    public static void main(String args[]) {
        Saito saito = Saito.getInstance();
        Nitta nitta = new Nitta();
        Nakai nakai = new Nakai();
        saito.addColleagueRelation(nakai, nitta, 90);
        nitta.setSecretLover(nakai);
        nitta.needsAdvice();
        nitta.react();
    }
}
