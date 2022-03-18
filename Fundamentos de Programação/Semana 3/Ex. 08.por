//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.8 - Escrever um algoritmo que lê:
//- a percentagem do IPI a ser acrescido no valor das peças 
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)


programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real valor1, valor2, ipi, valorTotal
		inteiro quant1, quant2
		cadeia cod1, cod2
		
		//leitura de váriaveis
		escreva ("Digite o código do produto 1: ")
		leia(cod1)

		escreva ("Digite a quantidade do produto 1: ")
		leia(quant1)

		escreva ("Digite o valor do produto 1: ")
		leia(valor1)

		escreva ("Digite o código do produto 2: ")
		leia(cod2)

		escreva ("Digite a quantidade do produto 2: ")
		leia(quant2)

		escreva ("Digite o valor do produto 2: ")
		leia(valor2)

		escreva ("Digite a porcentagem do IPI: ")
		leia(ipi)
		
		//Calcular o valor total aplicando o IPI
		valorTotal = (valor1 * quant1 + valor2 * quant2) * ((ipi/100) + 1)

		escreva ("O valor total é de: " + valorTotal)

		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 119; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */