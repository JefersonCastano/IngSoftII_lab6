package logica;

/**
 * Fabrica que se encarga de instanciar ProductRepository o cualquier otro que
 * se cree en el futuro.
 *
 * @author Libardo, Julio
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia iPaquete
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción iPaquete
     */
    public iPaquete getPaquete(String type) {

        iPaquete result = null;
        iPaquete paqueteBase = new PaqueteBase();
        switch (type) {
            case "Paquete Base":
                result = paqueteBase;
                break;
            case "Paquete Pear Harbor":
                result = new PearlHarborDecorador(paqueteBase);
                break;
            case "Paquete Nature":
                result = new NatureDecorador(paqueteBase);
                break;
            case "Paquete Amazing Hawaii":
                result = new AmazingHawaiiDecorador(paqueteBase);
                break;
            
        }

        return result;

    }
}
