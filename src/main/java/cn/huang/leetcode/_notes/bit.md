- 190	Reverse Bits
- 191. Number of 1 Bits
- 231. Power of Two
- 371. Sum of Two Integers
- 832	 Flipping an Image
    0 -> 1, 1 -> 0 using  v ^ 1

- 868	 Binary Gap



















## 字母大小写转换
Upper case A - Z, 65 - 90
Lower case a - z, 97 - 122
a - A = 32

a = A ^ (1<<5)
A = a ^ (1<<5)


##
exclusive or  ^
~ (bitwise compliment)
>>> (zero fill right shift)
>> (right shift)
The operator ‘>>’ uses the sign bit (left most bit) to fill the trailing positions after shift. 
If the number is negative, then 1 is used as a filler and if the number is positive, 
then 0 is used as a filler. 
For example, if binary representation of number is 10….100, then right shifting it by 2 using >> will 
make it 11…….1.

The value of n>>s is n right-shifted s bit positions with sign-extension.

The value of n>>>s is n right-shifted s bit positions with zero-extension.

MAX = (1 << 31) - 1