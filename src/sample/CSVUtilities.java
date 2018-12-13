package sample;
import  java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities
{
    private ArrayList<String> CSVData;
    private int numColumns;
    private String[] container;
    public CSVUtilities(File csv)
    {
        try {
           BufferedReader objReader = new BufferedReader(new FileReader("1.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.numColumns = CSVData.size();
    }
    public List<String> getColumnHeaders()
    {
        for(int i =0; i< numColumns; i++)
        {

        }
    }
    public List<String> getDataString(int column)
    {

    }
    public List<Integer> getDataInt(int column)
    {

    }
    public List<double> getDataDouble(int column)
    {

    }
}
