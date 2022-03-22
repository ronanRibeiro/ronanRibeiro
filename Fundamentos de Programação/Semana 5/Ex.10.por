//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex. 10 - Crie um algoritmo que, dados os lados de um triângulo informados pelo usuário, calcule a sua área.

programa
{
	//Inserir a biblioteca
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real a, b, c, area, p

		//Leitura de váriaveis
		escreva("Insira os 3 lados de um triângulo qualquer: \n")
		escreva("Primeiro lado: ")
		leia(a)
		escreva("Segundo lado: ")
		leia(b)
		escreva("Terceiro lado: ")
		leia(c)

		//Calcular a área pela fórmula de Heron
		p = (a+b+c)/2
		area = mat.arredondar(mat.raiz(p*(p-a)*(p-b)*(p-c), 2),2)

		//Resultado
		escreva("A área é de : " + area)

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */