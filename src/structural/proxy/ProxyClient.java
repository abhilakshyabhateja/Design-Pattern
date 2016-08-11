package structural.proxy;

import structural.proxy.domains.NetAccess;

public class ProxyClient {

	public static void print(NetAccess obj)
	{
		obj.grantPermission();
	}
	
	public static void main(String arg[]){
		
		NetAccess proxy = new ProxyNetAccess();
		proxy.setEmpGrade(9);
		print(proxy);
	}
}
