package logica;

/**
 * @brief Paquete decorado con Pearl Harbor
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class PearlHarborDecorador extends PaqueteDecorador{
    
    private double precio = 653;
    private int duracionDias = 2;
    
    public PearlHarborDecorador(iPaquete paquete) {
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
        return "Visita al museo Pearl Harbor \nVisita al palacio Iolani \nVisita al museo Bishop \nVisita al USS Arizona Memorial\n";
    }
}
