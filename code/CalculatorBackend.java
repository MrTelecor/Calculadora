

public class CalculatorBackend {
    private double number, answer;
    private int calculation;

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setCalculation(int calculation) {
        this.calculation = calculation;
    }

    public int getCalculation() {
        return calculation;
    }

    public double calculate(double secondNumber) {
        switch (calculation) {
            case 1: // Addition
                answer = number + secondNumber;
                break;
            case 2: // Subtraction
                answer = number - secondNumber;
                break;
            case 3: // Multiplication
                answer = number * secondNumber;
                break;
            case 4: // Division
                answer = number / secondNumber;
                break;
        }
        return answer;
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public double square() {
        return Math.pow(number, 2);
    }

    public double reciprocal() {
        return 1 / number;
    }
}

