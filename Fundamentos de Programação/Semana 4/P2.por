//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//P.2 - Uma empresa vai dar uma gratificação aos empregados que tenham mais de 1 ano de serviço: 10% para os
//que tenham menos de 10 anos e 25% para os demais. Calcule a gratificação de um dos funcionários, dado o seu salário
//e o tempo de serviço.

programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real salarioAtual, salarioFinal
		inteiro tempo
		
		//leitura de váriaveis
		escreva ("Digite o salário e o tempo de serviço (em anos): \n")
		escreva ("Salário: ")
		leia(salarioAtual)

		escreva ("Tempo de serviço: ")
		leia(tempo)
	
		//Calcular a gratificação
		se (tempo >= 1 e tempo < 10) {
			salarioFinal = salarioAtual * 1.1
			escreva ("Seu sálario não é de : " + salarioFinal)
			}
			
		senao se (tempo >= 10) {
			salarioFinal = salarioAtual * 1.25
			escreva ("Seu sálario não é de : " + salarioFinal)
		}
		senao {
			escreva ("Seu sálario não terá gratificação")
		}
		
		
		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1036; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */