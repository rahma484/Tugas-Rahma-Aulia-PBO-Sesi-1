import javax.swing.JOptionPane;

public class DemoInput {

    public static void main(String[] args) {

        String belajar;

        belajar = JOptionPane.showInputDialog("Anda sedang belajar apa?");

        JOptionPane.showMessageDialog(null,
                "Belajar " + belajar + " sangat mudah");

    }
}