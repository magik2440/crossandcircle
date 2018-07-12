import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Look extends JFrame implements ActionListener
{
    private static String x_or_o;
    private ImageIcon main_background;
    private JButton[] tab_button = new JButton[9];

    /**
     * konstruktor ustawiający wyglad okienka
     */
    public Look()
    {
        setSize(316, 330);
        setTitle("crossandcircel");
        setLayout(null);

        int x = 8;
        int y = 5;

        for (int i = 0; i < 9; i++)
        {
            if (x < 308)
            {
                tab_button[i] = set_button(x, y, tab_button[i]);
                x += 100;
            } else
            {
                x = 8;
                y += 100;
                tab_button[i] = set_button(x, y, tab_button[i]);
                x += 100;
            }
        }
    }
    public void setX_or_o(String random_char){x_or_o = random_char;}

    /**
     * funkcja do ustawiania przycisku
     *
     * @param x      wspolrzedna x
     * @param y      wspolrzedna y
     * @param button przycisk ktory ustawiamy
     * @return zwraca gotowy przycisk
     */
    private JButton set_button(int x, int y, JButton button)
    {
        button = new JButton("");
        button.setBounds(x, y, 88, 88);
        button.setBackground(Color.WHITE);
        add(button);
        button.addActionListener(this);
        return button;
    }

    /**
     * funckja ktora ustawia grafike obrazkowa
     *
     * @param g parametr graficzny
     */
    public void paint(Graphics g)
    {
        main_background = new ImageIcon("lattice.png");
        main_background.paintIcon(this, g, 8, 30);
        g.dispose();
    }

    /**
     * metoda zamienia na kolejna wartosc i zwraca poprzednia
     * @return x lub o
     */
    public String getX_or_o_and_change()
    {
        if (x_or_o.equals('o'))
        {
            x_or_o = "x";
            return "o";
        }
        else
        {
            x_or_o = "o";
            return "x";
        }
    }

    /**
     * Funckja ktora oblsuguje akcje nacisniecia przycisku
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source_button = e.getSource();
        JButton button = (JButton) source_button;
        if (button.getText().equals(""))
        {
            //jesi bedzie pusty to -> ustaw button.setText(getX_or_o_and_change())
            //sprawdz czy wygrales

        }
        else
            System.out.println("zly guzik wcisnales");

    }
}
