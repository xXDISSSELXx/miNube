package juanpablo.com.Maquina.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaquinaDispensadora {
    public static final int CAPACIDAD = 12;
    private List<Snack> dispensadora;
    public MaquinaDispensadora(){
        this.dispensadora=new ArrayList<>();}



    //METODOS
    public void agregarSnack(String nombre, long codigo, int precio){
        Snack snack = new Snack(nombre, codigo,precio,0);

        if(this.dispensadora.size() <CAPACIDAD){
            if (this.buscarSnack(nombre)== null){
                if(this.buscarSnack(codigo)== null){
                    this.dispensadora.add(snack);
                }else{
                    System.out.println(" El codigo " + codigo + "esta asignado a otro producto ");
                }
            }else{
                System.out.println("La maquina dispensadora ya cuenta con: " + nombre);
            }

        }else {
            System.out.println("La maquina dispensadora ya esta llena. ");
        }
    }

    public void sacarSnackPorCodigo(long codigo){
        Snack snackBuscado= buscarSnack(codigo);
        if (snackBuscado.getUnidades() ==0){
        System.out.println("Este producto se encuentra agotado");
        } else if (snackBuscado == null) {
            System.out.println("Este producto no se encuentra en la maquina");
        }else {
            snackBuscado.setUnidades(snackBuscado.getUnidades()-1);
        }
    }

    public void sacarSnackPorNombre(String nombre){
        Snack snackBuscado= buscarSnack(nombre);
        if (snackBuscado.getUnidades() ==0){
            System.out.println("Este producto se encuentra agotado");
        } else if (snackBuscado == null) {
            System.out.println("Este producto no se encuentra en la maquina");
        }else {
            snackBuscado.setUnidades(snackBuscado.getUnidades()-1);
        }

    }
    public void aumentarUnidades(String nombre){
        Snack snackBuscado = buscarSnack(nombre);
        if(snackBuscado.getUnidades()== 6){
            System.out.println("Las unidades de " +snackBuscado.getUnidades() + "esta llena" );
        }else{
            snackBuscado.setUnidades(snackBuscado.getUnidades()+1);
            System.out.println("El snack se agrego correctamente!!");
        }
    }
    public void aumentarUnidades(long codigo){
        Snack snackBuscado = buscarSnack(codigo);
        if(snackBuscado.getUnidades()== 6){
            System.out.println("Las unidades de " +snackBuscado.getUnidades() + "esta llena" );
        }else{
            snackBuscado.setUnidades(snackBuscado.getUnidades()+1);
            System.out.println("El snack se agrego correctamente!!");
        }
    }
    public void quitarSnack(String nombre){
        //Snack snackBuscado= buscarSnack(nombre);
        this.dispensadora.removeIf(snack -> snack.getNombre()== nombre);

    }
    public int cantidadUnidadesSnack(String nombre){
        Snack snackBuscado = buscarSnack(nombre);
        if (snackBuscado == null){
            System.out.println("El producto : " +nombre+ "no esta en la maquina.");
        }else {
            System.out.println("La cantidad de unidades es: " + snackBuscado.getUnidades());
        }
        return 0;
    }
    public List<Snack> sancksAgotados(){
        List<Snack> snacksAgotados = new ArrayList<>();

        for(Snack snack : this.dispensadora){
            if(snack.getUnidades() == 0);
                snacksAgotados.add(snack);
        }
        return snacksAgotados;
    }
    public List<Snack> mostrarInventario(){
        for(Snack snack : this.dispensadora){
            System.out.println("_____SNACKS______");
            System.out.println("Nombre: " + snack.getNombre());
            System.out.println("Codigo: " + snack.getCodigo());
            System.out.println("Unidades: " + snack.getUnidades());
            System.out.println("Precio:" + snack.getPrecio()) ;
            System.out.println("_________________");
        }
        return null;
    }
    public List<Snack> ordenarPorPrecio(){
        Collections.sort(dispensadora, Comparator.comparing(Snack::getPrecio).reversed());
        return dispensadora;
    }
    public List<Snack> ordenarPorCantidad(){
        Collections.sort(dispensadora, Comparator.comparing(Snack::getUnidades));
        System.out.println(dispensadora);
        return dispensadora;

    }

    public Snack buscarSnack(String nombre){
        Snack snackBuscado= null;
        for (Snack snack: this.dispensadora) {
            if (snack.getNombre().equalsIgnoreCase(nombre)) {
                snackBuscado = snack;
            }

        }
        return snackBuscado;
    }
    public  Snack buscarSnack(long codigo){
        Snack snackBuscado= null;
        for (Snack snack: this.dispensadora){
            if (snack.getCodigo()== codigo){
                snackBuscado = snack;
            }
        }
        return snackBuscado;
    }
}
