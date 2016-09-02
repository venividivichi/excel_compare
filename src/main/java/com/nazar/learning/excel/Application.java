package com.nazar.learning.excel;

import com.nazar.learning.excel.service.Excel;
import java.io.IOException;


public class Application {
    public static void main(String[] args) throws IOException {
        Excel test = new Excel();
        test.setInputFile1("D:/test2.xls");
        test.setInputFile2("D:/test1.xls");

        test.process();
    }
}
