package example;


import br.edu.utfpr.model.pojo.Disciplina;
import br.edu.utfpr.model.pojo.Professor;

import javax.persistence.EntityManager;

/**
 * @author Bernardo Vale
 *         Date: 20/12/12
 *         Time: 20:01
 */
public class TesteJPA {

    public static void main(String[] args) {
        EntityManager em = PersistenceGetter.getManager();
        // Create new todo
        em.getTransaction().begin();
        Professor p = new Professor("Dagoberto","123423123");
        em.persist(p);
        p.setId(2L);
        Disciplina d = new Disciplina("Loladora");
        d.setProfessor(p);
        em.persist(d);
        em.getTransaction().commit();
        em.close();
    }
}
