package creation.single.domains;

public class RequestHandler {

	private static RequestHandler handler;
	private RequestHandler(){
		
	}
	
	public static RequestHandler getInstance(){
		if(handler==null)
		{
			synchronized (RequestHandler.class) {
				
				//if(handler==null)
				//{
				handler = new RequestHandler();
				//}
			}
		}
		return handler;
	}
}
