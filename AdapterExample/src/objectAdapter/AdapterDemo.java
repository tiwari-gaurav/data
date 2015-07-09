package objectAdapter;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drive dr = new Adapter();
		Disk d = new Disk();
		dr.sendOutput(d, "Test");
		System.out.println(d.contents);
		
	}

}
