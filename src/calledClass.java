//package vikram;
import org.json.*;

public class calledClass {

	JSONObject obj;

	public String getstringvalue(String strval){

		String msg = null;

		try
		{
			msg=obj.getString("text");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}  	

		return msg;
	}

	public String getintvalue(String intval){
		String val = null;
		try
		{
			val = obj.getString("id");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return val;
	}


}
