#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int main(int argc, char *argv[])
{
    int idade;
    char nome[30];
    char cidade[90];
    printf ("Qual e o seu nome?: ");
    gets(nome);
    printf ("Qual e a sua idade? ");
    scanf ("%d",&idade);
    printf ("Qual o nome da cidade onde voce mora?%s",cidade);
    gets(cidade);
    printf ("Ahh seja muito bem vindo %s, voce tem apenas %d anos? hehehe... e me conte sobe %s, e muito frio la?\n\n\n",nome,idade,cidade);
  system("PAUSE");	
  return 0;
}
