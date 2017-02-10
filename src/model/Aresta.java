package model;
/**
 *
 * Integrantes do grupo:
 * Victor Domingos Duque
 * Lucas Lagrimante Martinho
 * Ramon de Souza Almeida
 * Kaio Cesar B. Costa
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.List;

@XStreamAlias("edge")
public class Aresta implements Comparable<Aresta> {

    @XStreamAlias("source")
    @XStreamAsAttribute
    private String origem;
    @XStreamAlias("target")
    @XStreamAsAttribute
    private String destino;
    @XStreamAlias("name")
    @XStreamAsAttribute
    private String nomeAresta;
    @XStreamAlias("value")
    @XStreamAsAttribute
    private int valorAresta;

    public Aresta(String nomeAresta, int valorAresta, String origem, String destino) {
        this.nomeAresta = nomeAresta;
        this.valorAresta = valorAresta;
        this.origem = origem;
        this.destino = destino;
    }

    public int getValorAresta() {
        return valorAresta;
    }

    public void setValorAresta(int valorAresta) {
        this.valorAresta = valorAresta;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNomeAresta() {
        return nomeAresta;
    }

    public void setNomeAresta(String nomeAresta) {
        this.nomeAresta = nomeAresta;
    }

    public int compareTo(Aresta aresta) {
        if (this.valorAresta < aresta.valorAresta) {
            return -1;
        } else if (this.valorAresta > aresta.valorAresta) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Aresta getArestaByNos(No origem, No destino, List<Aresta> arestas) {
        for (Aresta aresta : arestas) {
            if (aresta.getOrigem().equals(origem.getId()) && aresta.getDestino().equals(destino.getId())) {
                return aresta;
            }

        }
        return null;
    }
}
