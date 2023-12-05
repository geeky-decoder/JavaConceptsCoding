## Bit Manipulation Concepts

`Primary Application`
- Turn ON the bits
- Turn OFF the bits
- Toggle the bits
- Check for state whether ON/OFF.

`1 byte = 8 bits`

`Range of dataType value formula`: (-2^n-1 to +2^n-1 - 1)
byte - 1 byte (-128 to +127)
short - 2 bytes (-32768 to +32767)
int - 4 bytes (-2,147,483,648 to +2,147,483,647)
long - 8 bytes (-9,223,372,036,854,775,808 to +9,223,372,036,854,775,808)

- Negative numbers are always stored in form of 2's complement so that computer can understand between ive & +ve nos.

- Left side bit of binary representation is called as MSB(Most Significant Bit)

- Right side bit of binary representation is called as LSB(Least Significant Bit)

- Postives Nos as bits starts with '0'
0000
0001
0010
0011
0100
0101
0110
0111

- Negative Nos as bits starts with '1' [They are stored as 2's complement in memory so that computer understand these as -ve nos]
1000
1001
1010
1011
1100
1101
1110
1111


## Bitwise Operators

- | (Bitwise OR)
- & (Bitwise AND)
- ^ (Bitwise XOR)
- ~ (Bitwise COMPLEMENT)
- << (Left shift)
- >> (Signed Right Shift)
- >>> (Unsigned Right Shift)


`Truth Table OR`
A	B	Result
0	0	0
0	1	1
1	0	1
1	1	1

`Truth Table AND`
A	B	Result
0	0	0
0	1	0
1	0	0
1	1	1

`Truth Table XOR`
A	B	Result
0	0	0
0	1	1
1	0	1
1	1	0

`<< Left shift`
- The bits position which remain empty are filled by 0's.

int a = 5;
a = 0|0|0|0|0|1|0|1 -> 5

a << 1;
a = 0|0|0|0|1|0|1|0 -> 10

a << 2;
a = 0|0|0|1|0|1|0|0 -> 20

- This means that left shift operator increases the value of the variable by (a * 2 ^ no. of times the variable is left shifted)

`>> Signed Right shift`
- The bits position which remain empty are filled by value of the MSB(Most Significant Bit).

- [Positive No.]
int a = 5;
a = 0|0|0|0|0|1|0|1 -> 5

a >> 1;
a = 0|0|0|0|0|0|1|0 -> 2

a >> 2;
a = 0|0|0|0|0|0|0|1 -> 1

- This means that signed right shift operator decreases the value of the variable by [floor_division](a / 2 ^ no. of times the variable is right shifted)

- [Negative No.]
int a = -5;
a = 0|0|0|0|0|1|0|1 -> 5
Do the 2's complement to convert the value to negative.
1's complement = 1|1|1|1|1|0|1|0
                             + 1 
2's complement = 1|1|1|1|1|0|1|1    -> -5

a >> 1;
a = 1|1|1|1|1|1|0|1 
Do the 2's complement again to get the actual value.
1's complement = 0|0|0|0|0|0|1|0
                             - 1 
2's complement = 0|0|0|0|0|0|1|1    -> -3

`>>> Unsigned Right shift`
- The bits position which remain empty are filled by 0's.

- [Positive No.]
int a = 5;
a = 0|0|0|0|0|1|0|1 -> 5

a >> 1;
a = 0|0|0|0|0|0|1|0 -> 2

a >> 2;
a = 0|0|0|0|0|0|0|1 -> 1

- This means that signed right shift operator decreases the value of the variable by [floor_division](a / 2 ^ no. of times the variable is right shifted)

- [Negative No.]
int a = -5;
a = 0|0|0|0|0|1|0|1 -> 5
Do the 2's complement to convert the value to negative.
1's complement = 1|1|1|1|1|0|1|0
                             + 1 
2's complement = 1|1|1|1|1|0|1|1    -> -5

a >> 1;
a = 0|1|1|1|1|1|0|1 

Here as it is unsigned right shift so no 2's complement will be done and the value will be directly converted to decimal.

a = 2147483645

`~ Negation (Bitwise Complement)`
- It flips the bit i.e. 0 with 1 and 1 with 0.

`FORMULA TO FIND NEGATION OF ANY NO.: -(n + 1)`

- [Positive No.]
int a = 2;
a = 0|0|0|0|0|0|1|0

Now the while flipping the bits if the MSB is 1 than first of all you need to undo the 2's complement and than convert it into decimal.

a       = 0|0|0|0|0|0|1|0
                       -1
2's     = 1|1|1|1|1|1|0|0
Flip    = 0|0|0|0|0|0|1|1

Convert in decimal = -3
Therefore ~2 = -3

- [Negative No.]
int a = -2;
a = 0|0|0|0|0|0|1|0

Do the 2's complement to convert the value to negative.
1's complement = 1|1|1|1|1|1|0|1
                             + 1 
2's complement = 1|1|1|1|1|1|1|0    -> -2

Now according to negation flip the bits.
flip = 0|0|0|0|0|0|0|1 

Convert in decimal = 1
Therefore ~(-2) = 1



## Bit Masking

If bit is 0 that means it is OFF.
Else if bit is 1 it is ON.

`Turn ON the binary bit`
- Performing (|) OR operation with 0 has no effect on the result.
- Now to switch the OFF bits ON we will use (|)OR operation with 1.

- To create the mask we need to use binary no. as 1 and left shift it by the ith position value so that it comes at exact place where the bit has to be turned ON.

- Now we need to see which bit from (0 or 1) should be used so that no other position bits gets changed.

- For this we will use 0 in all other places of the binary.

Q. Switch ON the ith bit of the binary number. (ith position is 4)
Soln.- 
Indexing         8 7 6 5 4 3 2 1 0
Binary number -> 0|1|0|0|0|1|0|1|0 
`Mask`        -> 0 0 0 0 1 0 0 0 0
-------------------------------------
Result(|)     -> 0 1 0 0 1 1 0 1 0
-------------------------------------


`Turn OFF the binary bit`
- Performing (&) AND operation with 1 has no effect on the result.
- Now to switch the ON bits OFF we will use (&) AND operation with 1.

- To create the mask we need to use binary no. as 1 and left shift it by the ith position value so that it comes at exact place where the bit has to be turned ON.

- Now we need to see which bit from (0 or 1) should be used so that no other position bits gets changed.

- For this we will use 1 in all other places of the binary.


Q. Switch OFF the ith bit of the binary number. (ith position is 3)
Soln.- 
Indexing      ->   8 7 6 5 4 3 2 1 0
Binary number ->   0|1|0|0|0|1|0|1|0 
`Mask`        ->   1 1 1 1 1 0 1 1 1
------------------------------------------
Result(&)     ->   0 1 0 0 0 0 0 1 0
------------------------------------------
                            

`Toggle the binary bit`
- Performing (^) XOR operation with 0 has no effect on the result.
- Now to toggle the bits we will use (^) XOR operation with 1.

- To create the mask we need to use binary no. as 1 and left shift it by the ith position value so that it comes at exact place where the bit has to be toggled.

- Now we need to see which bit from (0 or 1) should be used so that no other position bits gets changed.

- For this we will use 0 in all other places of the binary.


Q. Toggle the ith bit of the binary number. (ith position is 5)
Soln.- 
Indexing      ->   8 7 6 5 4 3 2 1 0
Binary number ->   0|1|0|1|0|1|0|1|0 
`Mask`        ->   0 0 0 1 0 0 0 0 0
------------------------------------------
Result(^)     ->   0 1 0 0 0 1 0 1 0
------------------------------------------
                            

`Check State whether ON or OFF`
- Now to check the state of the bits we will use (&) AND operation with 1.

- To create the mask we need to use binary no. as 1 and left shift it by the ith position value so that it comes at exact place where the bit has checked.

- Now we need to see which bit from (0 or 1) should be used so that no other position bits gets changed.

- For this we will use 0 in all other places of the binary.

- If the result is a non-zero number that means position bit is `ON` else `OFF`.


Q. Check the state of the ith bit of the binary number. (ith position is 5)
Soln.- 
- If position bit is 1

Indexing      ->   8 7 6 5 4 3 2 1 0
Binary number ->   0|1|0|1|0|1|0|1|0 
`Mask`        ->   0 0 0 1 0 0 0 0 0
------------------------------------------
Result(&)     ->   0 0 0 1 0 0 0 0 0
------------------------------------------

- If position bit is 0

Indexing      ->   8 7 6 5 4 3 2 1 0
Binary number ->   0|1|0|1|0|1|0|1|0 
`Mask`        ->   0 0 0 0 0 0 1 0 0
------------------------------------------
Result(&)     ->   0 0 0 0 0 0 0 0 0
------------------------------------------