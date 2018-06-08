/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Breack
 */
public class CalcRmi extends UnicastRemoteObject implements CalcInterface{
    public CalcRmi()throws RemoteException
    {
        double a,b;
    }
    public double suma(double a, double b)throws RemoteException
    {
        return a+b;
    }
    public double resta(double a, double b)throws RemoteException
    {
        return a-b;
    }
    public double mult(double a, double b)throws RemoteException
    {
        return a*b;
    }
    public double div(double a, double b)throws RemoteException
    {
        return a/b;
    }
    public double seno(double a)throws RemoteException
    {
        return Math.sin(a);
    }
    public double coseno(double x)throws RemoteException
    {
        return Math.cos(x);
    }
    public double tangente(double x)throws RemoteException
    {
        return Math.tan(x);
    }
    public double cotangente(double x)throws RemoteException
    {
        return (1/Math.tan(x));
    }
    public double secante(double x)throws RemoteException
    {
        return (1/Math.cos(x));
    }
    public double cosecante(double x)throws RemoteException
    {
        return (1/Math.sin(x));
    }
    public double logs(double x)throws RemoteException
    {
        return Math.log(x);
    }
    public double raiz(double x)throws RemoteException
    {
        return Math.sqrt(x);
    }
    public double expo(double x)throws RemoteException
    {
        return Math.exp(x);
    }
    
}
