package Example2;

import objectAdapter.Disk;

public class Adapter extends Disk implements Drive{
	public void sendOutput( String c){
		RecieveInput(c);
	}

}
