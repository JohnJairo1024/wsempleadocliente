//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.20 a las 11:12:05 PM COT 
//


package co.com.wss;

import co.com.ws.dto.MensajeOut;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceStatus" type="{http://localhost/empleado-ws}serviceStatus"/&gt;
 *         &lt;element name="empleadoInfo" type="{http://localhost/empleado-ws}empleadoInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus",
    "empleadoInfo"
})
@XmlRootElement(name = "nuevoEmpleadoResponse")
public class NuevoEmpleadoResponse extends MensajeOut {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected EmpleadoInfo empleadoInfo;

    /**
     * Obtiene el valor de la propiedad serviceStatus.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Define el valor de la propiedad serviceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad empleadoInfo.
     * 
     * @return
     *     possible object is
     *     {@link EmpleadoInfo }
     *     
     */
    public EmpleadoInfo getEmpleadoInfo() {
        return empleadoInfo;
    }

    /**
     * Define el valor de la propiedad empleadoInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpleadoInfo }
     *     
     */
    public void setEmpleadoInfo(EmpleadoInfo value) {
        this.empleadoInfo = value;
    }

}
