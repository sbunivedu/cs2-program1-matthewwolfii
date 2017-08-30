# Program 1
## Purpose
The purpose of this program is to implement the infix to postfix conversion algorithm we presented in class. You should refer to the slides for more details. You may assume all variables and values are represented by a single character, and that no expression will exceed 100 characters in size.

## Expected Results
```shell
  $ java Converter
  Please input your infix expression:  2+3*4
  Postfix conversion: 234*+
  $ java Converter
  Please input your infix expression:  (1+2)*7
  Postfix conversion: 12+7*
```
You should read your infix expression using the ```Scanner``` class (```nextLine``` method).

## Test Cases
Please make sure that your solution pass the following test cases:
```
infix       | postfix
---------------------
a+b         | ab+
2+3*4       | 234*+
(a+b)*(c-d) | ab+cd-*
A+B*C-D     | ABC*+D-
```
