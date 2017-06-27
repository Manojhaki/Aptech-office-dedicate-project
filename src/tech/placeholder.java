
 package tech;
import java.awt.Color;
import javax.swing.JTextField;

public class placeholder {
String s= " Who do you want to Search ? ";
public void show(JTextField input, String s, int i)
{
    if(i==0)
    {
        input.setText(s);
        input.setForeground(Color.GRAY);
    }
}
public void click(JTextField input, String s)
{
    if(input.getText().equals(s))
    {
        input.setText("");
        input.setForeground(Color.BLACK);
    }
} 
}
