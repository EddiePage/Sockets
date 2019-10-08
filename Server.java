// The skeleton program for Server
import java.net.*;
import java.io.*;

public class Server
{
	//input stream defined
	private Socket socket = null;				//Initialized three objects
	private ServerSocket server = null;
	private DataInputStream in = null;
}

    public static void main(String args[])
    {
        Server server = new Server(5000);		//Never 80 use unused sockets 1234, 9999, 5000
    }
}
