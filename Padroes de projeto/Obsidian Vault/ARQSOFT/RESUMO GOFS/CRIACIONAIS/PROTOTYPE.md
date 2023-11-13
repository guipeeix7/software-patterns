- ## Definição: 
	- "Clonar objetos, e previne a criação de várias subclasses"
	- "Clonar objetos, previne a instanciação de novas classes com o new"
	- Isso lembra muito as várias cópias que podem ser feitas em programas de edição de imagem onde é possível pegar uma página inteira, copia-la e colar ela em uma nova página.
	- "Prototype rocks because it lets you produce a copy of
        an object without knowing anything about its type.
		- EX: 
		- ![[Pasted image 20231105161948.png]]
	- 
        ![[Pasted image 20231105155042.png]]
- ## Estrutura
	- ![[Pasted image 20231105155158.png]]
	- ## Aplicações
		- Muito utilizado em API's quando as classes concretas de um objeto são desconhecidas não sendo possível depender delas, e para interagir com a API esse padrão irá oferecer ao cliente a clonagem somente dos objetos permitidos.
		- Utilizar esse padrão quando é interessante reduzir o número de subclasses que somente diferenciam no modo como elas inicializam seus respectivos objetos. 
		- 