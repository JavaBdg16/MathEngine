public interface MathProcessing {

    String SEPARATOR = " ";
    double doCalculation(double leftValue, double rightValue);
    OperationCode getOperationCode();
}
