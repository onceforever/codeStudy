#include <stdio.h>

int globalvar;
int globalvar;
int globalvar;
//C语言全局变量有申明和定义的区别，可以重复声明，但是只能定义一次
//如果全局变量只有申明，没有定义，编译器会默认初始化。

int main1()
{
	int localvar;//C语言局部变量有申明和定义的区别，局部变量在使用之前必须初始化
	localvar = 1;

	printf("global variable is %d\n", globalvar);
	printf("local variable is %d\n", localvar);

	return 0;
}