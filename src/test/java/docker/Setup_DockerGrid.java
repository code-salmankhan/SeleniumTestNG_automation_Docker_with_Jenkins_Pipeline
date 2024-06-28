package docker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Setup_DockerGrid 
{
	
	private static class ProcessReader implements Callable
	{
		private InputStream inputStream;
		
		public ProcessReader(InputStream inputStream)
		{
			this.inputStream = inputStream;
		}
		
		@Override
		public Object call() throws Exception{
			return new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.toList());
		}
	}
	
	
	
	boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
	ProcessBuilder builder = new ProcessBuilder();
	
	
	 @BeforeSuite
	void startDockerGrid() throws IOException, InterruptedException
	{/*
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
		
		if(isWindows)
		{
			builder.command(System.getProperty("user.dir")+"\\start_dockergrid.sh");
			
		} else 
		{
			builder.command("sh", "-c", System.getProperty("user.dir")+"/start_dockergrid.sh");
		}
		
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		try 
		{
			Process process = builder.start();
			ProcessReader task = new ProcessReader(process.getInputStream());
			System.out.println("Started");
			Future<List<String>> future = pool.submit(task);
			
			List<String> results = future.get();
			for(String res:results)
			{
				System.out.println(res);
			}
			int exitCode = process.waitFor();
			
			System.out.println("Exit Code: "+ exitCode);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} 
		catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			pool.shutdown();
		}
		
		
		
	*/
		 Thread.sleep(15000);
		 System.out.println("Test Started");
	}
	
	@Test
	void start()
	{
		System.out.println("Test In Progress");
	}
	
	@AfterSuite
	void stopDockerGrid() throws IOException, InterruptedException
	{
		/*
		if(isWindows)
		{
			builder.command(System.getProperty("user.dir")+"/stop_dockergrid.sh");
		}
		else 
		{
			builder.command("sh", "-c", System.getProperty("user.dir")+"/test.sh");
		}
		
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		try 
		{
			Process process = builder.start();
			System.out.println("Stopped");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	*/
		 
		 Thread.sleep(15000);
		 System.out.println("Test Completed");
		
	}

}
