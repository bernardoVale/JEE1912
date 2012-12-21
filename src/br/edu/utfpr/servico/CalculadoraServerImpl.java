package br.edu.utfpr.servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Bernardo Vale
 *         Date: 12/11/12
 *         Time: 17:19
 */
@WebService(endpointInterface = "br.edu.utfpr.servico.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {

    @WebMethod
    public Double efetuarCalculo(String formula) {
            formula = formula.replaceAll(" ", "+");
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
        Double resultado = null;
        try {
            resultado = (Double)
            engine.eval(formula);
        } catch (ScriptException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return resultado;
    }
}
