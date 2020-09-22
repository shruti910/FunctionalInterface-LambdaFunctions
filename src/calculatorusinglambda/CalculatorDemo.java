/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorusinglambda;

/**
 *
 * @author User
 */
 public class CalculatorDemo {
   
    @FunctionalInterface
	interface MathOperation {
		int operation(int number1, int number2);
	}
	
	public int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
	public void addition() {
		MathOperation additionOp = (number1, number2) -> number1 + number2;
		System.out.println("50 + 10 = " + operate(50, 10, additionOp));
	}

	public void subtraction() {
		MathOperation subtractionOp = (number1, number2) -> number1 - number2;
		System.out.println("50 - 10 = " + operate(50, 10, subtractionOp));
	}

	public void multiplication() {
		MathOperation multiplicationOp = (number1, number2) -> number1 * number2;
		System.out.println("50 * 10 = " + operate(50, 10, multiplicationOp));
	}

	public void division() {
		MathOperation divisionOp = (number1, number2) -> number1 / number2;
		System.out.println("50 / 10 = " + operate(50, 10, divisionOp));
	}

	
}
