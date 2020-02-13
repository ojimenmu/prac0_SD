package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() throws IOException {
        //TODO: put your code here
        /*Random ran = new Random();
        int numero_aleatorio = ran.nextInt(10);
        System.out.print("Enviado: ");
        System.out.println(numero_aleatorio);
        comUtils.write_int32(numero_aleatorio);*/
        comUtils.writeChar('H');

    }

    public String readTest() throws IOException {
        String result = "";
        //TODO: put your code here
        /*int result_int = comUtils.read_int32();
        System.out.print("Recibido: ");
        System.out.println(result_int);
        result = Integer.toString(result_int);
        return result;*/
        result = Character.toString(comUtils.readChar());
        System.out.print("Recibido: ");
        System.out.println(result);
        return result;
    }



}
