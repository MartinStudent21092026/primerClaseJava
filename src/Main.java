import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
/*
        int numero = 7;
        final double pi = 3.14;
        String cadena = "CEI";
        boolean siono = false;
        enum RazasPerros {YORHSHIRE, CHUCHO, PASTOR_ALEMAN, CHIHUAHUA}
        RazasPerros raza = RazasPerros.CHIHUAHUA;
        System.out.println(raza);


        String n1 = "45";
        Integer numero1 = Integer.valueOf(n1);
        System.out.println(numero1);

        int n1=8;
        int n2=9;
        int resultado = n1+n2;


        int n1=8;
        int n2=9;

        int resultado = n1+n2;

        boolean n1 =true;
        boolean n2 =false;
        boolean rest = n1^n2;
        int n1 = 71;
        int n2 = 8;
        double suma = (double)n1/n2;  respuesta en decimal
        System.out.println(resultado);



     */
        distancia();

    }

    public static void ejercicio1() {
        int n1 = 35;
        int n2 = 7;
        System.out.println("El resultado de la operación " + n1 + "+" + n2 + " es " + (n1 + n2));
        System.out.println("El resultado de la operación " + n1 + "-" + n2 + " es " + (n1 - n2));
        System.out.println("El resultado de la operación " + n1 + "x" + n2 + " es " + (n1 * n2));
        System.out.println("El resultado de la operación " + n1 + "/" + n2 + " es " + (n1 / n2));
    }

    public static void ejercicio2() {
        //formula de conversion
        //(30 °C × 9 / 5) + 32 = 86 °F
        double temperatura = 45.56;
        double medida = 5;
        final double pies = 3280.84;
        final double km_millas = 1.609;
        double moneda = 40;
        double euro_libras = 0.86;
        double euro_dolar = 1.14;
        //Mostrar por consola un mensaje que diga “<X> <unidad> es equivalente a <Y> <unidad>”.
        //De grados Celsius (ºC) a grados Fahrenheit (ºF)
        //De kilómetros (km) a pies (ft), millas (m), etc.
        //De euros (EUR) a libras esterlinas (GBP), dólares estadounidenses (USD), etc.


        System.out.println(temperatura + " Celcius es equivalente a " + ((temperatura * 9 / 5) + 32) + " Fahrenheit");
        System.out.println(medida + " kilómetros es equivalente a " + (medida * pies) + " pies");
        System.out.println(medida + " kilómetros es equivalente a " + (medida / km_millas) + " millas");
        System.out.println(medida + " kilómetros es equivalente a " + (medida * 1000) + " metros");
        System.out.println(moneda + " euros es equivalente a " + (moneda * euro_libras) + " libras esterlinas");
        System.out.println(moneda + " euros es equivalente a " + (moneda * euro_dolar) + " dólares estadounidenses");

    }

    public static void ejercicio3() {
        double nt1 = 8;
        double nt2 = 7;
        double nt3 = 6;
        double nt4 = 5;
        double ntm = (nt1 + nt2 + nt3 + nt4) / 4;
        boolean aprobado = ntm > 5;
        /*
         * Hacer un programa que calcule la media entre 4 notas cualesquiera, y calcule si el alumno ha aprobado o no
         * (si la nota media es mayor o igual a 5).
         * Mostrar por consola un mensaje que diga “La nota media es <X>. El alumno ha aprobado: <true/false>”.
         * */
        System.out.println("La nota media es " + ntm + ". El alumno ha aprobado: " + aprobado);
    }

    public static void ejercicio4() {
        int n1 = 11;
        boolean par = n1 % 2 == 0;
        /*
         * Hacer un programa que muestre si un número es par. Recuerda que un número es par si al
         * dividirlo por 2 el resto es 0.
         * Mostrar por consola un mensaje que diga “El número <X> es par: <true/false>”.
         * */
        System.out.println("El número " + n1 + " es par: " + par);
    }

    public static void ejercicio5() {
        /*
         * Hacer un programa que muestre si un número está dentro de un rango de valores
         * , por ejemplo, entre 0 y 10. Mostrar por consola un mensaje que diga
         *  “El número <X> está entre <A> y <B>: <true/false>”.
         * */
        int n1 = 5;
        System.out.println("El número " + n1 + " está entre 0 y 10:" + (n1 > 0 && 10 > n1));
    }

    public static void ejercicio6() {
        /*
         * Hacer un programa que determine si un número es múltiplo de 3, 5 y/o 7.
         *  Recuerda que un número A es múltiplo de B si al dividir A entre B el resto es 0.
         *  Mostrar por consola varios mensajes que digan “El número <A> es múltiplo de <B>: <true/false>”.
         * */
        int n1 = 120;
        boolean m_3 = n1 % 3 == 0;
        boolean m_5 = n1 % 5 == 0;
        boolean m_7 = n1 % 7 == 0;
        System.out.println("El número " + n1 + " es múltiplo de " + 3 + " :" + m_3);
        System.out.println("El número " + n1 + " es múltiplo de " + 5 + " :" + m_5);
        System.out.println("El número " + n1 + " es múltiplo de " + 7 + " :" + m_7);
    }

    public static void ejercicio7() {
        /*
        * Hacer un programa que haga varios cálculos geométricos, por ejemplo:
          -Dado el lado de un cuadrado, calcular su perímetro y área
          -Dada la base y la altura de un triángulo, calcular su área
          Dado el radio de un círculo, calcular su perímetro y área
          Dados los catetos de un triángulo rectángulo, calcular la hipotenusa
          Consejo: la raíz cuadrada se calcula con Math.sqrt(<X>).

        * */
        double lc = 5;
        double lcp = 5 * 4;
        double lca = Math.pow(lc, 2);
        double tb = 7;
        double ta = 8;
        double tar = tb * ta / 2;
        double cr = 6;
        double cp = 2 * Math.PI * cr;
        double ca = Math.PI * Math.pow(cr, 2);
        double tca = 7;
        double tcb = 8;
        double hipo = Math.sqrt(Math.pow(7, 2) + Math.pow(8, 2));

        System.out.println("El lado de un cuadrado es " + lc + ", su perímetro es " + lcp + " y área es " + lca);
        System.out.println("La base es " + tb + " y la altura es " + ta + " de un triangulo, su aréa es " + tar);
        System.out.println("El radio de un círculo es " + cr + ", su perímetro es " + cp + " y área " + ca);
        System.out.println("los catetos de un triángulo rectángulo son " + tca + " y " + tcb + ", la hipotenusa es " + hipo);


    }

    public static void ejercicio8() {
      /*
      * Hacer un programa que imprima por consola la factura de un producto concreto.
      *  El producto tendrá un nombre, un precio unitario, un número de unidades y un impuesto.
      *  El programa debe calcular el subtotal y el precio total. El resultado debería ser similar al siguiente:
        Producto: <Nombre producto>
        Precio unitario: <Precio unitario> euros
        Unidades: <Unidades> uds.
        Subtotal: <Precio total sin impuestos> euros
        Impuestos: <Impuestos>%
        Precio total: <Precio total con impuestos> euros
      * */
        String nproduct = "Sandia";
        double precio = 1.40;
        int u = 5;
        double subtotal = precio * u;
        final double IMPUESTO = 21;
        double total = subtotal * 121 / 100;
        System.out.println("Producto: " + nproduct);
        System.out.println("Precio: " + precio + "€");
        System.out.println("Unidades: " + u + " uds");
        System.out.println("Subtotal: " + subtotal + " euros");
        System.out.println("Impuesto: " + IMPUESTO + "%");
        System.out.println("Precio total: " + total + "€");
    }

    public static void ejercicio9() {
        /*Hacer un programa que, dado un número total de segundos,
         imprima por consola el número equivalente de horas, minutos,
         y segundos. Por ejemplo: dados 3672 segundos, el programa imprimiría “1 hora,
          1 minuto y 12 segundos”.*/
        int segundos = 3672;
        int minutos = (segundos % 3600) / 60;
        int horas = segundos / 3600;
        int fsegundos = segundos % 60;

        System.out.println("3672 segundos son " + horas + " horas, " + minutos + " minutos, " + fsegundos + " segundos.");


    }

    public static void imc(){
        double peso = 75.6;
        double altura = 1.82;
        double imc = peso/(altura*altura);
        boolean pesoNormal = imc>=18.5;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("IMC: "+df.format(imc)+" saludable: "+pesoNormal);

    }

    public static void bisiesto(){
        int anyo = 2026;
        boolean bisiesto = anyo %4 ==0 && anyo %100!=0;
        System.out.println("El año" +anyo+" es bisiesto: "+bisiesto);
    }

    public static void distancia(){
        int x1 = 7;
        int y1 = 8;
        int x2 = 9;
        int y2 = 10;
        int cat1 = x2 - x1;
        int cat2 = y2 - y1;
        double hip = Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2));
        System.out.println("La distancia entre ("+x1+","+y1+") y ("+x2+","+y2+") es "+hip);
    }
    public static void pruebas(){


    }
}