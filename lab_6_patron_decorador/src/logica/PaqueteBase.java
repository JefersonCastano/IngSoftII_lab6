package logica;

/**
 * @brief Un paquete con caracteristicas basicas
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class PaqueteBase implements iPaquete{

    
    private double precioBase = 7000; //Precio del paquete base
    private int duracionDias = 5; //Duracion del paquete base
    
    @Override
    public String obtenerPlan() {
        return "Tiquetes aereos \nHotel en habitacion estandar \nAlimentacion \nVuelta a la isla \nRecepcion con lei hawaiano y camiseta de Millonarios \n";
    }

    @Override
    public double getPrecio() {
        return precioBase;
    }

    @Override
    public int getDuracion() {
        return  duracionDias;
    } 
}
