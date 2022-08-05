#include <stdio.h>

main(void) {
    int Cartas=0;
    while(Cartas<2 || Cartas>200000 || Cartas%2==1) {
        scanf("%d",&Cartas);
    }
    
    int Posicao=1,Metade=Cartas/2,Movimentos=0;
    while(Posicao!=1 || Movimentos==0) {
        if(Posicao<=Metade)
            Posicao=2*Posicao;
        else
            Posicao=Posicao-(Cartas-Posicao+1);

        Movimentos++;
    }

    printf("%d\n",Movimentos);
}
