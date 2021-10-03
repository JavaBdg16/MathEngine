public class DynamicHelper {

    private final MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public void process(String statement) {
        // add 2 2
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String operation = parts[0];
        double leftValue = Double.parseDouble(parts[1]);
        double rightValue = Double.parseDouble(parts[2]);

        MathProcessing theHandler = null;
        for (MathProcessing handler : handlers) {
            if (operation.equalsIgnoreCase(handler.getOperationCode().toString())) {
                theHandler = handler;
                break;
            }
        }

        if (theHandler == null) {
            System.out.println("Unknown operation");
        } else {
            double result = theHandler.doCalculation(leftValue, rightValue);
            System.out.println("result = " + result);
        }
    }
}
