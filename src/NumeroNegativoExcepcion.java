import javax.swing.*;

public class NumeroNegativoExcepcion extends Exception{

    public NumeroNegativoExcepcion(){}
    public NumeroNegativoExcepcion(String mensaje){
        super(mensaje);
    }

    public static void main(String[] args) throws NumeroNegativoExcepcion {
        int valor= Integer.parseInt(JOptionPane.showInputDialog("valor para calcular la raiz cuadarada"));

        try {
            if (valor<0){
                throw new NumeroNegativoExcepcion("el valor es negativo");
            }
            System.out.println(Math.sqrt(valor));

        }catch(NumeroNegativoExcepcion e){
            System.out.println(e.getMessage());
        }


    }
}
