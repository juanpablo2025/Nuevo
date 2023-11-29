/*
 * 
 */
package com.mycompany.xproyectoautomovil;

/**
 *
 * @author ATM
 * 
 * 
 */
public class Automovil {
    private String marca;
    private int modelo;
    private int motor;
    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISEL, GAS_NATURAL};
    private tipoCom tipoCombustible;
    enum tipoAuto {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, COUPE};
    private tipoAuto tipoAutomovil;
    private int numPuertas;
    private int cantAsientos;
    private int velocidadMaxima;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA};
    private tipoColor color;
    private int velocidadActual=0;
    
    
    
    
    
    private boolean automatico;
    private int valorMultas = 0; 
    private int cantidadMultas =0;

    
    //PUNTO B.

    public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoAuto tipoAutomovil, int numPuertas, int cantAsientos, int velocidadMaxima, tipoColor color, boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.cantAsientos = cantAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        
        
        
        this.automatico = automatico;
    }



    
    //PUNTO C.

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoAuto getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(tipoAuto tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

  
    
    //PUNTO D.
    
    public void acelerar (int incrementoVelocidad){
        if((velocidadActual + incrementoVelocidad) <=velocidadMaxima){
            velocidadActual = velocidadActual + incrementoVelocidad;
        }else
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida");
         valorMultas += 100;
         cantidadMultas+=1;
    }
    
    public void desacelerar (int decrementoVelocidad){
        if((velocidadActual - decrementoVelocidad) >0){
            velocidadActual -= decrementoVelocidad;
        }else
            System.out.println("No se puede desacelerar a una velocidad negativa");
    }
    
    public void frenar() {
        velocidadActual = 0;
    }
    
    // PUNTO E. 
       
    public double calcularTiempoLlegada(int distanciaRecorrida){
        double tiempo = distanciaRecorrida/velocidadActual;
        return tiempo;
    }
    
    //PUNTO F.
    public void imprimir(){
        System.out.println("****** IMPRIMIR ***********");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Motor: "+motor);
        System.out.println("Tipo Combustible: "+tipoCombustible);
        System.out.println("Tipo automovil: "+tipoAutomovil);
        System.out.println("Numero de puertas: "+numPuertas);
        System.out.println("Cantidad asientos: "+cantAsientos);
        System.out.println("Velocidad máxima en Km: "+velocidadMaxima);
        System.out.println("Color: "+color);
        System.out.println("Velocidad actual en Km: "+velocidadActual);
        
        
        
        
         System.out.println("Automatico: "+automatico);
         System.out.println("Valor total en multas: "+valorMultas);
         System.out.println("Cantidad de multas: "+cantidadMultas);
         System.out.println("*********** FIN IMPRIMIR ********");
        
    }
   
    public boolean tieneMultas() {
    return valorMultas > 0;
}

// Método para obtener el valor total de las multas
public int valorTotalMultas() {
    return valorMultas;
}
public int TotalMultas() {
    return cantidadMultas;
}

}
