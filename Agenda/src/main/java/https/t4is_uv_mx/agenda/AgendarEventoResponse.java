//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.16 a las 04:16:27 PM CDT 
//


package https.t4is_uv_mx.agenda;

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
 *         &lt;element name="RNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RFInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RFLimite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RDescripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "rNombre",
    "rfInicio",
    "rfLimite",
    "rDescripcion"
})
@XmlRootElement(name = "AgendarEventoResponse")
public class AgendarEventoResponse {

    @XmlElement(name = "RNombre", required = true)
    protected String rNombre;
    @XmlElement(name = "RFInicio", required = true)
    protected String rfInicio;
    @XmlElement(name = "RFLimite", required = true)
    protected String rfLimite;
    @XmlElement(name = "RDescripcion", required = true)
    protected String rDescripcion;

    /**
     * Obtiene el valor de la propiedad rNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNombre() {
        return rNombre;
    }

    /**
     * Define el valor de la propiedad rNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNombre(String value) {
        this.rNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad rfInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFInicio() {
        return rfInicio;
    }

    /**
     * Define el valor de la propiedad rfInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFInicio(String value) {
        this.rfInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad rfLimite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFLimite() {
        return rfLimite;
    }

    /**
     * Define el valor de la propiedad rfLimite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFLimite(String value) {
        this.rfLimite = value;
    }

    /**
     * Obtiene el valor de la propiedad rDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDescripcion() {
        return rDescripcion;
    }

    /**
     * Define el valor de la propiedad rDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDescripcion(String value) {
        this.rDescripcion = value;
    }

}
