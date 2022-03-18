//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.9 - Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa.


programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real numTotal, numBranco, numValido, numNulo
		real porBranco, porValido, porNulo
		
		//leitura de váriaveis
		escreva ("Digite o número total de eleitores: ")
		leia(numTotal)

		escreva ("Digite o número total de votos válidos: ")
		leia(numValido)

		escreva ("Digite o número total de votos em branco: ")
		leia(numBranco)

		escreva ("Digite o número total de votos nulos: ")
		leia(numNulo)

		//Calcular as porcentagens
		porValido = numValido / numTotal * 100
		porBranco = numBranco / numTotal * 100
		porNulo = numNulo / numTotal * 100

		escreva ("A porcentagem de votos válidos é: " + porValido + "% \n")
		escreva ("A porcentagem de votos em branco é: " + porBranco + "% \n")
		escreva ("A porcentagem de votos nulos é: " + porNulo + "% \n")

		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 118; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {porBranco, 13, 7, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */