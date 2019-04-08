package ua.lviv.iot.manager;

import ua.lviv.iot.models.BabyShop;
import ua.lviv.iot.manager.ManagerImplementation;
/*
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
*/

import java.io.*;
import java.util.List;

import static ua.lviv.iot.models.BabyShop.*;

public class BabyShopWriter {
    public static void writeToFile(List<BabyShop> kidGoodsList) throws IOException {

        File babyShopFile = new File("babyshop.csv");


        try (FileOutputStream fileOutputStream = new FileOutputStream(babyShopFile);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            bufferedWriter.write("BabyShop File");
            bufferedWriter.newLine();
            for (BabyShop good : kidGoodsList) {
                bufferedWriter.write(good.getHeaders());
                bufferedWriter.newLine();
                bufferedWriter.write(good.toCSV());
                bufferedWriter.newLine();
            }
        }

        System.out.println("This shit is working");
        //      kidGoodsList.stream().forEachOrdered(good -> bufferedWriter.write(kidGoodsList.getHeaders()););


        //       System.out.println("File was written successfully");
    }
}