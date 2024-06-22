import java.util.ArrayList;

public class ProductoServicio {

    private ArrayList<Producto> listaProductos;

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto producto)
    {
        listaProductos.add(producto);
    }

    public void listarProductos()
    {
        /*
        for (int i = 0; i < listaProductos.size() ; i++) {

            System.out.println(listaProductos.get(i));

        }
        */
        for (Producto producto:listaProductos)
        {
            System.out.println(producto);
        }
    }

}
