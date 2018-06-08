/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraRMI;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Breack
 */
public class CalcCliente {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            int repeat = 0;
            CalcInterface c = (CalcInterface)Naming.lookup("//localhost/Calc");
            do
            {
                System.out.println("*****************WELCOME******************");
                System.out.println("     Select an operation of the list ;)   ");
                System.out.println("1.- Suma");
                System.out.println("2.- Resta");
                System.out.println("3.- Multiplicacion");
                System.out.println("4.- Divicion");
                System.out.println("5.- Sen");
                System.out.println("6.- Cos");
                System.out.println("7.- Tan");
                System.out.println("8.- Cot");
                System.out.println("9.- Sec");
                System.out.println("10.- Cosec");
                System.out.println("11.- Log");
                System.out.println("12.- Raiz");
                System.out.println("13.- Exponencial");
            
                System.out.print("OPCION: ");
                int Opcion=sc.nextInt();
            
                double a, b;
                double x;
       
                switch(Opcion)
                {
                    case 1://suma
                    {
                        System.out.println("Introduza elemento a:");
                        a=sc.nextDouble();
                        System.out.println("Introduza elemento b:");
                        b=sc.nextDouble();
                        System.out.println(" La suma de "+a+" y "+b+" es: "+ c.suma(a,b));
                        break;
                    }
                    case 2://resta
                    {
                        System.out.println("Introduza elemento a:");
                        a=sc.nextDouble();
                        System.out.println("Introduza elemento b:");
                        b=sc.nextDouble();
                        System.out.println("La resta de "+a+" y de "+b+" es: "+ c.resta(a,b));
                        break;
                    }
                    case 3://multiplicacion
                    {
                        System.out.println("Introduza elemento a:");
                        a=sc.nextDouble();
                        System.out.println("Introduza elemento b:");
                        b=sc.nextDouble();
                        System.out.println("La Multiplicacion de "+a+"y de "+b+" es: "+ c.mult(a,b));
                        break;
                    }
                    case 4: //divicion
                    {
                        System.out.println("Introduza elemento a:");
                        a=sc.nextDouble();
                        System.out.println("Introduza elemento b:");
                        b=sc.nextDouble();
                        System.out.println(" La divicion de "+a+" entre "+b+" es:"+ c.div(a,b));
                        break;
                    }
                    case 5://Sen(X)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Sen("+x+") es:" + c.seno(x));
                        break;
                    }
                    case 6://Cos(X)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Cos("+x+") es:" + c.coseno(x));
                    break;    
                    }
                    case 7://Tan(X)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Tan("+x+") es:" + c.tangente(x));
                    break;    
                    }
                    case 8://Ctan(x)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Ctan("+x+") es:" + c.cotangente(x));
                    break;    
                    }
                    case 9://Sec(X)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Sec("+x+") es:" + c.secante(x));
                    break;    
                    }
                    case 10://Csec(X)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Csec("+x+") es:" + c.cosecante(x));
                    break;    
                    }
                    case 11://Log(x)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Log("+x+") es:" + c.logs(x));
                    break;    
                    }
                    case 12://Sqrt(x)
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Sqrt("+x+") es:" + c.raiz(x));
                    break;    
                    }
                    case 13://Exp
                    {
                        System.out.println("Introduza el argumento:");
                        x=sc.nextDouble();
                        System.out.println(" Exponencial("+x+") es:" + c.expo(x));
                    break;    
                    }
                }//Fin del Switch
                System.out.println("Deseas hacer otra operacion?");
                System.out.println("1.- Si");
                System.out.println("2.- No");
                repeat=sc.nextInt();
                
            }while(repeat==1);
            System.out.println("ByBye!!!!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
