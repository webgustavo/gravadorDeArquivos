import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Gravador {

    public static void main(String args[]) {
        try {

            FileOutputStream arquivo = new FileOutputStream("c:/arquivos/teste.txt");
            PrintWriter pr = new PrintWriter(arquivo);

            pr.println("texto1");
            pr.println("texto1");
            pr.println("texto1");

            pr.close();
            arquivo.close();
        } catch (Exception e) {

            System.out.println("erro ao ler ");

            //pr.close();
            //arquivo.close();
        }
    }

}