public class Main {
    public static int metodoSumar(int a, int b){
        return a + b;
    }

    public static void main(String[] args){


        //Primer ejemplo
        try{
            int a = 5;
            int b = 0;
            int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir un entero por 0");
        }

        //segundo ejemplo
        try{
            int a[] = new int[5];
            System.out.println(a[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El indice esta fuera de rango");
        }
/*
        //tercer ejemplo
        try{
            String s = "Hola mundo!";
            crearSaludo(s);
        }
        catch(NoSuchMethodException e){
            System.out.println("No existe el metodo indicado para el string");
        }
*/
        //Cuarto ejemplo
        try {
            String a = null;
            System.out.println(a.charAt(2));
        }
        catch(NullPointerException e){
            System.out.println("El objeto que se intenta llamar es nulo");
        }

        //Quinto ejemplo
        try{
            int a = 10;
            int b = -11;
            System.out.println(metodoSumar(a, b));
            if(b < 0){
                throw new IllegalArgumentException("El valor no puede ser negativo");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Argumentos no validos");
        }
    }
}

