package co.com.ws.services;

import co.com.ws.SoapClient;
import co.com.ws.dto.EmpleadoDTO;
import co.com.ws.dto.MensajeOut;
import co.com.wss.NuevoEmpleadoRequest;
import co.com.wss.NuevoEmpleadoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class EmpleadoService {

    @Autowired
    private SoapClient clinet;

    public NuevoEmpleadoResponse empleadows(
            String nombres, String apellidos,
            String tipoDocumento, String numeroDocumento,
            Date fechaNacimiento, Date fechaVinculacion,
            String cargo, double salario
    ) {

        NuevoEmpleadoRequest nuevoEmpleadoRequest = new NuevoEmpleadoRequest();
        nuevoEmpleadoRequest.setNombres(nombres);
        nuevoEmpleadoRequest.setApellidos(apellidos);
        nuevoEmpleadoRequest.setTipoDocumento(tipoDocumento);
        nuevoEmpleadoRequest.setNumeroDocumento(numeroDocumento);
//        nuevoEmpleadoRequest.setFechaNacimiento(fechaNacimiento);
//        nuevoEmpleadoRequest.setFechaVinculacion(fechaVinculacion);
        nuevoEmpleadoRequest.setCargo(cargo);
        nuevoEmpleadoRequest.setSalario(salario);

        return clinet.getLoanStatus(nuevoEmpleadoRequest);

    }

    public MensajeOut empleadows(EmpleadoDTO entrada) {

        MensajeOut mensajeOut = new MensajeOut();
        mensajeOut.setMensaje("Exitoso....");

        NuevoEmpleadoRequest nuevoEmpleadoRequest = new NuevoEmpleadoRequest();
        nuevoEmpleadoRequest.setNombres(entrada.getNombres());
        nuevoEmpleadoRequest.setApellidos(entrada.getApellidos());
        nuevoEmpleadoRequest.setTipoDocumento(entrada.getTipoDocumento());
        nuevoEmpleadoRequest.setNumeroDocumento(entrada.getNumeroDocumento());
//        nuevoEmpleadoRequest.setFechaNacimiento(fechaNacimiento);
//        nuevoEmpleadoRequest.setFechaVinculacion(fechaVinculacion);
        nuevoEmpleadoRequest.setCargo(entrada.getCargo());
        nuevoEmpleadoRequest.setSalario(entrada.getSalario());

        clinet.getLoanStatus(nuevoEmpleadoRequest);

        return mensajeOut;
    }
}
