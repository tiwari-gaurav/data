package objectAdapter;

public class Adapter implements Drive{
Disk d;
public void sendOutput(Disk d , String c)
{
	this.d = d;
	d.RecieveInput(c);
}


}
