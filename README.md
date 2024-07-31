# Geração de Distribuição Estatística

<p align="justify">
Aplicação desenvolvida pelos discentes do terceiro semestre do curso de Ciência da Computação pela Universidade Federal do Ceará (UFC): Luiza Esther Martins Pessoa, Lucas Pinheiro da Costa, Maria Luiza Felipe Carolino e Beatriz Fernandes Bezerra.

O objetivo deste repositório é armazenar o código fonte do trabalho prático da disciplina de Técnicas de Programação. O projeto é totalmente desenvolvido em Java e permite a manipulação de diferentes tipos de distribuições estatísticas, sendo capaz de calcular
parâmetros básicos como média, variância e desvio padrão.

Acesse o <relatório do projeto> com informações relacionadas as escolhas de design e a implementação.

# Tipos de Distribuições Estatísticas
o programa é capaz de manipular os seguintes tipos de distribuição:
- Exponencial
- Normal (Gaussiana)
- Poisson
- Uniforme

# Informações Técnicas
## Instruções para teste

### Pré-requisitos:
- Java Development Kit (JDK)
- Apache Maven [Guia de instalação](https://maven.apache.org/install.html) (caso escolha rodar o projeto em uma IDE que tenha suporte ele não é necessário)
### Rodando diretamente pelo Maven:

```bash
cd gerador_de_distribuicao
mvn exec:java -Dexec.mainClass="com.calculadora.Main"
```
### Gerando o arquivo .jar:
```bash
cd gerador_de_distribuicao
mvn compile
mvn package
```

## Documentação dos requisitos do projeto
[Documentação - AP1](https://github.com/EstherMart/Geracao-de-distribuicao-estatisticas/blob/main/2024%20CK%200235%20Avalia%C3%A7%C3%A3o%201.pdf)

## Requisitos Obrigatórios
O projeto utiliza conceitos relacionados à Programação Orientada a Objetos em Java. Abaixo, é apresentado as principais definições utilizadas no código.

### Classes
Utilização de classes abstratas (`Distribuicao`) e classes concretas (`DistribuicaoNormal, DistribuicaoExponencial, DistribuicaoUniforme, DistribuicaoPoisson`).

### Herança
Utilizada na definição de métodos abstratos da classe `Distribuicao` para geração de valores e cálculo de parâmetros, fazendo com que as classes concretas herdem tais aplicações.

### Polimorfismo
As classes concretas implementam os métodos definidos na classe abstrata e permite o uso polimórfico das distribuições.

### Generics
Utilizado para permitir operações sobre diferentes tipos de distribuições sem depender de um tipo específico.

### Classe Main padrão
Classe padronizada disponibilizada pelo docente e que, obrigatoriamente, deve ser executada com sucesso para fins avaliativos.

### Output
O código imprime cada valor da distribuição em uma lista de números, separados por vírgula, como saída.

## Adicionais Implementados
- Tratamento de entrada de exceção de entrada e saída de dados

# Demonstração da aplicação
<Vídeo>

</p>
