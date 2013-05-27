package br.com.genericnfe.tools;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Banco;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jsoliveira
 */
public class BancoDeDados {

    private Conexao c;

    public BancoDeDados() {

        //Banco.setBanco(1);
        c = new Conexao();

    }

    public void importarDropTable(ArrayList<String> drop) {
        try {
            FileReader arq = new FileReader("C:/Users/jsoliveira/Documents/GitHub/GenericNfe/GenericNfe/Banco/SCRIPT_DROP_BANCO.sql");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                drop.add(linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.",
                    e.getMessage());
        }
    }

    public void importarCreateTable(ArrayList<String> c) {



        try {
            FileReader arq = null;

            switch (Banco.getBanco()) {

                case 0:
                    arq = new FileReader("C:/Users/jsoliveira/Documents/GitHub/GenericNfe/GenericNfe/Banco/SCRIPT_BANCO_ORACLE.sql");
                    break;

                case 1:
                    arq = new FileReader("C:/Users/jsoliveira/Documents/GitHub/GenericNfe/GenericNfe/Banco/SCRIPT_BANCO_POSTGRESSQL.sql");
                    break;
            }

            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            StringBuilder create = new StringBuilder();
            while (linha != null) {

                create.append(linha).append("\n");


                if (linha.indexOf(";") != -1) {
                    // System.out.println(create.toString());
                    c.add(create.toString());
                    create = new StringBuilder();
                }

                // lê da segunda até a última linha
                linha = lerArq.readLine();

            }
            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.",
                    e.getMessage());
            c = new ArrayList<String>();
        }
    }

    public void deletarTabelas() {

        ArrayList<String> al = new ArrayList<String>();

        importarDropTable(al);

        for (int i = 0; i < al.size(); i++) {

            c.executeUpdate(al.get(i).replace(";", " "));

        }

    }

    public void criarTabelas() {

        ArrayList<String> al = new ArrayList<String>();

        importarCreateTable(al);

        for (int i = 0; i < al.size(); i++) {

            c.executeUpdate(al.get(i).replace(";", " "));

        }
    }

    public static void main(String[] args) {


       BancoDeDados b = new BancoDeDados();

       b.deletarTabelas();
       b.criarTabelas();





    }
}
