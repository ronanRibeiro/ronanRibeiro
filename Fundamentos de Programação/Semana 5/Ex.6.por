//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.6 - Construa um algoritmo de PORTUGOL para determinar se o indivíduo esta com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é
//definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo

programa
{
	//Inserir a biblioteca
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real peso, altura, imc

		//Leitura de váriaveis
		escreva("Digite o peso: ")
		leia(peso)

		escreva("Digite a altura: ")
		leia(altura)

		//Calculo do IMC
		imc = mat.arredondar(peso / mat.potencia(altura,2),2)

		//Resultados
		se (imc < 20) {
			escreva("O seu IMC é " + imc + ". A situação é Abaixo do Peso")
		}
		senao se ( imc >= 20 e imc < 25) {
			escreva("O seu IMC é " + imc + ". A situação é Peso Normal")
		}
		senao se ( imc >= 25 e imc < 30) {
			escreva("O seu IMC é " + imc + ". A situação é Sobre Peso")
		}
		senao se ( imc >= 30 e imc < 40) {
			escreva("O seu IMC é " + imc + ". A situação é Obeso")
		}
		senao se ( imc >= 40) {
			escreva("O seu IMC é " + imc + ". A situação é Obeso Mórbido")
		}

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 831; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */