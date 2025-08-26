<h1>Primeiro Projeto em Spring</h1>

Este projeto é um exemplo de aplicação Java que utiliza o Spring Framework para demonstrar conceitos de Injeção de Dependência e Inversão de Controle (IoC).
Ele foi construído como parte de um exercício para a disciplina de Programação para Web.

<b>Visão Geral do Projeto</b>

O aplicativo principal, EsportesAppSpring, utiliza um contexto de aplicação baseado em anotações (AnnotationConfigApplicationContext) para carregar e gerenciar os "beans" (objetos) definidos nas classes de serviço e de modelo.

As classes principais incluem:
* EsportesConfig: A classe de configuração principal do Spring, que usa @ComponentScan para escanear os pacotes de serviço e de modelo.
* TecnicoPingPong: Um "bean" de serviço que representa um técnico de ping-pong, injetando a dependência de um serviço de sorte.
* SorteDiariaFelizService: Um serviço que fornece uma mensagem de sorte diária, demonstrando a injeção de dependência.

  Claro! Para criar um README eficaz, é importante incluir informações sobre o projeto, como configurá-lo e como executá-lo. Aqui está um modelo de README que você pode usar para o seu projeto primeiroprojetosprng.

primeiroprojetosprng
Este projeto é um exemplo de aplicação Java que utiliza o Spring Framework para demonstrar conceitos de Injeção de Dependência e Inversão de Controle (IoC).

Ele foi construído como parte de um exercício para a disciplina de Programação para Web.

Visão Geral do Projeto
O aplicativo principal, EsportesAppSpring, utiliza um contexto de aplicação baseado em anotações (AnnotationConfigApplicationContext) para carregar e gerenciar os "beans" (objetos) definidos nas classes de serviço e de modelo.


Requisitos
Para rodar este projeto, você precisa ter o seguinte instalado:

Java Development Kit (JDK) 21 ou superior

Apache Maven (para gerenciar dependências)

Visual Studio Code com o Extension Pack for Java

Como Configurar e Executar
Siga os passos abaixo para clonar o repositório e rodar o projeto localmente:

Clone o repositório:

Bash

git clone [URL_DO_SEU_REPOSITORIO]
cd primeiroprojetosprng
Abra o projeto no VSCode:
Abra a pasta do projeto no Visual Studio Code. O VSCode vai reconhecer o projeto Maven e instalar as dependências automaticamente.

Execute a aplicação:

Abra o arquivo EsportesAppSpring.java.

Clique no botão de Run (Executar) que aparece acima do método main.
