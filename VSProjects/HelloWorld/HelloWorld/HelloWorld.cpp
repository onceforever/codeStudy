#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

//void print(int);

void print(int i) {
	//printf("[%d] --- Hello World\n", i);
}

int main() {
	/*for (int i = 0; i < 10; i++)
		print(i);*/

		//system("ping www.baidu.com");
		//MessageBox(0, "Hello my love", "this is title", 0);
		//ShellExecute(0, "open", "mailto:", 0, 0, 1);

	/*int num = 1913;
	printf("%x -- %d", &num, num);

	num = 1993;*/

	/*int num = 1;
	printf("address of num %x", &num);

	if (1 == (*(char *)&num))
	{
		printf("\nlow bit is in front!\n");
	}
	else
	{
		printf("\nhigher bit is in front!\n");
	}*/

	printf("sizf of char : %d\n", sizeof(char));
	printf("sizf of short : %d\n", sizeof(short));
	printf("sizf of int : %d\n", sizeof(int));
	printf("sizf of long int : %d\n", sizeof(long int));
	printf("sizf of float : %d\n", sizeof(float));
	printf("sizf of double : %d\n", sizeof(double));
	return 0;
}

