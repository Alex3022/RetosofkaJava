package com.alex.Ejercicio8;

import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) {
        String[][] actores = new String[10][7]; // almacenamos los actores
        int puntero = 0;
        int opcion;
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("****** GESTIÓN DE ACTORES *******");
            System.out.println("1-NUEVA ACTOR.");
            System.out.println("2-BUSCAR ACTOR.");
            System.out.println("3-ELIMINAR ACTOR.");
            System.out.println("4-MODIFICAR ACTOR.");
            System.out.println("5-VER TODOS LOS ACTORES.");
            System.out.println("6-BUSCAR ACTORES POR FILTRO.");
            System.out.println("7-SALIR");
            System.out.println("*********************************");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    if (puntero < 10) {
                        actores[puntero] = nuevoActor();
                        puntero++;
                    }
                    break;
                case 2:
                    buscarActor(actores, puntero);
                    break;
                case 3:
                    eliminarActor(actores, puntero);
                    puntero--;
                    break;
                case 4:
                    modificarActor(actores, puntero);
                    break;
                case 5:
                    mostrarActores(actores, puntero);
                    break;
                case 6:
                    buscarActoresFiltro(actores, puntero);
                    break;
                case 7:
                    return;
            }
        }
    }

    public static String[] nuevoActor() {
        Scanner entradaNuevoActor = new Scanner(System.in);
        String[] actor = new String[7];
        System.out.println("Ingrese el nombre del actor:");
        actor[0] = entradaNuevoActor.nextLine();
        System.out.println("Ingrese el apellido del actor:");
        actor[1] = entradaNuevoActor.nextLine();
        System.out.println("Ingrese la identificación del actor:");
        actor[2] = entradaNuevoActor.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del actor(año-mes-día)");
        actor[3] = entradaNuevoActor.nextLine();
        actor[4] = "" + (2022 - Integer.parseInt(actor[3].substring(0, 4)));
        System.out.println("Ingrese la bebida favorita del actor:");
        actor[5] = entradaNuevoActor.nextLine();
        System.out.println("Ingrese el color favorito del actor:");
        actor[6] = entradaNuevoActor.nextLine();
        return actor;
    }

    public static void buscarActor(String[][] actores, int puntero) {
        String identificacion;
        Scanner entradaBusquedaActor = new Scanner(System.in);
        System.out.println("Ingrese la identificacion a buscar: ");
        identificacion = entradaBusquedaActor.nextLine();
        for (int i = 0; i < puntero; i++) {
            if (identificacion.equals(actores[i][2])) {
                for (int j = 0; j < actores[i].length; j++) {
                    System.out.print(actores[i][j] + " ");
                }
                System.out.println();
                return;
            }
        }
        System.out.println("No se encontro al actor con identificacion " + identificacion);
    }

    public static void eliminarActor(String[][] actores, int puntero) {
        Scanner entrada = new Scanner(System.in);
        String eliminar;
        int aux = 0;
        boolean existe = false;
        System.out.println("Ingrese la identificacion del actor a eliminar");
        eliminar = entrada.next();
        for (int i = 0; i < puntero; i++) {
            if (eliminar.equals(actores[i][2])) {
                existe = true;
                aux = i;
                break;
            }
        }

        for (int i = aux; i < puntero - 1; i++) {
            actores[i] = actores[i + 1];
        }
    }

    public static void modificarActor(String[][] actores, int puntero) {

        int punteroModificar = 0;
        String identificacion;
        int opcionModificar;
        boolean encontrado = false;
        Scanner entradaModificarActor = new Scanner(System.in);
        System.out.println("Ingrese la identificación del actor a modificar");
        identificacion = entradaModificarActor.nextLine();

        for (int i = 0; i < puntero; i++) {
            if (identificacion.equals(actores[i][2])) {
                encontrado = true;
                punteroModificar = i;
            }
        }


        while (encontrado) {
            System.out.println("****** MODIFICAR ACTOR **********");
            System.out.println("1-MODIFICAR NOMBRE.");
            System.out.println("2-MODIFICAR APELLIDO.");
            System.out.println("3-MODIFICAR IDENTIFICACIÓN");
            System.out.println("4-MODIFICAR FECHA DE NACIMIENTO");
            System.out.println("5-MODIFICAR BEBIDA FAVORITA");
            System.out.println("6-MODIFICAR COLOR FAVORITO");
            System.out.println("7-RETORNAR AL MENÚ PRINCIPAL");
            System.out.println("*********************************");
            opcionModificar = entradaModificarActor.nextInt();
            switch (opcionModificar) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre: ");
                    identificacion = entradaModificarActor.next();
                    actores[punteroModificar][0] = identificacion;
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo apellido: ");
                    actores[punteroModificar][1] = entradaModificarActor.next();
                    break;
                case 3:
                    System.out.println("Ingrese la nueva identificación: ");
                    actores[punteroModificar][2] = entradaModificarActor.next();
                    break;
                case 4:
                    System.out.println("Ingrese la nueva fecha de nacimiento: ");
                    actores[punteroModificar][3] = entradaModificarActor.next();
                    actores[punteroModificar][4] = "" + (2022 - Integer.parseInt(actores[punteroModificar][3].substring(0, 4)));
                    break;
                case 5:
                    System.out.println("Ingrese la nueva bebida favorita: ");
                    actores[punteroModificar][5] = entradaModificarActor.next();
                    break;
                case 6:
                    System.out.println("Ingrese el nuevo color favorito: ");
                    actores[punteroModificar][6] = entradaModificarActor.next();
                    break;
                case 7:
                    return;
            }
        }

        System.out.println("No se encontro al actor");
    }

    public static void mostrarActores(String[][] actores, int puntero) {
        for (int i = 0; i < puntero; i++) {
            System.out.print((i + 1) + ". ");
            for (int j = 0; j < actores[i].length; j++) {
                System.out.print(actores[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void buscarActoresFiltro(String[][] actores, int puntero) {

        Scanner entrada = new Scanner(System.in);
        int opcionBuscarFiltro;
        String busqueda;


        while (true) {
            System.out.println("*****BUSCAR ACTORES POR FILTROS*****");
            System.out.println("1-BUSCAR POR NOMBRE.");
            System.out.println("2-BUSCAR POR APELLIDO.");
            System.out.println("3-BUSCAR POR IDENTIFICACION");
            System.out.println("4-BUSCAR POR FECHA DE NACIMIENTO.");
            System.out.println("5-BUSCAR POR BEBIDA FAVORITA.");
            System.out.println("6-BUSCAR POR COLOR FAVORITO.");
            System.out.println("7-RETORNAR AL MENÚ PRINCIPAL");
            opcionBuscarFiltro = entrada.nextInt();
            switch (opcionBuscarFiltro) {
                case 1:
                    System.out.println("Ingrese el nombre a buscar");
                    busqueda = entrada.next();
                    for (int i = 0; i < puntero; i++) {
                        if (actores[i][0].equals(busqueda)) {
                            System.out.println(
                                    actores[i][0] + "\t" +
                                            actores[i][1] + "\t" +
                                            actores[i][2] + "\t" +
                                            actores[i][3] + "\t" +
                                            actores[i][4] + "\t" +
                                            actores[i][5] + "\t" +
                                            actores[i][6] + "\t"
                            );
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el apellido a buscar");
                    busqueda = entrada.next();
                    for (int i = 0; i < puntero; i++) {
                        if (actores[i][1].equals(busqueda)) {
                            System.out.println(
                                    actores[i][0] + "\t" +
                                            actores[i][1] + "\t" +
                                            actores[i][2] + "\t" +
                                            actores[i][3] + "\t" +
                                            actores[i][4] + "\t" +
                                            actores[i][5] + "\t" +
                                            actores[i][6] + "\t"
                            );
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la identificacion a buscar");
                    busqueda = entrada.next();
                    for (int i = 0; i < puntero; i++) {
                        if (actores[i][2].equals(busqueda)) {
                            System.out.println(
                                    actores[i][0] + "\t" +
                                            actores[i][1] + "\t" +
                                            actores[i][2] + "\t" +
                                            actores[i][3] + "\t" +
                                            actores[i][4] + "\t" +
                                            actores[i][5] + "\t" +
                                            actores[i][6] + "\t"
                            );
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la fecha de nacimiento a buscar");
                    busqueda = entrada.next();
                    for (int i = 0; i < puntero; i++) {
                        if (actores[i][3].equals(busqueda)) {
                            System.out.println(
                                    actores[i][0] + "\t" +
                                            actores[i][1] + "\t" +
                                            actores[i][2] + "\t" +
                                            actores[i][3] + "\t" +
                                            actores[i][4] + "\t" +
                                            actores[i][5] + "\t" +
                                            actores[i][6] + "\t"
                            );
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese la bebida a buscar");
                    busqueda = entrada.next();
                    for (int i = 0; i < puntero; i++) {
                        if (actores[i][5].equals(busqueda)) {
                            System.out.println(
                                    actores[i][0] + "\t" +
                                            actores[i][1] + "\t" +
                                            actores[i][2] + "\t" +
                                            actores[i][3] + "\t" +
                                            actores[i][4] + "\t" +
                                            actores[i][5] + "\t" +
                                            actores[i][6] + "\t"
                            );
                        }
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el color a buscar");
                    busqueda = entrada.next();
                    for (int i = 0; i < puntero; i++) {
                        if (actores[i][6].equals(busqueda)) {
                            System.out.println(
                                    actores[i][0] + "\t" +
                                            actores[i][1] + "\t" +
                                            actores[i][2] + "\t" +
                                            actores[i][3] + "\t" +
                                            actores[i][4] + "\t" +
                                            actores[i][5] + "\t" +
                                            actores[i][6] + "\t"
                            );
                        }
                    }
                    break;
                case 7:
                    return;
            }
        }

    }

}
