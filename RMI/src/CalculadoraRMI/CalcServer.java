/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraRMI;

import java.rmi.registry.Registry;

/**
 *
 * @author Breack
 */
public class CalcServer {
    public static void main(String args[])
    {
    try{
        Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099);//Creamos el registro 
        r.rebind("Calc", new CalcRmi());
        System.out.println("Server is connected");
    }catch(Exception e){
            System.out.println("Servidor no conectado"+e);
    }
}
}
