package co.com.ws.client;

import co.com.wss.NuevoEmpleadoRequest;
import co.com.wss.NuevoEmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public NuevoEmpleadoResponse getNuevoEmpleado(NuevoEmpleadoRequest request) {
        template = new WebServiceTemplate(marshaller);
        NuevoEmpleadoResponse acknowledgement = (NuevoEmpleadoResponse) template.marshalSendAndReceive("http://localhost:8080/empleado",
                request);
        return acknowledgement;
    }
}
