#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    float media,nota01,nota02;
    printf ("Deve-se colocar a nota com ponto\n");
    printf ("Qual e a sua primeira nota?: ");
    scanf ("%f",&nota01);
    printf ("Qual e a sua segunda nota?: ");
    scanf ("%f",&nota02);
    media = (nota01+nota02)/2;
    printf ("A sua media e %f\n\n\n",media);
  
getch();	
  return 0;
}
