//package hello;
	
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
	
public class Server implements Resta {
	
    public Server() {}

    public int suma(int a, int b) throws RemoteException {
	return a+b;
    }
    public int resta(int a, int b) throws RemoteException {
	return a-b;
    }
    public int multiplica(int a, int b)throws RemoteException{
        return a*b;
    }
    public int divide(int a, int b)throws RemoteException{
        return a/b;
    }
    public Mensajes obtenerMensaje(){
         Mensajes men = new Mensajes("Hola que hace",1);
         return men;
     }
    public static void main(String args[]) {
	try {
		 java.rmi.registry.LocateRegistry.createRegistry(1099); //puerto default del rmiregistry
		 System.out.println("RMI registry ready.");
	  } catch (Exception e) {
		 System.out.println("Exception starting RMI registry:");
		 e.printStackTrace();
	  }//catch
	
	try {
		System.setProperty("java.rmi.server.codebase","http://8.25.100.18/clases/"); ///file:///f:\\redes2\\RMI\\RMI2
	    Server obj = new Server();
	    Resta stub = (Resta) UnicastRemoteObject.exportObject(obj, 0);

	    // Bind the remote object's stub in the registry
	    Registry registry = LocateRegistry.getRegistry();
	    registry.bind("Resta", stub);
            

	    System.err.println("Servidor listo...");
	} catch (Exception e) {
	    System.err.println("Server exception: " + e.toString());
	    e.printStackTrace();
	}
    }
}
