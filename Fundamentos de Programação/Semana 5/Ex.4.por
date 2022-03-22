//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.4 - Construir um algoritmo em PORTUGOL que leia dois números e efetue a adição. Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8; 
//caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

programa
{	
	funcao inicio()
	{
		//Declaração de váriaveis
		real n1, n2, soma

		//Leitura de váriaveis
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)

		//Calcular a soma
		soma = n1 + n2

		//Teste lógico
		se (soma > 20) {
			soma = soma + 8
		}
		senao {
			soma = soma - 5
		}

		//Resultados
		escreva("O valor final é: " + soma)

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 773; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */