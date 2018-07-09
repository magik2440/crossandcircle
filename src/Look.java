import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Look extends JFrame implements ActionListener
{
    private ImageIcon main_background;
    private Button[] tab_button = new Button[9];

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
            }
            else
            {
                x = 8;
                y += 100;
                tab_button[i] = set_button(x, y, tab_button[i]);
                x += 100;
            }
        }
    }

    /**
     * funkcja do ustawiania przycisku
     * @param x wspolrzedna x
     * @param y wspolrzedna y
     * @param button przycisk ktory ustawiamy
     * @return zwraca gotowy przycisk
     */
    private Button set_button(int x, int y, Button button)
    {
        button = new Button("");
        button.setBounds(x, y, 88,88);
        add(button);
        button.addActionListener(this);
        return button;
    }

    /**
     * funckja ktora ustawia grafike obrazkowa
     * @param g parametr graficzny
     */
    public void paint(Graphics g)
    {
        main_background = new ImageIcon("lattice.png");
        main_background.paintIcon(this, g, 8, 30);
        g.dispose();
    }

    /**
     * Funckja ktora oblsuguje akcje nacisniecia przycisku
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source_button = e.getSource();
        Button button = (Button) source_button;
        if (button.getName().equals(""))
        {
            //jesi bedzie pusty to -> ustaw button.setName("x lub y")

        }
    }
}
