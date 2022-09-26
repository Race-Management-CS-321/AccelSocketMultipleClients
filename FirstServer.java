package test;

import java.io.*;  
import java.net.*;
import java.util.concurrent.TimeUnit;

public class FirstServer {  
	
	public static void main(String[] args) throws InterruptedException{  
		new serve(1).start();
		TimeUnit.SECONDS.sleep(1);
		new serve(2).start();

	}  
	
    static class serve extends Thread {
    	static int serve;
		public serve(int servein) {
            // super: Allocates a new Thread object.
            super();
            serve=servein;
        }
        public void run() {
        	boolean cont = true;
    		int x;
    		int y;
    		int z;
    		String working;
        	switch (serve){
        	case 1:
        		System.out.println("server is run");

        		try{  
        			ServerSocket ss1=new ServerSocket(6661);  
        			Socket s1=ss1.accept();//establishes connection   
        			DataInputStream dis=new DataInputStream(s1.getInputStream()); 
        			while(cont) {
        				String  str=(String)dis.readUTF();  
        				System.out.println("first "+str); //shows what we get from the client
        				if (str.compareTo("end")==0) { //client will send "end" when finished testing
        					cont = false;
        				}
        				else { //if not the end, it turns the string into 3 ints
        					x = str.indexOf(",");
        					working = str.substring(0, x);
        					str = str.substring(x+1);
        					x = Integer.parseInt(working);
        					y = str.indexOf(",");
        					working = str.substring(0, y);
        					z = Integer.parseInt(str.substring(y+1));
        					y = Integer.parseInt(working);
        					System.out.println("x:"+x+" y:"+y+" z:"+z);  
        				}
        			}
        			ss1.close();  
        		}catch(Exception e){System.out.println(e);}  
        		break;
        	case 2:
        		System.out.println("server is run 2");
	        		try{  
	        			ServerSocket ss=new ServerSocket(6662);  
	        			Socket s=ss.accept();//establishes connection   
	        			DataInputStream dis=new DataInputStream(s.getInputStream()); 
	        			while(cont) {
	        				String  str=(String)dis.readUTF();  
	        				System.out.println("second "+str); //shows what we get from the client
	        				if (str.compareTo("end")==0) { //client will send "end" when finished testing
	        					cont = false;
	        				}
	        				else { //if not the end, it turns the string into 3 ints
	        					x = str.indexOf(",");
	        					working = str.substring(0, x);
	        					str = str.substring(x+1);
	        					x = Integer.parseInt(working);
	        					y = str.indexOf(",");
	        					working = str.substring(0, y);
	        					z = Integer.parseInt(str.substring(y+1));
	        					y = Integer.parseInt(working);
	        					System.out.println("x:"+x+" y:"+y+" z:"+z);  
	        				}
	        			}
	        			ss.close();  
	        		}catch(Exception e){System.out.println(e);}  
	        		break;
        	case 3:
				System.out.println("server is run 3");
        		try{  
        			ServerSocket ss=new ServerSocket(6663);  
        			Socket s=ss.accept();//establishes connection   
        			DataInputStream dis=new DataInputStream(s.getInputStream()); 
        			while(cont) {
        				String  str=(String)dis.readUTF();  
        				System.out.println("second "+str); //shows what we get from the client
        				if (str.compareTo("end")==0) { //client will send "end" when finished testing
        					cont = false;
        				}
        				else { //if not the end, it turns the string into 3 ints
        					x = str.indexOf(",");
        					working = str.substring(0, x);
        					str = str.substring(x+1);
        					x = Integer.parseInt(working);
        					y = str.indexOf(",");
        					working = str.substring(0, y);
        					z = Integer.parseInt(str.substring(y+1));
        					y = Integer.parseInt(working);
        					System.out.println("x:"+x+" y:"+y+" z:"+z);  
        				}
        			}
        			ss.close();  
        		}catch(Exception e){System.out.println(e);}  
				break;
        	case 4:
        		System.out.println("server is run 4");
        		try{  
        			ServerSocket ss=new ServerSocket(6664);  
        			Socket s=ss.accept();//establishes connection   
        			DataInputStream dis=new DataInputStream(s.getInputStream()); 
        			while(cont) {
        				String  str=(String)dis.readUTF();  
        				System.out.println("second "+str); //shows what we get from the client
        				if (str.compareTo("end")==0) { //client will send "end" when finished testing
        					cont = false;
        				}
        				else { //if not the end, it turns the string into 3 ints
        					x = str.indexOf(",");
        					working = str.substring(0, x);
        					str = str.substring(x+1);
        					x = Integer.parseInt(working);
        					y = str.indexOf(",");
        					working = str.substring(0, y);
        					z = Integer.parseInt(str.substring(y+1));
        					y = Integer.parseInt(working);
        					System.out.println("x:"+x+" y:"+y+" z:"+z);  
        				}
        			}
        			ss.close();  
        		}catch(Exception e){System.out.println(e);}  
        		break;
        	case 5:
        		System.out.println("server is run 5");
        		try{  
        			ServerSocket ss=new ServerSocket(6665);  
        			Socket s=ss.accept();//establishes connection   
        			DataInputStream dis=new DataInputStream(s.getInputStream()); 
        			while(cont) {
        				String  str=(String)dis.readUTF();  
        				System.out.println("second "+str); //shows what we get from the client
        				if (str.compareTo("end")==0) { //client will send "end" when finished testing
        					cont = false;
        				}
        				else { //if not the end, it turns the string into 3 ints
        					x = str.indexOf(",");
        					working = str.substring(0, x);
        					str = str.substring(x+1);
        					x = Integer.parseInt(working);
        					y = str.indexOf(",");
        					working = str.substring(0, y);
        					z = Integer.parseInt(str.substring(y+1));
        					y = Integer.parseInt(working);
        					System.out.println("x:"+x+" y:"+y+" z:"+z);  
        				}
        			}
        			ss.close();  
        		}catch(Exception e){System.out.println(e);}  
        		break;
        		
        	default:
        		break;
        	}

        }
    }
}  