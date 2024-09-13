
# ProvaPOO
### PRIMEIRA ETAPA:
Desenvolver um sistema interativo para um jogo que permite o cadastro de guerreiros, utilizando os conceitos de orientação a objetos.
O sistema deve permitir o cadastro de diferentes tipos de guerreiros (Espadachim e Arqueiro), derivados da classe base Guerreiro.

Guerreiro
##### nome (string): Nome do guerreiro.
##### forca (int): Força física do guerreiro.
##### vidas (int): Quantidade de vidas do guerreiro.

Todos os atributos são protegidos, com métodos getters e setters.
O construtor deve garantir que a classe só Inicializa com o nome e as vidas do grerreiro

Espadachim
##### habilidadeEspada (int): Habilidade com espadas.
##### velocidade (int): Velocidade de ataque.

Arqueiro
##### habilidadeArco (int): Habilidade com arcos.
##### alcance (int): Alcance do ataque.

Classe Menu Responsável por apresentar opções do programa.
Opções: 1 - Criar Espadachim, 2 - Criar Arqueiro, 0 - Sair.

Classe AppDeve manter um array para cada tipo de guerreiro cadastrado.
Deve instanciar e utilizar a classe Menu para iniciar a interação do usuário.


### SEGUNDA ETAPA:
Expandir um sistema de jogo para incluir três novos tipos de guerreiros, utilizando os conceitos de orientação a objetos, e atualizar a interação do usuário para gerenciar essas novas classes.

Baseando-se no sistema existente que gerencia guerreiros, vocês deverão criar três novas subclasses da classe Guerreiro com no mínimo 2 atributos cada. Além disso, devem atualizar as classes Menu e App para incluir as novas funcionalidades.
