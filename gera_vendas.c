#include <stdio.h>
#include <stdlib.h>

char MESES[12][4] = {"Jan","Fev", "Mar", "Abr", "Mai", "Jun",
						   "Jul","Ago", "Set", "Out", "Nov", "Dez"};

int gera_int(int mod){
	return (rand()%mod)+1;
}

char* gera_mes(){
	int mes = gera_int(12)-1;
	return MESES[mes];
	
}

int main(){
	int i,j;
	char *s;
	srand((unsigned)time(NULL));
	FILE *f = fopen("C:\\Users\\Frog33\\Documents\\Mestrado\\Estrutura de Dados e Algoritmos\\TrabalhoED\\vendas.txt","w");
	
	for(i = 0; i < 1000; i++){
		fprintf(f,"%d ",gera_int(40));
		fprintf(f,"%s/%c%c ",gera_mes(),gera_int(2)-1+48,gera_int(10)-1+48);
		fprintf(f,"%d %d\n",gera_int(1000),gera_int(100));
		//printf("%d ",MESES[0][i]);
	}
	printf("%s",MESES[0]);
	fclose(f);
	return 0;
}