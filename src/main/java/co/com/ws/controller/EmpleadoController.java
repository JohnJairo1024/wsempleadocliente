package co.com.ws.controller;

import co.com.ws.dto.EmpleadoDTO;
import co.com.ws.dto.MensajeOut;
import co.com.ws.services.EmpleadoService;
import co.com.wss.NuevoEmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

//    @GetMapping("/empleado")
//    public ResponseEntity<NuevoEmpleadoResponse> distanciapermitida(
//            @RequestParam("nombres") String nombres,
//            @RequestParam("apellidos") String apellidos,
//            @RequestParam("tipoDocumento") String tipoDocumento,
//            @RequestParam("numeroDocumento") String numeroDocumento,
//            @RequestParam("fechaNacimiento") Date fechaNacimiento,
//            @RequestParam("fechaVinculacion") Date fechaVinculacion,
//            @RequestParam("cargo") String cargo,
//            @RequestParam("salario") double salario
//    ) {
//        NuevoEmpleadoResponse mensajeOut = empleadoService.empleadows(
//                nombres, apellidos, tipoDocumento, numeroDocumento,
//                fechaNacimiento, fechaVinculacion, cargo, salario
//        );
//        return new ResponseEntity<>(mensajeOut, HttpStatus.OK);
//    }

    @PostMapping(path = "/empleado", consumes = "application/json", produces = "application/json")
    public MensajeOut validarLicenciaConduccion2(@RequestBody EmpleadoDTO entrada) {
        return empleadoService.empleadows(entrada);
    }


}
