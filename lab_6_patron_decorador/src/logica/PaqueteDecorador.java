package logica;

/**
 * @brief Clase abstracta de un paquete decorador
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public abstract class PaqueteDecorador implements iPaquete{
    
    protected iPaquete paquete; //Referencia al wrapped object 
    
    public PaqueteDecorador (iPaquete paquete){
        this.paquete = paquete;
    }
    
    @Override
    public String obtenerPlan() {
        return paquete.obtenerPlan();
    }

    @Override
    public double getPrecio() {
        return paquete.getPrecio();
    }

    @Override
    public int getDuracion() {
        return paquete.getDuracion();
    }
    
}
