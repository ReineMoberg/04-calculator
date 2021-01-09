package se.lexicon.ReineMoberg;

public class CalculatorImpl implements Calculator{
    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public long multiplication(int num1, int num2) {
        return (long)num1 * (long)num2;
    }

    @Override
    public float division(int num1, int num2) {
        return (float)num1 / (float)num2;
    }
}
