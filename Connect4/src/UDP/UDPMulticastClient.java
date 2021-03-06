package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * This is a Client library helps to broadcast multicast
 * message over LAN.
 *
 * @author  Eftakhairul Islam <eftakhairul@gmail.ocm>
 * @version 1.0
 * @since   2014-10-24
 */
public class UDPMulticastClient extends UDPClient {
	
	

	public UDPMulticastClient(String host, 
			                  int 	 port) throws IOException {
		//Overloading parent constructor
		super(host, port);
	}
	
	public void broadcast(String message) throws IOException {		
		try{
			this.socket 	  	= new MulticastSocket(this.port);
			DatagramPacket dgram = new DatagramPacket(message.getBytes(), 
													  message.length(),
													  InetAddress.getByName(this.host), 
													  this.port);
			((MulticastSocket)this.socket).send(dgram);							
		}catch(Exception e){
			e.printStackTrace();
		}finally{			
			((MulticastSocket)this.socket).close();
		}	
	}
}
