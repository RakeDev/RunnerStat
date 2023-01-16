package org.example;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@Component
public class ResultsProcessor {
    public List <Runner> getRunners(String distance, String sex) throws IOException {
//        try(BufferedReader buf = new BufferedReader(new FileReader("csvHome.txt")){
           try( Scanner sc = new Scanner(new File("C:\\Users\\hacer\\MavenProjects\\SpringPracByProductStarDz\\src\\main\\resources\\csvHome.txt"))){
               sc.useDelimiter("\\A");
               String result = sc.hasNext() ? sc.next() : "";
               List<Runner>runners = convertCsvToRunner(result);
               return runners.stream()
                       .filter((r)->r.getDistance().equals(distance))
                       .filter((r)->r.getSex().equals(sex))
                       .toList();
        }catch(IOException e){
            e.printStackTrace();
        }
       return Collections.emptyList();
    }
    private List<Runner>convertCsvToRunner(String input){
       List<Runner>list = new ArrayList<>();
       String[]lines = input.split("\n");
       for (int i = 1; i<lines.length; i++){
         list.add(converLineToRunner(lines[i]));
       }
       return list;
    }
    private Runner converLineToRunner(String line){
      String[] fields = line.split(",");
      return new Runner(fields[0],fields[1],fields[2],fields[3].substring(0, fields[3].length()-1));
    }
}
