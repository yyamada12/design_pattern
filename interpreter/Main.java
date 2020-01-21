public class Main {
    public static void main(String args[]) {
        Ingredient liguidSoup = new Ingredient("液体スープ");
        Ingredient hotWater = new Ingredient("お湯");
        Ingredient noodle = new Ingredient("麺");
        Ingredient powderSoup = new Ingredient("粉末スープ");

        Plus plus1 = new Plus(noodle, powderSoup);
        Expression intermediate1 = new Expression(plus1);
        System.out.println("中間生成物1: " + intermediate1.getOperandString());

        Plus plus2 = new Plus(intermediate1, hotWater);
        Expression intermediate2 = new Expression(plus2);
        System.out.println("中間生成物2: " + intermediate2.getOperandString());

        Wait wait = new Wait(3, intermediate2);
        Expression intermediate3 = new Expression(wait);
        System.out.println("中間生成物3: " + intermediate3.getOperandString());

        Plus plus3 = new Plus(intermediate3, liguidSoup);
        Expression cupNoodle = new Expression(plus3);
        System.out.println("完成物: " + cupNoodle.getOperandString());

    }
}