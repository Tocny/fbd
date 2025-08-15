package main.java.airline;

public class Vuelo {

    private int id;
    private String origen;
    private String destino;
    private String fecha;
    private String hora;
    private int duracion;

    public Vuelo(int id, String origen, String destino, String fecha, String hora, int duracion) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
    }

    // Getters
    public int getId(){
        return id;
    }

    public String getOrigen() { 
        return origen; 
    }

    public String getDestino() { 
        return destino; 
    }

    public int getDuracion() { 
        return duracion; 
    }

    @Override public String toString() {
        return String.format("Vuelo #%d: %s -> %s | %s %s | %d min", 
                id, origen, destino, fecha, hora, duracion);
    }
}