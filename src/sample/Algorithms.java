//Alexander Cox, Shihab Faruk
//Friday, February 1, 2019

package sample;

public class Algorithms {

    private String DDG_URL1 = "https://duckduckgo.com/?q=", DDG_URL2 = "&t=hi";

    private String question = "";

    void setupClient()
    {
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
    }

    int FullSearch(String query)
    {

    }

    int QuickSearch(String query)
    {

    }
}
