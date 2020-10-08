package jxl.application;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.test;

public class program {

	public static void main(String[] args) {
	
	
		test test = new test();
		try {
			List list = new ArrayList<>();
			File arquivo = new File("C:\\Users\\Betinho\\Documents\\ex.xls");

			Workbook planilha = Workbook.getWorkbook(arquivo);

		//	Sheet[] abas = planilha.getSheets();//Obtendo as Abas da planilha.
			Sheet aba = planilha.getSheet(0); // pega a primeira aba, ou seja, aba de indice 0.
		//	Cell[] linha = aba.getRow(0); // pega a primeira linha, ou seja, linhas de indice 0.
			String[][] matriz = new String[aba.getRows()][aba.getColumns()];
			
			//matriz.length -> representa as linhas da matriz
			//matriz[0].length -> pega o tamanho da linha [0], ou seja, pega o número de colunas
			
			Cell[] cel; // instancia um array de celulas que irá auxiliar no povoamento da matriz

			for (int i=0;i<matriz.length;i++) {
				cel = aba.getRow(i);
			for (int j=0;j<matriz[0].length; j++) {
					// pega os dados da celula cel[j] e adiciona na matriz
					matriz[i][j] = cel[j].getContents();
				}
			}
			for (int i=0;i<matriz.length;i++) {
				for (int j=0;j< matriz[0].length;j++) {
					//System.out.print(matriz[i][j] + "\t");
					 list = Arrays.asList(matriz[i]);
					 list = Arrays.asList(matriz[j]);
				}
			}
				        System.out.println(list);
				    
			for (int i=0;i<matriz.length;i++) {
				for (int j=0;j< matriz[0].length;j++) {
					System.out.print(matriz[i][j] + "\t");
				}
				System.out.println();
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
