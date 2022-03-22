//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.5 - Escreva um algoritmo em PORTUGOL que leia um número e imprima a raiz quadrada do número caso ele seja positivo ou igual a zero e o quadrado do número caso ele seja negativo.

programa
{
	//Inserir a biblioteca
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real n1, result

		//Leitura de váriaveis
		escreva("Digite um número: ")
		leia(n1)

		//Realizar as operações
		se (n1 >= 0) {
			result = mat.raiz (n1,2.0)
		}
		senao {
			result = mat.potencia (n1,2.0)
		}

		//Resultados
		escreva("O valor final é: " + result)

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */