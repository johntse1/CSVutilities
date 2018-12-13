package sample;
import  java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVUtilities
{
    private final BufferedReader objReader;
    private ArrayList<String> CSVData;
    private int numColumns;
    private String[] container;
    public CSVUtilities(File csv)
    {
        objReader = new BufferedReader(new FileReader("1.csv"));
    }
    public String getColumnHeaders()
    {
        for(int i =0; i< )
    }
}
