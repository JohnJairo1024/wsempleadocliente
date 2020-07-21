package co.com.ws.services;

import co.com.ws.client.SoapClient;
import co.com.ws.dto.EmpleadoDTO;
import co.com.ws.dto.MensajeOut;
import co.com.ws.util.FechaUtil;
import co.com.wss.NuevoEmpleadoRequest;
import co.com.wss.NuevoEmpleadoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.XMLGregorianCalendar;

@Service
@Slf4j
public class EmpleadoService {

    @Autowired
    private SoapClient soapClient;

    /**
     * @param entrada
     * @return
     */
    public NuevoEmpleadoResponse empleadows(EmpleadoDTO entrada) {

        NuevoEmpleadoResponse mensajeOut = new NuevoEmpleadoResponse();
        mensajeOut.setCodigoRespuesta("EXITOSO");
        mensajeOut.setExitoso(true);

        NuevoEmpleadoRequest nuevoEmpleadoRequest = new NuevoEmpleadoRequest();
        nuevoEmpleadoRequest.setNombres(entrada.getNombres());
        nuevoEmpleadoRequest.setApellidos(entrada.getApellidos());
        nuevoEmpleadoRequest.setTipoDocumento(entrada.getTipoDocumento());
        nuevoEmpleadoRequest.setNumeroDocumento(entrada.getNumeroDocumento());

        if (entrada.getFechaNacimiento() != null && !entrada.getFechaNacimiento().equals("")) {
            XMLGregorianCalendar fechaNacimiento = FechaUtil.toXMLGregorianCalendar(entrada.getFechaNacimiento());
            nuevoEmpleadoRequest.setFechaNacimiento(fechaNacimiento);
        } else {
            mensajeOut.setExitoso(false);
            mensajeOut.setCodigoRespuesta("FALLIDO");
            mensajeOut.setMensaje("Por favor ingresa la fecha de nacimiento...");
            return mensajeOut;
        }

        if (entrada.getFechaVinculacion() != null && !entrada.getFechaVinculacion().equals("")) {
            XMLGregorianCalendar fechaVinculacion = FechaUtil.toXMLGregorianCalendar(entrada.getFechaVinculacion());
            nuevoEmpleadoRequest.setFechaVinculacion(fechaVinculacion);
        } else {
            mensajeOut.setExitoso(false);
            mensajeOut.setCodigoRespuesta("FALLIDO");
            mensajeOut.setMensaje("Por favor ingresa la fecha de vinculación...");
            return mensajeOut;
        }

        nuevoEmpleadoRequest.setCargo(entrada.getCargo());
        nuevoEmpleadoRequest.setSalario(entrada.getSalario());

        return soapClient.getNuevoEmpleado(nuevoEmpleadoRequest);
    }
}
