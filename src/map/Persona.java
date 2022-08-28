package map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persona {
    public static void main(String[] args){
        Engine engine1 = new Engine("Unreal",8);
        Engine engine2 = new Engine("Unity",9);
        Lenguaje lenguaje1 = new Lenguaje("C++", "Microsoft", 10);
        List<Engine> engine = new ArrayList<>();
        List<Lenguaje> lenguaje = new ArrayList<>();
        engine.add(engine1);
        engine.add(engine2);
        lenguaje.add(lenguaje1);
        List<String> nomEngine = engine.stream().map(nom -> nom.getNombre()).collect(Collectors.toList());
        //List<Engine> lengAEngine = engine.stream().map(version -> version.)
        System.out.println(nomEngine);
        //1 mayuscula, 1 minuscula, 1 numero minimo
        String password = "Cristian199";
        char clave;
        byte  contNumero = 0, contLetraMay = 0, contLetraMin=0;
        for (byte i = 0; i < password.length(); i++) {
            clave = password.charAt(i);
            String passValue = String.valueOf(clave);
            if (passValue.matches("[A-Z]")) {
                contLetraMay++;
            } else if (passValue.matches("[a-z]")) {
                contLetraMin++;
            } else if (passValue.matches("[0-9]")) {
                contNumero++;
            }
        }
        System.out.println("Cantidad de letras mayusculas:"+contLetraMay);
        System.out.println("Cantidad de letras minusculas:"+contLetraMin);
        System.out.println("Cantidad de numeros:"+contNumero);
    }
}
