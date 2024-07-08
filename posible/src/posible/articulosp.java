/*
 la aplicacion se compondra de una clase apdre abstracta ARTICULOS  que contendra un metodo abstracto importe que permita calcular 
los costos que incluye la cantidad de articulos,
costo de fabricacion, asi como el costo de mantenimiento y costo de tranporte dependiendo del tipo de articulo.

la clase Articulo tiene como atributos: tipo de articulo( puede ser electrico, electronico o mecanico),
codigo de articulo, descripcion, cantidad, costo unitario de fabricacion y styock minimo. Constructor con parametros, los metodos getter y setter
yel metodo toString()

 */
package posible;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public abstract class  articulosp {

    public articulosp(String tipoart, String codart, String descrip, int cant, double costou, int stockm) {
        this.tipoart = tipoart;
        this.codart = codart;
        this.descrip = descrip;
        this.cant = cant;
        this.costou = costou;
        this.stockm = stockm;
    }

    public String getTipoart() {
        return tipoart;
    }

    public String getCodart() {
        return codart;
    }

    public String getDescrip() {
        return descrip;
    }

    public int getCant() {
        return cant;
    }

    public double getCostou() {
        return costou;
    }

    public int getStockm() {
        return stockm;
    }

    @Override
    public String toString() {
        return "articulosp{" + "tipoart=" + tipoart + ", codart=" + codart + ", descrip=" + descrip + ", cant=" + cant + ", costou=" + costou + ", stockm=" + stockm + '}';
    }
    
    
    
    
    public abstract void importe();
    
    private String tipoart, codart, descrip;
    private int cant;
    private double costou;
    private int  stockm;
}
