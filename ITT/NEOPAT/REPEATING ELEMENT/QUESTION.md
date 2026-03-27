Single File Programming Question
Problem Statement



In a university, students often submit assignments in a sequence, and the system needs to identify if any student submits the same assignment multiple times. Your task is to write an algorithm to find the first student who submitted the assignment more than once. If no such student exists, return that there are no duplicates.

Input format :
The first line of the input consists of an integer representing the size of array 'n', representing the number of assignments submitted.

The second line consists of n integers representing the student IDs for each assignment submission.

Output format :
The output should display the first repeating element in the array as

"The first repeating element is <<element>>" or "There are no repeating elements"



Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

1 ≤ n ≤ 10

1 ≤ student_id ≤ 90

Sample test cases :
Input 1 :
7
10 5 3 5 3 4 6
Output 1 :
The first repeating element is 5
Input 2 :
5
1 5 6 8 7
Output 2 :
There are no repeating elements
Input 3 :
8
5 2 4 6 7 2 4 5
Output 3 :
The first repeating element is 5
