package View;

import javax.swing.UIManager;



public class LoginMain{
public static void main(String[] args) {
			
		try {
		    // Set System L&F
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) {
		// handle exception
		}

new TelaLogin();
}

}





