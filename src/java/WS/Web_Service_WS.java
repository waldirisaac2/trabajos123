/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel-PC
 */
@WebService(serviceName = "Web_Service_WS")
public class Web_Service_WS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
     public byte[] getFicheroAdjunto(){
        
        String ruta ="D:\\1.txt";
        File file = new File(ruta);
        
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream input = new BufferedInputStream(fis);
            
            byte[] salida = new byte[(int) file.length() ];

            input.read(salida);
            input.close();
            return salida;
        } catch (IOException e) {
            return null;
        }
    /*return "Hello " + txt + " !";*/
    }
     
    public File getDirec(){
        
        String ruta ="D:\\1.txt";
        
        File file = new File(ruta);
        return file;
    }
}
