//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.8 - Faça um algoritmo que, dado o valor total em reais e o número de prestações desejadas,calcule o valor de cada prestação. O número mínimo de prestações deve ser 12.
//Se o número de prestações for maior ou igual a 24, adicione 10% de juros ao valor total, se for maior ou igual a 36, adicione 15% de juros ao valor total.

programa
{
	//Inserir a biblioteca
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real valor, parc
		inteiro pres

		//Leitura de váriaveis
		escreva("Escreva o valor total a ser dividido: ")
		leia(valor)
		escreva("Escreva o número de prestações: ")
		leia(pres)

		//Teste lógico e operações
		se (pres < 12) {
			escreva ("Insira um número de prestação maior ou igual a 12")
		}
		senao se (pres >= 12 e pres < 24) {
			parc = mat.arredondar(valor / pres,2)
			escreva ("O valor de " + valor + " parcelado em " + pres + "x terá parcelas de " + parc + " R$.")
		}
		senao se (pres >= 24 e pres < 36) {
			parc = mat.arredondar(valor * 1.1 / pres,2)
			escreva ("O valor de " + valor + " parcelado em " + pres + "x terá parcelas de " + parc + " R$.")
		}
		senao se (pres >= 36) {
			parc = mat.arredondar(valor * 1.15 / pres,2)
			escreva ("O valor de " + valor + " parcelado em " + pres + "x terá parcelas de " + parc + " R$.")
		}
				
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */