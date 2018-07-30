package co.assessment.question1;

abstract class Arithmetic {
int num1, num2, result;
public abstract int calculate(int num1, int num2);

//returns num1
public int getNum1() {
return num1;
}

//sets num1
public void setNum1(int num1) {
this.num1 = num1;
}

//returns num2
public int getNum2() {
return num2;
}

//sets num2
public void setNum2(int num2) {
this.num2 = num2;
}
}
//adding two numbers
class Addition extends Arithmetic{
@Override
public int calculate(int num1, int num2) {
result=num1+num2;
return result;
}
}
//subtracting two numbers
class Subtraction extends Arithmetic{
@Override
public int calculate(int num1, int num2) {
result=num1-num2;
return result;
}	
}
//multiplying two numbers
class Multiplication extends Arithmetic{
@Override
public int calculate(int num1, int num2) {
result=num1*num2;
return result;
}
}
//dividing two numbers
class Division extends Arithmetic{
@Override
public int calculate(int num1, int num2) {
result=num1/num2;
return result;
}
}