package com.ssce.filedemo;

import java.io.*;

public class ReadWriteFile
{
    public static void main(String[] args) throws IOException
    {
      ReadWriteFile readWriteFile = new ReadWriteFile();
      readWriteFile.readDataFromFile();
    }
    public void readDataFromFile() throws IOException
    {
        EntryList entryList = new EntryList("C:\\Users\\Darugar\\Downloads\\filehandling\\filehandling\\input.txt");
        entryList.writeFile();
    }
}
