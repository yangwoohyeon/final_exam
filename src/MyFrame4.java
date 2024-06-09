import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame4 extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;

    public MyFrame4(){
        this.setTitle("이벤트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);

        JPanel panel = new JPanel();
        button=new JButton("버튼 눌러");
        label = new JLabel("버튼 안눌림");
        button.addActionListener(this);
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            button.setText("버튼눌림");
            label.setText("정상 작동");
        }
    }
}
