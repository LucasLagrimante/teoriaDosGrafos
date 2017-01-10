package grafosxml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.List;
import java.util.Objects;

@XStreamAlias("node")
public class No {
    @XStreamAlias("id")
    @XStreamAsAttribute
    private String id;

    public No(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public static No getNoById(String id, List<No> nos) {
        for (No no : nos) {
            if (no.getId().equals(id)) {
                return no;
            }
        }
        return null;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final No other = (No) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
