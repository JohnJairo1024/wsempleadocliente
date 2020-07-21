package co.com.ws.controller;

import co.com.ws.client.SoapClient;
import co.com.ws.dto.EmpleadoDTO;
import co.com.ws.dto.MensajeOut;
import co.com.ws.services.EmpleadoService;
import co.com.wss.NuevoEmpleadoRequest;
import co.com.wss.NuevoEmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private SoapClient soapClient;

    /**
     * @param entrada
     * @return
     */
    @PostMapping(path = "/empleado", consumes = "application/json", produces = "application/json")
    public NuevoEmpleadoResponse nuevoEmpleado(@RequestBody EmpleadoDTO entrada) {
        return empleadoService.empleadows(entrada);
    }


    /**
     * @param request
     * @return
     */
    @PostMapping("/getLoanStatus")
    public NuevoEmpleadoResponse invokeSoapClientToGetLoanStatus(@RequestBody NuevoEmpleadoRequest request) {
        return soapClient.getNuevoEmpleado(request);
    }


}
