import java.util.*;

public class Graph {
    private final Map<String, List<Aresta>> vertices;
    private static ArrayList<String> cidades;
    public static double custo;
   
    public Graph() {
        Graph.cidades = new ArrayList<>();
        this.vertices = new HashMap<>();
    }
    public static double getCusto() {
        return custo;
    }
    public static void setCusto(double custo) {
        Graph.custo = custo;
    }
    public Map<String, List<Aresta>> getvertices() {
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
    
    public void addVertice(String cidade, List<Aresta> aresta) {
        this.vertices.put(cidade, aresta);
        cidades.add(cidade);
    }

    public List<String> menorCaminho(String origem, String destino) {
        final Map<String, Double> distancias = new HashMap<>();
        final Map<String, Aresta> anterior = new HashMap<>();
        PriorityQueue<Aresta> nodes = new PriorityQueue<>();
        
        double infinito = Integer.MAX_VALUE;

        vertices.keySet().stream().map(Aresta -> {
            if (Objects.equals(Aresta, origem)) {
                distancias.put(Aresta, 0.0);
                nodes.add(new Aresta(Aresta, 0));
            } else {
                distancias.put(Aresta, infinito);
                nodes.add(new Aresta(Aresta, infinito));
            }
            return Aresta;
        }).forEachOrdered(Aresta -> {
            anterior.put(Aresta, null);
        });

        while (!nodes.isEmpty()) {
            Aresta menor = nodes.poll();
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

            for (Aresta vizinho : vertices.get(menor.getCidade())) {
                double temp = distancias.get(menor.getCidade()) + vizinho.getDistancia();
                if (temp < distancias.get(vizinho.getCidade())) {
                    distancias.put(vizinho.getCidade(), temp);
                    anterior.put(vizinho.getCidade(), menor);

                    for (Aresta n : nodes) {
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