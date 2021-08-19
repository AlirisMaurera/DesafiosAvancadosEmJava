# Desafios Avançados em Java



# Desafio 1 - **Fibonacci em Vetor**

Nesse desafio você terá que desenvolver um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.

## Entrada

A primeira linha da entrada contém um inteiro **T**, indicando o número de casos de teste. Cada caso de teste contém um único inteiro **N** (0 ≤ **N** ≤ 60), correspondente ao enésimo termo da série de Fibonacci.

## Saída

Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.

Exemplo de Entrada	Exemplo de Saída
			3                                       
			0                                     Fib(0) = 0
			4 									Fib(4) = 3
			2                                     Fib(2) = 1



# Desafio 2 - **Área Superior**

Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz **M**[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área superior da matriz, conforme ilustrado abaixo (área verde).

![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1187.png)

## Entrada

A primeira linha de entrada contem um único caractere Maiúsculo **O** ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem 144 valores com ponto flutuante de dupla precisão que compõem a matriz.

## Saída

Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.



# Desafio 3 - **A Mudança**

![img](https://www.urionlinejudge.com.br/gallery/images/problems/UOJ_2686.png)

Hermione está criando um novo Vira Tempo especialmente para programadores. É impressionante as vantagens que ele oferece e o conforto pra codar que ele tem. O artefato ainda está em desenvolvimento e ele prometeu consertar os bugs e colocar uns apetrechos melhores e, em troca, pediu um sistema simples para o modo Standy Bay. O problema é que o artefato por si só sempre tem o ângulo de inclinação do Sol/Lua(de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar: dada em grau da inclinação do Sol/Lua, informe em qual período do dia ele se encontra.

## Entrada

A entrada contém um número inteiro **M** (0 ≤ **M** ≤ 360) representando o grau do Sol/Lua. Como a posição muda constantemente seu programa receberá diversos casos a cada segundo(EOF).

## Saída

Imprima uma saudação referente ao período do dia que ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".

