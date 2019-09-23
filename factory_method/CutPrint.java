public abstract class CutPrint {
    public abstract void draw(Cuttable hanzai);
    public abstract void cut(Cuttable hanzai);
    public abstract void print(Cuttable hanzai);
    protected Cuttable createCuttable() {
        return new Wood();
    }
    public void createCutPrint() {
        Cuttable hanzai = createCuttable();
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}