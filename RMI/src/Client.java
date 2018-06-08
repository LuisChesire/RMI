//package hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {

	String host = (args.length < 1) ? null : args[0];
	try {
		
	    Registry registry = LocateRegistry.getRegistry(host);	
//tambi�n puedes usar getRegistry(String host, int port)
	    
	    Resta stub = (Resta) registry.lookup("resta");
	    int x=5,y=4;
	    int response = stub.resta(x,y);
            Mensajes mensaje= stub.obtenerMensaje();
            System.out.println("Mensaje: "+ mensaje.m+" v: "+mensaje.v);
	    
	    System.out.println("respuesta resta "+x+" y "+y+" : " + response);
	} catch (Exception e) {
	    System.err.println("Client exception: " + e.toString());
	    e.printStackTrace();
	}
    }
}
