package com.test.texto;

import java.io.BufferedReader;
import java.io.FileReader;

import com.test.validation.ExpresionesRegulares;


public class TextReader {
	
	public void readText(String ruta){
		
		// ER
		ExpresionesRegulares validar = new ExpresionesRegulares();
		
	    FileReader fr = null;
	    BufferedReader br = null;
	    //Cadena de texto donde se guardara el contenido del archivo
	    String contenido = "";
	    try
	    {
	        //ruta puede ser de tipo String o tipo File
	        //si usamos un File debemos hacer un import de esta clase
	        //File ruta = new File( "/home/usuario/texto.txt" );
	        fr = new FileReader( ruta );
	        br = new BufferedReader( fr );
	  
	        String linea;
	        //Obtenemos el contenido del archivo linea por linea
	        while( ( linea = br.readLine() ) != null )
	        {
//	        	validar.validarCorreo(linea);
	            contenido += linea + "\n";
	        }
	 
	    }catch( Exception e ){  }
	    //finally se utiliza para que si todo ocurre correctamente o si ocurre
	    //algun error se cierre el archivo que anteriormente abrimos
	    finally
	    {
	        try{
	            br.close();
	        }catch( Exception ex ){
	        	
	        	System.out.println( ex.getMessage() );
	        }
	    }
	    //Se imprime el contenido
	    System.out.println(contenido);
	}
	
	
	public static void main(String[] args){
		
		TextReader readerText = new TextReader();
		String ruta = "/home/angel/CargaArchivo/TEF_NAT_5_LayoutC";
		
		readerText.readText(ruta);
		
	}
	
}
