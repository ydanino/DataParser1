import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.toString();
    }


    public static ArrayList<unemployed> parseUnemployment(String data){
        ArrayList<unemployed> results = new ArrayList<>();
        String[] individualLines = data.split("\n");

        for (int dataRow = 10; dataRow < individualLines.length; dataRow++) {

            String noCommas = removeDoubleComma(individualLines[dataRow]);
            String noCommasInQuotes = removeCommasInside(noCommas);
            String readyForUse = removeQuotes(noCommasInQuotes);

            String[] allData = readyForUse.split(",");

            if (allData.length >= 50) {
                unemployed u = new unemployed(allData[1].trim(), allData[2].trim(), Double.parseDouble(allData[9].trim()), Double.parseDouble(allData[13].trim()),
                        Double.parseDouble(allData[17].trim()), Double.parseDouble(allData[21].trim()), Double.parseDouble(allData[25].trim()), Double.parseDouble(allData[29].trim()),
                        Double.parseDouble(allData[33].trim()), Double.parseDouble(allData[37].trim()), Double.parseDouble(allData[41].trim()),
                        Double.parseDouble(allData[45].trim()), Double.parseDouble(allData[49].trim()));

                results.add(u);
            }
        }
        return  results;
    }

    public static String removeQuotes(String n){
        String end = n.replace("\"", "");

        return end;
    }
    public static String removeCommasInside(String n){

        String quote = " \"\" ";
        String end = n;

        for (int i = 0; i < n.length(); i++) {
            if(n.substring(i,i+1).equals(quote.substring(1, 2))){
                int secondQuote = findSecondQuote(n, i);

                String replace = n.substring(i, secondQuote +1);
                String afterReplace = replace.replace(",", "");

                end = end.substring(0,i) + afterReplace + n.substring(secondQuote  );
                i = secondQuote +1;
            }
        }

        return end;
    }

    private static int findSecondQuote(String n, int start) {
        String quote = " \"\" ";

        for (int i = start + 1; i < n.length(); i++) {
            if(n.substring(i,i+1).equals(quote.substring(1, 2))){
                return i;
            }
        }
        return -1;
    }

    public static String removeDoubleComma(String n){
        String end = n;
        for (int i = 0; i < 6; i++) {
            end = end.replace(",,", ",");
        }
        return end;
    }


    public static ArrayList<ElectionResult> parse2016ElectionResults(String data) {
        String quote = " \"\" ";
        int quoteNum = 0;
        ArrayList<ElectionResult> results = new ArrayList<>();

        String[] individualLines = data.split("\n");


        for (int i = 1; i < individualLines.length; i++) { // skips first  line which is the labels of each column
            for (int index = 0; index < individualLines[i].length(); index++) {
                if (individualLines[i].substring(index, index + 1).equals(",")) { // gets rid of the first number and the comma
                    if (index < 5) {
                        String s = individualLines[i].replace(individualLines[i].substring(0, index + 1), "");
                        individualLines[i] = s;
                    }
                }
                if (individualLines[i].substring(index, index + 1).equals("%")) { // gets rid of %
                    String q = individualLines[i].replace(individualLines[i].substring(index, index + 1), "");
                    individualLines[i] = q;
                }
                    if (individualLines[i].substring(index, index + 1).equals(quote.substring(1, 2))) {
                        int secondQuote = findSecondQuote(individualLines[i], index);
                        System.out.println(secondQuote);
                        for (int j = index; j < secondQuote + 1; j++) {
                            if (individualLines[i].substring(j, j + 1).equals(",")) {
                                String w = individualLines[i].replace(individualLines[i].substring(j, j + 1), "");
                                individualLines[i] = w;
                            }
                        }
                        String x = individualLines[i].replace(individualLines[i].substring(index, index + 1), "");
                        individualLines[i] = x;
                        String jeff = individualLines[i].replace(individualLines[i].substring(secondQuote, secondQuote + 1), "");
                        individualLines[i] = jeff;
                    }
            }


        }



        for (int lineNum = 0; lineNum < individualLines.length; lineNum++) { //splits and creates new ElectionResult obj, then adds it to arraylist
            String[] noSymbolLine = individualLines[lineNum].split(",");

            ElectionResult result = new ElectionResult(Double.parseDouble(noSymbolLine[0]),Double.parseDouble(noSymbolLine[1]),
                    Double.parseDouble(noSymbolLine[2]),Double.parseDouble(noSymbolLine[3]),
                    Double.parseDouble(noSymbolLine[4]),Double.parseDouble(noSymbolLine[5]),Double.parseDouble(noSymbolLine[6])
                    ,noSymbolLine[7],noSymbolLine[8],Double.parseDouble(noSymbolLine[9]));

            results.add(result);
        }

        return results;

    }




    private static void getRidOfComma(String individualLine, int index) {
        // can do helped method but then how do i actually change
    }

}
