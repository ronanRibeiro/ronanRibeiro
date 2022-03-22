//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.9 - Crie um programa que leia o tamanho de uma camisa e quando o tamanho for:
//“P”, imprima “Tamanho Pequeno”;
//“M”, imprima “Tamanho Médio”;
//“G”, imprima “Tamanho Grande”;
//“GG”, imprima “Tamanho Grande-Grande”;
//“XG”, imprima “Tamanho Extra-Grande”.

programa
{
	//Inserir a biblioteca
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		//Declaração de váriaveis
		cadeia tamanho

		//Leitura de váriaveis		
		escreva("Escreva o tamanho de camisa que deseja: ")
		leia(tamanho)

		//Resultados
		se (tamanho == "P" ou tamanho == "p") {
			escreva ("Tamanho Pequeno")
		}
		senao se (tamanho == "M" ou tamanho == "m") {
			escreva ("Tamanho Médio")
		}
		senao se (tamanho == "G" ou tamanho == "g") {
			escreva ("Tamanho Grande")
		}
		senao se (tamanho == "GG" ou tamanho == "gg") {
			escreva ("Tamanho Grande-Grande")
		}
		senao se (tamanho == "XG" ou tamanho == "xg") {
			escreva ("Tamanho Extra-Grande")
		}		 		
		 		
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */