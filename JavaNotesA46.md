

### what is language  

 language is a medium to communicate. 


 **what is program** 

 program is instruction or set of instructions used to create application. 

**what is programming language**

the language that is used to write the program is called programming language.

### what is java  

java is a programming language used to create application. 

### what is application 

application is collection of programs or collection of instructions. 


### types of language 

we have 3 types of language.

1. Low Level Language / Binary Lanuguage
2. Mid Level Language / Assembly Language
3. High Level Language / Programming Language


 **Low Level Language** 

    it contains only 0 and 1. 
    it is also called binary Language. 

    system can understand binary language but programmer can't understand this.

**Mid Level Language**

    this language contains some mnemonics.

    it is also called Assembly Language and it is partially understandable. 

**High Level Language**
    
    it is called Programming language that helps to create the applications.


### Translator 

there are 3 types of translator

1. Assembler 
2. Compiler 
3. Interpreter



Mid level Language system can not understand.
for that we need translator to convert it into binary language.

here we need Assembler. 


for high level language compiler is the translator. 


### File  

file is a container where we can store the data permanently.

**what is source file**

the file where we are writing source code by using programming language. 

**what is executable file**

the file that is created by compiler that contains binary code is called executable file. 


**where we can write java code**

text editor : 
  notepad , notepad++ , editplus, vs code 

IDE : 
  eclipse , netbeans 

### Platform Dependent

**what is platform**

platform is providing one environment to run / execute the applications. 

eg: windows , mac , linux 

**what is platform dependent**

 in which platform we are writing the source file , we can execute only in that perticular platform that is called platfrom dependent. 

 eg: c,c++


 ### Platform Independent 

  Platform Independent means in which platform we are creating the source file , we can execute in that platform and we can execute in other platform also.

  eg :  java is platform independent language


  **jdk**
       
       jdk stands for java development kit. 
       it is like one full package where we can develop,compile and execute java file. 

       current version : jdk 25

  **JRE**
       
       JRE stands for Java Runtime Environment. 
       it provides one environment to run/execute the java program. 

  **JVM**
      
      JVM stands for Java Virtual Machine.
      it is used to convert any byte code into binary code.
      JVM is interpreter.

  **JIT**
      JIT stands for just in time compiler. 
      it helps JVM to work more efficiently. 

  **javac**
          it is one compiler , it helps to compile the source file.

          it covert the source code into byte code.



  **Compile Time**

    the time taken by the compiler to check the syntax of the source file, is called compile time. 

  **what is compile time error (CTE)**
    
     During compile time if any error is coming , that is called compile time error. 

  **what is compile time success (CTS)**

      During compile time if there is no error , that is called compile time success.

  **what is Runtime**

       the time taken by the JVM to covert the byte code into binary code , is called runtime.

  **what is runtime error (RTE)**
       
       During runtime if any error is there , that is called runtime error. 

  **what is runtime success (RTS)**

       During runtime if there is no error, that is called runtime success. 


###      Structure Of Java Program  

*syntax:*

 ```java
    class  classname
    {
       public static void main(String[] args)
       {
          // statement
       }
    }

example : 

     class First
     {
        public static void main(String[] args)
        {
          System.out.println("welcome to java world");
        }
     }
```

       we have to save the file 
                First.java

    now we have to execute the file . 
    for that we have to follow two steps. 

*step 1 :*  we have to compile the file 
         
         syntax: 
                 javac filename.java 

            eg:   javac First.java 

*step 2 :*  now we are ready to execute 

          syntax :     
                      java classname

                eg :  
                       java First


**take one empty class**

```java

    class Second
    {


    }
```

*save the file* =>  Second.java

*compile* =>   javac Second.java 
                  it will not give any error.

*execute* =>    java Second
                   it will give error 

    
    note :   empty class is compile time success but 
             run time error.


**take one class with empty main method**

```java

class Third
{
    public static void main(String[] args)
    {

    }
}
```


*save this file* => Third.java 

*compile* =>   javac Third.java 
                       => it will not give any error

*execute* =>   java Third
                   => it will not give any error 


**note :**  
    class with empty main method is compile time success and run time success but no output.


###   printing statement 

in java we have 2 types of printing statements. 

**1. System.out.println([data]) ;**

          this printing statement is used to print line by line. 

          note: inside the method if we are not passing any  data , it will not give any error.

    eg: 

    ```java
            System.out.println("my name is ");
            System.out.println("rohit");

        // output : 
                // my name is 
                // rohit
    ```

**write a java program to print 5 friends name**



**System.out.print()**

           it is used to display the output in the same line. 

    note:  in this method if we are not passing any value , it will give error (CTE)   

   eg : 

     ```java

         System.out.print("Hello Everyone");
         System.out.print(" ");
         System.out.print("Good Morning");

    // output: 
           // Hello Everyone Good Morning
     ```

**write a java program to print 5 heroine names in the same line**



**\n**
     
     \n is used to break the line and print in the next line.

eg: 

    ```java
     
        System.out.print("hello\nhi");
        
        //output : 
                //  hello
                //  hi
    ```

**print 5 webserie names in the different line by using print statement**

*****
****
***
**
*

**\t**
     it is used to give space for tab.



###                                   PART - 1 



### Token


Tokens are basic building blocks of Java Programming Language. 

in java we have 5 types of tokens. 

1. keywords
2. identifiers
3. literals / data 
4. separators
5. operators


**1. keywords**

keywords are predefined words or reserved words having some meanings. 

note :  keywords should be in lowercase. 
 
 eg:  class , public , static , void , for , if , break etc.


 **Identifiers**

    any component where we can assign the names , is called Identifier. 

    eg:  class name , variable name , iterface name , method name etc. 


**Note:**


    
            class Santanu
            {

            }
    

   here we can save the file by any name. 
   San.java ✅
   A.java ✅
   Hi.java ✅
   Santanu.java ✅

```java

   public class Santanu
   {

   }
```

   now if we want to save the file 
   we have to give 
   Santanu.java ✅

   San.java ❌❌

**Note**
   *if there is public keyword infront of class then classname and file name must be same.*

   but if there is no public keyword then classname and file name can be different. 


 ###  Rules Of Identifiers 

   1.  we can not start any identifier name with number.
       but in between we can use. 

       eg: 
           class 2Hello ❌
           class He2llo ✅

  2. we can not give any space in between the idenfier name. 
          class He llo  ❌

 3. we can not use any special characters except dollar($) and underscore( _ ).

        class Hel%lo ❌
        class @Hello ❌
        class Hello# ❌

        class Hello_ ✅
        class He$llo ✅

 4. we can't use any keywords as an identifier. 

      class if ❌
      class while ❌



**Separators**

 Separators are used to separate the instruction in java. 

 eg: 
    space ( )
    comma ( , )
    semicolon( ; )
    { } etc.
    


**literals**

  literals are the data what we are using in the java programming language. 

  **write a java program to display all the data**



  in this program we have used single character , collection of characters , decimal number , non decimal number and boolean data . (true / false)




  ###  Variable  

    variable is the container where we can store the data. 


**how to declare variable**

     datatype  variablename ;   (variable declaration)

     variablename = value/data ; (variable initialization)

eg: 

```java

        int age ; 

        age = 21 ; 

        System.out.println(age) ; 

        /// output :   21 
```


 we can do it in the same line also. 

  *datatype variablename = value ;*

```java

    String name = "santanu" ; (v.d and v.i)

    System.out.println(name) ; 
```



**Note :**  
   variable re-initialization is possible but re-declartion is not possible. 

```java

    int a = 10 ;

    a = 20 ; (re-initialization)  ✅

    int a ; (re-declaration) ❌
```




**write a java program to print 5 heroines name and theier age**



###   Datatype 


datatypes are used to define which kind of data we have to store inside the variable. 


                     datatype 

primitive datatype                non primitive datatype

byte                                String
short                               Array
int                                 Object
long
float 
double
char
boolean

**primitive datatype**

it is used to store single value inside the variable. 

**Non primitive datatype**

it is used to store multiple value inside the variable.


**write a java program to display all the primitive datatype variable .**



datatype       size              default value 

byte           1 byte            0

short          2 bytes           0

int            4 bytes           0

long           8 bytes           0

float          4 bytes           0.0

double         8 bytes           0.0

char           2 bytes          space 

boolean        1 bit            false 


**Global Area**

  the area that is present inside the class is called Global Area. 

**Global Variable**

the variable that is declared inside the global area, is called Global Variable. 


**Local Area**

The area that is present inside any method, is called Local Area.

**Local Variable**

The variable that is declared inside the local area , is called Local variable. 


**Default value**

 if we are declaring any variable but we are not initalizing.
 that time by default the value it will assign is called default value. 


```java

    class Hello
    {

        public static void main(String[] args)
        {
            byte a ;

            System.out.println(a);
        }
    }
```


 **Note :** 
     this code will give error. 
     a is local variable , it can't have default value.

     whenever we are taking any localvariable, if we want to use that we have to assign the value. 


```java

    class Hi 
    {
        static int b ; 

        public static void main(String[] args)
        {
            System.out.println(b);
        }
    }
```


**Note :**  
        this code will give the output as 0 . 
        global variable have the default value. 



**how to execute java code in single step**

  java filename.java 


**comments**

in java we have two types of comments. 

1. single line comment : 

         // i am single line comment

2. multiline comment : 

      /*
          i 
          am 
          multiline 
          comment
      */

whatever we are writing inside the comment it will not execute. 


**Note**

if we are creating any class but there is no public keyword infront of the class.
    that time we can take classname and filename same or different.


if there is public keyword infront of the class. 
  then classname and filename should be same.



### Operators

  operators are predefined symbols used to perform some operation.
eg:
      2 + 3 


      based on any operator can take how many operands, we can classify operator into 3 types.

*1. unary operator* 
             this operator can take only one operand. 

*2. binary operator* 
           this operator can take two operands. 

*3. ternary operator* 
         this operator can take three operands. 
        


in java we have 8 types of operators. 

1. Typecast Operator 
2. Arithmetic Operator
3. Increment / Decrement Operator
4. Compound Assingmnet Operator
5. Relational Operator
6. Logical Operator
7. Conditional Operator
8. Bitwise Operator



###  type casting 

converting one datatype into another datatype is called type casting . 

                    type casting 

primitive typecasting             non primitive typecasting


narrowing    widening          upcasting        downcating



**primitive typecasting**
   
    converting one primitive datatype into another primitive datatype is called primitive typecasting.  


 **widening**
        
          converting small range data into large range data is called widening. 

          note: java will perform widening implicitly

 **Narrowing**
        
        converting large range data into small range data is called Narrowing. 

*note:*       it will give error. 
              for performing narrowing we need the help of type cast operator. 




**how to know the maximum value or minimum value any datatype can store ??**

*for byte*

Byte.MIN_VALUE 
Byte.MAX_VALUE 

*for short*

Short.MIN_VALUE
Short.MAX_VALUE

*for int*

Integer.MIN_VALUE
Interger.MAX_VALUE




### type cast operator

   this operator is used to convert one datatype into another dataype.

   it is one unary operator. 

   eg: 

```java
             int a = 10 ; 

             byte b = (byte)a ;

```

**Multiplication**

 it is denoted by * symbol. 

 it performs multiplication. 

 note : it will also follow the same table.


 **division**

 it is denoted by / symbol.

 it will give the quotient as output.

 **modulus**

 it is denoted by % symbol.

 it will give remainder as output.

 this operator is used to know any number is present or not in other number's table.

 eg :  
 
 ```java

           int a = 15 ; 
           int b = 3 ; 

           System.out.println(a % b); // 0
```

     here a % b we are getting 0. 
     so we can tell a is present in the table of b . 

*note:*
       
       a % b (where a is smaller than b )

       then output will be a . 

eg: 

```java

         System.out.println(3 % 5);    // 3
         System.out.println(9 % 15);  // 9
```


**very important note**


4567 %  10 =  7

1523 % 10  = 3 

2531 % 10  =  1 

 number  %  10 => it will give the last digit 

4567 / 10  = 456 

1523 / 10 = 152 

2531 / 10 = 253 

number / 10 => it will remove the last digit 


**Dynamic Reading**

taking the data from the user is called Dynamic Reading.


step 1 :  we have to import Scanner class in our program.

        import java.util.Scanner;


step 2 :  we have to create the object of the Scanner class.

   [static]  Scanner sc = new Scanner(System.in);


step 3 : we have to take the data from the user.

     sc.nextInt() => used to take interger data
     sc.next() => used to take string data. 
                  it will take only one word

     sc.nextLine() => used to take sentence 

     sc.next().charAt(0) => used to take the character 

     sc.nextByte() => used to take the byte data. 

     sc.nextShort() => used to take short data. 

     sc.nextLong() => used to take long data. 

     sc.nextBoolean()=> used to take booolean data. 

     sc.nextFloat() => used to take boolean data. 

     sc.nextDouble() => used to take double data. 

    

### increment / decrement Operator


**increment**

this is denoted by ++ symbol. 
it increases the value by 1. 

we have two types. 

*1. pre increment operator :* 

       first it will increase the value by 1 then it will perform next operation. 

       ex: 
```java

             int a = 20 ; 
             int b = ++a;

             System.out.println(a);   // 21
             System.out.println(b);  // 21
```


*2. post increment operator:* 

         first it will perform the operation then it will increase the value by 1. 

         ex: 
```java

                 int a = 5 ; 
                 int b = a++;

                 System.out.println(a);   // 6
                 System.out.println(b);  // 5
```


**Decrement Operator**

   it will decrease the value by 1 . 

   it is denoted by -- symbol . 

  there are two types.   

**pre decrement operator**

          first it will decrease the value by 1 then it will perform next operation. 

```java

          int a = 10 ; 

          int b = --a ;

          System.out.println(a);    //9
          System.out.println(b);   //9
```


**post decrement**

   first it will perform the operation then it will decrease the value by 1. 

   eg: 

```java
                int a = 5 ; 
                int b = a--; 

                System.out.pritnln(a);   // 4
                System.out.pritnln(b);  // 5    

```



### Compound Assingment Operator

assignment operator is denoted by = symbol.

it is used to assign the value inside any variable. 


when we are assigning some value inside any variable , and same variable we are using as a value . that time we can use compound assignment operator. 



### Relational Operator

this operator is used to compare between two operands. 

return type : boolean (true / false)

**1. equal to**

it is denoted by == symbol. 
it checks both the operands value are same or not.

**2. not eqaul**

it is denoted by != symbol. 
it is opposite of equal operator.

**3. greater than**

denoted by > symbol. 
it will check first operand is greater than second operand or not.

**4. less than**

denoted by < symbol. 
it is opposite of greater than symbol, it check first operand is less than second operand or not.

**5. greater than or equal**

it is denoted by >= symbol. 
it will check the first operand is greater or equal to the second operand.

**6. less than or equal**

it is denoted by <= symbol.

it will check the first operand is less or equal to second operand is or not. 


### Logical Operator 

in java we have 3 types of Logical operator. 

1. Logical AND operator
2. Logical OR operator 
3. Logical NOT operator


** ! Logical AND operator **


value1        operator       value2         result

true          &&             true           true

true          &&             false          false 

false         &&             true           false 

false         &&             false          false 



**Logical OR operator**

value1        operator        value2         result

true          ||              true            true 

true          ||              false           true 

false         ||              true            true 

false         ||              false           false 




**Logical NOT operator**

operator value1   result

!        true     false 

!        false    true 




Q1 : System.out.println(10 > 5 && 20 < 30);

Q2 : System.out.println(10 > 50 || 20 < 30);

Q3 : System.out.println(!(10 > 5));

Q4 : System.out.println(!(10 > 5 && 20 < 30));

Q5 : System.out.println(10 > 5 && !(20 < 10));

Q6 : System.out.println(10 < 5 || !(20 == 20));

Q7 : System.out.println(!(10 == 10) || 5 >= 5);

Q8 : System.out.println(!(10 < 5 || 20 > 15));

Q9 : System.out.println(10 >= 10 && 5 != 3);

Q10 : System.out.println(!(10 >= 5) && 20 < 30);




###  Conditional Operator 

*syntax:*

  x ? y : z 


  this operator is used to check the condition, and based on that it gives the output. 

  it takes 3 operands, so we can call it ternary operator.

  note : 
    x value should be boolean. 
    y and z is used to determine the output.




###  Control Flow Statement  

it is used to control the execution of the program. 

we have 3 types control flow statement

1.  Decision Making statement 
2. Looping Statement 
3. Jump Statement 

**Decision Making statent**

**if statement**

*syntax :*

```java

  if(condition)
  {
      
      // code
  }
```


  eg: 

  in if statement it will check the condition,
  if the condition is true it will enter into the if block.


```java

  class Person
  {
     public static void main(String[] args)
     {
          int age = 34 ;

          if(age > 19)
          {
            System.out.println("you are adult");
          }
     }
  }
```


**if else statement**

*syntax:*

```java

   if(condition)
   {
       // code
   }
   else
   {
       // code 
   }
```

   here inside if , it will check the condition.
   if the condition is true , it will enter into the if block otherwise it will enter into the else block.


**else if ladder**

   *syntax*

```java

    if(condition)
    {
        // code
    }
    else if(condition)
    {
        // code
    }
    else if(condition)
    {
        // code 
    }
    .
    .
    .
    .
    else
    {
         // code 
    }
```


    when we want to check more than one condition then we can use else if ladder. 
 

 **write a java program to check number is zero , positive or negative**




 **switch statement**

  when we have more than one condition to check we can use switch statement. 

  *syntax:* 

```java

      switch(expression)
      {
         case value1 :   // code 
                        break;
        
         case value2 :  // code 
                        break;
            .
            .
            .
            .
        case value-n: //code 
                      break;

        default :  // code 
      }
```



inside switch the expression we are giving , it will compare with case value.

if they are matching then that case block will execute.

in each case block break statement is mandatory.
if we are not giving it will execute all the remaining case block which are present after the case block what is matching with expression.

if condition is not mathing with any case that time for getting output we can use default.



*note :*  

in switch we can not use boolean , float , double , long



###   Loop  

if we want to perform one task again and again then we can use looping statement. 

in java we have 3 types of looping statement.

1. for loop 
2. while loop 
3. do while loop 


**for loop**

*syntax:* 

```java

 for( initialization ;  condition ; updation)
 {
    // code 
 }
```

 **print hello 5 times**


```java

 for(int i=1 ; i<=5 ; i++)
 {
    System.out.println("hello");
 }
```

 **print 15 to 20**


 ```java

    for(int i=15 ; i<= 20 ; i++)
    {
        System.out.println(i);
    }
```


 
 **task**

 print all the odd numbers between 100 to 150

 add all the even numbers between 20 to 40

 multiply all the odd numbers between 5 to 15


 **while loop**



```java

    initialization

    while(condition)
    {

        // code 

        updation

    }
```


 * while loop is used when we don't know exactly how many times one loop will run.

 eg: 

 ```java

            int i = 1 ; 

            while(i<=5)
            {
                System.out.println("we love java");
                i++;
            }
```


  **do while loop**

  * this loop is called as exit controlled loop.

  * if our condition is false, then also atleast one time it will execute. 

  * for creating menu driven program we have to use this loop. 



 ###  methods 

  method is block of code, performing some particular/specific task.

  **how to create method**

  *syntax:* 

  [access modifier] [modifier] returntype methodname([formal argument])
  {

  }

  *method signature* => methodname + formal arguments 

  *method declaration* => access modifier + modifier + returntype + method signature   

  *method definition* =>method declaration + method body => 

  **types of method**

  in java we have two types of methods. 

  1. No Argument method 
  2. Parameterized method 


  **1. No argument method**

    the method that does not have any formal arguments. 

    eg: 

```java

     public static void greet()
     {
        System.out.println("good morning everyone");
     }
```

   
   **2. parameterized method**

    method that having formal arguments, is called parameterized method. 

  eg: 

  ```java

       public static void wish(String name)
       {
         System.out.println("good morning "+name)
       }
```


**method calling statement**

 for calling the method we need method name and arguments.

 it should match with mehtod signature.

```java

 public static void m1(int a , String b)
 {

 }

 m1("hi",10); ❌
 m1(10,30);❌
 m1(10,"hello");✅
```




### Jump Statement ###

   in java mainly we have 3 jump statementes.

   * **continue** 
   * **break** 
   * **return**


**continue**
    
    it is used to skip the current iteration.
    it should be used with conditional statement.

eg: 
      **print 1 to 10 but skip 3 , 7 , 9 .*

      ```java
               for(int i=1 ; i<=10 ; i++)
               {
                  if(i==3 || i==7 || i==9)
                        continue;

                  System.out.println(i);
               } 
      ```


**break** 
    
   * break keyword is used to terminate the current  iteration.

   * we can use break keyword inside loop and switch case.

eg: 
    


      ```java
               for(int i=1 ; i<=10 ; i++)
               {
                  if(i==5) 
                        break;
                  System.out.println(i);
               } 
      ```

   ***output*** => 1 2 3 4 

      ```java
               for(int i=1 ; i<=10 ; i++)
               {
                  System.out.println(i);
                  if(i==5) 
                        break;
               } 
      ```

   ***output*** => 1 2 3 4 5



**write a program to find prime number. use break in the pgm**




**return**

   * it is a keyword, used to transfer control from one method to another method.

   * return should be the last statement in our method. 

   * after using return if we write anything that can not be reached, it will give error.

   note: 
      if any method return type is void, `we can't call the method inside println()`.


eg: 

```java

   class Functions 
{
	public static void m1()
	{
		System.out.println("i am m1");	
	}
	public static int m2()
	{
      System.out.println("i am m2");
		return 500;
      //	System.out.println("how are you"); ❌  not possible
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
	//	System.out.println(m1());  ❌ not possible
      m1();
		m2();
		System.out.println("end");
	}
}

```


###  ARRAY 

Array is linear datastructure where we can store multiple value in continuous manner.

in array we can store homogeneous data.

**how to create array**

*syntax:* 

   datatype arrayname[] = new datatype[size];

**note: arrayindex starts from 0.**

eg: 

```java

     String friends[] = new String[6];
```

    
    in this example we have taken array size as 6.
    so the index number will start from 0 and the last index number will be 5.

    we can't give index value for more than 5 or lessthan 0.

    negative index is not possible for array.

    for these it will give one error =>     
     ArrayIndexOutOfBoundsException

    when we are creating array, it will store default value of that particular datatype.


**how to access array element**

*syntax :*   arrayname[index]

eg: 

```java

       System.out.println(friends[4]); // null
```

**how to assign the value in array**

*syntax:*  arrayname[index] = value ;

eg: 

```java

     friends[5] = "phebe";

     System.out.println(friends[5]); // phebe
```


**how to know the length of array**

**length**

   *syntax:*  arrayname.length


**how to traverse array**

for traversing we can use looping statement.

```java

        for(int i=0 ; i<friends.length;i++)
        {
            System.out.println(friends[i]);
        }
```

**How to print array by using Arrays class**

first we have to import Arrays class. 

*import java.util.Arrays;*

in this Arrays class we have one method toString(), it is used to print the array. 

*Arrays.toString(name of the array);*


**Recursion**

* it is the process of calling any function/method itself.

* here very important is we have to provide base case.

* base case is one condition that helps to stop the iteration.

* if there is no basecase our method will execute repeatedly and it will give stack overflow.


eg 1 :   print 5 to 1 . 


```java

class Print5
{
   public static void display(int n)
   {
        // base case 
        if(n==0)
           return;

        System.out.println(n);
        display(n-1);
   }

   public static void main(String args[])
   {
     display(5);
   }
}
```

code: 

**sum of n natural numbers**
**factorial**
**fibonacci series**
**power of number**
**merge sort**



###      static 

static is keyword and it is a modifier in java.

it represents common.

we can use static keyword in 

*i. variables*
*ii. methods* 
*iii. initializers*


**execution process of program**

when we are trying to execute our java code, JRE request RAM to provide memory.

the memory will be classified into 4 blocks.
  *i. method area* 
 *ii. static pool area* 
*iii. stack area*
 *iv. heap area*

**method area**

   inside this method area all the static and nonstatic blocks will be stored with address.

**static pool area**

  inside this area it will create one dedicated block class static area.

  the name of the block will be same as classname.

  it will store all the static members of the class.

**stack area**

it is used only for execution purpose.

inside the stack area all the method will come, it will execute and it will be removed from the stack.

stack follows Last In First Out(LIFO) principle.

if stack is empty means my program has executed.

**Heap Area**

it is used to store the objects. 

inside the object it will store all the non-static members.


**static variable**

any variable declared in global area and prefixed with static keyword is called static variable.

static variable will be stored in the csa with default values.

example : 

any static variable we can access 3 ways from the same class.

1. directly by the variable name
2. by using class 
3. by using object

**Accessing static variable from other class**

from other class we can't access directly by the variable .

by using class we can access.

by using object of that class, we can access.

eg: 


```java

class A
{
   static int x ; 
}

class B
{
   public static void main()
   {
       System.out.println(x) ;  // not possible

       System.out.println(A.x); // possible 

       A ob = new A();
       System.out.println(ob.x);  // possible
   }
}
```


**static methods**

any method that is prefixed with static keyword is called static method.

when we are executing our program static methods will load in method area with address.

next it will load its address and method signature inside class static area.

next it will go to stack area and it will execute.

**note :**

 if we are creating any static method 
 
 **from same class**

 we can access directly ✅
 we can access by class ✅
 we can access by object referece ✅

 **from another class**

 access directly ❌
 access by class ✅
 access by object referece ✅

```java

        class Demo
        {
            // static method
            static void display()
            {
                System.out.println("Static method executed");
            }

            public static void main(String[] args)
            {
                // ! from same class

                // direct access ✅
                display();

                // by class name ✅
                Demo.display();

                // by object reference ✅
                Demo d = new Demo();
                d.display();
            }
        }

        class Test
        {
            public static void main(String[] args)
            {
                // ! from another class

                // direct access ❌
                // display(); // CTE

                // by class name ✅
                Demo.display();

                // by object reference ✅
                Demo d = new Demo();
                d.display();
            }
        }
```


 **static Initializers**

 we have two types of static initializers.
 i. single line static initializers
 ii. multi line static initializers

 **single line static initializers**

    any static variable that is assigned some value is called single line static initializers.

    note: 
    when it is loading inside class static area, it will assign default value.

    later it will be assigned with given value.

    eg: 
     



**Multiline static Initializers**

*syntax*

```java
    static
    {

    }

```

  this is used for startup instruction.

  we can assign static variable inside this block.

  eg: 


```java

class Demo
{
    // multiline static initializer
    static
    {
        System.out.println("Static Block 1");
        System.out.println("Loading class...");
        System.out.println("Database Connected");
    }


    public static void main(String[] args)
    {
        System.out.println("Inside main method");
    }

    static
     {
            System.out.println("Static Block 2");
            System.out.println("Application Started");
     }
}

//output : 
// Static Block 1
// Loading class...
// Database Connected
// Static Block 2
// Application Started
// Inside main method
```

**static context**

   any block (method/multiline initializers) having static keyword as prefix, is called static context.

   from static context we can't access any nonstatic members.

   eg: 

```java

    class Student
    {
        String sname;
        static{
             System.out.println(sname);   ❌ not possible
        }
        public static void main(String args[])
        {
           System.out.println(sname);   ❌ not possible
        }
    }
```


  **Class Loading Process**

  when we are executing our program memory will be classified into 4 blocks.

  in the method area it is storing all the blocks with address.

  in the static pool area it will generate one dedicated block by name of class that is called class static area.

  in that area it will store all the static members of class.
  for variable it will give default values.
  for method and multiline initializers it will take address and signature.

  after that all the initializers will execute top to bottom.

  once all the initializers are executed and main method is ready to go in stack area, our Class loading process is completed.


  ### class and object  

  class is a keyword and it is a blueprint for creating the object.

  class is userdefined nonprimitive datatype.

  *syntax:* 


```java

  class classname
  {
     
  }
```

  **what is object**

  any thing that have physical existance that is called object. 

  with the help class we can create object, so we can tell object is instance of class.

  object having states and behaviours.

  **what is states**

    states are non static variable of object.

  **what is behaviours**

     behaviours are non static methods of object.


  **how to create an object**

  we can create an object with the help of new keyword.

  syntax: 

      classname refVariable = new classname();


  we can apply nonstatic in 
  1. variable
  2. method
  3. initializers 
  4. constructor


  **non static variable**

  any variable that does not have static keyword as prefix, is called as non static variable.

  when we are creating object one memory will be created in heap area.

  in this memory all the non static variable will be stored with default values.

  eg:


```java

  class Person
  {
      int age ; 
      public static void main(String args[])
      {
           Person p1 = new Person();
           System.out.println(p1.age);

           p1.age = 30;
           System.out.println(p1.age);

           Person p2 = new Person();
           System.out.println(p2.age);
      }
  }

  // output :   0 
                30
                0
``` 



*note :* 
  
  **Accessing nonstatic varialbe from same class.**

  direct access . ❌
  by using class name . ❌
  by using object ref . ✅

  **Accessing nonstatic varialbe from other class.**

  direct access . ❌
  by using class name . ❌
  by using object ref . ✅


  **non static method**

  any method that does not have static keyword as perfix is called as non static method.

  when we are executing our program non static method will be stored in method area.
  (it will not store in class static area)

  when we are creating the object , all the non static methods will store inside the object with method signature and method address.

  when we are calling the method by using object reference it will come to stack area and it will execute.

  eg: 

```java

  class Leo
  {
      String actorName ;    // nonstatic variable 

      void songs()
      {
        System.out.println("Naa Ready");
        System.out.println("Ordinary Person");
      }

      public static void main(String args[])
      {
           Leo l1 = new Leo();
           l1.song();
      }
  }
```



  **accessing nonstatic method from same class**

    directly ❌
    by using class ❌
    by using object reference ✅

  **accessing nonstatic method from other class**

    directly ❌
    by using class ❌
    by using object reference ✅


  **Non static Initializers**

  in java we have 2 types of nonstatic initializers.

   *i. single line nonstatic initializers*
  *ii. multi line nonstatic initializers*


  **single line nonstatic initializers**

  any nonstatic variable if it is assigned with some value, is called as single line nonstatic initializers.

  **multiline nonstatic initializers**

```java
  {

  }
```

*note :* when we are creating the object that time only nonstatic initializers will be executed from top to bottom.


 ###       Constructor  

 * constructor is special block whose name is same as classname.

 * constructor does not have any returntype.

*syntax:* 

```java
[access modifier] classname([formal arguments])
{
    
}

eg: 
     class Abc
     {
         Abc()
         {
             // Load Instruction 

             // programmer written statement
         }
     }
```

**types of constructor**

in java we have two types of constructor 

1. Non parameterized constructor 
2. parameterized constructor


**how to call constructor**

we are calling constuctor by using new keyword.

eg: 
 ```java 
        Student s1 =   new Student();
 ```


**Non Parameterized Constructor**

any constructor that does not have any formal arguments / parameters is called as non parameterized constructor.


eg: 

```java
class ABC
{
     ABC()
     {
        System.out.println("I am constructor");
     }

    int a ;

    public static void main(String args[])
    {
        ABC ob1 = new ABC();
        System.out.println(ob1.a);

        ABC ob2 = new ABC();
        System.out.println(ob2.a);
    }
}

// output : 

I am constructor 
0
I am constructor 
0
```

**Note**

if any class does not have any user defined constructor (constructor created by user), *that time the class have default constructor.*

default constructor is `non parameterized constructor.`


**parameterized constructor**

any constructor that has formal arguments / parameters that is called parameterized constructor.

by using this parameterized constructor when we are creating object that time we can pass the values for the states.

so we can perform creating object and assign values to the states in single step.

eg: 

```java

class Student
{
    String sname;
    int sid;

    Student(String name , int id)
    {
       sname = name;
       sid = id ;
    }

    void display()
    {
      System.out.println(sname);
      System.out.println(sid);
    }

    public static void main(String[] args)
    {
        
        Student s1 = new Student("salman",1);
        s1.display();

        Student s2 = new Student("vijay",5);
        s2.display();
    }
}
```

**Object Loading Process**

* when we are executing our program all the nonstatic methods and nonstatic multiline initializers will store in method area.

* when we are creating the object we are calling the constructor.
that time it is creating one object block inside heap area.
now constructor is loading all the nonstatic members inside the object block with default value.
and the nonstatic method, non static multiline initializers are stored with signature and address.

* after that all the nonstatic initializers will execute from top to bottom.

* now we can say our object loading process is completed.


**this keyword**

* this is one keyword.

* it is nonstatic referenced variable.

* this works for current object reference.

* when we have local and global variable same name, that time to access the global variable we can use this keyword.

* we `can't write this keyword in static context`.


eg: 

```java
class Employee
{
    // global variables
    int eid;
    String ename;

    // constructor
    Employee(int eid, String ename)
    {
        // local variables and global variables same name

        this.eid = eid;
        this.ename = ename;
    }

    void display()
    {
        System.out.println("Employee id is : " + this.eid);
        System.out.println("Employee name is : " + this.ename);
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Rahul");

        e1.display();

        // this keyword in static context ❌
        // System.out.println(this.eid); // CTE
    }
}
```

**nonstatic context**

  any block that is nonstatic (nonstatic method/ multiline nonstatic initializers)


##   Part - 2 (OOPS) 


* OOPs stands for Object Oriented Programming system.

* it is one approach for writing the program based on real world object.

* by using oops we are solving the real world problem.

**Pillars Of OOPs**

1. Encapsulation
2. Inheritance 
3. Polymorphism
4. Abstraction


###   Encapsulation 

* it is the process of binding / wrapping the data into single unit.

* in java by using class we are wrapping all the states and behaviours of objects.

*Note:* 
     The advantage of Encapsulation is **Data Hiding.**

**what is Data Hiding**

       It is the process of restrict the direct access of data memebers and providing indirect access through methods.


**in Encapuslation for achiving data hiding we have to follow some steps :** 

*1. make all the nonstatic variable as private.*
       by doing this we can restrict the direct access of the data members.

*2. we have to create getter method.*

  **how to create getter method**

 ```java
  public returntype (of the variable) getVariablename() 
  {

       return variable;
  }
```
  by using this getter method other class can read the data.

*3. we have to create setter method.* 

  **how to create setter method**

  ```java
   public void setVariablename(returntype parameter)
   {
          this.variable = parameter;
   }
```
   this method is used to give the access to other class so that they can assign the data.


**Reference Variable**

  * any variable that can store the address of object, is called as reference variable. 

   *note :*
      more than one reference variable can assign same object address.


  eg: 

```java
     class A
     {
         int x ;
         String y;

         public static void main(String args[])
         {
            A ob = new A();
            System.out.println(ob);          // A@123

            A ob2 = new A();
            System.out.println(ob2);        // A@980

            A ob3 = ob;
            System.out.println(ob3);       // A@123

            A ob4 = ob2;
            System.out.println(ob4);     // A@980
         }
     }

```

### Singleton class

     the class that can create only one object is called singleton class.

 **how to create singleton class**

*step1 :*   take one referece variable that should be 
               public and static 

               eg: 
  ```java
                    public static Thala t;
   ``` 

*step 2 :*   take one private constructor.
               so that other class can't create any object of this class. 
```java
               private Thala()
               {

               }
```

*step 3:*   create one public static method that will 
              create object and return the object.

              we have to create the object if the reference variable is null.

              eg: 
```java
              public static Thala getThala()
              {
                  if(t == null)
                       t = new Thala();
                  
                  return t;
              }
```


*step 4 :*   from other class we can access the getThala() 
            method by using class and we can get the object.


            eg: 

```java
            class Fan
            {
               public static void main(String args[])
               {
                   Thala t1 = Thala.getThala();
                   Thala t2 = Thala.getThala();

                   System.out.println(t1);         // Thala@1234
                   System.out.println(t2);        // Thala@1234
               }
            }
```

**POJO Class**

  stands for plain old java object class.

  this class will be having private data members and public getter and setter methods.



### Relationship  

  relationship is connection between objects. 

                         Relationship

      Has-a-Relationship                 Is-a-Relationship


Composition            Aggregation


**composition**

when between the objects the relationship is strong, one object can not survive without other object is called composition.

eg: 

    Car                 Boy            Phone

    Engine             Heart         Battery

eg: 

```java


class Engine
{
	
	void start()
	{
		System.out.println("engine has started");
	}
}

  class Car
{
	Engine e1 = new Engine();  // composition
	
	Car()
	{
		e1.start();
		System.out.println("car has manufactured");
	}
}


class  Factory
{
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		
		System.out.println("-------------------");
		
		Car c2 = new Car();
		
	}
}

```

*Note : here when ever we are creating the object of car it will create the object of engine, they are fully dependent.*


**Aggregation**

when between the objects relationship is weak, one object is not fully dependent on another object, is called Aggregation.

