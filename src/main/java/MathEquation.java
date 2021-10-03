public class MathEquation {

    // operacja, liczba z lewej, liczba z prawej
    private double leftValue;
    private double rightValue;
    private OperationCode operationCode; // 'a', 's', 'm', 'd'
    private double result;

    public void execute() {
        CalculateBase calculate;
        switch (operationCode) {
            case ADD:
                calculate = new Adder(leftValue, rightValue);
                calculate.calculate();
                result = calculate.getResult();
                break;
            case SUBSTRACT:
                calculate = new Substracter(leftValue, rightValue);
                calculate.calculate();
                result = calculate.getResult();
                break;
            case MULTIPLY:
                calculate = new Multiplier(leftValue, rightValue);
                calculate.calculate();
                result = calculate.getResult();
                break;
            case DIVIDE:
                calculate = new Divider(leftValue, rightValue);
                calculate.calculate();
                result = calculate.getResult();
                break;
        }
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public void setOperationCode(OperationCode operationCode) {
        this.operationCode = operationCode;
    }

    public double getResult() {
        return result;
    }
}
