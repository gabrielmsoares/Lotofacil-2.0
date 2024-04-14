# LotoFacil 🎰
Lotofácil é um projeto para um sistema de apostas interativo com o usuário. Faz parte de um trabalho da disciplina de Linguagens de Programação cursada na faculdade Newton Paiva.

## Sobre o Projeto
O sistema é capaz de gerar jogos aleatórios e permite que os jogadores façam suas apostas, verifiquem os resultados e calculem os prêmios de acordo com as regras da loteria. Este sistema funciona por meio do terminal, lendo e escrevendo dados.

## Versão 2.0
A versão 2.0 conta com uma atualização do projeto para a adição da interface gráfica e pequenas atualizações no código fonte.

## Funcionalidade
-	Geração de jogos aleatórios.
-	Apostas: os jogadores podem fazer suas apostas inserindo os números desejados.
-	Verificação de resultados.
-	Cálculo de prêmios de acordo com as regras da loteria.

## Contexto e utilização
A Lotofácil permite ao usuário que realize as seguintes apostas: 

- Apostar de 0 a 100:
O sistema solicita ao usuário um número inteiro entre 0 e 100 enquanto sorteia outro número. Ao receber o número do usuário, ele compara os números. Caso o número do usuário seja o mesmo número sorteado, o usuário recebe a mensagem informando que ganhou R$1.000,00.

- Apostar de A à Z:
O sistema solicita ao usuário uma letra, seja ela minúscula ou maiúscula. Ao receber a letra, o sistema compara a letra recebida com a letra premiada. Caso a letra informada pelo usuário seja a mesma letra premiada, o usuário recebe a mensagem informando que ganhou R$500,00.

- Apostar em par ou ímpar: 
O sistema solicita ao usuário um número inteiro. Ao receber o número, o sistema verifica se o número é par ou ímpar. Caso o número informado seja par, ele é premiado e o usuário recebe a mensagem informando que ganhou R$100,00. 

Confira aqui imagens do projeto: 
<img src="/assets/img/arquivo.gif.gif">

## Requisitos do projeto
> *Clique na seta para ver a lista de requisitos que recebemos para desenvolver o projeto*

<details><summary><strong>Menu</strong></summary>

Crie um menu para a loteria utilizando as estruturas switch case e do while. Enquanto o usuário não digitar 0, para sair, novas apostas serão permitidas.
</details>

<details><summary><strong>Apostar de 0 a 100</strong></summary> 

Utilizando a biblioteca Scanner, leia um número inteiro via teclado, de 0 a 100,
caso o número seja maior que 100 ou menor que 0, imprima a mensagem: “Aposta
inválida.”.
- Documentação:
- https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
- Utilize a biblioteca Random para sortear aleatoriamente um número de 0 a 100.
- Compare o número escolhido pelo usuário apostador com o número sorteado pelo
sistema.
- Documentação:
- https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
- Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 1.000,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! O número sorteado
foi: X.”.
</details>

<details><summary><strong>Apostar de A à Z:</strong></summary> 

Utilizando o método System.in.read(), leia um char via teclado, de A à Z, podendo
ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, imprima a
mensagem: “Aposta inválida.”. Você poderá utilizar o método Character.isLetter()
para verificar se a entrada digitada é uma letra válida.
- Documentação:
- https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
- Converta a entrada do usuário apostador para maiúsculo, utilizando o método
Character.toUpperCase().
- Escolha a letra com a inicial do seu nome para ser a letra premiada.
- Exemplo: char letraPremiada = 'J'.
- Compare a letra lida via teclado, e convertida para maiúsculo, com a letra
premiada.
- Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 500,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! A letra sorteada foi:
X.”.
</details>

<details><summary><strong>Apostar em par ou ímpar</strong></summary> 
- Utilizando a biblioteca Scanner, leia um número inteiro via teclado. Exemplo: 600.
- Utilize o operador de módulo (%) para verificar se o número é par ou ímpar.
Lembrando que, caso o resto da divisão do número por 2 seja 0, o número é par.
- O prêmio será dado caso o usuário digite um número par. O sistema não irá
premiar jogadores que digitarem um número ímpar.
- Se o número digitado for par, imprima a mensagem: “Você ganhou R$ 100,00
reais.”. Caso o usuário digite um número ímpar, imprima a mensagem: “Que pena!
O número digitado é ímpar e a premiação foi para números pares.”.
</details>
