
package model;


public class Storage {
    
    private static Storage instance = null;
    private Grafo grafo;
    
    protected Storage(){
        grafo = new Grafo();
    }
    
    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public Grafo getGrafo() {
        return grafo;
    }
    
    public void setGrafo(Grafo grafo){
        this.grafo = grafo;
    }
}