```java

class MusicPlayer
{
	void song()
	{
		System.out.println("Dheema song is playing");
	}
}

class Car
{
	Car()
	{
		System.out.println("BMW has manufactured");
	}
	
	Car(MusicPlayer mp)
	{
		mp.song();
		System.out.println("RR has manufactured");
	}
}


class Aggregation 
{
	public static void main(String[] args) 
	{
		Car bmw = new Car();
		
		System.out.println("--------------------------------");
		
		MusicPlayer mp = new MusicPlayer();
		
		Car RR = new Car(mp);

	}
}

```

*Note: here Car and MusicPlayer are not fully dependent, if we pass or if we not pass the object of MusicPlayer there is no problem.*


### INHERITANCE  

* it is the process of acquiring properties of one class into another class.

* for performing inheritance minimum two classes are needed.

* from which class we are acquiring the properties is called as Parent class / Super class / Base class.

* in which class we are inheriting all the properties is called as Child class / Sub class / Derived class.

for performing inheritance we need 2 keywords.
1. extends 
2. implements 

**properties that can not be inherited from Parent to Child**

*i. private members*
*ii. constructor* 
*iii. multiline nonstatic initializers* 


**when we have to use implements and extends**

* when Parent is class and Child is also class we need *extends* keyword to perform inheritance.

* when Parent is interface and Child is also interface we can use *extends* keyword

* when Parent is interface and child is class that time we have use *implements* keyword.

* when Parent is class and Child is interface that time **inheritance not possible.***


### types of Inheritance in java

1. Single Inheritance / Single Level Inheritance 
2. Multi Level Inheritance 
3. Hierarchical Inheritance 
4. Multiple Inheritance 
5. Hybrid Inheritance 


**Single Level Inheritance**

* when one Parent class having only one child class, is called Single Level Inheritance.

note: 
      by using child class referece we can access both child and parent class properties.
      but 
      by using parent class reference we can access only parent class properties not child class properties.

**Multi level inheritance**

when parent class having one child class and that child class having another child class, that is called Multi Level Inheritance.


**Hierarchical Inheritance**

if one parent class having multiple child classes in a same level, is called as Hierarchical Inheritance.


**Multiple Inheritance**

if one child class having multiple parent class in the same level is called as Multiple Inheritance.

note: 
     in java multiple inheritance not possible by using class, we can do by using interface.


eg: 

```java
    class Father
    {

    }

    class Mother
    {

    }

    class Child extends Father,Mother
    {
          **! ❌ not possilbe **
    }

```

**Hybrid Inheritance**

    combination of any two inheritance is called as Hybrid Inheitance.

    note: 
         we can't create Hybrid inheritance with multiple inheritance.


**Constructor Chaining**

 * calling one constructor from another constructor is called as constructor chaining.

 * in the same class if we want to perform constructor chaining we need this() calling statement.

**this() calling statement**

* it is used for performing constructor chaining in a same class.

* it should be the first statement in the constructor.

* we can't write multiple `this()` statement in same constructor.

* if there is n number of constructor, we can use `n-1 times this()` statement.


**Constructor chaining from different class**

* if we want to perform constructor chaining from different class we need `super()` statement.

* when we are performing inheritance we can access all the parent class properties by using child class reference.

**how ???**

* when we are creating object of child class, it will call child class constructor.

* in that constructor by default super() calling statement is present.

* the job of super() is to call parent class constructor.

* now the job of parent class constructor to load all the instruction inside the object block of child class.

* in inheritance first parent class property will load after that child class properties will load.


**super() calling statment**

* it is used to call the immediate parent class constructor.

* `super()` should be the first statement in the constructor.

* `this()` and `super()` can not be present together.

**difference b/w super() and this()**





### non-primitive typecasting 

            non primitive typecasting

upcasting                              downcasting


**upcasting**

* converting child class reference into parent class reference is called as upcasting.

* the advantage of upcasting is **Genralization**

eg: 

```java
    class Parent
    {
        int money = 2000;
    } 

    class Boy extends Parent
    {
        String toy = "car";
    }

    class Girl extends Parent
    {
        String toy = "gun"; 
    }

    class Main
    {
        public static void main(String args[])
        {
             Boy b = new Boy();
             Parent p = b;         // upcasting

             Parent p1 = new Girl();  // upcasting

             System.out.println(p.money);   ✅
             System.out.println(p1.money);  ✅

             System.out.println(p.toy);   ❌ 
             System.out.println(p1.toy);  ❌
        }
    }
```

*note:*
    upcasting is done implicitly.



**what is Genralization**

   it is the capability of parent class referece to store any child class reference.

   when we don't know which child reference to be created that time we can create the reference of parent class and we can store any child class object reference.

**Downcasting**

   converting parent class reference into child class reference is called downcasting.

   if we are performing downcasting there should be upcasting.

                     class A
    
    class B          class C         class D


```java
     A  a1   =   new B()   // upcasting
     B  b1   =  (B) a1 ;  // downcasting
```

*note:*   
    upcasting is done implicitly but for performing downcasting we need typecast operator  (classname).

    C c1 = (C) a1 ;  ❌
    D d1 = (D) a1 ;  ❌


    -------------------------------------------------


    class A

    class B

    class C

    class D


   A a1 =  new C()

   B b1 = (B) a1 ;  ✅
   C c1 = (C) a1 ;  ✅

   D d1 = (D) a1 ; ❌

   C c2 = (C) b1 ; ✅
   D d2 = (D) b1 ; ❌

------------------------------------------------------


  **what is classcast exception**

   without upcasting if we want to perform downcasting it will give classcast exception.

```java
   class A 
   {}

   class B extends A
   {}

   class C extends A
   {}

   class Main
   {
      public static void main(String args[])
      {
           A ob = new B(); // upcasting 
           C ob2 = (C) ob; // classCastException
      }
   }
```



### Polymorphism  

 object having capability to undergo multiple forms , is called Polymorphism.

 polymorphism is the combination of two greek words poly that means many and morphism that means forms.

 eg: 

    ice    water   steam/gas


       --** curd
milk   ---** ghee
       ---** butter


**Types of Polymorphism**

*1. compile time polymorphism* 
        
        i. method overloading
       ii. constructor overloading
      iii. method shadowing 
       iv. variable shadowing 

*2. run time polymorphism*

       i. method overriding




### compile time polymorphism

* if the binding is happening during compile time that is called compile time polymorphism.

**what is binding**

connection between method calling statement and method signature is called binding.

**1. method overloading**

 if in the same class there is more than one method with same name but different formal arguments, is called method overloading.

 **what is the meaning of different formal arguments**

 *no of arguments* 
 *type of arguments*
 *order of arguments*

 
 **note :** 
    
    method overloading is possible for both static and nonstatic methods.

    return type of the method does not matter for method overloading.


    eg:

```java
      class MethodOverload
      {

          void m1()
          {
            System.out.println("i am m1 without any arguments")
          }

          int m1(String x)
          {
               System.out.println("m1 with one string argument");

               return 10;
          }

          int m1(int x)
          {
              System.out.println("i am m1 with one int argument");
              return 20;
          }

          void m1(int x,String y)
          {
            System.out.println("m1 with int and string arguments");
          }

          void m1(String y , int x)
          {
              System.out.println("m1 with string and int arguments");
          }


          psvm(String[] args)
          {
               MethodOverload ob = new MethodOverload();

               ob.m1();
               ob.m1(300);
               ob.m1("hi");
               ob.m1(2000,"good morning");
               ob.m1("how are you",5000);
          }
      } 
```

**type promotion**

* method declartion when we are doing that time which method signature we are providing and when we are calling the method by passing the arguments if they are not matched it gives error.

* but before giving error it checks can it perform type cast or not.

* if the type cast is possible then it calls type promotion.

eg: 

```java

class A
{
     void m1(float a , float b)
     {
        System.out.println("hi");
     }
     void m1(double a , double b)
     {
        System.out.println("hi");
     }
}

class Main
{
     public static void main(String args[])
     {
              A ob = new A();
              ob.m1(10,30);

     }
}
```

eg 2 : 

```java
class B
{
    void m2(float a , double b)
    {
         System.out.println("hi");
    }
    void m2(double a , float b)
    {
         System.out.println("hello");
    }
}

class Main
{
    public static void main(String args[])
    {
          B ob = new B();
          ob.m2(20,30);   ❌ not possible
    }
}
```


### main() method overload is possible ?

  YES, we can perform method overload for main method.


### constructor overloading 

inside same  class if there is more than one constructor by the same name but different formal arguments, is called as constructor  overloading.


### method shadowing 

if parent class and child class both having same static method it is called as method shadowing.

if we are creating the reference of child class it will give priority to child class method.

if we are creating the reference of parent class it will give priority to parent class method.

method shadowing is also called as method hiding.

note: 
     it is checking the reference not the object.

**Rules of Method Shadowing**

* method name should be same.
* return type of method should be same 
* formal arguments should be same 
* method should be `static`
* access modifier should be same or higher. 

 **public -> protected -> default -> private**


 ### variable shadowing 

 * if parent class and child class having same variable, 
   if we are targetting by the parent ref it will take 
   parent class variable and if we are targetting by the child ref it will take child class variable.

* if global and local both variable is same any block 
  will give more priority to the local variable.

 
 eg: 

