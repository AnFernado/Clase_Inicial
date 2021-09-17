public class Producto {
    private Integer id;
    private String nombre;
    private Integer cantidad;
    private String categoria;
    private double precio;
    
    public Producto (String nombre,Integer cantidad,String categoria,double precio ){
        this.id=0;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio= precio;
    }
    public Producto() {
        this.id=0;
        this.nombre = null;
        this.cantidad = 0;
        this.categoria = null;
        this.precio= 0.0;
    }

                                            //ID
    public  Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
                                            //NOMBRE
    public  String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
                                            //CANTIDAD
    public  Integer getCantidad(){
        return cantidad;
    }
    public void setCantidad(Integer cantidad){
        this.cantidad=cantidad;
    }
                                             //CATEGORIA
    public  String getCategoria(){
    return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
                                            //PRECIO
    public  double getPrecio(){
    return precio;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }
                                //no elimine ni modifique éste método
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
}