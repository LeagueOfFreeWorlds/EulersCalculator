package app;
import java.lang.Math;
import java.util.Arrays;
public class Calculation {
    // e^i = cos(1) + i*sin(1) | e^(ln(3)*i) = cos(ln(3)) + i * sin(ln(3))
    // 3^i = (e^(ln3))^i = e^(ln(3) * i)
    // double outPut[][] = {{}};
    public static void forE(double x){ //e^ix = cos(x) + isin(x)
        double resultCos = Math.cos(x); // Does the cos part of things
        double resultSin = Math.sin(x); // Does the sin part of things
        double[] result = {resultCos, resultSin}; // [cosx, isinx]
        
        System.out.println("e^i = " + result);
    }

    public static void forCos(){ // To be done 4/21/20

    }

    public static void forSin(){

    }
}