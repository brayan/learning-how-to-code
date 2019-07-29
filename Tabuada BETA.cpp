#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int main(int argc, char *argv[])
{
    int numero,numero01,numero02,numero03,numero04,numero05,numero06,numero07,numero08,numero09,numero10;
    printf("Entre com um numero: ");
    gets(numero);
    scanf ("%d",&numero);
    numero01 = numero*1;
    numero02 = numero*2;
    numero03 = numero*3;
    numero04 = numero*4;
    numero05 = numero*5;
    numero06 = numero*6;
    numero07 = numero*7;
    numero08 = numero*8;
    numero09 = numero*9;
    numero10 = numero*10;
    scanf ("%d",&numero01,&numero02,&numero03,&numero04,&numero05,&numero06,&numero07,&numero08,&numero09,&numero10);
    printf ("\n%d x 1 = %d\n%d x 2 = %d\n%d x 3 = %d\n%d x 4 = %d\n%d x 5 = %d\n%d x 6 = %d\n%d x 7 = %d\n%d x 8 = %d\n%d x 9 = %d\n%d x 10 = %d\n\n",numero,numero01,numero,numero02,numero,numero03,numero,numero04,numero,numero05,numero,numero06,numero,numero07,numero,numero08,numero,numero09,numero,numero10);
    getch();	
}
