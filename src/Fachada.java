import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fachada {
    Graph g = new Graph();
    Vertex vertex = new Vertex();
    private double comb = 5.50; 
    
    public void adicionarTodosVertices(){
        g.addVertex("Assis", Arrays.asList(new Vertex("Marilia", 60), new Vertex("Ourinhos", 70)));
        g.addVertex("Ourinhos", Arrays.asList(new Vertex("Bauru", 40), new Vertex("Piraju", 50), new Vertex("Assis", 70), new Vertex("Jau", 80)));
        g.addVertex("Marilia", Arrays.asList(new Vertex("Bauru", 30), new Vertex("Assis", 60), new Vertex("Ourinhos", 50)));
        g.addVertex("Bauru", Arrays.asList(new Vertex("Jau", 50), new Vertex("Ourinhos", 100), new Vertex("Marilia", 90)));
        g.addVertex("Jau", Arrays.asList(new Vertex("Avaré", 130), new Vertex("Bauru", 50), new Vertex("Ourinhos", 120)));
        g.addVertex("Piraju", Arrays.asList(new Vertex("Jau", 60), new Vertex("Avaré", 40), new Vertex("Ourinhos", 70)));
        g.addVertex("Avaré",Arrays.asList(new Vertex("Jau", 40), new Vertex("Piraju", 70)) );
    }
    public void adicionarVerticeCusto(double kml, int eixo){
        g.addVertex("Assis", Arrays.asList(new Vertex("Marilia", 60*(comb/kml) + 10.70*eixo), new Vertex("Ourinhos", 70*(comb/kml) + 8.70*eixo)));
        g.addVertex("Ourinhos", Arrays.asList(new Vertex("Bauru", 40*(comb/kml) + 15.70*eixo), new Vertex("Piraju", 50*(comb/kml) + 20.75*eixo), new Vertex("Assis", 70*(comb/kml) + 8.70*eixo), new Vertex("Jau", 80*(comb/kml))));
        g.addVertex("Marilia", Arrays.asList(new Vertex("Bauru", 90*(comb/kml) + 10.75*eixo), new Vertex("Assis", 60*(comb/kml) + 10.70*eixo), new Vertex("Ourinhos", 50)));
        g.addVertex("Bauru", Arrays.asList(new Vertex("Jau", 50*(comb/kml)), new Vertex("Ourinhos", 100*(comb/kml)+15.70*eixo), new Vertex("Marilia", 90*(comb/kml) + 10.75*eixo)));
        g.addVertex("Jau", Arrays.asList(new Vertex("Avaré", 130*(comb/kml)), new Vertex("Bauru", 50*(comb/kml)), new Vertex("Ourinhos", 80*(comb/kml))));
        g.addVertex("Piraju", Arrays.asList(new Vertex("Jau", 60), new Vertex("Avaré", 70), new Vertex("Ourinhos", 70*(comb/kml) + 17.80*eixo)));
        g.addVertex("Avaré",Arrays.asList(new Vertex("Jau", 130), new Vertex("Piraju", 70)) );
    }
    public ArrayList<String> retornaCaminho(String origem, String destino){
        ArrayList<String> caminhoFinal = (ArrayList<String>) g.menorCaminho(origem, destino);
        Collections.reverse(caminhoFinal);
        return caminhoFinal;
    }
}
