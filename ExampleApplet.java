/*<APPLET code="ExampleApplet.class" WIDTH=300 HEIGHT=200></APPLET>*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class ExampleApplet extends Applet //inheriting the Applet class.
{
String text;
public void init()//predefined method,when we run the program at first this method is called, with the methods called inside it
{
setBackground(Color.white);
setForeground(Color.red);
text="ECE DEPARTMENT";
System.out.println("...Initialized the Applet");//this lines will not be prnted in browser but in cmd 
}
public void start()// when applet start operations this method is called
{
System.out.println("...starting the Applet");
}
public void stop()//when we minimize the applet browser this will be called
{
System.out.println("...stopping the Applet");
}
public void destroy()// when we close the applet browser permanently this will be called.
{
System.out.println("...exiting the Applet");
}
public void paint(Graphics g)//this method is always needed to print or write or do something in the applet browser.
{
System.out.println("..painting the applet");
g.drawString(text,100,100);
showStatus("This is Status Bar");
}
}
//to run applet prog in cmd -->1.javac <file name>.java    2. appletviewer <class name>.java