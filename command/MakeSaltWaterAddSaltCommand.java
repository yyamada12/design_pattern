public class MakeSaltWaterAddSaltCommand extends Command {
    private Command makeSaltWater = new MakeSaltWaterCommand();
    private Command addSalt = new AddSaltCommand();

    @Override
    public void setBeaker(Beaker beaker) {
        this.beaker = beaker;
        makeSaltWater.setBeaker(beaker);
        addSalt.setBeaker(beaker);
    }

    @Override
    public void execute() {
        System.out.println("食塩水を作り、それに食塩を1gずつ加えて飽和食塩水を作る実験");
        makeSaltWater.execute();
        addSalt.execute();
    }

}