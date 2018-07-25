public class Test
{
    double firstNumber;
    double secondNumber;
    double result;
    String operator;
    Test(double firstNumber, double secondNumber, String operator)
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double math()
    {
        if(operator == "+")
        {
            result = firstNumber + secondNumber;
        }
        else if(operator == "-")
        {
            result = firstNumber - secondNumber;
        }
        else if(operator == "*")
        {
            result = firstNumber * secondNumber;
        }

            else if(operator == "/")
        {
            result = firstNumber / secondNumber;
        }
        return result;

    }
    public static void main (String[] args)
    {
        Test test = new Test(10, 7, "/");
        System.out.println(test.math());

    }
}

