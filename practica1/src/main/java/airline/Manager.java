package main.java.airline;
import main.java.common.ReaderWriter;

public class Manager{
    /**
     * Genera una instacia de Aerolinea a partir de los datos
     * contenidos en el archivos "vuelos.txt"
     * 
     * @return una instancia Aerolinea con los vuelos cargados desde el archivo.
     * 
     * @throws NullPointerException una línea del archivo es nula
     * @throws ArrayIndexOutOfBoundsException una línea no tiene el número correcto de campos
     * @throws NumberFormatException el campo de id o duracion no puede convertise en número
     */
    public static Aerolinea generaAerolinea(){
        Aerolinea aerolinea = new Aerolinea();
        String[] lineas = ReaderWriter.read("vuelos.txt");
        for(String linea: lineas){
            String[] datosVuelo = linea.split(",");
            try{
                int id = Integer.parseInt(datosVuelo[0].trim());
                String origen = datosVuelo[1].trim();
                String destino = datosVuelo[2].trim();
                String fecha = datosVuelo[3].trim();
                String hora = datosVuelo[4].trim();
                int duracion = Integer.parseInt(datosVuelo[5].trim());
                Vuelo nuevoVuelo = new Vuelo(id, origen, destino, fecha, hora, duracion);
                aerolinea.agregar(nuevoVuelo);
            } catch (NullPointerException e) {
                        System.err.println("Error Null: " + linea);
            } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("Error Fuera de rango: " + linea);
            } catch (NumberFormatException e) {
                        System.err.println("Error de formato: " + linea);
            }
        }
        return aerolinea;
    }
}