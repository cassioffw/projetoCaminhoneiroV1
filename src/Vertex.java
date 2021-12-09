import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
@SupportedSourceVersion(SourceVersion.RELEASE_8)
class Vertex implements Comparable<Vertex> {
    private String cidade;
    private double distancia;
    public Vertex(){
        
    }
    public Vertex(String cidade, double distancia) {
        super();
        this.cidade = cidade;
        this.distancia = distancia;
    }

    public String getCidade() {
        return cidade;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    @Override
    public int compareTo(Vertex o) {
        if (this.distancia < o.distancia) {
            return -1;
        } else if (this.distancia > o.distancia) {
            return 1;
        }
        return this.getCidade().compareTo(o.getCidade());
    }

}