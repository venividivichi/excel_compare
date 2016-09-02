package com.nazar.learning.excel.service;
/**
 * Created by Nazar on 22.05.2016.
 */
import org.apache.commons.lang3.StringUtils;

import com.nazar.learning.excel.models.Model;
import com.nazar.learning.excel.models.Model2;
import com.nazar.learning.excel.models.Model3;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Excel{

    private String inputFile1;

    public String getInputFile1() {
        return inputFile1;
    }

    public void setInputFile1(String inputFile1) {
        this.inputFile1 = inputFile1;
    }

    public String getInputFile2() {
        return inputFile2;
    }

    public void setInputFile2(String inputFile2) {
        this.inputFile2 = inputFile2;
    }

    private String inputFile2;

    private List<Model> models = new ArrayList<>();
    private List<Model2> models2 = new ArrayList<>();
    private List<Model3> models3 = new ArrayList<>(); //масив виведення

    private void read() throws IOException {
        File inputWorkbook = new File(inputFile1);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // получаем первый лист
            Sheet sheet = w.getSheet(0);

            for (int i = 0; i < sheet.getRows(); i++) {

                Model model = new Model();
                for (int j = 0; j < sheet.getColumns(); j++) {
                    Cell cell = sheet.getCell(j, i);

                    if (j == 0) model.setVin(cell.getContents());
                    else if (j == 1) model.setDoc(cell.getContents());
                    else if (j == 2) model.setFace_Mod(cell.getContents());
                    else if (j == 3) model.setTin(cell.getContents());
                    else if (j == 4) model.setTin_Out(cell.getContents());
                    else if (j == 5) model.setSer_Nom(cell.getContents());
                    else if (j == 6) model.setD_Rog(cell.getContents());
                    else if (j == 7) model.setName_Owner(cell.getContents());
                    else if (j == 8) model.setRegion(cell.getContents());
                    else if (j == 9) model.setC_Territ(cell.getContents());
                    else if (j == 10) model.setC_Street(cell.getContents());
                    else if (j == 11) model.setName_Street(cell.getContents());
                    else if (j == 12) model.setN_House(cell.getContents());
                    else if (j == 13) model.setHouse_Add(cell.getContents());
                    else if (j == 14) model.setN_Corp(cell.getContents());
                    else if (j == 15) model.setApartment(cell.getContents());
                    else if (j == 16) model.setNom_Znak(cell.getContents());
                    else if (j == 17) model.setMarka(cell.getContents());
                    else if (j == 18) model.setData_Vyp(cell.getContents());
                    else if (j == 19) model.setNom_Kuz(cell.getContents());
                    else if (j == 20) model.setNom_Shassi(cell.getContents());
                    else if (j == 21) model.setVol_Engine(cell.getContents());
                    else if (j == 22) model.setTyp_Tr_Zas(cell.getContents());
                    else if (j == 23) model.setTyp_Kuz(cell.getContents());
                    else if (j == 24) model.setTyp_Dll(cell.getContents());
                    else if (j == 25) model.setData_Dll(cell.getContents());
                    else if (j == 26) model.setFuel_Name(cell.getContents());
                }
                models.add(model);
            }

        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    private void read2() throws IOException {
        File inputWorkbook2 = new File(inputFile2);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook2);
            // получаем первый лист
            Sheet sheet = w.getSheet(0);

            for (int i = 0; i < sheet.getRows(); i++) {
                Model2 model2 = new Model2();
                for (int j = 0; j < sheet.getColumns(); j++) {
                    Cell cell = sheet.getCell(j, i);
                    if (j == 0) model2.setBrandAndModel(cell.getContents());
                    else if (j == 1) model2.setEngine(cell.getContents());
                    else if (j == 2) model2.setTypeFuel(cell.getContents());
                    else if (j == 3) model2.setYear(cell.getContents());
                }
                models2.add(model2);
            }
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    private void read3() {
        for (int i = 0; i < models.size(); i++) {
            Model model = models.get(i);

            for (int j = 0; j < models2.size(); j++) {
                Model2 model2 = models2.get(j);

                String stringVyp = model.getData_Vyp();
                String stringYear = model2.getYear();

                if( !NumberUtils.isNumber(stringYear) || !NumberUtils.isNumber(stringVyp) ) {
                    continue;
                }

                int year = Integer.valueOf(model2.getYear());
                int vyp = Integer.valueOf(model.getData_Vyp());

                if ( (model.getMarka().equals(model2.getBrandAndModel())) &&
                        (model.getVol_Engine().equals(model2.getEngine())) &&
                             (model.getFuel_Name().equals(model2.getTypeFuel())) &&
                                (vyp >= year) ) {
                    Model3 model3 = new Model3(model);
                    model3.setComparesing(i);
                    model3.setIdfromDB(j);
                    models3.add(model3);
                }
            }
        }

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("new sheet");

        for (int i = 0; i < models3.size(); i++) {
            HSSFRow row = sheet.createRow(i);
            Model3 model3 = models3.get(i);

                HSSFCell cell = row.createCell(0);

                cell.setCellValue(model3.getVin());
            cell = row.createCell(1);
                cell.setCellValue(model3.getDoc());
            cell = row.createCell(2);
                cell.setCellValue(model3.getFace_Mod());
            cell = row.createCell(3);
                cell.setCellValue(model3.getTin());
            cell = row.createCell(4);
                cell.setCellValue(model3.getTin_Out());
            cell = row.createCell(5);
                cell.setCellValue(model3.getSer_Nom());
            cell = row.createCell(6);
                cell.setCellValue(model3.getD_Rog());
            cell = row.createCell(7);
                cell.setCellValue(model3.getName_Owner());
            cell = row.createCell(8);
                cell.setCellValue(model3.getRegion());
            cell = row.createCell(9);
                cell.setCellValue(model3.getC_Territ());
            cell = row.createCell(10);
                cell.setCellValue(model3.getC_Street());
            cell = row.createCell(11);
                cell.setCellValue(model3.getName_Street());
            cell = row.createCell(12);
                cell.setCellValue(model3.getN_House());
            cell = row.createCell(13);
                cell.setCellValue(model3.getHouse_Add());
            cell = row.createCell(14);
                cell.setCellValue(model3.getN_Corp());
            cell = row.createCell(15);
                cell.setCellValue(model3.getApartment());
            cell = row.createCell(16);
                cell.setCellValue(model3.getNom_Znak());
            cell = row.createCell(17);
                cell.setCellValue(model3.getMarka());
            cell = row.createCell(18);
                cell.setCellValue(model3.getData_Vyp());
            cell = row.createCell(19);
                cell.setCellValue(model3.getNom_Kuz());
            cell = row.createCell(20);
                cell.setCellValue(model3.getNom_Shassi());
            cell = row.createCell(21);
                cell.setCellValue(model3.getVol_Engine());
            cell = row.createCell(22);
                cell.setCellValue(model3.getTyp_Tr_Zas());
            cell = row.createCell(23);
                cell.setCellValue(model3.getTyp_Kuz());
            cell = row.createCell(24);
                cell.setCellValue(model3.getTyp_Dll());
            cell = row.createCell(25);
                cell.setCellValue(model3.getData_Dll());
            cell = row.createCell(26);
                cell.setCellValue(model3.getFuel_Name());

            //рядок співпадіння
            cell = row.createCell(27);
                cell.setCellValue(model3.getComparesing());
        }

        //потім винесеш якшо захоч кароч)
        FileOutputStream fileOut = null;

        try {
            fileOut = new FileOutputStream("D:\\result.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            wb.write(fileOut);
            fileOut.close();
            System.out.println("Congratulation. Happy End !!! ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void process() throws IOException {
        this.read();
        this.read2();
        this.read3();
    }
}
