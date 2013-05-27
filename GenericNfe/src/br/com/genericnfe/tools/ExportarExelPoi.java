package br.com.genericnfe.tools;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;

/**
 *
 * @author jsoliveira
 */
public class ExportarExelPoi {

    public void layoutCaderneta() {

        HSSFWorkbook wb = new HSSFWorkbook();

        HSSFSheet sheet = wb.createSheet("Planilha"); //Cria a Tabela

        HSSFRow row = sheet.createRow((short) (10));  //Linha

        HSSFCell cell = row.createCell(5);  //Colunas

        cell.setCellValue("Alinhe isto!");

        row = sheet.createRow((short) (11));

        cell = row.createCell(5);
        cell.setCellValue("Teste");


    }

    public static void main(String[] args) throws IOException {


        HSSFWorkbook wb = new HSSFWorkbook();

        HSSFSheet sheet = wb.createSheet("Planilha"); //Cria a Tabela

        HSSFRow row = sheet.createRow((short) (10));  //Linha

        HSSFCell cell = row.createCell(5);  //Colunas

        cell.setCellValue("Alinhe isto!");

        row = sheet.createRow((short) (11));

        cell = row.createCell(5);
        cell.setCellValue("Teste");


        HSSFCellStyle estilo = wb.createCellStyle();

        estilo.setAlignment(HSSFCellStyle.ALIGN_CENTER);

        //Adicionando bordas

        estilo.setBorderBottom(HSSFCellStyle.BORDER_DASHED);

        estilo.setBottomBorderColor(HSSFColor.BLACK.index);

        estilo.setBorderLeft(HSSFCellStyle.BORDER_DOTTED);

        estilo.setLeftBorderColor(HSSFColor.GREEN.index);

        estilo.setBorderRight(HSSFCellStyle.BORDER_THIN);

        estilo.setRightBorderColor(HSSFColor.BLUE.index);

        estilo.setBorderTop(HSSFCellStyle.BORDER_MEDIUM_DASHED);

        estilo.setTopBorderColor(HSSFColor.BLACK.index);

        cell.setCellStyle(estilo);

        FileOutputStream fileOut = new FileOutputStream("C:/Users/jsoliveira/Desktop/testeExel/eeeee.xls");

        wb.write(fileOut);

        fileOut.close();



    }
}
