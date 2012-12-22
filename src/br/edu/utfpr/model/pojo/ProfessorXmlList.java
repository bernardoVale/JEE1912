package br.edu.utfpr.model.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * @author Bernardo Vale
 *         Date: 22/12/12
 *         Time: 10:46
 */
@XmlType
public class ProfessorXmlList {
    private List<Disciplina> disciplinas;

    @XmlElement
    public List<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }
}
