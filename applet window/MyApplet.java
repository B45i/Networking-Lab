import java.applet.*;
import java.awt.*;
import java.net.*;

public class MyApplet extends Applet {
    String param;

    public void start() {
        setBackground(Color.red);
        setForeground(Color.blue);
        param = getParameter("hello");
    }
    
    public void paint(Graphics g) {
			URL codeBase = getDocumentBase();
            g.drawString("Hello world", 200, 200);
			showStatus(param);
			
    }
}

/*

<html>
<body>
	<applet code="MyApplet.class" width="400" height="400">
		<param name="hello" value="param value"> </param>	
	</applet>
</body>
</html>

*/
