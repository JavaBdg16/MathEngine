public class Substracter extends CalculateBase implements MathProcessing {

    public Substracter(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public Substracter() {
    }

    @Override
    public void calculate() {
        double value = getLeftValue() - getRightValue();
        setResult(value);
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();
        return getResult();
    }

    @Override
    public OperationCode getOperationCode() {
        return OperationCode.SUBSTRACT;
    }
}
