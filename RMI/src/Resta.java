import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Resta extends Remote {
    int resta(int a,int b) throws RemoteException;
    Mensajes obtenerMensaje() throws RemoteException;
}
