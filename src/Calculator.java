
public class Calculator {

    static void calc(double a, double b){
        double result = a + b;
        System.out.println(result);
    }

    static double anotherCalc(double a, double b){
        System.out.println(a + b);
        return a + b;
    }

    //TODO: умовнi конструкцii

    static void calc(double numA, double numB, char operation){
        double result = 0;
        switch(operation){
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
                System.out.println("Ups, incorrect operation type");
                break;
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        calc(20, 10, '+');
        calc(20, 10, '-');
        calc(20, 10, '*');
        calc(20, 10, '/');
        calc(20, 10, '$');
    }
}
