import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArchivoServicio {

    private ProductoServicio productoServicio;

    public void cargarDatos() throws Exception {

        File file = new File("src/file/ProductosImportados.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String lineaLeida;
        while((lineaLeida = bufferedReader.readLine())!=null)
        {
            System.out.println(lineaLeida);
            String [] valores = lineaLeida.split(",");
            String articulo = valores[0];
            String precio = valores[1];
            String descripcion = valores[2];
            String codigo = valores[3];
            String talla = valores[4];
            String marca = valores[5];
            String color = valores[6];
            Producto producto = new Producto(articulo,precio,descripcion,codigo,talla,marca,color);
            productoServicio.agregarProducto(producto);



        }

    }
}
