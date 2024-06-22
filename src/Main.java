//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Producto producto =
               new Producto("polera Polo","3000","polera de algodón","8s8sj","L","Nike","blanca"); //objeto vacio
        //System.out.println(producto);

        ArchivoServicio archivoServicio = new ArchivoServicio();
        archivoServicio.cargarDatos();



    }
}