//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.3 - Implemente um programa para ler três números inteiros e mostrar o maior e o menor deles

programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real num1, num2, num3

		//leitura de váriaveis
		escreva ("Digite 3 diferentes número \n")
		escreva ("Primeiro número: ")
		leia(num1)

		escreva ("Segundo número: ")
		leia(num2)

		escreva ("Terceiro número: ")
		leia(num3)

		//Verificar o maior número
		se (num1 > num2 e num1 > num3) {

			escreva (num1 + " é o maior número.")

		}

		senao se (num2 > num1 e num2 > num3) {

			escreva (num2 + " é o maior número.")

		}
		
		senao {

			escreva (num3 + " é o maior número.")

		}
		
		escreva ("\n")
		
		//Verificar o menor número
		se (num1 < num2 e num1 < num3) {

			escreva (num1 + " é o menor número.")

		}

		senao se (num2 < num1 e num2 < num3) {

			escreva (num2 + " é o menor número.")

		}
		
		senao {

			escreva (num3 + " é o menor número.")

		}

		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */