package com.smartelevation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCSVExample2
{
    public static void main(String[] args)
    {

        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("src/CSVDemo.csv"));
            extract(br);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void extract(BufferedReader br) throws IOException {
        String line = "";
        String splitBy = ",";
        line = br.readLine(); // Header
        while ((line = br.readLine()) != null)   //returns a Boolean value
        {
            String[] employee = getRow(line, splitBy);    // use comma as separator
            System.out.println("Employee [First Name=" + Integer.parseInt(employee[0]) + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");
        }
    }
    public static String[] getRow(String line, String splitBy){
        String[] row = line.split(splitBy);
        return row;
    }
}
