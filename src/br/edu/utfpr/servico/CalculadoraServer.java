package br.edu.utfpr.servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Bernardo Vale
 * Date: 12/11/12
 * Time: 17:16
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculadoraServer {

    @WebMethod
    public Double efetuarCalculo(String formula);
}
