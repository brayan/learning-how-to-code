#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
main()
{
    int idade;
    char nome[40],cidade[90],estado[90],pais[90],nome_pai[40],nome_mae[40];
        printf("Cadastro by bRayan... aperte enter para comecar");
            getchar();system("cls");
        printf("Informe o seu nome: ");
            gets(nome);
            system("cls");
        printf("Informe a sua idade: ");
            scanf("%d",&idade);
            system("cls");
        printf("Informe a sua Cidade: ");
            gets(cidade);
            system("cls");
        printf("Informe o seu Estado: ");
            gets(estado);
            system("cls");
        printf("Informe o seu Pais: ");
            gets(pais);
            system("cls");
        printf("Informe o nome do seu pai: ");
            gets(nome_pai);
            system("cls");
        printf("Informe  o nome da sua mae: ");
            gets(nome_mae);
            system("cls");
        printf("Aperte enter para exibir o seu cadastro");
            getchar();system("cls");
        printf("Nome: %s\n\nIdade: %d anos\n\nCidade: %s\n\nEstado: %s\n\nPais: %s\n\nNome da mae: %s\n\nNome do pai: %s",nome,idade,cidade,estado,pais,nome_mae,nome_pai);
            getchar();
return 0;
}
