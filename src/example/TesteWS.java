package example;

import br.edu.utfpr.servico.CalculadoraServer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Bernardo Vale
 *         Date: 20/12/12
 *         Time: 21:53
 */
public class TesteWS {
    public static void main(String[] args) {
        try{
            URL url =  new URL("http://localhost:8080/jeeAtividade/ts?wsdl");
            QName qame = new QName("http://servico.utfpr.edu.br/", "CalculadoraServerImplService");
            Service service = Service.create(url,qame);
            CalculadoraServer calc = service.getPort(CalculadoraServer.class);
            Double result = calc.efetuarCalculo("3+4");
            System.out.println(result);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
