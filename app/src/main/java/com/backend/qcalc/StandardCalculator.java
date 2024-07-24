package com.crio.qcalc;

public class StandardCalculator {

    protected double result;

    // getters
    public double getResult() {
        return result;
    }

    // setters
    // this functions like AC / C in calculator
    public void clearResult() {
        this.result = 0;
    }
 
    // member methods
    public final void add(int num1, int num2) {
        add((double)num1, (double)num2);
    }

    public final void add(double num1, double num2){
        result = num1 + num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
    }
    
    public final void subtract(int num1, int num2) {
        subtract((double)num1, (double)num2);
    }
    

    public final void subtract(double num1, double num2) {
        result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
    }
    
    public final void multiply(int num1, int num2) {
        multiply((double)num1, (double)num2);
    }
    
    public final void multiply(double num1, double num2) {
        result = num1 * num2;
        if((result == Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || ((result == Double.POSITIVE_INFINITY))) {
            throw new ArithmeticException("Double overflow");
        }
    }

    public final void divide(int num1, int num2) {
        divide((double)num1, (double)num2);
    }

    public final void divide(double num1, double num2) {
        result = num1 / num2;
        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero");
        }
    }

    // get result
    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);
    }

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

}
