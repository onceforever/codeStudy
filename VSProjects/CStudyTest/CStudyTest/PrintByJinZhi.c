#include <stdio.h>
#include <limits.h>    //���޵�ͷ�ļ�
#include <float.h>     //�������ļ���ֵ
void main3()
{
	/*******���ղ�ͬ�������һ����**********/
	int num = 65534;
	char str[32];

	printf("num is : %d\nʮ�������:%d, �˽������:%o, ʮ���������:%x\n", num, num, num, num);

	itoa(num, str, 2);
	printf("���������:%s\n", str);


	/*******�����ͬ�������͵ļ���ֵ�ͼ�Сֵ**********/
	printf("\n\n\n\n\nint max: %d, min: %d\nunsigned int max:%d, min: %d\n", INT_MAX, INT_MIN, UINT_MAX, 0);

}