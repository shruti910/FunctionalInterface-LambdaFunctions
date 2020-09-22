/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorusinglambda;
import java.util.function.BinaryOperator;

/**
 *
 * @author User
 */



public class CalculatorUsingLambda {

   
    //Our interface defines a contract by which operations on two objects of type Double are made, that also returns a Double.
    //The exact operation will be left to the clients to decide.

    public Double operate(Double a, Double b, BinaryOperator<Double> operator) {
		
                 return operator.apply(a, b);
	}
	
	private void addition() {
		//BinaryOperator additionOp = (number1, number2) -> number1 + number2;
		System.out.println("50 - 10 = " + operate(50.0, 10.0, (number1, number2) -> number1 + number2));
	}

	private void subtraction() {
		//BinaryOperator subtractionOp = (number1, number2) -> number1 - number2;
		System.out.println("50 - 10 = " + operate(50.0, 10.0, (number1, number2) -> number1 - number2));
	}

	private void multiplication() {
		//BinaryOperator multiplicationOp = (number1, number2) -> number1 * number2;
		System.out.println("50 * 10 = " + operate(50.0, 10.0,  (number1, number2) -> number1 * number2));
	}

	private void division() {
		//BinaryOperator divisionOp = (number1, number2) -> number1 / number2;
		System.out.println("50 / 10 = " + operate(50.0, 10.0, (number1, number2) -> number1 / number2));
	}

    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculatorUsingLambda calculator = new CalculatorUsingLambda();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
                System.out.println(calculator.operate(3.0,5.0, (a,b)-> a>b ?a:b));
                //Clients can invoke the operate() method with any idea that comes to mind. All they need to do is come up with a valid lambda expression.
             
		CalculatorDemo calculator1 = new CalculatorDemo();
		calculator1.addition();
		calculator1.subtraction();
		calculator1.multiplication();
		calculator1.division();
                System.out.println(calculator1.operate(3, 5, (a,b)->(a>b)?a:b));
	}
      
    
    
}
