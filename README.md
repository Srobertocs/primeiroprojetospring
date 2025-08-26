<h1>Primeiro Projeto em Spring</h1>

Este projeto é um exemplo de aplicação Java que utiliza o Spring Framework para demonstrar conceitos de Injeção de Dependência e Inversão de Controle (IoC).
Ele foi construído como parte de um exercício para a disciplina de Programação para Web.

<b>Visão Geral do Projeto</b>

O aplicativo principal, EsportesAppSpring, utiliza um contexto de aplicação baseado em anotações (AnnotationConfigApplicationContext) para carregar e gerenciar os "beans" (objetos) definidos nas classes de serviço e de modelo.

As classes principais incluem:
EsportesConfig: A classe de configuração principal do Spring, que usa @ComponentScan para escanear os pacotes de serviço e de modelo.
TecnicoPingPong: Um "bean" de serviço que representa um técnico de ping-pong, injetando a dependência de um serviço de sorte.
SorteDiariaFelizService: Um serviço que fornece uma mensagem de sorte diária, demonstrando a injeção de dependência.
