#include <stdio.h>

main(void) {
    int RazaoMatriz=0;
    
    while(scanf("%d",&RazaoMatriz) != EOF) {
        while(RazaoMatriz<3 || RazaoMatriz>70) {
            scanf("%d",&RazaoMatriz);
        }
        
        int matriz[RazaoMatriz][RazaoMatriz];
        
        int contador,contador1;
        for(contador=0;contador<RazaoMatriz;contador++) {
            for(contador1=0;contador1<RazaoMatriz;contador1++) {
                if(contador+contador1+1==RazaoMatriz) {
                    matriz[contador][contador1]=2;
                } else if(contador==contador1) {
                    matriz[contador][contador1]=1;
                } else 
                    matriz[contador][contador1]=3;
            }
        }
        
        for(contador=0;contador<RazaoMatriz;contador++) {
            for(contador1=0;contador1<RazaoMatriz;contador1++) {
                printf("%d",matriz[contador][contador1]);
            }
            printf("\n");
        }
    }
}