```java
    class Demo1
    {
         int x = 10 ;

         void m1()
         {
            int x = 50 ; 
            System.out.println(x);
         }
    }

    class Demo2 extends Demo1
    {
        int x = 20;
    }

    class Main
    {
        public static void main(String args[])
        {

            Demo1 d1 = new Demo1(); 
            System.out.println(d1.x); // 10

            Demo2 d2 = new Demo2();
            System.out.println(d2.x); // 20

            Demo1 d3 = new Demo2();  // upcasting 
            System.out.println(d3.x); // 10 

            d3.m1();  // 50 
        }
    }

```


### method override

**method override by using @Override**

```java
class A
{
	void m1()
	{
		 System.out.println("hi");
	}
}
class B extends A
{
	@Override
	void m1()
	{
			 System.out.println("hello");
	}
}

class Example2 
{
	public static void main(String[] args) 
	{
		 B ob = new B();
         ob.m1();         // hello

         A ob1 = new A();
         ob1.m1();      // hi

         A ob2 = new B(); // upcasting
         ob2.m1();        // hello
	}
}

```


***what is method override ***

  if parent class and child class having same non static method, is called **method override**

  ***rules of method override***

  * there should be is-a-relationship
  * method should be nonstatic 
  * method signature should be same (name and formal arg)
  * return type of methods should be same
  * access modifier should be same or higher visibility.
  * we can use **@Override** annotation.
  * final method can not be overridden.


**Note**
      runtime polymorphism depends on object not on reference variable of class.




### final 

   final is one keyword.
   it is one modifier.
   it defines constant , we can not change.

   we can use final keyword in 

   1. variable 
   2. method
   3. class 


**final variable**

   * any variable that is prefixed with final keyword is called final variable.

   * for final variable re-initialization is not possible.

   * when ever we are declaring any final variable that should be assigned.

```java
   final int A ; 
   A = 20 ; 
   System.out.println(A);         ❌  not possible 

   final int B = 20 ;  ✅ possible 
```

   when we are taking any final variable that should be written in uppercase.

**can we take static final variable**
      =>  yes 


eg: 

```java
     class Example
     {

         final static int A ;  ❌ not possible 

         final static int B = 20 ;  ✅ possible 
     }
```

**can we take global nonstatic final variable**
      
       yes 

```java
        class Example2
        {
            final int ID ;  ❌ not possible

            final int PAN_ID = 123455;  ✅ possible 
        }
```


**By the help of multiline static initializers we can perfrom declaration and initialization in two steps for final static variable.**

```java

        class Example2
        {
            static final int A ;

            static{
                A = 20 ;
            }
        }
```


**by using constructor we can do declaration and initialization in two steps for nonstatic final variable**

```java
        class Example3
        {
            final int B ;

            Example3()
            {
                this.B = 30 ;
            }
        }
```

MIN_VALUE , MAX_VALUE they are final variable.


**final class**

* any class prefixed with final keyword is called as final class.

*syntax*
```java
        final class class_name
        {

        }
```

when we are making any class final we can not inherit that class.

eg: 
   String class is final class, we can't inherit String class.

```java
class A extends String
{
    ❌ not possible 
}
```

**final method**

* any method prefixed with final keyword is called as final method.

* for final method , method override is not possible.


eg: 

```java
 class Parent
 {
     final void sleep()
     {
        System.out.println("parnet is sleeping");
     }
 }

 class Child extends Parent
 {
     void sleep()     ❌ not possible 
     {
        System.out.println("child is sleeping");
     }
 }
```



### Abstraction 


it is the process of hiding the implementation and providing only the essential features.

eg: 
   if we press the break vehicle will be stopped, but we don't know how it is working.

   here break is the feature of vehicle but the implementation of this feature is not given. 


   to achice abstracion we need **abstract** keyword.
   * it is one modifier.
   * we can use it in class and method.


**abstract method** 

  * any method that is prefixed with abstract keyword,is called as abstract method.

  * we can't provide any body for abstract method.

  ***syntax***
      
[access modifier] abstract returntype methodname([arg]);


**Note**
     we can't provide static keyword with abstract keyword.



**concrete method**
         
 * any method that does not have abstact keyword as prefix is called as concrete method.

 * this method should have method body.


 **abstract class**
   
  * any class that is prefixed with abstract keyword is called as abstract class.

  * if any class having atleast one abstract method, the class should be defined as abstract.

  * we `can not create any object` of abstract class.

  * inside abstract class we can take both `abstract method` as well as `concrete method`

  *syntax:* 
    
      abstract class class_name
      {
          // abstract method 
          // concrete method
      }

 
**concrete class**

 * any class that is not prefixed with abstact keyword, is called as concrete class.

 * concrete class `can not store abstract method`, it is used to store only concrete methods.

 * we can create object of concrete class.


 ### how to achive abstraction by class

*step 1 :* 
      
   we have to take `abstact method`.

   so that it will provide only the features not the implemetation.

   eg: 

      ```java
            abstract void biriyani();
      ```

*step 2:* 
      we have to take abstract class to wrap the abstract method.
eg: 
        
```java
    abstract class KFC
    {
        abstract void biriyani();
    }
```

  **Note : not possible**
 

  class KFC                    class KFC
  {                            {
      void biriyani(); ❌         abstract void biriyani();
  }                            }  ❌

   **Note : possible**

  abstract class KFC
  {
    abstract void biriyani();

    void friedChicken()   ✅ possible👍🏻
    {

    }
  }


*step 3 :* 
  
  *  We have to provide inheritance of the abstract class.
  *  we can't create the object of abstract class, for that we can't access any nonstatic properties of the class.

  ```java
     
      class Nexus extends KFC
      {
         ❌ not possible 
      }
  ```

   when we are performing inheritance of abstract class inside concrete class it will give error.

   because this concrete class can not store the inheritated abstract method.

   to overcome this either we can make the child class as abstract or we can perform method override of the abstract method.


   ```java
       
       class Nexus extends KFC
       {
          @Override 
            void biriyani()
            {
                System.out.println("very good 😋🤗");
            }
       }
        
   ```

*step 4 :* 
   
    Now we can access all the properties of abstract class by creating the object of implementation class.

eg: 

 ```java
     
     class Restaurant 
     {
         public static void main(String[] args)
         {
            //  KFC k = new KFC(); ❌

            Nexus n = new Nexus();
            n.biriyani();

            KFC  k2 =  new Nexus();  // upcasting 
            k2.biriyani();
         }
     }
 ```

 **Note**
   
   * we can't make any abstract method as `final`.


### interface

  * it is one block same like class , is used to store variables and methods.

  * for creating interface we have to prefix the block with interface keyword.

  *Syntax*

```java
       interface interfaceName
       {

       }
```

 **why interface is needed ??**

  * 1. it is needed for providing `100% abstraction.`

         in abstract class we can define both abstract method as well as concrete method, but in interface we can define only abstract method not concrete method.

    * 2. it is used to achieve **multiple inheritance** 



*not possible*
   ```java
        interface A
        {
            void m1()
            {
                   ❌
            }
        }  
     ```


   ```java
        interface A           abstract interface A
        {                     {
            void m1();     public abstract void m1();
        }                     }
     ```


  inside interface when we are taking any variable that will be considered as public static final

eg: 

interface B
{
     int x ;  ❌ // not possible
}

interface C
{
    int y = 10 ;
}

abstract inteface C
{
    public static final int y = 10 ;
}
```

### how to achieve abstraction by using interface

*step 1:* 
   
    we need interface and abstract method.

    ```java
        interface Parent
        {
            void sleep();
            String bike = "RE";
        }
    ```

*step 2:* 
       we can not create the object of interface so that we can't access the nonstatic abstract methods of interface.

       for that we have to perform inheritance.

       ```java
          
          class Child implements Parent
          {
              @Override
                public void sleep()
                  {
                    System.out.println("sleeping");
                  }
          }
       ```

*step 3:* 
          now we can create the object of the implementation class and we can access the abstact methods.

          ```java 
            class Main
            {
                 public static void main(String[] args)
                 {
                        Child c  =   new Child();
                        c.sleep();

                     Parent p = new Child(); // upcasting
                     p.sleep();

                     System.out.println(Parent.bike);
                 }
            }
          ```

### Multiple Inheritance By using interface 

 we can perform multiple inheritance by using `interface`.

  for that *child should be class* and the parent can be class and interface but there should be **only one parent class** remaining **parent should be interface**.


### can we provide method body inside interface ??

    for nonstatic method we can't provide method body because they are bydefault abstract. 

    but for static method we can provide method body.

    this static method will not inherit to another class.


    eg: 

    ```java
        
        interface A
        {
            void m1();
            
            static void m2()
            {
                System.out.println("i am static method of interface A");
            }
        }

        interface C extends A
        {
        }

        class B implements A
        {
            @Override
                public void m1(){
                    System.out.println("i am m1");
                }
        }

     class Example 
        {
            public static void main(String[] args) 
            {
                System.out.println("Hello World!");
                A.m2();
                
                B ob = new B();
                ob.m1();
                
                //ob.m2();  // ❌ not possible
                
                //C.m2();   // ❌ not possible
            }
        }
    ```

### Types of Interface 

 in java we have 3 types of interface.

 **1. Regular Interface**
         
         in this interface we can take n number of static methods, abstract methods and constants.

    eg:

    ```java
            interface A{

                int x = 10 ;
                String str1 = "how are you";
                void m1();
                void m2();
                static void m3()
                {
                    
                }
                static void m4()
                {

                }
            }
    ```
     

**2. Functional Interface**

    in this type of inteface we can declare only one abstract method.

    for creating this interface we have to use 
    @FunctionalInterface annotation.

    we can provide n number of static methods and constant variables but abstract method will be only one.

    eg:

    ```java
       @FunctionalInterface
        interface A
        {
            void m1();
            //void m2();  ❌ not possible
            
            int x = 10 ;
            int y = 20 ;
             
            static void m3()
            {
                System.out.println("i am static method of interface A");
            }
            static void m4()
            {
                System.out.println("i am static method of interface A");
            }
            
        }
    ```


**3. Marker Interface**
   
      this type of interface does not have any methods and constants.

      it is used to mark or send some special signal to JVM.



##   Part - 3

###                 Object Class 


  * Object class is the `supermost parent class / root class` in java class hierarchy.

  * it is present in `java.lang` package.

  * in Object class there is 11 nonstatic methods.



  ### toString() method 

   * this method is present in `Object class`.

   * it is returning **classname@hexadecimal** value as string.

   **toString() method in Object class**

   ```java
    
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
   ```

   **code without override of toString()**


```java

   class Emp
   {
      String ename ; 
      int eid ; 
      Emp(String ename , int eid)
      {
        this.ename = ename ;
        this.eid = eid;
      }
      public static void main(String[] args)
      {
         Emp e1 = new Emp("miller",101);
         System.out.println(e1);
         System.out.println(e1.toString());
      }
   }
    // output:
            // Emp@12345eg
            // Emp@12345eg

