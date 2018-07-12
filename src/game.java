import javax.swing.*;
import java.util.Random;

public class game
{
    public static void main(String args[])
    {
        Look game1 = new Look();
        game1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game1.setVisible(true);


        //https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
        int n = JOptionPane.showConfirmDialog(game1,
                                              "Play game and random x or y?",
                                              "Beginning game",
                                              JOptionPane.YES_NO_OPTION);
        if (n == 0)
        {
            int random = new Random().nextInt(2);
            if (random == 0)
            {
                JOptionPane.showMessageDialog(game1,
                                              "Player with the 'o' beginning");
                game1.setX_or_o("o");
            }
            else
            {
                JOptionPane.showMessageDialog(game1,
                                              "Player with the'x' beginning");
                game1.setX_or_o("x");
            }
        }
        else
        {
            Object[] options = {"X", "O"};
            int i =JOptionPane.showOptionDialog(game1,
                                                "Would you like X or O?",
                                                "A Serious Question",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE,
                                                null,     //do not use a custom Icon
                                                options,  //the titles of buttons
                                                options[0]);
            switch (i)
            {
                case 0:
                {
                    game1.setX_or_o("x");
                    break;
                }
                case 1:
                {
                    game1.setX_or_o("o");
                    break;
                }
            }
        }

    }
}
