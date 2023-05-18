import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class A268MultiClientMultiThreadReverseEcho extends Thread{

    
        Socket stk ;

        public A268MultiClientMultiThreadReverseEcho(Socket st){

            stk = st;
        }

        public void run(){
            try
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
                PrintStream ps = new PrintStream(stk.getOutputStream());

                String msg;
                StringBuilder sb;

          do{

           msg = br.readLine();

           sb = new StringBuilder(msg);
           sb.reverse();

           msg = sb.toString();

           ps.println(msg);

        }while(!msg.equals("dne"));

        stk.close();
    } catch(Exception e){}
}



    public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(2000);
        int count =1;
        Socket stk ;

        A268MultiClientMultiThreadReverseEcho re;
        do{
            stk = ss.accept();
            System.out.println("Client connected :"+count++);
            re = new A268MultiClientMultiThreadReverseEcho (stk);
            re.start();

        }while(true);

    }

        

 class Client {
    public static void main(String[] args)throws Exception {
        
        Socket stk = new Socket("192.168.48.133",2000); // " number" is ip number of this laptop
        
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        
        do{

           msg = keyb.readLine();
           ps.println(msg);
           msg=br.readLine();

           System.out.println("From Server"+msg);

        }while(!msg.equals("dne"));

        stk.close();
    }
 }
}


    