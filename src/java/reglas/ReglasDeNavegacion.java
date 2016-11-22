/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import java.util.Random;

/**
 *
 * @author xp
 */
public class ReglasDeNavegacion {

    /**
     * Creates a new instance of ReglasDeNavegacion
     */
    public ReglasDeNavegacion() {
    }
    /////////////  propiedad mensaje////////////////////////////////
    private String mensaje = "";

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    ///////////////// ////////////////////////////
    
    /**
     * este método chequea si el mensaje tiene
     * más de 2 caracteres
     * Si tiene menos de 2, nos llevará a una página de error
     * Si tiene dos o más, elegirá una al azar y la devolverá
     * @return 
     * devuelve el nombre de la página a la que vamos 
     */
    public String cambiaPagina(){
        if (mensaje.length() <2 ){
            return ("paginaError");
        }
        else{
            String[] resultado = {"pagina1", "pagina2", "pagina3" };
            Random r = new Random();
            return (resultado[r.nextInt(3)]);
        }
    }
    
}
