package PrimerTrimestre;


/**
 * Write a description of class da here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;



/**
* Write a description of class JavaGui01 here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class JavaGui01 extends JFrame
{
    private JPanel panel1,panel2, panelTexto;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JLabel lTexto;
    private final String jX = "X", jO = "O";
    private int turno = (int)(Math.random()*2+1);
    private int contador = 1;
    private JButton[][] arrayBotones;



   public JavaGui01(){
        super("Haz fila, columna o diagonal con tu signo y gana");



       initElementos();
        setSize(1000,800);
        setLocationRelativeTo(null);
        setVisible(true);



   }



   public void initElementos(){
        MiListener ml = new MiListener();
        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel(new GridLayout(3,3));
        panelTexto = new JPanel();
        //panel texto



       lTexto = new JLabel("Turno de la "+ turnoJ());
        lTexto.setFont(new Font("MV Boli", Font.BOLD, 120));



       lTexto.setForeground(Color.WHITE);
        panelTexto.add(lTexto);
        panelTexto.setBackground(Color.BLACK);
        panel1.add(panelTexto, BorderLayout.NORTH);
        //panel1.add(lTexto, BorderLayout.NORTH);
        //Panel botones;



       b1 = new JButton();
        b1.addActionListener(ml);
        b2 = new JButton();
        b2.addActionListener(ml);
        b3 = new JButton();
        b3.addActionListener(ml);
        b4 = new JButton();
        b4.addActionListener(ml);
        b5= new JButton();
        b5.addActionListener(ml);
        b6 = new JButton();
        b6.addActionListener(ml);
        b7 = new JButton();
        b7.addActionListener(ml);
        b8 = new JButton();
        b8.addActionListener(ml);
        b9 = new JButton();
        b9.addActionListener(ml);



       panel2.add(b1); panel2.add(b2); panel2.add(b3); panel2.add(b4);
        panel2.add(b5); panel2.add(b6); panel2.add(b7); panel2.add(b8);
        panel2.add(b9);



       panel1.add(panel2, BorderLayout.CENTER);



       arrayBotones = new JButton[][]{{b1,b2,b3},{b4,b5,b6},{b7,b8,b9}};



       add(panel1);
    }



   public String turnoJ(){
        //turno++;
        if(turno%2 == 0){
            return jX;



       }else{
            return jO;



       }



   }
    class MiListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton bp = (JButton) e.getSource();
            if(bp.getText().equals("")){
                bp.setText(turnoJ());
                bp.setFont(new Font("MV Boli", Font.BOLD, 50));
                bp.setSelected(true);



               comprobador();
                turno++;
                contador++;
                lTexto.setText("Turno de la "+turnoJ());
                
            }else{
                JOptionPane.showMessageDialog(null,"Casilla no valida");
            }



       }
    }



   public void comprobador(){



       if(!b1.getText().equals("") &&
        (b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Horizontal 1
        }else if(!b4.getText().equals("") &&
        (b4.getText().equals(b5.getText()) && b5.getText().equals(b6.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Horizontal 2
        }else if(!b7.getText().equals("") &&
        (b7.getText().equals(b8.getText()) && b8.getText().equals(b9.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Horzontal 3
        }else if(!b1.getText().equals("") &&
        (b1.getText().equals(b4.getText()) && b4.getText().equals(b7.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Vertical1
        }else if(!b1.getText().equals("") &&
        (b1.getText().equals(b5.getText()) && b5.getText().equals(b9.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Diagonal 1
        }else if(!b7.getText().equals("") &&
        (b7.getText().equals(b5.getText()) && b5.getText().equals(b3.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Diagonal2
        } else if(!b2.getText().equals("") &&
        (b2.getText().equals(b5.getText()) && b5.getText().equals(b8.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Vertical2
        }else if(!b3.getText().equals("") &&
        (b3.getText().equals(b6.getText()) && b6.getText().equals(b9.getText()))){
            JOptionPane.showMessageDialog(null,"Gana el Jugador "+ turnoJ());
            dispose();
            //Vertical3
        }else if(contador >= 9){
            JOptionPane.showMessageDialog(null,"Juego concluido: empate");
            dispose();
        }
    }



   public static void main(String[] args){
        new JavaGui01();
    }
}