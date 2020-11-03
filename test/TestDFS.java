package test;

import data.structure.Graph;
import data.structure.Vertex;

public class TestDFS {
    static void testPrintAndrea() {

        Graph graph = new Graph(false);
        // grafo visto en clase
        graph.readFileInput("testdfs.txt");
        // para recorrer desde el nodo 0
        Vertex vertex = graph.getVertexList().getHead().getData();
        graph.printDFS(vertex);
    }

        
        


    
}
