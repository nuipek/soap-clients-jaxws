
package es.correos.oficinasbuzones;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OficinasBuzonesSoap", targetNamespace = "OficinasBuzones")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OficinasBuzonesSoap {


    /**
     * Devuelve las provincias por idioma
     * 
     * @param idioma
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultaProvincias", action = "OficinasBuzones/ConsultaProvincias")
    @WebResult(name = "ConsultaProvinciasResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "ConsultaProvincias", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.ConsultaProvincias")
    @ResponseWrapper(localName = "ConsultaProvinciasResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.ConsultaProvinciasResponse")
    public String consultaProvincias(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma);

    /**
     * Verifica si existe alguna localidad con callejero con los valores ingresados
     * 
     * @param localidad
     * @param provincia
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TieneCallejero", action = "OficinasBuzones/TieneCallejero")
    @WebResult(name = "TieneCallejeroResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "TieneCallejero", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.TieneCallejero")
    @ResponseWrapper(localName = "TieneCallejeroResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.TieneCallejeroResponse")
    public String tieneCallejero(
        @WebParam(name = "localidad", targetNamespace = "OficinasBuzones")
        String localidad,
        @WebParam(name = "provincia", targetNamespace = "OficinasBuzones")
        String provincia);

    /**
     * Muestra la informaci�n de todos los servicios y caracter�sticas disponibles sobre los que se puede cribar
     * 
     * @param idioma
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultaServiciosDisponiblesVisibles", action = "OficinasBuzones/ConsultaServiciosDisponiblesVisibles")
    @WebResult(name = "ConsultaServiciosDisponiblesVisiblesResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "ConsultaServiciosDisponiblesVisibles", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.ConsultaServiciosDisponiblesVisibles")
    @ResponseWrapper(localName = "ConsultaServiciosDisponiblesVisiblesResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.ConsultaServiciosDisponiblesVisiblesResponse")
    public String consultaServiciosDisponiblesVisibles(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma);

    /**
     * Obtiene la informaci�n necesaria para la p�gina inicial del localizador de oficinas y buzones
     * 
     * @param idioma
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InformacionInicial", action = "OficinasBuzones/InformacionInicial")
    @WebResult(name = "InformacionInicialResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "InformacionInicial", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.InformacionInicial")
    @ResponseWrapper(localName = "InformacionInicialResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.InformacionInicialResponse")
    public String informacionInicial(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma);

    /**
     * Devuelve el listado de los pares provincia-localidad con callejero
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ParesConCallejero", action = "OficinasBuzones/ParesConCallejero")
    @WebResult(name = "ParesConCallejeroResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "ParesConCallejero", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.ParesConCallejero")
    @ResponseWrapper(localName = "ParesConCallejeroResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.ParesConCallejeroResponse")
    public String paresConCallejero();

    /**
     * Delimita las localidades existentes en funcion de localidad/provincia elegidos
     * 
     * @param buzones
     * @param hora
     * @param oficinas
     * @param idioma
     * @param numerocalle
     * @param provincia
     * @param nomcalle
     * @param servicios
     * @param fecha
     * @param maxresultados
     * @param poblacion
     * @param maxOficinas
     * @param maxBuzones
     * @param tipoBusqueda
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DelimitaLocalidades", action = "OficinasBuzones/DelimitaLocalidades")
    @WebResult(name = "DelimitaLocalidadesResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "DelimitaLocalidades", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DelimitaLocalidades")
    @ResponseWrapper(localName = "DelimitaLocalidadesResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DelimitaLocalidadesResponse")
    public String delimitaLocalidades(
        @WebParam(name = "maxresultados", targetNamespace = "OficinasBuzones")
        String maxresultados,
        @WebParam(name = "provincia", targetNamespace = "OficinasBuzones")
        String provincia,
        @WebParam(name = "poblacion", targetNamespace = "OficinasBuzones")
        String poblacion,
        @WebParam(name = "nomcalle", targetNamespace = "OficinasBuzones")
        String nomcalle,
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "TipoBusqueda", targetNamespace = "OficinasBuzones")
        String tipoBusqueda,
        @WebParam(name = "oficinas", targetNamespace = "OficinasBuzones")
        String oficinas,
        @WebParam(name = "maxOficinas", targetNamespace = "OficinasBuzones")
        String maxOficinas,
        @WebParam(name = "maxBuzones", targetNamespace = "OficinasBuzones")
        String maxBuzones,
        @WebParam(name = "buzones", targetNamespace = "OficinasBuzones")
        String buzones,
        @WebParam(name = "servicios", targetNamespace = "OficinasBuzones")
        String servicios,
        @WebParam(name = "fecha", targetNamespace = "OficinasBuzones")
        String fecha,
        @WebParam(name = "hora", targetNamespace = "OficinasBuzones")
        String hora,
        @WebParam(name = "numerocalle", targetNamespace = "OficinasBuzones")
        String numerocalle);

    /**
     * Las oficinas y/o buzones que se encuentren en 1 c�digo postal
     * 
     * @param servicios
     * @param fecha
     * @param buscabuzones
     * @param diadelasemana
     * @param maxnumbuzones
     * @param hora
     * @param idioma
     * @param maxnumoficinas
     * @param codigopostal
     * @param buscaoficinas
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BusquedaPorCodigoPostal", action = "OficinasBuzones/BusquedaPorCodigoPostal")
    @WebResult(name = "BusquedaPorCodigoPostalResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "BusquedaPorCodigoPostal", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoPostal")
    @ResponseWrapper(localName = "BusquedaPorCodigoPostalResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoPostalResponse")
    public String busquedaPorCodigoPostal(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codigopostal", targetNamespace = "OficinasBuzones")
        String codigopostal,
        @WebParam(name = "servicios", targetNamespace = "OficinasBuzones")
        String servicios,
        @WebParam(name = "fecha", targetNamespace = "OficinasBuzones")
        String fecha,
        @WebParam(name = "diadelasemana", targetNamespace = "OficinasBuzones")
        String diadelasemana,
        @WebParam(name = "hora", targetNamespace = "OficinasBuzones")
        String hora,
        @WebParam(name = "buscaoficinas", targetNamespace = "OficinasBuzones")
        String buscaoficinas,
        @WebParam(name = "maxnumoficinas", targetNamespace = "OficinasBuzones")
        String maxnumoficinas,
        @WebParam(name = "buscabuzones", targetNamespace = "OficinasBuzones")
        String buscabuzones,
        @WebParam(name = "maxnumbuzones", targetNamespace = "OficinasBuzones")
        String maxnumbuzones);

    /**
     * Las oficinas y/o buzones que se encuentren en 1 c�digo postal
     * 
     * @param buscabuzones
     * @param maxnumbuzones
     * @param idioma
     * @param maxnumoficinas
     * @param codigopostal
     * @param buscaoficinas
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BusquedaPorCodigoPostalSinFiltro", action = "OficinasBuzones/BusquedaPorCodigoPostalSinFiltro")
    @WebResult(name = "BusquedaPorCodigoPostalSinFiltroResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "BusquedaPorCodigoPostalSinFiltro", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoPostalSinFiltro")
    @ResponseWrapper(localName = "BusquedaPorCodigoPostalSinFiltroResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoPostalSinFiltroResponse")
    public String busquedaPorCodigoPostalSinFiltro(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codigopostal", targetNamespace = "OficinasBuzones")
        String codigopostal,
        @WebParam(name = "buscaoficinas", targetNamespace = "OficinasBuzones")
        String buscaoficinas,
        @WebParam(name = "maxnumoficinas", targetNamespace = "OficinasBuzones")
        String maxnumoficinas,
        @WebParam(name = "buscabuzones", targetNamespace = "OficinasBuzones")
        String buscabuzones,
        @WebParam(name = "maxnumbuzones", targetNamespace = "OficinasBuzones")
        String maxnumbuzones);

    /**
     * Las oficinas y/o buzones que se encuentren en 1 municipio
     * 
     * @param servicios
     * @param fecha
     * @param buscabuzones
     * @param maxnumbuzones
     * @param hora
     * @param idioma
     * @param maxnumoficinas
     * @param codmunicipio
     * @param buscaoficinas
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BusquedaPorCodigoMunicipio", action = "OficinasBuzones/BusquedaPorCodigoMunicipio")
    @WebResult(name = "BusquedaPorCodigoMunicipioResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "BusquedaPorCodigoMunicipio", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoMunicipio")
    @ResponseWrapper(localName = "BusquedaPorCodigoMunicipioResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoMunicipioResponse")
    public String busquedaPorCodigoMunicipio(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codmunicipio", targetNamespace = "OficinasBuzones")
        String codmunicipio,
        @WebParam(name = "servicios", targetNamespace = "OficinasBuzones")
        String servicios,
        @WebParam(name = "fecha", targetNamespace = "OficinasBuzones")
        String fecha,
        @WebParam(name = "hora", targetNamespace = "OficinasBuzones")
        String hora,
        @WebParam(name = "buscaoficinas", targetNamespace = "OficinasBuzones")
        String buscaoficinas,
        @WebParam(name = "maxnumoficinas", targetNamespace = "OficinasBuzones")
        String maxnumoficinas,
        @WebParam(name = "buscabuzones", targetNamespace = "OficinasBuzones")
        String buscabuzones,
        @WebParam(name = "maxnumbuzones", targetNamespace = "OficinasBuzones")
        String maxnumbuzones);

    /**
     * Las oficinas y/o buzones que se encuentren en 1 municipio
     * 
     * @param servicios
     * @param fecha
     * @param buscabuzones
     * @param maxnumbuzones
     * @param hora
     * @param idioma
     * @param maxnumoficinas
     * @param codmunicipio
     * @param oficinasEntrega
     * @param buscaoficinas
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BusquedaPorCodigoMunicipioExtendido", action = "OficinasBuzones/BusquedaPorCodigoMunicipioExtendido")
    @WebResult(name = "BusquedaPorCodigoMunicipioExtendidoResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "BusquedaPorCodigoMunicipioExtendido", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoMunicipioExtendido")
    @ResponseWrapper(localName = "BusquedaPorCodigoMunicipioExtendidoResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoMunicipioExtendidoResponse")
    public String busquedaPorCodigoMunicipioExtendido(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codmunicipio", targetNamespace = "OficinasBuzones")
        String codmunicipio,
        @WebParam(name = "servicios", targetNamespace = "OficinasBuzones")
        String servicios,
        @WebParam(name = "fecha", targetNamespace = "OficinasBuzones")
        String fecha,
        @WebParam(name = "hora", targetNamespace = "OficinasBuzones")
        String hora,
        @WebParam(name = "buscaoficinas", targetNamespace = "OficinasBuzones")
        String buscaoficinas,
        @WebParam(name = "maxnumoficinas", targetNamespace = "OficinasBuzones")
        String maxnumoficinas,
        @WebParam(name = "buscabuzones", targetNamespace = "OficinasBuzones")
        String buscabuzones,
        @WebParam(name = "maxnumbuzones", targetNamespace = "OficinasBuzones")
        String maxnumbuzones,
        @WebParam(name = "OficinasEntrega", targetNamespace = "OficinasBuzones")
        boolean oficinasEntrega);

    /**
     * Devuelve la informaci�n disponible de las oficina que se consulta
     * 
     * @param codigooficina
     * @param idioma
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DetalleOficina", action = "OficinasBuzones/DetalleOficina")
    @WebResult(name = "DetalleOficinaResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "DetalleOficina", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DetalleOficina")
    @ResponseWrapper(localName = "DetalleOficinaResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DetalleOficinaResponse")
    public String detalleOficina(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codigooficina", targetNamespace = "OficinasBuzones")
        String codigooficina);

    /**
     * Devuelve la informaci�n disponible del buz�n que se consulta
     * 
     * @param idioma
     * @param codigobuzon
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DetalleBuzon", action = "OficinasBuzones/DetalleBuzon")
    @WebResult(name = "DetalleBuzonResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "DetalleBuzon", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DetalleBuzon")
    @ResponseWrapper(localName = "DetalleBuzonResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DetalleBuzonResponse")
    public String detalleBuzon(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codigobuzon", targetNamespace = "OficinasBuzones")
        String codigobuzon);

    /**
     * Devuelve la informaci�n de las oficinas m�s cercanas
     * 
     * @param servicios
     * @param buzones
     * @param fecha
     * @param codigocalle
     * @param numbuzones
     * @param numoficinas
     * @param hora
     * @param oficinas
     * @param codigoprovincia
     * @param idioma
     * @param numerocalle
     * @param codigolocalidad
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BuscarLasMasCercanas", action = "OficinasBuzones/BuscarLasMasCercanas")
    @WebResult(name = "BuscarLasMasCercanasResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "BuscarLasMasCercanas", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BuscarLasMasCercanas")
    @ResponseWrapper(localName = "BuscarLasMasCercanasResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BuscarLasMasCercanasResponse")
    public String buscarLasMasCercanas(
        @WebParam(name = "numoficinas", targetNamespace = "OficinasBuzones")
        String numoficinas,
        @WebParam(name = "oficinas", targetNamespace = "OficinasBuzones")
        String oficinas,
        @WebParam(name = "numbuzones", targetNamespace = "OficinasBuzones")
        String numbuzones,
        @WebParam(name = "buzones", targetNamespace = "OficinasBuzones")
        String buzones,
        @WebParam(name = "servicios", targetNamespace = "OficinasBuzones")
        String servicios,
        @WebParam(name = "fecha", targetNamespace = "OficinasBuzones")
        String fecha,
        @WebParam(name = "hora", targetNamespace = "OficinasBuzones")
        String hora,
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codigoprovincia", targetNamespace = "OficinasBuzones")
        String codigoprovincia,
        @WebParam(name = "codigolocalidad", targetNamespace = "OficinasBuzones")
        String codigolocalidad,
        @WebParam(name = "codigocalle", targetNamespace = "OficinasBuzones")
        String codigocalle,
        @WebParam(name = "numerocalle", targetNamespace = "OficinasBuzones")
        String numerocalle);

    /**
     * Delimita las localidades existentes en funcion de localidad/provincia elegidos
     * 
     * @param buzones
     * @param hora
     * @param oficinas
     * @param idioma
     * @param numerocalle
     * @param provincia
     * @param nomcalle
     * @param servicios
     * @param fecha
     * @param maxresultados
     * @param poblacion
     * @param maxOficinas
     * @param maxBuzones
     * @param tipoBusqueda
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DelimitaLocalidadesOficinasEntrega", action = "OficinasBuzones/DelimitaLocalidadesOficinasEntrega")
    @WebResult(name = "DelimitaLocalidadesOficinasEntregaResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "DelimitaLocalidadesOficinasEntrega", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DelimitaLocalidadesOficinasEntrega")
    @ResponseWrapper(localName = "DelimitaLocalidadesOficinasEntregaResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.DelimitaLocalidadesOficinasEntregaResponse")
    public String delimitaLocalidadesOficinasEntrega(
        @WebParam(name = "maxresultados", targetNamespace = "OficinasBuzones")
        String maxresultados,
        @WebParam(name = "provincia", targetNamespace = "OficinasBuzones")
        String provincia,
        @WebParam(name = "poblacion", targetNamespace = "OficinasBuzones")
        String poblacion,
        @WebParam(name = "nomcalle", targetNamespace = "OficinasBuzones")
        String nomcalle,
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "TipoBusqueda", targetNamespace = "OficinasBuzones")
        String tipoBusqueda,
        @WebParam(name = "oficinas", targetNamespace = "OficinasBuzones")
        String oficinas,
        @WebParam(name = "maxOficinas", targetNamespace = "OficinasBuzones")
        String maxOficinas,
        @WebParam(name = "maxBuzones", targetNamespace = "OficinasBuzones")
        String maxBuzones,
        @WebParam(name = "buzones", targetNamespace = "OficinasBuzones")
        String buzones,
        @WebParam(name = "servicios", targetNamespace = "OficinasBuzones")
        String servicios,
        @WebParam(name = "fecha", targetNamespace = "OficinasBuzones")
        String fecha,
        @WebParam(name = "hora", targetNamespace = "OficinasBuzones")
        String hora,
        @WebParam(name = "numerocalle", targetNamespace = "OficinasBuzones")
        String numerocalle);

    /**
     * Las oficinas y/o buzones que se encuentren en 1 c�digo postal
     * 
     * @param buscabuzones
     * @param maxnumbuzones
     * @param idioma
     * @param maxnumoficinas
     * @param codigopostal
     * @param buscaoficinas
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BusquedaPorCodigoPostalSinFiltroOficinasEntrega", action = "OficinasBuzones/BusquedaPorCodigoPostalSinFiltroOficinasEntrega")
    @WebResult(name = "BusquedaPorCodigoPostalSinFiltroOficinasEntregaResult", targetNamespace = "OficinasBuzones")
    @RequestWrapper(localName = "BusquedaPorCodigoPostalSinFiltroOficinasEntrega", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoPostalSinFiltroOficinasEntrega")
    @ResponseWrapper(localName = "BusquedaPorCodigoPostalSinFiltroOficinasEntregaResponse", targetNamespace = "OficinasBuzones", className = "es.correos.oficinasbuzones.BusquedaPorCodigoPostalSinFiltroOficinasEntregaResponse")
    public String busquedaPorCodigoPostalSinFiltroOficinasEntrega(
        @WebParam(name = "idioma", targetNamespace = "OficinasBuzones")
        String idioma,
        @WebParam(name = "codigopostal", targetNamespace = "OficinasBuzones")
        String codigopostal,
        @WebParam(name = "buscaoficinas", targetNamespace = "OficinasBuzones")
        String buscaoficinas,
        @WebParam(name = "maxnumoficinas", targetNamespace = "OficinasBuzones")
        String maxnumoficinas,
        @WebParam(name = "buscabuzones", targetNamespace = "OficinasBuzones")
        String buscabuzones,
        @WebParam(name = "maxnumbuzones", targetNamespace = "OficinasBuzones")
        String maxnumbuzones);

}