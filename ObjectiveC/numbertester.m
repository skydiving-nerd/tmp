#include <stdio.h>
int main(){
	printf("Please Choose Option Between 1-5\n");
	int input;
	scanf("%i", &input);
	if (input == 1)
		printf("You have entered #1\n");
	else if (input == 2)
		printf("You have entered #2\n");
	else if (input == 3)
		printf("You have entered #3\n");
	else if (input == 4)
		printf("You have entered #4\n");
	else if (input == 5)
		printf("You have entered #5\n");
	else printf("You have entered and invalid number!\n");
}

