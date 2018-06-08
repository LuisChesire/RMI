package CalculadoraRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Breack
 */
public interface CalcInterface extends Remote { /*declaracion de la interfaz y las funciones que se implementaran :D :3*/
    public double suma(double x, double y) throws RemoteException;  //Case1
    public double resta(double x, double y)throws RemoteException;   //Case2
    public double mult(double x, double y)throws RemoteException;    //Case3
    public double div(double x, double y)throws RemoteException; //Case4
    public double seno(double x)throws RemoteException; //Case5
    public double coseno(double x)throws RemoteException;   //Case6
    public double tangente(double x)throws RemoteException; //Case7
    public double cotangente(double x)throws RemoteException;   //Case8
    public double secante(double x)throws RemoteException;  //Case9
    public double cosecante(double x)throws RemoteException;    //Case10
    public double logs(double x)throws RemoteException; //Case11
    public double raiz(double x)throws RemoteException; //Case12
    public double expo(double x)throws RemoteException; //Case13
}
