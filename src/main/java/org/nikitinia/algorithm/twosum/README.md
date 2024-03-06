# Task
* Given an array of integers **nums** and an integer **target**; 
* Return indices of the two numbers such that they add up to target;

## Assumptions
* You may assume that each input would have exactly one solution, 
and you may not use the same element twice;
* You can return the answer in any order;

## Algorithm
* This task can be solution different algorithm;

### First variant
#### Solution assumes: 
1. We use only data structure -> array;
#### Algorithm:
1. Iteration by source array [sa];
2. Get first element [fe] of [sa];
3. Iteration by rest part of array [ra];
4. Calculate the sum of [fe] and first element of [ra] - [fera]; 
5. If [fe] + [fera] = target -> end;
6. if [fe] + [fera] != target -> [6.];
7. Calculate the sum of [fe] and next element of [ra] - [nera];
8. If [fe] + [nera] = target -> end;
9. if [fe] + [nera] != target -> [9.];
10. Repeat [7-8] when [ra] do not end;
11. If when we process [9.] do not get end, 
repeat [2.], but change [fe], by next element [sa] - [nesa]; 
12. Repeat 10 until get end [sa];
13. If end 11 without success - throw Exception;
#### Realisation:
* Walking through a loop that is in a loop;

### Second variant
#### Solution assumes:
1. We use two type structure - array and map;
#### Algorithm:
1. Iteration by source array [sa];
2. 
#### Realisation:
* Walking through a loop that is in a loop;<<Q