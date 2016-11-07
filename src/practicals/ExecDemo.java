package practicals;

public class ExecDemo {
	public static void main(String[] args)throws IOException {
		Runtime r = Runtime.getRuntime();
		Process p;
		System.out.println("Opening Notepad");
		try{
			p = r.exec("notepad");
			p.waitFor();
			System.out.println("Notepade Returned : " + p.exitValue());
			writer.close();
		}catch(Exception e){
			System.out.println("Error Opening Notepad");
			e.printStackTrace();
		}

		System.out.println("Try Block Completed");
	}
}
