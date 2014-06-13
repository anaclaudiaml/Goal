package models;

import java.util.*;

import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;
import play.db.jpa.*;

/**
Posicoes entity managed by JPA
 */
@Entity 
@SequenceGenerator(name = "posicoes_seq", sequenceName = "posicoes_seq")

public class Posicoes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posicoes_seq")
    public Long id;
    
    public String name;    
    
    @ManyToOne(cascade = CascadeType.MERGE)
    public Jogador jogador;
    
    /**
    Find a position by id
     */
    public static Posicoes findById(Long id) {
        return JPA.em().find(Posicoes.class, id);
    }
    
    /**
     * Update the position
     */
    public void update(Long id) {
        if(this.jogador.id == null) {
            this.jogador = null;
        } else {
            this.jogador = Jogador.findById(jogador.id);
        }
        this.id = id;
        JPA.em().merge(this);
    }
	
	/**
     * Delete the position
     */
	public void delete() {
        JPA.em().remove(this);
    }
     
    public static Page page(int page, int pageSize, String sortBy, String order, String filter) {
        if(page < 1) page = 1;
        Long total = (Long)JPA.em()
            .createQuery("select count(c) from Posicoes c where lower(c.name) like ?")
            .setParameter(1, "%" + filter.toLowerCase() + "%")
            .getSingleResult();
        @SuppressWarnings("unchecked")
				List<Posicoes> data = JPA.em()
            .createQuery("from Posicoes c where lower(c.name) like ? order by c." + sortBy + " " + order)
            .setParameter(1, "%" + filter.toLowerCase() + "%")
            .setFirstResult((page - 1) * 12)
            .setMaxResults(12)
            .getResultList();
        return new Page(data, total, page, 12);
    }
    
    /**
     * Used to represent a list page of posicoes
     */
    public static class Page {
        
        private final int pageSize;
        private final long totalRowCount;
        private final int pageIndex;
        private final List<Posicoes> list;
        
        public Page(List<Posicoes> data, long total, int page, int pageSize) {
            this.list = data;
            this.totalRowCount = total;
            this.pageIndex = page;
            this.pageSize = pageSize;
        }
        
        public long getTotalRowCount() {
            return totalRowCount;
        }
        
        public int getPageIndex() {
            return pageIndex;
        }
        
        public List<Posicoes> getList() {
            return list;
        }
        
    }
    
}

