<h1>Projeto caminhoneiro com grafos - JAVA</h1>
<strong>Atividade realizada em dupla:</strong> Cassio Mariano de Freitas e Lucas Henrique Hoffmann.
<br>
<br>
<p align="center">
    <img src="https://image.freepik.com/vetores-gratis/caminhao-de-entrega-com-uma-grande-caixa_1284-44424.jpg" width = "300px" height = "250px" >
    <p>Imagem disponivel em: <a href="https://br.freepik.com/fotos-vetores-gratis/estrada">Estrada vetor criado por macrovector</a></p>
</p>
<h2>Sobre o projeto</h2>
<p>O projeto consiste em determinar uma rota de menor caminho ou uma rota de menor custo à partir de um grafo, onde será criado o mapa com o nome das cidades. O usuário entrará com a cidade de partida (origem) e a cidade destino. O programa irá retornar o menor caminho ou o menor custo (depende da escolha do usuario).</p>

<h2>Classes e suas responsabilidades</h2>
<h3><b>● ProjetoCaminhoneiro2.java(main): </b></h3>
<p>Onde será executado todos os comandos de menu e interação com o usuario.</p>
<h3><b>● Fachada.java:</b></h3>
<p>Fachada onde enviará os comandos para criação do grafo de acordo com as opções fornecidas pelo usuario, também é responsavel pela formatação da saída do programa</p>
<h3><b>● Graph.java:</b></h3>
<p>Responsável por criar o grafo e implementar o Algoritmo de Djikstra.</p>
<h3><b>● Vertex.java:</b></h3>
<p>Onde os vertices do grafo são criados.</p>


<h2>Sobre o Algoritmo de Djikstra</h2>
<p>Seu objetivo é fornecer o caminho com a menor distancias entre 2 pontos em um grafo, esse algoritmo foi utilizado para calcular a rota de menor caminho/custo para o usuário.</p>

## Features
- ✅ **Calcular rotas por KM e fornecer a menor distancia.**
- ✅ **Ou calcular rotas por gastos e fornecer a rota de menor custo.**

## Run

- **INICIALIZAR O PROGRAMA PELA CLASSE MAIN "ProjetoCaminhoneiro2".**
