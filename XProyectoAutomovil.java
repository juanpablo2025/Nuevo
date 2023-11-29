/*
 * Se necesita un programa que modele el concepto de un automóvil. Un automóvil
 tiene los siguientes atributos: 
A.
-Marca: el nombre del fabricante. 
-Modelo: año de fabricación. 
-Motor: volumen en litros del cilindraje del motor de un automóvil. 
-Tipo de combustible: valor enumerado con los posibles valores de gasolina, 
bioetanol, diésel, biodiésel, gas natural. 
-Tipo de automóvil: valor enumerado con los posibles valores de 
carro de ciudad, subcompacto, compacto, familiar, ejecutivo, coupé. 
-Número de puertas: cantidad de puertas.
-Cantidad de asientos: número de asientos disponibles que tiene el vehículo.
-Velocidad máxima: velocidad máxima sostenida por el vehículoen km/h.
-Color: valor enumerado con los posibles valores de blanco, negro,
rojo, naranja, amarillo, verde, azul, violeta.
-Velocidad actual: velocidad del vehículo en un momento dado.

La clase debe incluir los siguientes métodos:
B.Un constructor para la clase Automóvil donde se le pasen como parámetros 
los valores de sus atributos.
C.Métodos get y set para la clase Automóvil.
D.Métodos para ACELERAR una cierta velocidad, DESACELERAR y FRENAR 
(colocar la velocidad actual en cero). 
Es importante tener en cuenta que no se debe acelerar más allá de la velocidad máxima permitida
para el automóvil. De igual manera, tampoco es posible desacelerar a una velocidad negativa. 
Si se cumplen estos casos, se debe mostrar por pantalla los mensajes correspondientes.
E.Un método para calcular el tiempo estimado de llegada, utilizando como parámetro 
la distancia a recorrer en kilómetros. El tiempo estimado se calcula 
como el cociente entre la distancia a recorrer y la velocidad actual.
F.Un método para mostrar los valores de los atributos de un Automóvil en pantalla.
G.Un método main donde se deben crear un automóvil, colocar su velocidad actual en 100 km/h, 
aumentar su velocidad en 20 km/h, luego decrementar su velocidad en 50 km/h, 
y después frenar. 
Con cada cambio de velocidad, se debe mostrar en pantalla la velocidad actual.

 */

package com.mycompany.xproyectoautomovil;

import java.util.Scanner;

/**
 *
 * @author ATM
 */
public class XProyectoAutomovil {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Crear el objeto
        Automovil auto1 = new Automovil("",0,0,Automovil.tipoCom.GASOLINA, Automovil.tipoAuto.CIUDAD,0,0,0,Automovil.tipoColor.AMARILLO,false);
    
        ingresarDatos(sc, auto1);
        auto1.imprimir();
        
         int opcion;
    do {
        System.out.println("\nMenu:");
        System.out.println("1. Crear auto");
        System.out.println("2. Mostrar vehiculo");
        System.out.println("3. Ver velocidad actual");
        System.out.println("4. Acelerar");
        System.out.println("5. Desacelerar");
        System.out.println("6. Frenar");
        System.out.println("7. Ver multas");
        System.out.println("8. Salir");
        System.out.print("Ingrese opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> // Crear auto
                ingresarDatos(sc, auto1);
            case 2 -> {
                // Mostrar vehiculo
                if (auto1 != null) {
                    auto1.imprimir();
                } else {
                    System.out.println("Primero cree un automóvil.");
                }
                }
            case 3 -> {
                // Ver velocidad actual
                if (auto1 != null) {
                    System.out.println("Velocidad actual: " + auto1.getVelocidadActual());
                } else {
                    System.out.println("Primero cree un automóvil.");
                }
                }
            case 4 -> {
                // Acelerar
                if (auto1 != null) {
                    System.out.print("Ingrese la cantidad de aceleración: ");
                    auto1.acelerar(sc.nextInt());
                } else {
                    System.out.println("Primero cree un automóvil.");
                }
                }
            case 5 -> {
                // Desacelerar
                if (auto1 != null) {
                    System.out.print("Ingrese la cantidad de desaceleración: ");
                    auto1.desacelerar(sc.nextInt());
                } else {
                    System.out.println("Primero cree un automóvil.");
                }
                }
            case 6 -> {
                // Frenar
                if (auto1 != null) {
                    auto1.frenar();
                    System.out.println("El automovil ha frenado.");
                } else {
                    System.out.println("Primero cree un automóvil.");
                }
                }
            case 7 -> {
                // Ver multas
                if (auto1 != null) {
                    System.out.println("Tiene multas: " + auto1.tieneMultas()+" cantidad: "+auto1.TotalMultas());
                    System.out.println("Valor total de multas: " + auto1.valorTotalMultas());
                } else {
                    System.out.println("Primero cree un automóvil.");
                }
                }
            case 8 -> System.out.println("Saliendo del programa.");
            default -> System.out.println("Opción no válida. Intente de nuevo.");
        }
    } while (opcion != 8);
    sc.close();
        
        
    /*
        G.Un método main donde se deben crear un automóvil, 
        
        ***colocar su velocidad actual en 100 km/h, 
        ***aumentar su velocidad en 20 km/h, 
        ***luego decrementar su velocidad en 50 km/h, 
        ***y después frenar. 
    Con cada cambio de velocidad, se debe mostrar en pantalla la velocidad actual.
        */
        
