package main.java.airline;

import java.util.ArrayList;
import java.util.List;

public class Aerolinea{

    private List<Vuelo> vuelos;

    public Aerolinea(){
        vuelos = new ArrayList<>();
    }

    public void agregar(Vuelo vuelo){
        vuelos.add(vuelo);
    }

    public List<Vuelo> buscaOrigen(String origen){
        
        List<Vuelo> encontrados = new ArrayList<>();
        
        for(Vuelo vuelo: vuelos){
            if(vuelo.getOrigen().equals(origen)){
                encontrados.add(vuelo);
            }
        }
        return encontrados;
    }

    public double duracionPromedio(){

        if(vuelos.size() == 0){
            return 0;
        }

        double duracionesTotales = 0;

        for(Vuelo vuelo: vuelos){
            duracionesTotales += vuelo.getDuracion();
        }

        return duracionesTotales / vuelos.size();

    }

    public List<Vuelo> getVuelos(){
        return vuelos;
    }

}