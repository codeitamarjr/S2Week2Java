##Java Problem Worksheet: Strings
1. What is the output from the following?
   
   Do a program trace first and then check your answers by running the program.
   
   String s1="software";
   
   String s2="java";
   
   System.out.println(s1.length()+s2.length());
   
   System.out.println(s1.charAt(4));
   
   System.out.println(s2.charAt(1));
   
   System.out.println(s1.charAt(0)+" "+s2.charAt(3));
   
   if(s1.equals(s2))
   
   System.out.println(s1);
   
   else
   
   System.out.println(s2);
   
   if (s1.compareTo(s2)<0)
   System.out.println(s1);
   if (s2.compareTo(s1)>0)
   System.out.println(s2);
   if (s1.compareTo(s1)==0)
   System.out.println(s1);
   
2. Write a program to input two strings and display the longest string.
   
   Solution:LongestString
   
3. Modify the example program MPH2KPH to use Scanner and System.out.print
   rather than Dialog boxes.
   
4. Write a program to input a string. If the string is not four characters long display an error
   message; otherwise display the number of punctuation characters in the string.
   
   The punctuation characters are , . : ; ? !
   
   Example 1:
   
        Input a four-character string A:C;
   There are 2 punctuation characters in the string A:C;
   
   Example 2:
   
        Input a four-character string !;:;
   There are 4 punctuation characters in the string !;:;
   
   Solution:PunctuationCount
   
5. Write a program to input two strings.
   If both the strings are not three characters long display an error message; otherwise display
   each character in the first string that is the same as the corresponding character in the second
   string.
   Example:
   Input the first string: asd <—— Input
   Input the first string: abd <—— Input
   The identical characters are ad <—— Output
   Solution:CommonCharacters
6. Using Dialog boxes, input a measurement in inches and convert it to centimeters.
   (1 inch=2.54 centimeters)
7. Write a program to input a user's first and last name and generate a password for the user.
   The password is made up from the first, middle and last character from the first and second
   name.
   Example:
   Enter your first name: John <—— Input
   Enter your second name: Murphy <—— Input
   Your password is JhnMpy <—— Output
   Solution:GeneratePassword
8. What is the output from the following?
   Do a program trace first and then check your answers by running the program.
   String str = "Java Programming Course";
   int index = str.indexOf("Java");
   System.out.println("index="+index);
   index = str.indexOf("Course");
   System.out.println("index="+index);
   index = str.indexOf("JAVA");
   System.out.println("index="+index);
   index = str.indexOf("ram");
   System.out.println("index="+index);
   index = str.indexOf('r');
   System.out.println("index="+index);
   index = str.indexOf('r', 7);
   System.out.println("index="+index);
   index = str.indexOf('r', 10);
   System.out.println("index="+index);
   index = str.indexOf("Program");
   System.out.println("index="+index);
   index = str.indexOf("C++");
   System.out.println("index="+index);
   index = str.indexOf('a',2);
   System.out.println("index="+index);
   index = str.lastIndexOf('o');
   System.out.println(“index="+index);
9. Write a program to input a 6-character string from the keyboard.
   The program then checks if the input string is in alphabetical sequence, i.e. ABCDEF or
   KLMNOP or HIJKLM.
   (One way to do this is to use indexOf to check if the input string is in the string
   “ABCDEFGHIJKLMNOPQRTSTUVWXYZ”
   or in the string
   “abcdefghijklmnopqrstuvwxyz”)
10. (a)Write a program to input a string and check if it is a Java keyword or not.
    Java has a long list of keywords, so for the purposes of this program assume Java uses only
    the following keywords:
    main int long short float double String
    (b) Modify the program to check if the input string is a valid identifier or not.
11. Write a program to input a string and check whether or not it is a valid e-mail address.
    A valid e-mail address:
    cannot start or end with @
    cannot start or end with .
    must contain @ only once
    must contain . at least once after @
    Solution:CheckEmailAddress