```

**code by override toString method**



```java

   class Emp
   {
      String ename ; 
      int eid ; 
      Emp(String ename , int eid)
      {
        this.ename = ename ;
        this.eid = eid;
      }

     @Override 
        public String toString()
        {
            return "ename is : "+ename+ " eid is : "+eid;
        }

      public static void main(String[] args)
      {
         Emp e1 = new Emp("miller",101);
         System.out.println(e1);
         System.out.println(e1.toString());
      }
   }
    // output:
            // ename is : miller eid is : 101
            // ename is : miller eid is : 101

```


### equals() method

 `==` operator is used to check the address of object but 
 **equals()** method is used to check the content of the object.


 ```java
    
    Emp e1 = new Emp("miller",101);
    Emp e2 = new Emp("scott",102);
    Emp e3 = new Emp("miller",101);

    System.out.println(e1 == e2); // false
    System.out.println(e1 == e3); // false
 ```

 * in this example every object having different address.

 * for that even though our e1 and e3 content is same but we are comparing by using `==` operator , it will give the output as false.


 * to check the content / to compare the content we can use `equals()` method.

 ```java
    System.out.printn(e1.equals(e2)); // false 
    System.out.printn(e1.equals(e3)); // false 
 ```
  * in the above example e1 and e3 both content is same then also it will give false.

  * if we want to get true for that *we have to override the equals()* method.


  ```java
     @Override
       public boolean equals(Object obj)
       {
           // downcast 
           Emp e = (Emp) obj;

           return this.ename.equals(e.ename) &&
                  this.eid == e.eid;
       }

  ```


### hashCode()

 * this method is present in Object class, it will return one unique integer number.

 * if we override `equals()` method we **should override hashcode() method**

 ```java
    System.out.println(e1.hashCode());
    System.out.println(e2.hashCode());
    System.out.println(e3.hashCode());
 ```

 * for this above code it will create 3 unique number.
   here e1 and e3 both are equals but there hashCode number is different, that does not make any sense.

* means if `both objects are equal` there **hashcode should be same**, for that we have do *override of hashcode method.*

**How to override hashCode() method**

*step 1:* we have to import *Objects* class from `java.util` package.

*step 2 :* we have to override 

 ```java
    @Override 
     public int hashCode()
     {

     }
 ```

*step 3:* from this hashCode() method we have to generate unique number.
    
   that we can do by using *Objects.hashCode()* method or 
   *Objects.hash()* method.

   *Objects.hashCode()* can take 1 parameter.
   *Objects.hash()* can take more than 1 parameters.

```java
    @Override 
     public int hashCode()
     {
            return Objects.hash(ename,eid);
     }
```


### finalize()

* this method is present in Object class , it is called by Garbage Collector **System.gc()** before the destroy of any object.


```java

        class School
        {
            String sub1 ;
            String sub2 ;

            School(String sub1 , String sub2)
            {
                this.sub1 = sub1;
                this.sub2 = sub2;
            }

            @Override
            public String toString()
            {
                return "subject1 : "+sub1 + " subject2 : "+sub2;
            }

            @Override
            protected void finalize()  {

                System.out.println("object deleted");
            }

            public static void main(String args[])
            {
                    School s = new School("mathematics","chemistry");
                    s = null;
                    System.gc();
            }
        }

```



### clone() 

* The `clone()` method in Java is used to create an exact copy (a duplicate) of an existing object.

**steps to make clone of any object**

*step 1:*  `implement Clonable interface`

```java
         class School implements Clonable
         {

         }
```

*step2:*  `override the clone() method`

```java

    @Override
    public Object clone() throws CloneNotSupportedException {
          return super.clone();
    }
```

*step 3:* `use the clone() method and handle the exception`

```java

          School s1 = new School("java","python");
           System.out.println(s1);
         try{

             School s2 = (School) s1.clone(); // downcasting
             System.out.println(s2)
         }
         catch(Exception e)
         {
            System.out.println(e);
         }

```


### Package in Java


**built-in package in java**




### access modifier

  * it is used for visibility and accessibility  of identifiers in java.

  * in java we have 4 access modifiers. 

  * public , protected , default , private 





### method chaining 

* it is the process of calling more than one method in single statement. 

* for performing this all the methods return type should be class type and it will return the current object by using `this` keyword.

eg:

```java



class Practice
{

    Practice reading()
    {
        System.out.println("I am reading");
        return this;
    }
    Practice writing()
    {
        System.out.println("I am writing");
        return this;
    }
    Practice mock()
    {
        System.out.println("I will give mock");
        return this;
    }
    public static void main(String[] args) {
        
        Practice p = new Practice();

        // p.reading();
        // p.writing();
        // p.mock();

        p.reading().writing().mock();

    }
}
```







### method local inner class 

   * any class we are declaring inside method is called method local inner class.

   * the accessibility of this class will be inside this method only.


```java
   
    class Outer
      {
         public static void m1()
          {
                class Inner
                {
                     void m2()
                     {
                        System.out.println("this is inner class method");
                     }
                }

                Inner ob = new Inner();
                ob.m2();
          }
      }
```


### Anonymous class

* any class that does not have any name,is called Anonymous class.

*syntax*

    interfacename ref_var = new interfacename{

           @Override
    };


eg:

```java

interface Caluculate
{
    void add();
}

class Calulator 
{
    public static void main(String args[])
    {
        Calculate c = new Calculate(){
            @Override
              public void add()
              {
                System.out.println("this is add method");
              }
        } 
    }
}

```


### lamda expression

* anonymous block of code that is used to manage functional interface.

* it has introduced in java 8 features.

*syntax :*

```java
         
     interfaceName refVariable = (parameters)->{ }
```


eg: 

```java
  @FunctionalInterface
interface Operation
{
    void multiply();
}

interface Operation2
{
    void division(int a , int b);
}

interface Operation3 {

    int addition(int a , int b);
}

public class Lamda {
    public static void main(String[] args) {
        
        // ! lamda expression without parameter

        Operation op = ()->{

            System.out.println("muliply is "+(2*4));
        };
        op.multiply();


        // ! lamda expression with parameter

        Operation2 op2 = ( a ,  b)->{

             System.out.println("division is : "+(a/b));
        };
        op2.division(20, 5);

        // ! lamda expression with return type

        Operation3 op3 = (a,b)-> a + b ;

      System.out.println("addition is : "+op3.addition(30,60))  ;
    }
}

```



### Exception 

 * Exception is an unwanted event that occurs during the execution of program.

 * it happens becuase of some abnormal statement.

 * for this the normal flow of a program execution will be errupted.

 * exception happens suddenly.

 eg: 
     going to attend world class best **santanu sir** batch, suddenly rain came.

     santanu sir is teaching suddenly power cut happen.


*diagram of Exception class hierarchy*


**types of Exception**

* 1. Unchecked Exception 
* 2. Checked Exception 


**Unchecked Exception**

  * the exception, compiler is not aware of or compiler does not know about the exception is called as Unchecked Exception. 

  * Unchecked Exception is compile time success but run time error.


*example 1*

```java
 
 class A
 {
     public static void main(String args[])
     {
             int a = 20 , b = 0 ; 
             System.out.println("start");
             System.out.println(a+b);
             System.out.println(a-b);
             System.out.println(a/b);  
             System.out.println(a*b);
             System.out.println("end");
     }
 }
```

*note:* for the abnormal statement  `sop(a/b)`, it occurs Exception and it will stop the normal execution flow.


*example 2:*

```java
       class Ex2
       {
           public static void main(String args[])
           {
                int arr[] = {10,20,30,40,50};

                System.out.println(arr[0]);
                System.out.println(arr[3]);
                System.out.println(arr[5]);
                System.out.println(arr[1]);
                System.out.println(arr[2]);
           }
       }
```

*note* this is `java.lang.ArrayIndexOutOfBoundsException` 


*example 3:*

```java

        class Example3
        {
                public static void main(String args[])
                {
                    String s1 = null;
                    System.out.println(s1.toUpperCase());
                }
        }