    //***colocar su velocidad actual en 100 km/h,
    System.out.println("Vamos a iniciar la velocidad en 100km/h");
    auto1.setVelocidadActual(100);
    //aumentar su velocidad en 20 km/h
    System.out.println("Ahora vamos a AUMENTAR la velocidad en 20km/h");
    auto1.acelerar(20);
    System.out.println("Actualmente la velocidad es: "+auto1.getVelocidadActual());
    //***luego decrementar su velocidad en 50 km/h, 
    System.out.println("El automovil DECREMENTA su velocidad en 50");
    auto1.desacelerar(50);
        System.out.println("Con el decremento, la velocidad actual es: "+auto1.getVelocidadActual());
    //*y después frenar.
        System.out.println("El automovil FRENAR");
        auto1.frenar();
        System.out.println("La velocidad actual del vehiculo es :"+ auto1.getVelocidadActual());
      
              
        
    }
    public static void ingresarDatos(Scanner sc, Automovil auto1){
        String dato;
        Automovil.tipoCom tipoCombustible1 = null;
        Automovil.tipoAuto tipoAuto1 = null;
        Automovil.tipoColor tipoColor1 = null;
        
        System.out.print("Ingrese Marca:");
        auto1.setMarca(sc.next());
        System.out.print("Ingrese el modelo: ");
        auto1.setModelo(sc.nextInt());
        System.out.print("Ingrese el número de motor: ");
        auto1.setMotor(sc.nextInt());
        
        //tipoCom
        do{
        System.out.println("Ingrese el tipo de combustible GASOLINA, BIEOTANOL, "
                + "DIESEL, BIODISEL, GAS_NATURAL");
        
        dato = sc.next().toUpperCase();
        
        
        try{
            tipoCombustible1 = Automovil.tipoCom.valueOf(dato); 
            
        }catch(IllegalArgumentException e){
            System.out.println("El valor ingresado no es válido para este tipo de combustible");
            
        }
        }while(tipoCombustible1==null);
       auto1.setTipoCombustible(tipoCombustible1);
        
        //***PARA INGRESAR EL TIPO DE AUTO
        while (tipoAuto1 == null) {
            System.out.println("Ingrese el tipo de auto CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, COUPÉ : ");
            dato = sc.next().toUpperCase();

            try {
                tipoAuto1 = Automovil.tipoAuto.valueOf(dato);
            } catch (IllegalArgumentException e) {
                System.out.println("El valor ingresado no es válido para el TIPO DE AUTO ");
                tipoAuto1 = null;
            }
        }
        auto1.setTipoAutomovil(tipoAuto1);
        
        System.out.print("Ingrese el número de puertas: ");
        auto1.setNumPuertas(sc.nextInt());
        System.out.print("Ingrese la cantidad de asientos: ");
        auto1.setCantAsientos(sc.nextInt());
        System.out.print("Ingrese la velocidad máxima: ");
        auto1.setVelocidadMaxima(sc.nextInt());
        

        //*** PARA INGRESAR EL COLOR
        do {
            System.out.println("Ingrese el tipo de color BLANCO, NEGRO, ROJO,"
                    + " NARANJA, AMARILLO, VERDE, AZUL, VIOLETA");
            dato = sc.next().toUpperCase();

            try {  

                tipoColor1 = Automovil.tipoColor.valueOf(dato);

            } catch (IllegalArgumentException e) {
                System.out.println("El valor ingresado no es válido para este tipo de COLOR");
                tipoColor1 = null;
            }
        } while (tipoColor1 == null);

          auto1.setColor(tipoColor1);
        
        System.out.print("Ingrese la velocidad actual: ");
        auto1.setVelocidadActual(sc.nextInt());
        
        
        
       
        
    }
    
}
