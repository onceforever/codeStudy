#include <stdio.h>

int globalvar;
int globalvar;
int globalvar;
//C����ȫ�ֱ����������Ͷ�������𣬿����ظ�����������ֻ�ܶ���һ��
//���ȫ�ֱ���ֻ��������û�ж��壬��������Ĭ�ϳ�ʼ����

int main1()
{
	int localvar;//C���Ծֲ������������Ͷ�������𣬾ֲ�������ʹ��֮ǰ�����ʼ��
	localvar = 1;

	printf("global variable is %d\n", globalvar);
	printf("local variable is %d\n", localvar);

	return 0;
}