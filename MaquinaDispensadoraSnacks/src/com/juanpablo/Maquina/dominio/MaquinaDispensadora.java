package com.juanpablo.Maquina.dominio;

import java.util.List;

public class MaquinaDispensadora {
    public static final int CAPACIDAD = 12;
    private List<Snack> dispensadora;



    //METODOS
    public void agregarSnack(String nombre, long codigo, int precio){
        Snack snack = new Snack(nombre, codigo,precio,0);

        if(this.dispensadora.size() <CAPACIDAD){
            if (this.buscarSnack(nombre)== null){
                this.dispensadora.add(snack);

            }else{
                System.out.println("La maquina dispensadora ya cuenta con: " + nombre);
            }

        }else {
            System.out.println("La maquina dispensadora ya esta llena. ");
        }
    }

    public void sacarSnackPorCodigo(long codigo){

    }

    public void sacarSnackPorNombre(String nombre){

    }
    public void aumentarUnidades(String nombre){

    }
    public void aumentarUnidades(long codigo){

    }
    public void quitarSnack(String nombre){

    }
    public int cantidadUnidadesSnack(String nombre){
        return 0;

    }
    public List<Snack> sancksAgotados(){
        return null;
    }
    public List<Snack> mostrarInventario(){
       return null;
    }
    public List<Snack> ordenarPorPrecio(){
        return null;
    }
    public List<Snack> ordenarPorCantidad(){
        return null;
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
