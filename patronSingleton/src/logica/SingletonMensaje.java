
package logica;

/**
 *
 * @author Cristian
 */
public class SingletonMensaje {
    
    //Sera igual dependiendo de donde se llame la variable
    static SingletonMensaje sinMensaje;
    private String mensajeUsu; 
    
    
    private SingletonMensaje(){   
    }
    
    //Regresa una instancia unica del objeto almacenada en 
    // static SingletonMensaje mensaje;

    public static SingletonMensaje getInstance(){
        
        if(sinMensaje == null){
            //Se instancia el objeto
            sinMensaje = new SingletonMensaje();       
        }   
        return sinMensaje;
    }
    
    public void SingletonMensaje(String mensajeUsu){
        this.mensajeUsu = mensajeUsu;   
    }

    public String getMensajeUsu() {
        return mensajeUsu;
    }
        
}
