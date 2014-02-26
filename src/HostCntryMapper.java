



import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

	
	 public class HostCntryMapper extends MapReduceBase implements Mapper<Text, Text, TextPair, TextPair> 
	 {
		 HostCntryMapper(){
         }	
		 public String tag = "R";
         
		public void map( Text key , Text values ,OutputCollector <TextPair, TextPair> output , Reporter reporter ) throws IOException 
		{
			
		/*	String line = values.toString();
	       String[] tokens = line.split(" "); 
	       String[] arraystrings = {"", ""};
	       if(tokens.length>0)
	    	   arraystrings[0] =tokens[0];
	       if(tokens.length>1)
	    	   arraystrings[1] =tokens[1];
	      
	       
	       key.set( arraystrings[0]);
	       values.set(arraystrings[1]);
				output.collect (new TextPair( key.toString () , tag ) ,new TextPair( values.toString (), tag )); */
			
			 String line = key.toString();
		      /*    String[] tokens = line.split(" "); // StringTokenizer splits the line into tokens separated by whitespaces.
		      
		       String[] arraystrings = {"", ""};
		      if(tokens.length>0)
		    	   arraystrings[0] = tokens[0];
		       if(tokens.length>1)
		    	   arraystrings[1] = tokens[1];
		       if(tokens.length>2)
		    	   arraystrings[2] = tokens[2];
		       if(tokens.length>3)
		    	   arraystrings[3] = tokens[3];
		       if(tokens.length>4)
		    	   arraystrings[4] = tokens[4];
		       key.set(arraystrings[0]);
		       value.set(arraystrings[1]+ " " + arraystrings[2] + " "+ arraystrings[3]+" "+arraystrings[4]);*/
		      if(line.indexOf(' ') !=-1)
		      {
		      String ip = line.substring(0,line.indexOf(' '));
		      output . collect (new TextPair( ip . toString () , tag ) ,new TextPair( values . toString () , tag ));
		      }
		}	
		}
	


