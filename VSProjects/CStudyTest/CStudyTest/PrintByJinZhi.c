#include <stdio.h>
#include <limits.h>    //极限的头文件
#include <float.h>     //浮点数的极大值
void main3()
{
	/*******按照不同进制输出一个数**********/
	int num = 65534;
	char str[32];

	printf("num is : %d\n十进制输出:%d, 八进制输出:%o, 十六进制输出:%x\n", num, num, num, num);

	itoa(num, str, 2);
	printf("二进制输出:%s\n", str);


	/*******输出不同数据类型的极大值和极小值**********/
	printf("\n\n\n\n\nint max: %d, min: %d\nunsigned int max:%d, min: %d\n", INT_MAX, INT_MIN, UINT_MAX, 0);

}