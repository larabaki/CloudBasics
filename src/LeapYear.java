import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame implements ActionListener {
    private JButton check;
    private JTextField year, result;
    private JLabel info;

    public LeapYear() {
        super("Leap Year Checker");
        info = new JLabel("Enter a year to check if it is a leap year: ");
        year = new JTextField(8);
        result = new JTextField("Result: ");
        result.setEditable(false);
        check = new JButton("Check");

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(null); 
        topPanel.setPreferredSize(new Dimension(350, 180)); 

       
        info.setBounds(10, 5, 220, 20);
        year.setBounds(10, 30, 60, 20);
        check.setBounds(115, 80, 90, 20);

        topPanel.add(info);
        topPanel.add(year);
        topPanel.add(check);

        c.add(topPanel, BorderLayout.NORTH);
        result.setBounds(10, 235, 50, 20);
c.add(result);
        check.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int yr = Integer.parseInt(year.getText());
            if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
                result.setText("The year is a leap year (there are 366 days).");
            } 
            
            else {
                result.setText("The year is not a leap year (there are 365 days).");
            }
        } catch (NumberFormatException ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setSize(320, 300);
        app.setVisible(true);
        app.setResizable(false);
    }
}
