public class Main {
    public static void main(String args[]) {
        HumanLetterFactory factory = HumanLetterFactory.getInstance();
        HumanLetter a = factory.getHumanLetter("あ");
        takePhoto(a);
        HumanLetter i = factory.getHumanLetter("い");
        takePhoto(i);
        HumanLetter ha = factory.getHumanLetter("は");
        takePhoto(ha);
        HumanLetter a2 = factory.getHumanLetter("あ");
        takePhoto(a2);
        HumanLetter i2 = factory.getHumanLetter("い");
        takePhoto(i2);
        HumanLetter yo = factory.getHumanLetter("よ");
        takePhoto(yo);
        HumanLetter ri = factory.getHumanLetter("り");
        takePhoto(ri);
        HumanLetter mo = factory.getHumanLetter("も");
        takePhoto(mo);
        HumanLetter a3 = factory.getHumanLetter("あ");
        takePhoto(a3);
        HumanLetter o = factory.getHumanLetter("お");
        takePhoto(o);
        HumanLetter i3 = factory.getHumanLetter("い");
        takePhoto(i3);

    }

    private static void takePhoto(HumanLetter letter) {
        System.out.println(letter.getLetter());
    }
}
