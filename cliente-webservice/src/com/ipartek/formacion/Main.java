package com.ipartek.formacion;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import es.correos.oficinasbuzones.OficinasBuzones;
import es.correos.oficinasbuzones.OficinasBuzonesSoap;
import net.webservicex.CCChecker;
import net.webservicex.CCCheckerSoap;
import net.webservicex.bible.BibleWebservice;
import net.webservicex.bible.BibleWebserviceSoap;
import net.webservicex.geoip.GeoIP;
import net.webservicex.geoip.GeoIPService;
import net.webservicex.geoip.GeoIPServiceSoap;
import net.webservicex.loan.APR;
import net.webservicex.loan.FinanceService;
import net.webservicex.loan.FinanceServiceSoap;

public class Main {

	public static void main(String[] args) {
	
		double cantidadTotal=2000.0;
		double tipoInteres=5.0;
		double costeExtra=1.0;
		double valorResidual=500.0;
		double pagoMes = 100;
		double meses=12;
		 /*
		 if (validarTarjetaCredito()){
				System.out.println("Es Valida");
		 }
		 else
		 {
			 System.out.println("Es Invalida");
		 }
		 
		 GeoIP geoip = obtenerIp();
		 System.out.println("La IP es: " + geoip.getIP());
		 geoip = obtenerPais(geoip.getIP());
		 System.out.println("El pais es: " + geoip.getCountryName());
		 
		
		 double aprPagoMes =  obtenerPagoMesApr(cantidadTotal,tipoInteres,costeExtra,meses);
		 double amortizacionMes = obtenerAmortizacionMensual(cantidadTotal,valorResidual,tipoInteres,meses);
		 double cuotaMes = obtenerCuotaMes(cantidadTotal,tipoInteres,meses);
		 double numMeses = numeroMesesPago(cantidadTotal, tipoInteres, pagoMes);
		 System.out.println("La cantida de Pago por mes es: " + aprPagoMes);
		 System.out.println("La Amortizacion Mensual es: " + amortizacionMes);
		 System.out.println("La Cuota Mensual es: " + cuotaMes);
		 System.out.println("El numero de meses de pago asciende a: " + numMeses);
		 
		 
		 //// PROVINCIAS DE CORREOS /////
		 
		 Map<Integer,Provincia> provincias = getProvincias();
		 
		 for (Map.Entry<Integer,Provincia> entry : provincias.entrySet() ){
			Provincia provincia = entry.getValue();
			Integer code = entry.getKey();
			System.out.println(provincia.toString());
		 }
		 */
		 ////// Libros de la biblia //////
		 System.out.println("Libros de la Biblia");
		 for(LibroBiblia biblia : getLibros()){
			 System.out.println(biblia.toString());
		 }
		 
	}

	
	private static boolean validarTarjetaCredito(){
	CCChecker checker = new CCChecker();
		
		CCCheckerSoap soapclient = checker.getCCCheckerSoap();
		String resultado = soapclient.validateCardNumber("VISA", "1234567891234567");
	
		boolean valid = false;
		valid = resultado.contains("is valid");

		return valid;
	}
	
