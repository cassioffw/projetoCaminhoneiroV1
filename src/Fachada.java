import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fachada {
    Graph g = new Graph();
    Aresta aresta = new Aresta();
    private double comb = 5.50; 
    
    public void adicionarTodosVertices(){
        g.addVertice("Assis", Arrays.asList(new Aresta("Marilia", 60), new Aresta("Ourinhos", 70)));
        g.addVertice("Ourinhos", Arrays.asList(new Aresta("Bauru", 40), new Aresta("Piraju", 50), new Aresta("Assis", 70), new Aresta("Jau", 80)));
        g.addVertice("Marilia", Arrays.asList(new Aresta("Bauru", 30), new Aresta("Assis", 60), new Aresta("Ourinhos", 50)));
        g.addVertice("Bauru", Arrays.asList(new Aresta("Jau", 50), new Aresta("Ourinhos", 100), new Aresta("Marilia", 90)));
        g.addVertice("Jau", Arrays.asList(new Aresta("Avaré", 130), new Aresta("Bauru", 50), new Aresta("Ourinhos", 120)));
        g.addVertice("Piraju", Arrays.asList(new Aresta("Jau", 60), new Aresta("Avaré", 40), new Aresta("Ourinhos", 70)));
        g.addVertice("Avaré",Arrays.asList(new Aresta("Jau", 40), new Aresta("Piraju", 70)) );
    }
    public void adicionarVerticeCusto(double kml, int eixo){
        g.addVertice("Assis", Arrays.asList(new Aresta("Marilia", 60*(comb/kml) + 10.70*eixo), new Aresta("Ourinhos", 70*(comb/kml) + 8.70*eixo)));
        g.addVertice("Ourinhos", Arrays.asList(new Aresta("Bauru", 40*(comb/kml) + 15.70*eixo), new Aresta("Piraju", 50*(comb/kml) + 20.75*eixo), new Aresta("Assis", 70*(comb/kml) + 8.70*eixo), new Aresta("Jau", 80*(comb/kml))));
        g.addVertice("Marilia", Arrays.asList(new Aresta("Bauru", 90*(comb/kml) + 10.75*eixo), new Aresta("Assis", 60*(comb/kml) + 10.70*eixo), new Aresta("Ourinhos", 50)));
        g.addVertice("Bauru", Arrays.asList(new Aresta("Jau", 50*(comb/kml)), new Aresta("Ourinhos", 100*(comb/kml)+15.70*eixo), new Aresta("Marilia", 90*(comb/kml) + 10.75*eixo)));
        g.addVertice("Jau", Arrays.asList(new Aresta("Avaré", 130*(comb/kml)), new Aresta("Bauru", 50*(comb/kml)), new Aresta("Ourinhos", 80*(comb/kml))));
        g.addVertice("Piraju", Arrays.asList(new Aresta("Jau", 60), new Aresta("Avaré", 70), new Aresta("Ourinhos", 70*(comb/kml) + 17.80*eixo)));
        g.addVertice("Avaré",Arrays.asList(new Aresta("Jau", 130), new Aresta("Piraju", 70)) );
    }
    public ArrayList<String> retornaCaminho(String origem, String destino){
        ArrayList<String> caminhoFinal = (ArrayList<String>) g.menorCaminho(origem, destino);
        Collections.reverse(caminhoFinal);
        return caminhoFinal;
    }
}
