//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.16 a las 04:16:27 PM CDT 
//


package https.t4is_uv_mx.agenda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.agenda package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EventosRequest_QNAME = new QName("https://t4is.uv.mx/agenda", "EventosRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.agenda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventosResponse }
     * 
     */
    public EventosResponse createEventosResponse() {
        return new EventosResponse();
    }

    /**
     * Create an instance of {@link EliminarEventoResponse }
     * 
     */
    public EliminarEventoResponse createEliminarEventoResponse() {
        return new EliminarEventoResponse();
    }

    /**
     * Create an instance of {@link AgendarEventoRequest }
     * 
     */
    public AgendarEventoRequest createAgendarEventoRequest() {
        return new AgendarEventoRequest();
    }

    /**
     * Create an instance of {@link AgendarEventoResponse }
     * 
     */
    public AgendarEventoResponse createAgendarEventoResponse() {
        return new AgendarEventoResponse();
    }

    /**
     * Create an instance of {@link EventosResponse.AgendaBD }
     * 
     */
    public EventosResponse.AgendaBD createEventosResponseAgendaBD() {
        return new EventosResponse.AgendaBD();
    }

    /**
     * Create an instance of {@link ModificarEventoRequest }
     * 
     */
    public ModificarEventoRequest createModificarEventoRequest() {
        return new ModificarEventoRequest();
    }

    /**
     * Create an instance of {@link ModificarEventoResponse }
     * 
     */
    public ModificarEventoResponse createModificarEventoResponse() {
        return new ModificarEventoResponse();
    }

    /**
     * Create an instance of {@link EliminarEventoRequest }
     * 
     */
    public EliminarEventoRequest createEliminarEventoRequest() {
        return new EliminarEventoRequest();
    }

    /**
     * Create an instance of {@link EliminarEventoResponse.Agenda }
     * 
     */
    public EliminarEventoResponse.Agenda createEliminarEventoResponseAgenda() {
        return new EliminarEventoResponse.Agenda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/agenda", name = "EventosRequest")
    public JAXBElement<Object> createEventosRequest(Object value) {
        return new JAXBElement<Object>(_EventosRequest_QNAME, Object.class, null, value);
    }

}
