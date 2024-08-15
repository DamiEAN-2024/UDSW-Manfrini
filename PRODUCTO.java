
import java.io.*;
import java.util.*;

/**
 * 
 */
public class PRODUCTO {

    /**
     * Default constructor
     */
    public PRODUCTO() {
    }

    /**
     * 
     */
    public int código;

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public TipoProducto tipo;

    /**
     * 
     */
    public Date fechaExpiración;

    /**
     * 
     */
    public String fabricante;

    /**
     * 
     */
    public int cantidadInventario;

    /**
     * 
     */
    public float precioUnitario;

    /**
     * @return
     */
    public int getCódigo() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public TipoProducto getTipo() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Date getFechaExpiración() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getFabricante() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getCantidadInventario() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public float getPrecioUnitario() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param código 
     * @return
     */
    public void setCódigo(int código) {
        // TODO implement here
        return null;
    }

    /**
     * @param nombre 
     * @return
     */
    public void setNombre(String nombre) {
        // TODO implement here
        return null;
    }

    /**
     * @param tipo 
     * @return
     */
    public void setTipo(TipoProducto tipo) {
        // TODO implement here
        return null;
    }

    /**
     * @param fechaExpiración 
     * @return
     */
    public void setFechaExpiración(Date fechaExpiración) {
        // TODO implement here
        return null;
    }

    /**
     * @param fabricante 
     * @return
     */
    public void setFabricante(String fabricante) {
        // TODO implement here
        return null;
    }

    /**
     * @param cantidadInventario 
     * @return
     */
    public void setCantidadInventario(int cantidadInventario) {
        // TODO implement here
        return null;
    }

    /**
     * @param precioUnitario
     */
    public void setPrecioUnitario(float precioUnitario) {
        // TODO implement here
    }

    /**
     * 
     */
    public enum TipoProducto {
        LACTEO,
        CÁRNICO,
        FRUTA,
        ENLATADO
    }

}