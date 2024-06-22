public class Producto {

    private String articulo,precio,descripcion,codigo,talla,marca,color;


    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Producto()
    {

    }

    public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
        this.articulo = articulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }


    @Override
    public String toString() {
        return
                "articulo: " + articulo + "\n"+
                "precio:" + precio + "\n" +
                "descripcion: " + descripcion + "\n" +
                "codigo: " + codigo + "\n" +
                "talla: " + talla + '\n' +
                "marca: " + marca + '\n' +
                "color: " + color + '\n';
    }
}
