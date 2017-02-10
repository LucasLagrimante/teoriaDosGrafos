package Storage;

import model.Grafo;

/**
 *
 * Integrantes do grupo:
 * Victor Domingos Duque
 * Lucas Lagrimante Martinho
 * Ramon de Souza Almeida
 * Kaio Cesar B. Costa
 */
public class GraphSession {

    private static Grafo grafo;

    public static Grafo getGrafo() {
        return grafo;
    }

    public static void setGrafo(Grafo fgrafo) {
        grafo = fgrafo;
    }

}
