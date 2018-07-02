package navegador;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class NavegadroPrincipal {

	 private static int count = 0;
	 
	private void primeiraTarefa() {
        final Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Counting " + (++count) +
                        " Time: " + new Date()
                );
                //new Execucoes().tabuada(count);
                /*if (count == 5) {
                    t.cancel();
                }*/
            }

        }, 5000, 3000);
    }

	public static void main(String[] args) throws IOException {

		NavegadroPrincipal nav = new NavegadroPrincipal();
		nav.primeiraTarefa();
		
	    Desktop desktop = null;  
	    desktop = Desktop.getDesktop();  
	    URI uri = null;  
	    try {
	    	uri = new URI("https://ponto.cwi.com.br/Lite/Home.aspx");  
	        desktop.browse(uri);  
	    }  
	    catch(IOException ioe) {  
	               ioe.printStackTrace();  
	    }  
	    catch(URISyntaxException use) {  
	               use.printStackTrace();  
	    }
	    
	}
	
}
