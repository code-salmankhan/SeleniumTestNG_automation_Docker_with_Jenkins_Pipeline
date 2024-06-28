package docker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException; 
import java.net.*; 
import java.util.Scanner;
import java.io.*;

import org.testng.annotations.Test;

public class Setup2_DockerGrid
{
	
	@Test
	void setup() throws IOException
	{
		
		String filePath = "start_dockergrid.sh";
        String[] cmd = {"sh", filePath};
        ProcessBuilder processBuilder = new ProcessBuilder(cmd);
        processBuilder.directory(new File("."));
        Process process;
        try {
            process = processBuilder.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            System.out.println("Output is: ");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
		
		
		
		
		/*
		
		 try{
	            String scriptPath = "/Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/start_dockergrid.sh";
	            
	            
	            ProcessBuilder pb = new ProcessBuilder("zsh", scriptPath);
	            
	            Process process = pb.start();
	            
	            int exitCode = process.waitFor();
	            
	            System.out.println("Script exited with code: " + exitCode);
	            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
		 /*
		
		 try{ 
		        ProcessBuilder pb = new ProcessBuilder("/Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/start_dockergrid.sh"); 
		        Runtime.getRuntime().exec("/Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/start_dockergrid.sh");
		        pb.inheritIO();
		        Process p = pb.start(); 
		        p.waitFor(); 
		        System.out.println("Script executed.."); 
		    }catch(Exception e){ 
		        e.printStackTrace(); 
		        } 
		
		/*
		ProcessBuilder builder = new ProcessBuilder();
	
		builder.command("sh", "-c", "/Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/start_dockergrid.sh");
		Process process = builder.start();
		
		//process = Runtime.getRuntime().exec(String.format("/bin/sh %s", "/Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/start_dockergrid.sh"));
	*/	
	
		/*
		String[] cmd = new String[] {"/Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/start_dockergrid.sh"};
 	    ProcessBuilder pb = new ProcessBuilder(cmd);
 	    
 	   try
 	   {
 		Process p = pb.start();
 		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
 		String s = null;
 		while((s = reader.readLine()) != null)
 		{
 			System.out.println("YEs");
 		}
 	   }
 	   catch(IOException e)
 	   {
 		   System.out.println("NO");
 		   e.printStackTrace();
 	   }
 	  */
       
        /*
        Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
        */
        
        
	}	
	


}
