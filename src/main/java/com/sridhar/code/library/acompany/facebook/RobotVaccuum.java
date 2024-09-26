package com.sridhar.code.library.acompany.facebook;


/*

O X X O O
O O X O R
X O O O O
O O X O O


R is the location of robot

X is spots where robot cannot go

O is spots where a robot can go

A robot can go in 4 directions, such as top, down, left or right

Find the farthest coordinates where a robot can go given the 2D matrix.

In this case
(0,0) is can be reached with 7 hops

 */

/*

My approach, I did breadth first search to figure out all the elements that can be reached
for hop distance 1, hop distance 2, and so on. put it in a hashmap
return the coordinates of the highest hop distance.
 */


public class RobotVaccuum {

}
