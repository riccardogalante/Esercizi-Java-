import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal operand1 = new BigDecimal("10.5");
        BigDecimal operand2 = new BigDecimal("5.2");

        for (OperationEnum operation : OperationEnum.values()) {
            performOperation(operation, operand1, operand2);
        }
    }

    public static void performOperation(OperationEnum operation, BigDecimal operand1, BigDecimal operand2) {
        BigDecimal result = calculate(operation, operand1, operand2);

        System.out.println("Operazione: " + operation.getSymbol());
        System.out.println("Operand1: " + operand1);
        System.out.println("Operand2: " + operand2);
        System.out.println("Risultato: " + result);
        System.out.println();
    }

    public static BigDecimal calculate(OperationEnum operation, BigDecimal operand1, BigDecimal operand2) {
        switch (operation) {
            case ADDITION:
                return operand1.add(operand2);
            case SUBTRACTION:
                return operand1.subtract(operand2);
            case MULTIPLICATION:
                return operand1.multiply(operand2);
            case DIVISION:
                return operand1.divide(operand2, BigDecimal.ROUND_HALF_UP);
            case MIN:
                return operand1.min(operand2);
            case MAX:
                return operand1.max(operand2);
            default:
                throw new IllegalArgumentException("Operazione non supportata: " + operation.getSymbol());
        }
    }
}