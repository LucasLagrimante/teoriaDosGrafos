package grafosxml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.List;


@XStreamAlias("edge")
public class Aresta implements Comparable<Aresta>{
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

    public Aresta( String nomeAresta, int valorAresta, String origem, String destino) {
        this.nomeAresta = nomeAresta;
        this.valorAresta = valorAresta;
        this.origem = origem;
        this.destino = destino;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Vertice getV1() {
        return v1;
    }

    public void setV1(Vertice v1) {
        this.v1 = v1;
        source = v1.getId();
    }

    public Vertice getV2() {
        return v2;
    }

    public void setV2(Vertice v2) {
        this.v2 = v2;
        target = v2.getId();
    }    
}
