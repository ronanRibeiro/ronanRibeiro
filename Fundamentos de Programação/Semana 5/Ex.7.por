//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.7 - Criar um algoritmo em PORTUGOL que informe a quantidade total de calorias de uma refeição a partir do usuário que deverá informar o prato, a sobremesa e a bebida

programa
{
	//Inserir a biblioteca
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		//Declaração de váriaveis
		inteiro prato, sobremesa, bebida, total=0

		//Leitura de váriaveis
		escreva("Esse porgrama calculará quantidade total de calorias da sua refeição. Para isso, escolha uma opção de prato, sobremesa e bebida abaixo: \n")
		escreva("Prato Principal: 1. Vegetariano \n 2. Peixe \n 3. Frango \n 4. Carne \n")
		leia(prato)
		escreva("\n")		
		escreva("Sobremesa: 1. Abacaxi \n 2. Sorvete Diet \n 3. Mouse Diet \n 4. Mouse Chocolate \n")
		leia(sobremesa)
		escreva("\n")
		escreva("Bebida: 1. Chá \n 2. Suco de Laranja \n 3. Suco de Melão \n 4. Refrigerante Diet \n")
		leia(bebida)
		escreva("\n")

		//Soma de calorias do prato
		escolha (prato)	
		{
			caso 1: 
		 		total = total + 180
		 		pare
		 	caso 2: 
		 		total = total + 230
		 		pare 
		 	caso 3: 
		 		total = total + 250
		 		pare
		 	caso 4: 
		 		total = total + 350
		 		pare
		 	caso contrario:
		 		escreva ("Opção Inválida !")
		}

		//Soma de calorias da sobremesa
		escolha (sobremesa)	
		{
			caso 1: 
		 		total = total + 75
		 		pare
		 	caso 2: 
		 		total = total + 110
		 		pare
		 	caso 3: 
		 		total = total + 170
		 		pare
		 	caso 4: 
		 		total = total + 200
		 		pare
		 	caso contrario:
		 		escreva ("Opção Inválida !")
		}

		//Soma de calorias da bebida
		escolha (bebida)	
		{
			caso 1: 
		 		total = total + 20
		 		pare
		 	caso 2: 
		 		total = total + 70
		 		pare
		 	caso 3: 
		 		total = total + 100
		 		pare
		 	caso 4: 
		 		total = total + 65
		 		pare
		 	caso contrario:
		 		escreva ("Opção Inválida !")
		}

		//Resultados
		escreva("Seu total de calorias é: " + total)
		
		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 986; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */