//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.5 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o  mês com 30.

programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		inteiro anos, meses, dias, totalDias
		
		//leitura de váriaveis
		escreva ("Digite sua idade em anos, meses e dias \n")
		escreva ("Anos: ")
		leia(anos)

		escreva ("Mêses: ")
		leia(meses)

		escreva ("Dias: ")
		leia(dias)

		//Somar a quantidade total de dias
		totalDias = anos * 365 + meses * 30 + dias

		escreva ("Você já viveu " + totalDias + " dias.")
		
		escreva ("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 737; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */