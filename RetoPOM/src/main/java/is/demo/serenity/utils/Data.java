package is.demo.serenity.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Data {

    private  static ArrayList<Map<String, String>> data= new ArrayList<>();
    private  static ArrayList<Map<String, String>> data2= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
        try {
            data= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataReto.xlsx","credentials");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public static ArrayList<Map<String, String>> extractTo2(){
        try {
            data2= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataReto.xlsx","credentials");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data2;
    }

}
