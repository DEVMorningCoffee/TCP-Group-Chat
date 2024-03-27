

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }


    public void startServer(){
        try{
            while(!serverSocket.isClosed()){
                Socket socket = serverSocket.accept();
                System.out.println("A new client has connected!");
                Client client = new Client();

                Thread thread = new Thread(client);
                thread.start();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public void closeServerSocket(){
        try{
            if(serverSocket != null){
                System.out.println("Server is closing!");
                this.serverSocket.close();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        server.startServer();
    }
}
