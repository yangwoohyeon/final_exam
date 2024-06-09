import javax.swing.*;

public class MyFrame extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame(){
        this.setTitle("이벤트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);

        JPanel panel = new JPanel();
        button=new JButton("버튼 눌러");
        label = new JLabel("버튼 안눌림");
        button.addActionListener(new MyListener());
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
