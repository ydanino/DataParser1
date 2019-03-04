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
        System.out.println(data);
    }
}
