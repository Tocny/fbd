package main.java.airline;

import java.util.ArrayList;
import java.util.List;

public class Aerolinea{

    private List<Vuelo> vuelos;


    /**
     * Consturctor de la aerolínea
     * Se inicializa como lista de vuelos vacía
     */
    public Aerolinea(){
        vuelos = new ArrayList<>();
    }


    /**
     * Agrega un vuelo a la aerolínea
     * 
     * @param vuelo el vuelo a agregar
     */
    public void agregar(Vuelo vuelo){
        vuelos.add(vuelo);
    }

    /**
     * Busca los vuelos con origen específico a buscar.
     * 
     * @param origen ciudad de origen de los vuelos a buscar
     * @return lista de vuelos cuyo origen coincide
     */
    public List<Vuelo> buscaOrigen(String origen){
        
        List<Vuelo> encontrados = new ArrayList<>();
        
        for(Vuelo vuelo: vuelos){
            if(vuelo.getOrigen().equals(origen)){
                encontrados.add(vuelo);
            }
        }
        return encontrados;
    }

    /**
     * Calcula la duración promedio de todos los vuelos de la aerolínea
     * 
     * @return duracion de todos los vuelos o 0 en caso de no existir vuelos
     */
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

    /**
     * Regresa la lista de todos los vuelos de la aerolínea
     * 
     * @return lista de vuelos
     */
    public List<Vuelo> getVuelos(){
        return vuelos;
    }

}