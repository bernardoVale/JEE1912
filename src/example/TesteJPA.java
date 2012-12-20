package example;


import br.edu.utfpr.model.dao.DaoProfessor;
import br.edu.utfpr.model.pojo.Professor;

/**
 * @author Bernardo Vale
 *         Date: 20/12/12
 *         Time: 20:01
 */
public class TesteJPA {

    public static void main(String[] args) {
        DaoProfessor d = new DaoProfessor();
        Professor p = new Professor("Negroide","1234231233");
        p = d.save(p);
        p.getId();
    }
}
