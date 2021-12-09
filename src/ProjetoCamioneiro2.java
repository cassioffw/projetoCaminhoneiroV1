import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoCamioneiro2 {

    public static void main(String[] args) {
        Graph g = new Graph();
        Fachada f = new Fachada();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para rota de menor caminho, ou 2 para rota\n"
                + "de menor custo: ");
        int op = sc.nextInt();
        if (op == 1){
            f.adicionarTodosVertices();
        }
        else{
            System.out.println("Informe a km/l do caminhão: ");
            double kml = sc.nextDouble();
            System.out.println("Informe a quantidade de eixos: ");
            int eixos = sc.nextInt();
            f.adicionarVerticeCusto(kml, eixos);
        }
        System.out.println("Informe a Origem: \n [1]Assis [2]Ourinhos \n"
                + " [3]Marilia [4]Bauru \n [5]Jau [6]Piraju \n [7]Avaré");
        int o = sc.nextInt();
        String origem = g.getCidades(o-1);
        System.out.println("Informe o Destino: \n [1]Assis  [2]Ourinhos \n"
                + " [3]Marilia  [4]Bauru \n [5]Jau [6]Piraju \n [7]Avaré");
        int d = sc.nextInt();
        String destino = g.getCidades(d-1);
        ArrayList<String> melhorCaminho;
        melhorCaminho = f.retornaCaminho(origem, destino);
        if (op == 1){
            System.out.println("A rota de menor caminho partindo de " + origem
                +" para " + destino + " é: \n" +melhorCaminho);
            System.out.println("Total percorrido: "+ String.format("%.1f", Graph.getCusto())+ " KM");
        }
        else{
            System.out.println("A rota de menor custo partindo de " + origem
                +" para " + destino + " é: \n" +melhorCaminho);
            System.out.println("Total gasto: R$"+ String.format("%.2f", Graph.getCusto()));
        }
        
    }
}
