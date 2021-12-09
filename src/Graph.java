import java.util.*;

public class Graph {
    private final Map<String, List<Vertex>> vertices;
    private static ArrayList<String> cidades;
    public static double custo;

    public static double getCusto() {
        return custo;
    }
    public static void setCusto(double custo) {
        Graph.custo = custo;
    }
   
    public Graph() {
        Graph.cidades = new ArrayList<>();
        this.vertices = new HashMap<>();
    }
    public Map<String, List<Vertex>> getVertices() {
        return vertices;
    }
    

    public ArrayList<String> getCidades() {
        return cidades;
    }
    
    public String getCidades(int index) {
        return cidades.get(index);
    }

    public void setCidades(ArrayList<String> cidades) {
        Graph.cidades = cidades;
    }
    
    public void addVertex(String cidade, List<Vertex> vertex) {
        this.vertices.put(cidade, vertex);
        cidades.add(cidade);
    }

    public List<String> menorCaminho(String origem, String destino) {
        final Map<String, Double> distancias = new HashMap<>();
        final Map<String, Vertex> anterior = new HashMap<>();
        PriorityQueue<Vertex> nodes = new PriorityQueue<>();
        
        double infinito = Integer.MAX_VALUE;

        vertices.keySet().stream().map(vertex -> {
            if (Objects.equals(vertex, origem)) {
                distancias.put(vertex, 0.0);
                nodes.add(new Vertex(vertex, 0));
            } else {
                distancias.put(vertex, infinito);
                nodes.add(new Vertex(vertex, infinito));
            }
            return vertex;
        }).forEachOrdered(vertex -> {
            anterior.put(vertex, null);
        });

        while (!nodes.isEmpty()) {
            Vertex menor = nodes.poll();
            if (Objects.equals(menor.getCidade(), destino)) {
                final List<String> caminho = new ArrayList<>();
                while (anterior.get(menor.getCidade()) != null) {
                    caminho.add(menor.getCidade());
                    menor = anterior.get(menor.getCidade());
                }
                return caminho;
            }

            if (Objects.equals(distancias.get(menor.getCidade()), infinito)) {
                break;
            } else {
            }

            for (Vertex vizinho : vertices.get(menor.getCidade())) {
                double temp = distancias.get(menor.getCidade()) + vizinho.getDistancia();
                if (temp < distancias.get(vizinho.getCidade())) {
                    distancias.put(vizinho.getCidade(), temp);
                    anterior.put(vizinho.getCidade(), menor);

                    for (Vertex n : nodes) {
                        if (Objects.equals(n.getCidade(), vizinho.getCidade())) {
                            nodes.remove(n);
                            n.setDistancia(temp);
                            nodes.add(n);
                            custo = temp;
                            break;
                        }
                    }
                }
            }
        }
      
        return new ArrayList<>(distancias.keySet());
    }

}