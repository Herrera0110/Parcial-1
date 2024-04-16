import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short zapatillas_Yeezy = 35, zapatillas_Jordan = 15, Botas_Timberland = 8, Chancletas_Crocs = 20, Zapatos_Escolares = 36;
        boolean R = true;

        System.out.println("Bienvenido a la aplicacion de gestion de inventario de 'Calsados Chris'");

        while (R) {
            System.out.println("Escriba '1' para ingresar informacion sobre algun producto");
            System.out.println("Escriba '2' para calcular la cantidad de inventario de un producto disponible");
            System.out.println("Escriba '3' para determinar si hay suficiente stock para una venta");
            System.out.println("Escriba '4' duplicar el inventario inicial de un producto agotado");
            System.out.println("Escriba '5' mostrar la informacion actualizada del inventario");
            short i = sc.nextShort();

            switch (i) {
                case 1:
                    System.out.println("seleccione '1' para ingresar informacion sobre Zapatillas Yeezy");
                    System.out.println("seleccione '2' para ingresar informacion sobre Zapatillas Jordan");
                    System.out.println("seleccione '3' para ingresar informacion sobre Botas Timberland");
                    System.out.println("seleccione '4' para ingresar informacion sobre Chancletas Crocs");
                    System.out.println("seleccione '5' para ingresar informacion sobre Zapatos Escolares");
                    short l = sc.nextShort();
                    sc.nextLine();
                    switch (l) {
                        case 1, 2, 4, 5, 3:
                            System.out.println("Ingrese la informacion sobre el producto");
                            sc.nextLine();
                            break;
                        default:
                            System.out.println("Por favor, ingrese una opcion valida");
                    }
                    break;
                case 2:
                    System.out.println("Escriba '1' para actualizar el inventario del producto Zapatillas Yeezy");
                    System.out.println("Escriba '2' para actualizar el inventario del producto Zapatillas Jordan");
                    System.out.println("Escriba '3' para actualizar el inventario del producto Chancletas Crocs");
                    System.out.println("Escriba '4' para actualizar el inventario del producto Botas Timberland");
                    System.out.println("Escriba '5' para actualizar el inventario del producto Zapatos Escolares");
                    short e = sc.nextShort();
                    switch (e) {
                        case 1:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            short var = sc.nextShort();
                            zapatillas_Yeezy -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam "+ zapatillas_Yeezy + " pares disponibles");
                            break;
                        case 2:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            zapatillas_Jordan -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedan " + zapatillas_Jordan + " pares disponibles");
                            break;
                        case 3:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            Chancletas_Crocs -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam " + Chancletas_Crocs + " pares disponibles");
                            break;
                        case 4:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            Botas_Timberland -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam " + Botas_Timberland + " pares disponibles");
                            break;
                        case 5:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            Zapatos_Escolares -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam " + Zapatos_Escolares + " pares disponibles");
                            break;
                        default:
                            System.out.println("Por favor,escriba una opcion valida");

                    }
                    break;
                case 3:
                    System.out.println("Escriba '1' para revisar el inventario del producto Zapatillas Yeezy");
                    System.out.println("Escriba '2' para revisar el inventario del producto Zapatillas Jordan");
                    System.out.println("Escriba '3' para revisar el inventario del producto Chancletas Crocs");
                    System.out.println("Escriba '4' para revisar el inventario del producto Botas Timberland");
                    System.out.println("Escriba '5' para revisar el inventario del producto Zapatos Escolares");
                    short o = sc.nextShort();
                    switch (o) {
                        case 1:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            short var2 = sc.nextShort();
                            if (var2 > zapatillas_Yeezy) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > zapatillas_Jordan) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > Chancletas_Crocs) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > Botas_Timberland) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > Zapatos_Escolares) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        default:
                            System.out.println("Por favor, ingrese una opcion valida");
                    }
                    break;
                case 4:
                    System.out.println("Escriba '1' para revisar el inventario del producto Zapatillas Yeezy");
                    System.out.println("Escriba '2' para revisar el inventario del producto Zapatillas Jordan");
                    System.out.println("Escriba '3' para revisar el inventario del producto Chancletas Crocs");
                    System.out.println("Escriba '4' para revisar el inventario del producto Botas Timberland");
                    System.out.println("Escriba '5' para revisar el inventario del producto Zapatos Escolares");
                    short u = sc.nextShort();
                    switch (u) {
                        case 1:
                            if (zapatillas_Yeezy == 0) {
                                zapatillas_Yeezy = 60;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 2:
                            if (zapatillas_Jordan == 0) {
                                zapatillas_Jordan = 24;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 3:
                            if (Botas_Timberland == 0) {
                                Botas_Timberland = 10;System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 4:
                            if (Chancletas_Crocs == 0) {
                                Chancletas_Crocs = 30;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 5:
                            if (Zapatos_Escolares == 0) {
                                Zapatos_Escolares = 100;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        default:
                            System.out.println("Por favor, ingrese una opcion valida");
                    }
                    break;
                case 5:
                    System.out.println("Cantidad de pares de 'Zapatillas Nike' disponible: "+zapatillas_Yeezy);
                    System.out.println("Cantidad de pares de 'Zapatillas Adidas' disponible: "+zapatillas_Jordan);
                    System.out.println("Cantidad de pares de 'Tacones Chanel' disponible: "+Chancletas_Crocs);
                    System.out.println("Cantidad de pares de 'Dr. Martens' disponible: "+Botas_Timberland);
                    System.out.println("Cantidad de pares de 'Crocs' disponible: "+Zapatos_Escolares);
                    break;
                default:
                    System.out.println("Por favor, ingrese un numero valido");
            }

            System.out.println("Desea realizar otra consulta? (y/n): ");
            char a = sc.next().charAt(0);
            if (a == 'n') {R = false;}
        }
    }
}