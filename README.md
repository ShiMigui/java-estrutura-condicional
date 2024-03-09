# Curso de Java completo - Estrutura condicional

Este repositório foi criado para armazenar os exercícios e projetos desenvolvidos no curso de Java da Udemy. Recomendo que, se quiser ter acesso à experiência completa, inscreva-se no curso. Abaixo estão detalhes sobre o curso:

## Links

Curso: [Java completo - Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/).

Youtube: [Dev Superior](https://www.youtube.com/@DevSuperior).

Github: [Nelio Alves](https://github.com/acenelio).

Site: [Dev Superior](https://devsuperior.com.br).

## Exercícios

- [Exercício 1](#exercício-1)

### Exercício 1

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java)

Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

#### Exercício 1 - Exemplos

```bash
-10
NEGATIVO
```

```bash
8
NAO NEGATIVO
```

```bash
0
NAO NEGATIVO
```

### Exercício 2

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java)

Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

#### Exercício 2 - Exemplos

```bash
12
PAR
```

```bash
27
IMPAR
```

```bash
0
PAR
```

### Exercício 3

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java)

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Os números devem poder ser digitados em ordem crescente ou decrescente.

#### Exercício 3 - Exemplos

```bash
6 24
Sao Multiplos
```

```bash
6 25
Nao sao Multiplos
```

```bash
24 6
Sao Multiplos
```

### Exercício 4

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java)

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo.  Um jogo pode começar em um dia e terminar em outro. Um jogo tem uma duração mínima de 1 hora e máxima de 24 horas.

#### Exercício 4 - Exemplos

```bash
16 2
O JOGO DUROU 10 HORA(S)
```

```bash
0 0
O JOGO DUROU 24 HORA(S)
```

```bash
2 16
O JOGO DUROU 14 HORA(S)
```

### Exercício 5

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java)

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

|código|especificação|valor|
|---|---|---|
| 1 | Cachorro quente | R$ 4.00|
| 2 | X-Salada | R$ 4.50|
| 3 | X-Bacon | R$ 5.00|
| 4 | Torrada simples | R$ 2.00|
| 5 | Refrigerante | R$ 1.50|

#### Exercício 5 - Exemplos

```bash
3 2
Total: R$ 10.00
```

```bash
2 3
Total: R$ 13.50
```

### Exercício 6

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java)

Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos (\[0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”

#### Exercício 6 - Exemplos

```bash
25.01
intervalo (25,50]
```

```bash
25.00
intervalo \[0,25]
```

```bash
100.00
intervalo (75,100]
```

```bash
-25.02
Fora de intervalo
```

### Exercício 7

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java)

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

| | -x | +x|
|---|---|---|
| +y | Q2 | Q1 |
| -y | Q3 | Q4 |

#### Exercício 7 - Exemplos

```bash
4.5 -2.2 
Q4
```

```bash
0.1 0.1
Q1
```

```bash
0.0 0.0
Origem
```

### Exercício 8

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java)

Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

| Renda | Imposto |
|---|---|
| 0,00 a 2000,00 | Isento |
| 2000,01 a 3000,00 | 8% |
| 3000,01 a 4500,00 | 18% |
| acima de 4500,00 | 28% |

#### Exercício 8 - Exemplos

```bash
3002,00
R$ 80,36
```

```bash
1701,12
Isento
```

```bash
4520,00
R$ 355,60
```
