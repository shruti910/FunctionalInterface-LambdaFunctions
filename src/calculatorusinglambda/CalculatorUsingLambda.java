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

    public <T> T operate(T a, T b, BinaryOperator<T> operator) {
		//return mathOperation.operation(a, b); //delegate to the operator
                 return operator.apply(a, b);
	}
	
	private void addition() {
		BinaryOperator additionOp = (number1, number2) -> number1 + number2;
		System.out.println("50 + 10 = " + operate(50, 10, additionOp));
	}

	private void subtraction() {
		BinaryOperator subtractionOp = (number1, number2) -> number1 - number2;
		System.out.println("50 - 10 = " + operate(50, 10, subtractionOp));
	}

	private void multiplication() {
		BinaryOperator multiplicationOp = (number1, number2) -> number1 * number2;
		System.out.println("50 * 10 = " + operate(50, 10, multiplicationOp));
	}

	private void division() {
		BinaryOperator divisionOp = (number1, number2) -> number1 / number2;
		System.out.println("50 / 10 = " + operate(50, 10, divisionOp));
	}

    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculatorUsingLambda calculator = new CalculatorUsingLambda();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
                System.out.println(calculator.operate(3,5, (a,b)-> a>b ?a:b));
                //Clients can invoke the operate() method with any idea that comes to mind. All they need to do is come up with a valid lambda expression.
                
    }
    
}
