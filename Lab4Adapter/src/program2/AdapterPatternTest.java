package program2;

class Volt {
	private int volts;	
	public Volt(int v){
		this.volts=v;
	}
	public int getVolts() {
		return volts;
	}
	public void setVolts(int volts) {
		this.volts = volts;
	}	
}
 
class Socket {
	public Volt getVolt(){
		return new Volt(120);
	}
}

interface SocketAdapter {
	public Volt get120Volt();
	public Volt get12Volt();
	public Volt get3Volt();
}
 
 class SocketClassAdapterImpl extends Socket implements SocketAdapter{
		@Override
		public Volt get120Volt() {
			return getVolt();
			//120 is the default so adapter simply allow to pass through
		}

		@Override
		public Volt get12Volt() {
			Volt v= getVolt();
			return convertVolt(v,10);
			//devides the default volt by a factor of 10
		}

		@Override
		public Volt get3Volt() {
			Volt v= getVolt();
			return convertVolt(v,40);
			//devides the default volt by a factor of 40 just like inside mobile adapter has transformers inside

		}
		
		private Volt convertVolt(Volt v, int i) {
			return new Volt(v.getVolts()/i);
		}
	}
public class AdapterPatternTest {
	public static void main(String[] args) {
		testClassAdapter();
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,4);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,110);
		System.out.println("v3 is getting "+v3.getVolts()+" volts using Class Adapter");
		System.out.println("v12 is getting "+v12.getVolts()+" volts using Class Adapter");
		System.out.println("obj v120 volts using Class Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		if (i>1 && i < 7){
			return sockAdapter.get3Volt();
		}
		else if( i>7 && i < 15 ) {
			return sockAdapter.get12Volt();
		}
		else if(i>100 && i < 140) {
			return sockAdapter.get120Volt();
		}
		else {
			return sockAdapter.get120Volt();
		}
	}
}
