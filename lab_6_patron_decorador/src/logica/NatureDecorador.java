package logica;

/**
 * @brief Paquete decorado con Nature
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class NatureDecorador extends PaqueteDecorador{
    private double precio = 720;
    private int duracionDias = 5;
    
    public NatureDecorador(iPaquete paquete) {
        super(paquete);
    }
    
    @Override
    public String obtenerPlan() {
        return super.obtenerPlan() + obtenerAdicionesPlan();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + precio;
    }

    @Override
    public int getDuracion() {
        return super.getDuracion() + duracionDias;
    }
    /**
    * @brief Especifica las adiciones que realiza el paquete 
    * @return Cadena con los detalles adicionales del paquete
    */
    private String obtenerAdicionesPlan(){
        return "Visita al Kualoa Ranch \nVisita Maui OceanCenter \nVisita al Akaka Falls State Park\n";
    }
}
