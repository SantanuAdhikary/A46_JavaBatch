
<!-- arithmetic operator -->

1. swap of two numbers without third variable


<!-- conditional operator  -->

1. odd or even 
2. positive or negative 
3. greater of two numbers 
4. zero positive negative
5. positve odd , positive even , negative odd , negative even 


<!-- if else -->

1. Write a java program to check is it uppercase or lowercase 
2. Write a java program to check the number is multiple of 10 or not. 
3. Write a java program to check given number is divisible by 3 and 5 or not.
4. Write a java program to check the year is leapyear or not.
5. Check whether a number is divisible by 4 but not by 8.
6. Check whether a triangle is valid (sum of angles = 180).
7. Check whether a number is positive or negative.
8. voter eligible
9. vowel or consonant



<!-- else if ladder -->

1. grade
2. zero positive negative
3. child / teenager / adult / senior citizen 
4. check charcter is number or lowercase or uppercase or special character
5. write a java program to diplay the final price of the product 
    if bill is more than or equal to 10000 give 60% discount 
    if bill is more than 7000 give 40% discount
    if bill is more than 5000 give 20 discount 
    otherwise no discount 
6. FizzBuzz


<!--  nested if -->
   1.  mobile otp verification 


<!-- switch -->

  1. traffic light
  2. days 
  3. calculator 
  4. atm


<!-- while loop -->

1. add all the digits
2. multiply all the digits
3. count digit
4. reverse number 
5. sum of even / odd digits 
6. max and minimum digit 
7. first digit 
8. spy number (addition of digits == multiplication of digits)
9. palindrome 


<!-- ! after method  -->

1. check even 
2. perimeter and area of triangle
3. from 1 to 20 add only the even numbers
4. duck number
5. power
6. prime number
7. from 50 to 100 print all the prime numbers 
8. strong number
9. binary to decimal 
10. decimal to binary
11. GCD
12. LCM
13. Armstrong number



<!--! Array Programs -->

1. print array elements from start to end and end to start
2. add all the array elements 
3. find maximum and minimum element of the array.
4. reverse the array
5. copy one array inside another array
6. left rotate by 1 position  
7. right rotate by 1 position
8. check array is sorted or not 
9. count primes 
10. (replace odd by -1) / replace by multiple of 10 and 20
11. missing number
12. duplicate is present or not
13. maximum continuous 1 
14. linear search (gfg)
15. array is sorted and rotated(leetcode 1752)
16. move all the positive at the start
17. merge two sorted array 
18. container with most water
19. binary search
20. single number
21. right rotate by k position (by using 2 loops, by using extra array)
22. left rotate by k position (by using 2 loops, by using extra array)(task) 
23. move zero at the end
24. two sum (index)
25. two sum (present or not)
26. triplet sum (present or not)
27. print all the pairs
28. print all the subarrays
29. print all the subarray sum
30. max sum subarray - (kadane algorithm)
31. search element in sorted and rotated array
32. trapping rain water problem
33. sort012
34. common elements b/w two array
35. find duplicate 
36. find second max element 
37. stock1
38. common element b/w 3 sorted array
39. bubblesort 
40. selection sort
41. insertion sort
42. remove duplicate























it is a class present in java.lang package. ()

when ever any cls does not have any parent Object class will be the parent for the class.

object class is the super most class in java.


<!--! why it should be only the parent ?? -->

it having some property,
 that will help to convert object into string 
it will help us to compare the object
it will help to generate the hashcode. 
to obtain the clone of the object. (cloning , robot movie )
it will also help for thread communication. 

object class wants all the class shold get these properties. 

object class is the supermost parent class for all teh clases in java.

note : object class is hving 


toString() method without overiding 

without overriding this method whnevr progmmer is trying to access the real address of an object , internally this mehtod is called
this method provides callsname@hexadecimal value in string format 

public class mobile 
{
  psvm()
  {
    mobile m = new mobile();
    sout(m)
    sout(m.toString(0))  both same 
  }
}

purpose of overriding toString() 

we override tosting method to get the state of the object.