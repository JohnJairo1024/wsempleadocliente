package co.com.ws.dto;

import co.com.ws.util.Constantes;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class MensajeOut {

    private String codigoRespuesta;
    private String mensaje;
    private String fecha;
    private boolean exitoso;

    public MensajeOut(boolean exitoso, String mensaje) {
        this.exitoso = exitoso;
        if (exitoso) {
            this.setMensaje(Constantes.MENSAJE_OK);
            this.setCodigoRespuesta(Constantes.CodigoRespuesta.Exitoso.toString());
        } else {
            this.setCodigoRespuesta(Constantes.CodigoRespuesta.Fallido.toString());
        }
        if (mensaje != null) {
            this.setMensaje(mensaje);
        }
    }
}
