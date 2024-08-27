package exercises;

import java.math.BigInteger;

public class TableOfBinaryOctalAndHexadecimalNumbers {
    public static void main(String[] args) {
        String numeroDecimal = "10";
        String numeroBinario = new BigInteger(numeroDecimal).toString(2);
        String numeroOctal = new BigInteger(numeroDecimal).toString(8);
        String numeroHexadecimal = new BigInteger(numeroDecimal).toString(16);
        System.out.println("Número em Decimal: " + numeroDecimal);
        System.out.println("Número em Binario: " + numeroBinario);
        System.out.println("Número em Octal: " + numeroOctal);
        System.out.println("Número em Hexadecimal: " + numeroHexadecimal);

        for (int i = 1; i <= 257; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Número em Decimal: " + numeroDecimal);
            System.out.println("Número em Binario: " + numeroBinario);
            System.out.println("Número em Octal: " + numeroOctal);
            System.out.println("Número em Hexadecimal: " + numeroHexadecimal);
            System.out.println();
            numeroDecimal = String.valueOf(i);
            numeroBinario = new BigInteger(numeroDecimal).toString(2);
            numeroOctal = new BigInteger(numeroDecimal).toString(8);
            numeroHexadecimal = new BigInteger(numeroDecimal).toString(16);
        }
    }
}
