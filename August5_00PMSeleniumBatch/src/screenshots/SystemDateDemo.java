package screenshots;

import java.util.Date;

public class SystemDateDemo 
{

	public static void main(String[] args) 
	{
		Date dt = new Date();
		System.out.println(dt);
		String s = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(s);
	}

}
