/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static javax.script.ScriptEngine.FILENAME;

/**
 *
 * @author nuwan
 */
public class ReadLog {
    public String LoadReader(String location) throws FileNotFoundException, IOException
    {
        String content = "";
        try
        {
            File file = new File(location);
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            StringBuffer stringbuffer = new StringBuffer();
            String line;
            while(((line = bufferedreader.readLine())!=null))
            {
                stringbuffer.append(line);
                stringbuffer.append("\n");
                content=stringbuffer.toString();
                
            }
            filereader.close();
            System.out.println("Content Of The File");
            System.out.println(content);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return content;
    }
    
}
