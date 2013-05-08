package br.com.genericnfe.tools;

import java.util.List;

/**
 *
 * @author jpribeiro
 */
public class ImplodeArray {

    /**
     * Método para juntar elementos de um array de String
     * @author Hendrik Will, imwill.com
     * @param inputArray Array contendo as Strings
     * @param glueString String colocada entre os elementos
     * @return String contendo todos elementos do array separados por glueString
     */
    public String implodeArray(String[] inputArray, String glueString) {
        String output = "";

        if (inputArray.length > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(inputArray[0]);

            for (int i = 1; i < inputArray.length; i++) {
                sb.append(glueString);
                sb.append(inputArray[i]);
            }

            output = sb.toString();
        }

        return output;
    }
    
    public String implodeArray(List<String> inputArray, String glueString) {
        String output = "";

        if (inputArray.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(inputArray.get(0).toString());

            for (int i = 1; i < inputArray.size(); i++) {
                sb.append(glueString);
                sb.append(inputArray.get(i).toString());
            }

            output = sb.toString();
        }

        return output;
    }
}
