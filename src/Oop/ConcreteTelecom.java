package Oop;

public class ConcreteTelecom extends AbstractTelecom implements InterfaceTelecom, InterfaceTelecom2 {

	@Override
	public void incoming() {
		System.out.println("incoming,this is come from InterfaceTelecom");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void network() {
		System.out.println("network,this is come from InterfaceTelecom");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outgoing() {
		System.out.println("outgoing,this is come from InterfaceTelecom");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		System.out.println("camera,this is come from InterfaceTelecom2");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void videocall() {
		System.out.println("videocall,this is come from InterfaceTelecom2");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void facereader() {
		System.out.println("facereader,this is come from InterfaceTelecom2");
		// TODO Auto-generated method stub
		
	}
	

}
