![[Pasted image 20231103135851.png]]
![[Pasted image 20231103135902.png]]

- # FACTORY METHOD
	- Objetivos:
		- Permitir e delegar a instanciação às subclasses
		- Exemplo de Aplicação![[Pasted image 20231103145004.png]]
		- ![[Pasted image 20231103145059.png]]
		- ## STRUTRA
		- ![[Pasted image 20231103182748.png]]
	- ![[Pasted image 20231103183148.png]]

- ## Aplicações:
	- Quando nao se sabe quais os tipos exatos e as dependências dos objetos que o código estará trabalhando
	- Separa o codigo do produto do que atualmente utiliza o mesmo. Por exemplo para adicionar um novo produto à aplicação só é necessário criar uma nova subclasse e sobrecarregar @override o método da mesma
	- Quando se quer prover aos usuários algo que estenda um framework ou biblioteca
	- ?????? Usar quando se deseja salvar recursos da maquina hospedeira reutiizando objetos criado inves de rebuilda-lo toda vez

![[Pasted image 20231103192933.png]]