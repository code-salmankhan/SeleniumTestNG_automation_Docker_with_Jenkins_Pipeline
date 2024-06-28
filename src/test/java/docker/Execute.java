package docker;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Execute {

	public static void main(String[] args) throws IOException
	{
		
		  try {
	            // Path to your shell script
	            String scriptPath = "/Users/salmankhan/.docker/run/start_dockergrid.sh";
	            
	            // Use ProcessBuilder to execute the script
	            ProcessBuilder processBuilder = new ProcessBuilder("sh", scriptPath);

	            // Set environment variables if necessary
	            Map<String, String> environment = processBuilder.environment();
	            // environment.put("VAR_NAME", "value"); // Example of setting an environment variable

	            // Redirect error stream to capture all output
	            processBuilder.redirectErrorStream(true);

	            // Start the process
	            Process process = processBuilder.start();

	            // Capture output
	            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            // Wait for the process to complete
	            int exitCode = process.waitFor();
	            System.out.println("Exited with code: " + exitCode);

	            // Handle exit code 127 specifically
	            if (exitCode == 127) {
	                System.err.println("Command not found: Verify the script path and permissions.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		/*
		 System.out.println("Starting shell script");
		    String script = "start_dockergrid.sh";
		    String scriptPath = "/Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/";
		    
		    try {
		        Process awk = new ProcessBuilder("/bin/bash", scriptPath + script).start();
		        awk.waitFor();
		        BufferedReader reader = new BufferedReader(new InputStreamReader(        
		                awk.getInputStream()));                                          
		            String s;                                                                
		            while ((s = reader.readLine()) != null) {                                
		              System.out.println("Script output: " + s);
		              System.out.println("output code: "+awk.exitValue());
		            }      
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    System.out.println("Finished");
	*/
		}
	

}
