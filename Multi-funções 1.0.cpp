#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
main()
{
      int opcao, cont, qt_notas, decisao;
      float nota, media, acomulador;
      cont=1; acomulador=0;
      system("TITLE Multi-funções 1.0");
      do
      {
         system("cls");
         printf("Programa desenvolvido por Brayan Bedritchuk 21-04-2009");
         printf("\n\nPara calculo de media digite 1.\n\n");
         scanf("%d",&opcao);
         if(opcao!=1,opcao!=2,opcao!=3,opcao!=4,opcao!=5,opcao!=6)
            printf("\nOpcao invalida");
         switch (opcao)
         {
            case 1:
                 {
                    system("cls");
                    printf("De quantas notas voce deseja saber a sua media?: ");
                    scanf("%d",&qt_notas);
                    while(cont<=qt_notas)
                    {
                       printf("\nDigite a nota: ");
                       scanf("%f",&nota);
                       acomulador = acomulador + nota;
                       cont++;
                    }
                    media = acomulador/qt_notas;
                    printf("\nMedia: %f",media);
                    if (media>=7)
                       printf("\n\nAeeeee ta na media =D");
                    else
                       printf("\n\nIxxx fudeu =/");       
                 }break;
         
         }
         printf("\n\n\nDeseja retornar ao programa?\n\nDigite 1 se deseja retornar: ");
         scanf("%d",&decisao);
      }while(decisao==1);                   
}
