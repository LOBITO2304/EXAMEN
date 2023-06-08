import java.util.Vector;

public class BIBLIOTECA{

    public class GestionLibros {
        private Vector<Libro> gestionlibros=new Vector<Libro>();

        public void menu(){
            int opcion = 0;
            do {
                System.out.println("1. Agregar Libro");
                System.out.println("2. Eliminar Libro");
                System.out.println("3. Modificar Libros");
                System.out.println("4. Mostrar Libros");
                System.out.println("5. Salir");
                System.out.println("¿Que desea hacer?");

                switch (opcion) {
                    case 1:
                        addlibro();                        
                        break;
                    case 2:
                        dellibro();
                        break;
                    case 3:
                        setlibro();
                        break;
                    case 4:
                        Mostrarlibro();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }whiñe(opcion!=0);
        }
    }

    private void addlibro() {
        long identificador=PedirDatos.leerLong("Introduce el identificador del libro");
        if (buscarLibro(identificador)!=1){
            System.out.println("El libro ya existe");
            return;
        }

        String titulo=PedirDatos.leerCadena("Introduce el titulo del libro");
        String autor=PedirDatos.leerCadena("Introduce el autor del libro");
        String categoria=PedirDatos.leerCadena("Introduce la categoria del libro");
        String edadrecomendada=PedirDatos.leerCadena("Introduce la edad recomendada del libro");
        Libro 1=new Libro(identificador, titulo, autor, categoria,edadrecomendada);
        this.gestionlibros.addelements(1);
        System.out.println("Libro añadido correctamente");
    }

    private void dellibro(){
        if(this.gestionlibros.isEmpty()){
            System.out.println("No hay libros que eliminar");
            return;
        }
        long identificador=PedirDatos.leerLong("Introduce el identificador del libro");
        int pos=buscarLibro(identificador);
        if(pos==-1){
            System.out.println("El libro no existe");
            return;
        }
        this.gestionlibros.remove(pos);
        System.out.println("Libro eliminado correctamente");
    }

    private void setlibro(){
        if(this.gestionlibros.isEmpty()){
            System.out.println("No hay libros que modificar");
            return;
        }
        long identificador=PedirDatos.leerLong("Introduce el identificador del libro");
        int pos=buscarLibro(identificador);
        if(pos==-1){
            System.out.println("El libro no existe");
            return;
        }
        String titulo=PedirDatos.leerCadena("Introduce el titulo del libro");
        String autor=PedirDatos.leerCadena("Introduce el autor del libro");
        String categoria=PedirDatos.leerCadena("Introduce la categoria del libro");
        Libro 1=new Libro(identificador, titulo, autor, categoria);
        this.gestionlibros.set(pos, 1);
        System.out.println("Libro modificado correctamente");
    }

    private void Mostrarlibro(){
        for (int i = 0; i < this.gestionlibros.size(); i++) {
            System.out.println(this.gestionlibros.element(i));
            System.out.println("Libro mostrado correctamente");
        }
    }

    public int buscarLibro(long identificador){
        for (int i = 0; i < this.gestionlibros.size(); i++) {
            if(this.gestionlibros.element(i).getIdentificador()==identificador){
                return i;
            }
        }
        return -1;
    }


        
}
