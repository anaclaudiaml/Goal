package models;

import java.util.*;

import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.jpa.*;

/**
 Jogador entity managed by JPA
 */
@Entity 
@SequenceGenerator(name = "jogadores_seq", sequenceName = "jogadores_seq")

public class Jogador {

    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jogadores_seq")
    public Long id;
    
    @Constraints.Required
    public String name;
    
	@Constraints.Required
    public String caminho;
	
    public static Jogador findById(Long id) {
        return JPA.em().find(Jogador.class, id);
    }
	/**
     * Add Jogador
     */

	public void save() {
        JPA.em().persist(this);
    }

    public static Map<String,String> options() {
        @SuppressWarnings("unchecked")
				List<Jogador> jogadores = JPA.em().createQuery("from Jogador order by name").getResultList();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Jogador c: jogadores) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

}