	private static GeoIP obtenerIp(){
		
		GeoIP geoip=null;
		try {
			GeoIPService cliente = new GeoIPService();
			GeoIPServiceSoap clientesoap = cliente.getGeoIPServiceSoap();
			geoip = clientesoap.getGeoIPContext();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return geoip;
	}
	
	private static GeoIP obtenerPais(String ip){
		GeoIP geoip = null;
		
		try {
			GeoIPService cliente = new GeoIPService();
			GeoIPServiceSoap clientesoap = cliente.getGeoIPServiceSoap();
			geoip = clientesoap.getGeoIP(ip);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return geoip;
	}
	
	
	private static double obtenerPagoMesApr(double cantidadTotal, double tipoInteres, double costeExtra, double meses){
		
		double pagoMes=0.0;

		FinanceService cliente = new FinanceService();
		FinanceServiceSoap clienteSoap = cliente.getFinanceServiceSoap();
		pagoMes = clienteSoap.apr(cantidadTotal, costeExtra, tipoInteres, meses);
		return pagoMes ;
	
	}
	
	private static double obtenerAmortizacionMensual(double cantidadTotal, double valorResidual, double tipoInteres, double meses){
		double AmortizacionMensual = 0.0;
		
		try {
			FinanceService cliente = new FinanceService();
			FinanceServiceSoap clienteSoap = cliente.getFinanceServiceSoap();
			AmortizacionMensual = clienteSoap.leaseMonthlyPayment(cantidadTotal, valorResidual, tipoInteres, meses);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return AmortizacionMensual;
	}
	
	private static double obtenerCuotaMes(double cantidadTotal, double tipoInteres, double meses){
		double cuotaMes=0.0;

		try {
			FinanceService cliente = new FinanceService();
			FinanceServiceSoap clienteSoap = cliente.getFinanceServiceSoap();
			cuotaMes = clienteSoap.loanMonthlyPayment(cantidadTotal, tipoInteres, meses);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cuotaMes;
	}
private static double numeroMesesPago(double cantidadTotal, double tipoInteres, double meses){
		double numMesesPago = 0.0;

		try {
			FinanceService cliente = new FinanceService();
			FinanceServiceSoap clienteSoap = cliente.getFinanceServiceSoap();
			numMesesPago = clienteSoap.loanNumberOfPayment(cantidadTotal, tipoInteres, meses);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return numMesesPago;
		
	}


private static Map<Integer,Provincia> getProvincias(){
	Map<Integer,Provincia> provincias = null;
	
	OficinasBuzones cliente = new OficinasBuzones();
	OficinasBuzonesSoap clienteSoap = cliente.getOficinasBuzonesSoap();
	String texto = clienteSoap.consultaProvincias("");
	
	provincias = parseToMapProvincias(texto);
	
	return provincias;
	
}


private static Map<Integer, Provincia> parseToMapProvincias(String texto) {
	Map<Integer,Provincia> provincias = null;
	Provincia provincia = null;
	
	//Esta clase es la que me permite trabajar con tipos de datos XML
	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docBuilder = null;
	Document doc = null;
	try{
		docBuilder = docFactory.newDocumentBuilder();
		// Parseamos el String al XML
		doc = docBuilder.parse(new InputSource(new ByteArrayInputStream(texto.getBytes("Windows-1252"))));
		int len = doc.getElementsByTagName("provincia").getLength();
		provincias = new HashMap<Integer,Provincia>();
		
		for (int i = 0;i<len;i++){
			provincia = new Provincia();
			
			Node prov = doc.getElementsByTagName("provincia").item(i);
			
			provincia.setNombre(prov.getFirstChild().getNodeValue());
			NamedNodeMap attrs = prov.getAttributes();
			
			int codigo = Integer.parseInt(attrs.getNamedItem("id").getNodeValue());
			provincia.setCodigo(codigo);
			
			provincias.put(provincia.getCodigo(), provincia);
		}
		
		
	}catch(ParserConfigurationException e){
		e.printStackTrace();
	} catch (SAXException e) {
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return provincias;
}

private static List<LibroBiblia> getLibros(){
	List<LibroBiblia> libros = null;
	
	try {
		BibleWebservice cliente = new BibleWebservice();
		BibleWebserviceSoap clienteSoap = cliente.getBibleWebserviceSoap();
		String textoRetorno = clienteSoap.getBookTitles();
		libros = parseToListLibroBiblia(textoRetorno);
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	return libros;
}


private static List<LibroBiblia> parseToListLibroBiblia(String texto) {
	List<LibroBiblia> libros = new ArrayList<LibroBiblia>();
	
	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	try {
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = null;
		doc = docBuilder.parse(new InputSource(new ByteArrayInputStream(texto.getBytes())));
		int len = doc.getElementsByTagName("Table").getLength();
		System.out.println("Hay libros: " + len);
		for(int i= 0;i<len;i++){
			LibroBiblia biblia = new LibroBiblia();
						
			Node nodo = doc.getElementsByTagName("Table").item(i);
			NodeList nodeList = nodo.getChildNodes();
		
			biblia.setCodigo(Integer.parseInt(nodeList.item(1).getTextContent()));
			biblia.setTitulo(nodeList.item(3).getTextContent());
		
			libros.add(biblia);
		
		}
		
	} catch (ParserConfigurationException e) {
		e.printStackTrace();
	} catch (SAXException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return libros;
}


	
}
