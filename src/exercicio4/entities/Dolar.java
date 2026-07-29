package exercicio4.entities;

public class Dolar {
    
    public static double currencyConverter(double dolar, double quant) {
        return dolar * quant + (quant * 6 / 100);
    }
}
