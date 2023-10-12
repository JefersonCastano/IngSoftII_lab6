package logica;

/**
 * @brief Interfaz para un paquete
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public interface iPaquete {
    /**
    * @brief Especifica detalles de lo que incluye el paquete
    * @return Cadena con los detalles del paquete
    */
    public String obtenerPlan ();
    /**
    * @brief Permite obtener el precio del paquete
    * @return Precio del paquete
    */
    public double getPrecio ();
    /**
    * @brief Permite obtener la duracion del paquete
    * @return Duracion del paquete
    */
    public int getDuracion();
}
