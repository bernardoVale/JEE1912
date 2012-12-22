package example;


import br.edu.utfpr.model.dao.DisciplinaDao;
import br.edu.utfpr.model.dao.ProfessorDao;
import br.edu.utfpr.model.pojo.Disciplina;
import br.edu.utfpr.model.pojo.Professor;

import java.util.List;

/**
 * @author Bernardo Vale
 *         Date: 20/12/12
 *         Time: 20:01
 */
public class TesteJPA {

    public static void main(String[] args) {
        ProfessorDao d = new ProfessorDao();
        DisciplinaDao dd = new DisciplinaDao();

        Professor p = d.findByID(2L);
        List<Disciplina> dis = p.getDisciplinasMinistrantes();
        Disciplina disciplina = dd.save(new Disciplina("Java",p));
        p = d.findByID(p.getId());
        List<Disciplina> disciplinas = p.getDisciplinasMinistrantes();
        System.out.printf(disciplinas.toString());
    }
}
