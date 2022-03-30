package mx.uv.t4is.Saludos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.saludos.BuscarSaludosResponse;
import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;

import https.t4is_uv_mx.saludos.EliminarSaludoRequest;
import https.t4is_uv_mx.saludos.EliminarSaludoResponse;

import https.t4is_uv_mx.saludos.ModificarSaludoRequest;
import https.t4is_uv_mx.saludos.ModificarSaludoResponse;



@Endpoint
public class SaludosEndPoint {
    int contadorId = 1 ;
    List<Saludo> saludos = new ArrayList<>();


    @PayloadRoot(localPart = "SaludarRequest", namespace = "https://t4is.uv.mx/saludos")
    @ResponsePayload
    public SaludarResponse Saludar(@RequestPayload SaludarRequest peticion) {
        SaludarResponse respuesta = new SaludarResponse();
        respuesta.setRespuesta("Hola "+ peticion.getNombre());
        Saludo saludo = new Saludo();
        saludo.setNombre(peticion.getNombre());
        saludo.setId(contadorId);
        saludos.add(saludo);
        contadorId ++;
        return respuesta;
    }

    //------------------------------------------------------------------------

    @PayloadRoot(localPart = "BuscarSaludosRequest", namespace = "https://t4is.uv.mx/saludos")
    @ResponsePayload
    public BuscarSaludosResponse buscarSaludos(){
        BuscarSaludosResponse respuesta = new BuscarSaludosResponse();
        for (Saludo saludo : saludos) {
            BuscarSaludosResponse.Saludos saludosBuscar = new BuscarSaludosResponse.Saludos();
            saludosBuscar.setId(saludo.getId());
            saludosBuscar.setNombre(saludo.getNombre());
            respuesta.getSaludos().add(saludosBuscar);
        }
        return respuesta;
    }

    //------------------------------------------------------------------------

    @PayloadRoot(localPart = "ModificarSaludoRequest", namespace = "https://t4is.uv.mx/saludos")
    @ResponsePayload
    public ModificarSaludoResponse modificarSaludo(@RequestPayload ModificarSaludoRequest peticion){
        ModificarSaludoResponse respuesta = new ModificarSaludoResponse();
        if(!saludos.isEmpty()){ 
            for (Saludo saludoParaModificar : saludos) { 
                if(saludoParaModificar.getId() == peticion.getId()){ 
                    saludoParaModificar.setNombre(peticion.getNuevoNombre()); 
                    respuesta.setId(peticion.getId()); 
                    respuesta.setNombre(peticion.getNuevoNombre());
                }
            }
        }
        return respuesta;
    }

    //------------------------------------------------------------------------

    @PayloadRoot(localPart = "EliminarSaludoRequest", namespace = "https://t4is.uv.mx/saludos")
    @ResponsePayload
    public EliminarSaludoResponse borrarSaludo(@RequestPayload EliminarSaludoRequest peticion){
        int indexDelElementoABorrar = 0;
        boolean elementoEncontrado = false;
        EliminarSaludoResponse respuesta = new EliminarSaludoResponse();
        respuesta.getSaludos().clear(); 
        if(!saludos.isEmpty()){
            for (Saludo saludoParaBorrar : saludos) {
                if(saludoParaBorrar.getId() == peticion.getId()){
                    indexDelElementoABorrar = saludos.indexOf(saludoParaBorrar);
                    elementoEncontrado = true;
                   
                }
            }
            if (elementoEncontrado){
                saludos.remove(indexDelElementoABorrar);
            }
            for (Saludo saludo : saludos) {
                EliminarSaludoResponse.Saludos saludoNoEliminado = new EliminarSaludoResponse.Saludos();
                saludoNoEliminado.setId(saludo.getId());
                saludoNoEliminado.setNombre(saludo.getNombre());
                respuesta.getSaludos().add(saludoNoEliminado);
            }
        }
        return respuesta;

    }

}

