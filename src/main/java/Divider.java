public class Divider extends CalculateBase {
    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }
}
