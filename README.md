# Resolução exercício Beecrowd1116

## Descrição do problema
Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

## Como Funciona
1. O usuário define a quantidade de casos de teste, armazenada na variável `controle`, limpando o buffer com `leia.nextLine()`.
2. Uma estrutura de repetição `for` processa cada caso até atingir o limite estabelecido.
3. Dentro do laço, a entrada de cada par é lida como uma linha de texto única e dividida por espaços usando o método `.split(" ")` para isolar `num1` e `num2`.
4. Uma estrutura condicional (`if/else`) verifica o valor do segundo número (`num2`):
   - Se `num2 == 0`: Imprime a mensagem `"divisao impossivel"`.
   - Caso contrário: Realiza o cálculo fazendo um cast explícito para `(double)` para garantir precisão e imprime o resultado formatado via `System.out.printf`.