package logica;

/**
 * @brief Paquete decorado con Amazing Hawaii
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class AmazingHawaiiDecorador extends PaqueteDecorador{
    private double precio = 931;
    private int duracionDias = 3;
    
    public AmazingHawaiiDecorador(iPaquete paquete) {
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
        return "Escalar en el Waipio Valley \nSurfear en las playas Waikiki o Hanalei Bay \nBucear en Hanauma Bay \n";
    }
}
