package xyz.arantes.edu.lista1.utils;

public class Checker {

    public static boolean isInt(String v){
        try{
            int s = Integer.parseInt(v);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
