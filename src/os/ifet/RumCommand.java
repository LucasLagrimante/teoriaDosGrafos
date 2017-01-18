/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os.ifet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RumCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Process p;
            File arquivo = new File("src\\os\\dot\\file.dot");
            try (FileWriter fw = new FileWriter(arquivo)) {
                fw.write("digraph G {\na -> b -> c;\n");
                fw.write("b -> d;\n");
                fw.write("d -> a;}\n");
                fw.flush();
            } catch (IOException ex) {
            System.out.println("Erro ao Criar Arquivo: " + ex.getMessage());
            }
            String commandLine = "dot -Tpng "+arquivo.getCanonicalPath()+" -o src\\os\\img\\file.png";

            p = Runtime.getRuntime().exec(commandLine);
            
        } catch (IOException ex) {
            System.out.println("Erro do Executar Comando: " + ex.getMessage());
        }

    }

}
