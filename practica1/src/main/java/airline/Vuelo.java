package main.java.airline;

public class Vuelo {
    private int id;
    private String origen;
    private String destino;
    private String fecha;
    private String hora;
    private int duracion;
    /**
     * Consturctor de la clase vuelo
     * 
     * @param id identificador único de vuelo
     * @param origen ciudad de origen 
     * @param destino ciudad de destino
     * @param fecha fecha de salida (YYYY-MM-DD)
     * @param hora hora de salida (formato HH:mm)
     * @param duracion duracion del vuelo en minutos
     */
    public Vuelo(int id, String origen, String destino, String fecha, String hora, int duracion) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
    }
    /**
     * Obtiene el identificador de vuelo
     * 
     * @return id del vuelo
     */
    public int getId(){
        return id;
    }
    /**
     * Obtiene la ciudad de origen del vuelo
     * 
     * @return origen del vuelo
     */
    public String getOrigen() { 
        return origen; 
    }
    /**
     * Obtiene la ciudad de destino del vuelo
     * 
     * @return destino del vuelo
     */
    public String getDestino() { 
        return destino; 
    }
    /**
     * Obtiene la duración del vuelo
     * 
     * @return duración en minutos
     */
    public int getDuracion() { 
        return duracion; 
    }
    /**
     * Devuelve una representación en cadena del vuelo,
     * mostrando sus datos de manera legible
     */
    @Override public String toString() {
        return String.format("Vuelo #%d: %s -> %s | %s %s | %d min", 
                id, origen, destino, fecha, hora, duracion);
    }
}