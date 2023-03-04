package com.ssce.filedemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EntryList
{
    private List<String> list = new ArrayList<>();
    EntryList(String fileName)
    {
        String line;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line=bufferedReader.readLine())!=null)
            {
                String []parts = line.split(",");
                for(int i=0;i< parts.length;i++)
                {
                    list.add(nameFormat(parts[i]));
                }
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String nameFormat(String part)
    {
        String out="";
        String temp;
        for(int i=0;i<part.length();i++)
        {
           temp = part.substring(i,i+1);
           if(i==0)
           {
               temp=temp.toUpperCase();
           }
           else
           {
               temp=temp.toLowerCase();
           }
            out = out + temp;
        }
        return out;
    }
    public void writeFile()
    {
        String out ="";
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Darugar\\Downloads\\filehandling\\filehandling\\output.txt");
            ListIterator<String> it =list.listIterator();
            while(it.hasNext())
            {
                out = out + it.next();
                if(it.hasNext())
                    out = out +",";
            }
            fileWriter.write(out);
            fileWriter.close();
            System.out.println(out);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
