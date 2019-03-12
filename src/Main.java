import java.util.ArrayList;

/***
 * Main class for data parser
 * @author: Yuval Danino
 */


public class Main {

    /***
     * weekend hw code
     *
     * split by /n
     * remove all !@#$%^&*(
     * split by ,
     *
     *
     *
     */

    public static void main(String[] args) {
        //test of utils

        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");


        ArrayList<ElectionResult> results = Utils.parse2016ElectionResults(data);
        for (int i = 0; i < results.size(); i++) {
            results.get(i).toString();
        }


    }
}
