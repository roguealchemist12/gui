import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  extends Presmetki implements ActionListener {

    private Presmetki presmetka;
    private int count = 0;
    private JLabel label,label2;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JTextField textField,textField2;

   public GUI()
    {
        panel = new JPanel();
        frame = new JFrame();
        button = new JButton(new ImageIcon("C:\\Users\\Blastin\\IdeaProjects\\pro\\src\\btn.png"));
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");
        label2 = new JLabel();

        textField = new JTextField();
        textField.setBounds(20,20,150,20);

        panel.add(textField);

        textField2 = new JTextField();
        textField2.setBounds(20,20,150,20);

        panel.add(textField2);


        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        panel.add(label2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Blastinnn420");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);


        int a = Integer.parseInt(textField.getText());
        int b = Integer.parseInt(textField2.getText());
//        System.out.println(a);
//        System.out.println(b);

        presmetka = new Presmetki(a,b);
       // presmetka.multiply();

        label2.setText(presmetka.multiply());
    }
}
