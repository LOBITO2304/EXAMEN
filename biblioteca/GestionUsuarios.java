package biblioteca;

import java.util.Vector;

public class GestionUsuarios {

    private Vector <Usuario> gestionusuarios=new Vector<Usuario>();

    public void menu(){
        int opcion=0;

        do{
            System.out.println("1. Añadir usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Modificar usuarios");
            System.out.println("4. Mostrar usuarios");
            System.out.println("0. Salir");
            opcion=PedirDatos.leerEntero("¿Que desea hacer?");
            switch (opcion) {
                case 1:
                    addUsuario();
                    break;
                case 2:
                    delUsuario();
                    break;
                case 3:
                    setUsuario();
                    break;
                case 4:
                    mostrarUsuarios();
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal");
                    break;
            
                default:
                    System.out.println("Opciones entre el 0 y el 4");
                    break;
            }
        }while(opcion!=0);
    }

    private void addUsuario(){
        long codusuario=PedirDatos.leerEntero("Introduce el codigo del usuario");
        if (buscarUsuario(codusuario)!=-1) {
            System.out.println("El usuario ya existe");
            return;
        }
        String nombre=PedirDatos.leerCadena("Introduce el nombre del usuario");
        String apellido1=PedirDatos.leerCadena("Introduce el primer apellido del usuario");
        String apellido2=PedirDatos.leerCadena("Introduce el segundo apellido del usuario");
        String fechaNacimiento=PedirDatos.leerCadena("Introduce la fecha de nacimiento del usuario");
        String dni = PedirDatos.leerCadena("Introduce el dni del usuario");
        Usuario u=new Usuario(codusuario, nombre, apellido1, apellido2, fechaNacimiento, dni);
        this.gestionusuarios.addElement(u);
        System.out.println("Usuario añadido correctamente");


    }

    private void delUsuario(){
        if (this.gestionusuarios.isEmpty()) {
            System.out.println("No hay usuarios");
            return;
        }
        long codusuario=PedirDatos.leerEntero("Introduce el codigo del usuario");
        int pos=buscarUsuario(codusuario);
        if (pos==-1) {
            System.out.println("El usuario no existe");
            return;
        }
        this.gestionusuarios.remove(pos);
        System.out.println("Usuario eliminado correctamente");
    }

    private void setUsuario(){
        if (this.gestionusuarios.isEmpty()) {
            System.out.println("No hay usuarios");
            return;
        }
        long codusuario=PedirDatos.leerEntero("Introduce el codigo del usuario");
        int pos=buscarUsuario(codusuario);
        if (pos==-1) {
            System.out.println("El usuario no existe");
            return;
        }
        System.out.println("Los datos del usuario con el codigo "+codusuario+" son:");
        System.out.println(this.gestionusuarios.elementAt(pos));
        String nombre=PedirDatos.leerCadena("Introduce el nuevo nombre del usuario");
        String apellido1=PedirDatos.leerCadena("Introduce el nuevo primer apellido del usuario");
        String apellido2=PedirDatos.leerCadena("Introduce el nuevo segundo apellido del usuario");
        String fechaNacimiento=PedirDatos.leerCadena("Introduce la nueva fecha de nacimiento del usuario");
        String dni = PedirDatos.leerCadena("Introduce el nuevo dni del usuario");
        Usuario u=new Usuario(codusuario, nombre, apellido1, apellido2);
        this.gestionusuarios.setElementAt(u, pos);
        System.out.println("Usuario modificado correctamente");
    }

    private void mostrarUsuarios(){
        for (int i = 0; i < this.gestionusuarios.size(); i++) {
            System.out.println(this.gestionusuarios.elementAt(i));
            System.out.println("-------------------------------");
        }
    }

    public int buscarUsuario(long codusuario){
        for (int i = 0; i <this.gestionusuarios.size();i++){
            if(this.gestionusuarios.elementAt(i).gestionusuarios==codusuario){
                return i;
            }
        }
        return -1;
    }
}

