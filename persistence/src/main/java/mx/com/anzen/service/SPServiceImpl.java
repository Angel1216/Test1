package mx.com.anzen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.anzen.bean.ParametrosSP;
import mx.com.anzen.repository.SPRepository;

/**
 * 
 * @author: Angel
 * @category: Persistencia
 * @version: 1.0 (21/02/17) 
 */
@Service
@Transactional
public class SPServiceImpl implements SPService{

	@Autowired
	private SPRepository spRepository; 
	
	
	/**
	 * Invoke a Stored Procedure (Consultas)
	 * 
	 * @param nameSP: Nombre del Stored Procedure que sera invocado en la base de datos
	 * @param parametros: Se envia una lista con los parametros de entrada que seran registrados en el SP en un objeto lista 
	 *                    con los atributos: Tipo de dato, nombre del parametro y el valor del parametro
	 *                    
	 * @return Object: Retorna un objeto generico para ser casteado al tipo de entidad que se requiera
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getQuerySP(String nombreSP, Object object) {
		
		// Invocar SP para consulta
		return spRepository.getQuerySP(nombreSP, (List<ParametrosSP>)object);
	}

	
	/**
	   * Invoke a Stored Procedure (Insercion, actualizacion y eliminacion de datos)
	   * 
	   * @param nameSP: Nombre del Stored Procedure que sera invocado en la base de datos
	   * @param parametros: Se envia una lista con los parametros de entrada que seran registrados en el SP en un objeto lista 
	   *                    con los atributos: Tipo de dato, nombre del parametro y el valor del parametro
	   *                    
	   * @return Object: Retorna un objeto generico para ser casteado al tipo de entidad que se requiera
	   */
	@SuppressWarnings("unchecked")
	@Override
	public Object getCRUDSP(String nombreSP, Object object) {

		// Invocar SP para insert, update y delete
		return spRepository.getCRUDSP(nombreSP, (List<ParametrosSP>)object);		
	}
	
}
