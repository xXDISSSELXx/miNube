package juanpablo.com.Maquina.app;

import juanpablo.com.Maquina.dominio.MaquinaDispensadora;

public class AppMaquina {
    public static void main(String[] args) {
        MaquinaDispensadora miMaquina = new MaquinaDispensadora();

        miMaquina.agregarSnack("DeTodito",122,3000);
        miMaquina.sacarSnackPorCodigo(122);
        miMaquina.sacarSnackPorNombre("DeTodito");
        miMaquina.aumentarUnidades("DeTodito");
        miMaquina.cantidadUnidadesSnack("DeTodito");
        miMaquina.agregarSnack("popetas",24,1800);
        miMaquina.aumentarUnidades(24);
        miMaquina.aumentarUnidades(24);
        miMaquina.aumentarUnidades(24);
        miMaquina.buscarSnack("popetas");
        System.out.println(miMaquina.cantidadUnidadesSnack("popetas"));
        System.out.println(miMaquina.mostrarInventario());
        System.out.println(miMaquina.sancksAgotados());
        System.out.println(miMaquina.ordenarPorCantidad());


    }
}






















