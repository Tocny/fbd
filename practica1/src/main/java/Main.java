package main.java;
import main.java.airline.*;

public class Main{
    public static void main(String[] args){
        Aerolinea aerolinea = Manager.generaAerolinea();
        System.out.println("Vuelos de la aerolinea:");
        for(Vuelo vuelo: aerolinea.getVuelos()){
            System.out.println("* " + vuelo.toString());
        }
        System.out.println("\nVuelos con origen Ciudad de México:");
        for(Vuelo vuelo: aerolinea.buscaOrigen("Ciudad de México")){
            System.out.println("▣ " + vuelo.toString());
        }
        System.out.println("\nDuración promedio de todos los vuelos: " + aerolinea.duracionPromedio() + "min");
    }
}