```

*note:* this is ` java.lang.NullPointerException`


*example 4:*

```java
      class A
      {}
      class B extends A
      {}
      class Example4
      {
        public static void main(String args[])
        {
              B ob =(B) new A();
        }
      }
```
*note* this is `java.lang.ClassCastException`


**Checked Exception**

   * Exception that is known by compiler is called as Checked Exception.

*example*

```java
        class Example1
        {
                public static void main(String args[])
                {
                        for(int i=1;i<=10 ; i++)
                        {
                            System.out.println(i);
                            Thread.sleep(200);
                        }
                }
        }
```



### Exception Handling

 * when we are writing any abnormal statement in our prgoram, it will generate one **Throwable type object**.

 * after that immediately it won't stop the execution, it will search for any referece variable who can store the object.

 * now programmer task is to handle the Exception by storing the Throwable type of object.

 * for that we need **try and catch block** 

 *example*

 ```java
        
  class Handle
    {
     public static void main(String[] args) {  
        int a = 30 , b = 0 ;
        System.out.println("start");    ✅
        try{
            System.out.println(a+b);  ✅
            System.out.println(a/b);
            System.out.println(a-b); ❌
            System.out.println(a*b); ❌
        }
        catch(ArithmeticException e)
        {
            System.out.println("your problem I have handled"); ✅
        }
        System.out.println("end");

  }   
}
 ```


 **we can write multiple try block and multiple catch block**

 *example*

 ```java
     public class Handle2 {
    
    public static void main(String[] args) {
        
        System.out.println("start");

        int arr[]={2,3,4,5,6};
        String s = null ;

        // ! first try and catch block
    
        try
        {
            System.out.println(30/0);

        }
        catch(ArithmeticException e)
        {
              System.out.println("arithmetic exception is handled");
        }
    
        // ! 2nd try and catch block

        try{
            System.out.println(s.toUpperCase());
        }
        catch(NullPointerException e)
        {
           System.out.println("nullpointer exception is handled");
        }
       

        // ! 3rd try and catch 

        try{

            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("ArrayIndexOutOfBoundsException is handled");
        }
        System.out.println("end");

    }
}

 ```


 **try block with multiple catch block**

 *syntax*

 ```java

       try{
       }
       catch()
       {}
       catch()
       {}
       .
       .
       .
       catch()
       {}
 ```

 ```java


     public class handle3 {
    
    public static void main(String[] args) {
        
        System.out.println("start");
        int a[] ={1,2,3,4};
        String s = null;
        try{
            System.out.println(10+5);
            System.out.println(10-5);
            System.out.println(a[2]);
            System.out.println(a[10]);
            System.out.println(s.toUpperCase());
            System.out.println(30/0);
        }
        catch(ArithmeticException e)
        {
          System.out.println("ArithmeticException handled");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException is handled");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException is handled");
        }
        System.out.println("end");
    }
}
 ```


 * instead of writing multiple catch block we can use only one catch block.

 * when we are using multiple catch block, we have to handle all types of possible exception that might occur in my program.

 * to overcome this if we take only one catch block, this catch block should have capability to handle any kind of exception.

 * for that in the catch block we will take **Exception class** reference variable because it can store any kind of exception (checked and unchecked) by providing `Generalization`.

 *example*

 ```java
    public class handle4 {
    
    public static void main(String[] args) {    
        System.out.println("start");
        int a[] ={1,2,3,4};
        String s = null;
        try{
            System.out.println(10+5);
            System.out.println(10-5);
            System.out.println(a[2]);
            // System.out.println(a[10]);
            // System.out.println(s.toUpperCase());
            System.out.println(30/0);
        }
        catch(Exception e)
        {
               System.out.println("exception is handled");
        }
        System.out.println("end");
    }
}

 ```


 **try block**

 * A try block in Java is a container used to enclose code that might throw an exception.

 * we can't write try block alone, there should be atleast one catch or finally block with try.

 * we can write one try block and multiple catch block.


 **catch block**

 * catch block is used to handle the exception by storing the Throwable type object, that is created in try block.

 * we can't write only catch block without try block.

 *syntax*

 ```java
     
     try{

     }
     catch( Exceptionhandlingclass ref )
     {

     }

 ```

 * in catch block order maintaining is very much important.

 *example*

 ```java
    
      public static void main(String args[])
      {
           
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
             System.out.println("arithmetic exception is handled");
        }
        catch(RuntimeException e)
        {
            System.out.println("RuntimeException is handled");
        }
        catch(Exception e)
        {
            System.out.println("exception is handled");
        }

        catch(Throwable e)
        {
            System.out.println("Throwable exception is handled");
        }
       
      }
 ```

 *note :*  the above example is possible but if we do opposite that is not possible.

                        Throwable 
                            |
                        Exception
                            |
                    RuntimeException
                            |
                     ArithmeticException


**finally block**

  * finally block is used in Exception handling with try block or with try and catch block.

  * this block will execute everytime regardless of exception is there or not.


**what is throws keyword**

* In Java, the `throws` keyword is used in a method declaration to indicate that the method might throw one or more specific exceptions during its execution. 

* It  informing the compiler and the caller that this method won't handle the exception itself and that the caller is responsible for dealing with it.


**Exception Propagation**

* transfering the Exception Handling from one method to the caller method is called as `Exception Propagation.`

* for checked Exception, propagation can be done explicitely by using `throws` keyword.

* if it is unchecked Exception, propagation will happen implicitely. we need not to use `throws` keyword.

*example: Exception Propagation for Checked Exception*

```java


public class PropagationEx {

    public static void m3() throws Exception
    {
          for(int i=1 ; i<=10;i++)
          {
            System.out.println(i);
            Thread.sleep(1000);
          }
    }
    public static void m2() throws Exception
    {
       m3();
    }
    public static void m1() throws Exception
    {
        m2();
    }
    public static void main(String[] args) {
        
       try{
           m1();
       } 
       catch(Exception e)
       {
         System.out.println("thread exception is handled");
       }

    }
}


```


**what is Throwable class**

* The java.lang.Throwable class is the root superclass of all errors and exceptions in the Java language.

*methods* => `toString(),getMessage(),printStackTrace()`

*example*

```java

      class Example
      {
        public static void main(String[] args) {
        
        int a[]={10,3};
        try{
            // System.out.println(10/0);
            System.out.println(a[6]);
        }
        catch(Throwable t)
        {
            System.out.println(t.toString());
            System.out.println(t.getMessage());
            t.printStackTrace();
        }
    }
}
```


**throw keyword**

* The `throw` keyword in Java is used to explicitly throw an exception from a method or any block of code.

* mainly it is used for throwing *custom exception*

* it can only throw one exception object at a time.

*syntax*
    
    throw object Of Exception type("message")

*example*

```java

public class Learningthrow {
    public static void main(String[] args)  {
        
          System.out.println("start");
          int age = 9;

            if(age>21)
                System.out.println("you can ride bike");
            else
             throw new ArithmeticException("you can't ride");    
        
        System.out.println("end");
    }
}

```


**differnce between throw and throws**




### custom Exception

* A custom exception (also called a user-defined exception) in Java is a specific exception class created by a programmer to handle error scenarios based on  their application.

* cutom Exception we can create both for checked and unchecked.

**how to create Checked Custom Excepton**

* we have to create one class and that class should inherit from *Exception Class*

*syntax*

```java
     class classname extends Exception
     {
          classname(String msg)
          {
            super(msg);
          }
     }
```


*example*

```java



// !  Checked Custom Exception 

class NotStudying extends Exception
{
      NotStudying(String msg)
      {
        super(msg);
      }
}

public class Custom1{

    public static void school() throws NotStudying
    {
        int marks = 30 ;

        if(marks >= 50)
            System.out.println("very good.. keep it up");
        else 
            throw new NotStudying("very bad");
    }
    public static void main(String[] args) {
        
        try{

            school();
        }
        catch(NotStudying n)
        {
           System.out.println(n);
           System.out.println(n.getMessage());
           System.out.println("NotStuding Exception is handled");
        }
    }
}
```



**unchecked Custom Exception**

* first we have to create our own class , this class should inherit *RuntimeException* class.

*syntax*

```java
     class classname extends RuntimeException
     {
          classname(String msg)
          {
            super(msg);
          }
     }
```

*example*

```java


// ! unchecked custom exception 

class BreakNotWorking extends RuntimeException
{
    BreakNotWorking(String msg)
    {
        super(msg);
    }
}

class Bike
{
    static boolean isStoppable = false;

    public static void ride() 
    {
            System.out.println("bike is running");

            if(isStoppable)
                System.out.println("bike is stopped");
            else 
                throw new BreakNotWorking("you can't stop the bike");
    }           
}
public class Custom2 {
    public static void main(String[] args) {   
        Bike.ride();
    }
}

```


**difference between final , finally and finalize**

*final*
  
  * it is one keyword, modifier
  * we can apply it to variable,class,methods.
  * it is used to make constant.
  * final variable we can't change the value, 
    final class we can't inherit
    final method we can't override.

*finally*
 
 * finally is one block.
 * it is written with try or try and catch block.
 * it will execute everytime irrespective of exception is handled or not handled.

*finalize*
  
  * finalize is one method. 
  * it is present in Object class.
  * it is used for cleanup (to remove the object from the heap area who does not have any reference.)
  * it is called by *System.gc()* method.


### Wrapper Class