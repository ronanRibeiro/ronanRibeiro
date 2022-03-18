//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.7 - Escrever um algoritmo que lê um valor inteiro, calcula o fatorial desse número e mostra o resultado.


programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		inteiro num, aux
		inteiro fatorial = 1
		
		//leitura de váriaveis
		escreva ("Digite o número que deseja fatorar: ")
		leia(num)
		aux = num
		
		//Calcular o fatorial
		se (num == 0) {
			escreva ("O fatorial de " + num + " é: 1")
		}
		senao {
			
			enquanto (aux > 1){
				fatorial = fatorial * aux
				aux = aux -1
			}
			escreva ("O fatorial de " + num + " é: " + fatorial)
		}

		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 694; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */