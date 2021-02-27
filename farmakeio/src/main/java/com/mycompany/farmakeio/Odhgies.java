package com.mycompany.farmakeio;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



//ΟΔΗΓΙΕΣ ΤΗΣ ΕΦΑΡΜΟΓΗΣ
public class Odhgies extends JFrame{

    JLabel od;
    
    Odhgies(){
    JFrame periballon = new JFrame("ΟΔΗΓΙΕΣ ΕΦΑΡΜΟΓΗΣ"); //ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ ΠΑΡΑΘΥΡΟΥ ΓΙΑ ΤΟ ΜΕΝΟΥ
    JButton[] okoumpi = new JButton[4]; //ΔΗΜΙΟΥΡΓΙΑ 4 ΚΟΥΜΠΙΩΝ ΤΟΥ ΜΕΝΟΥ
    
    int thesho=0;
    int katakoryfa = 50;
    
    okoumpi[0] = new JButton("Η παρούσα εφαρμογή συγκεντρώνει τις ερωτήσεις της εργασίας και τις απαντάει με User Interface.");
    okoumpi[1] = new JButton("Πατώντας το κουμπί με την ερώτηση, οδηγείστε σε παράθυρο με την λύση.");
    okoumpi[2] = new JButton("Για να πάτε στο πίσω παράθυρο, πατήστε ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΜΕΝΟΥ!");
    okoumpi[3] = new JButton("ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΜΕΝΟΥ");
    
    
    for (int i = 0; i < 4; i++) {
                okoumpi[thesho].setBounds(100, katakoryfa, 1200, 50);  //ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΚΑΙ ΤΙΣ ΣΥΝΤΕΤΑΓΜΕΝΕΣ ΓΙΑ ΤΗΝ ΤΟΠΟΘΕΤΗΣΗ ΤΩΝ ΚΟΥΜΠΙΩΝ
                okoumpi[thesho].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                         //ΑΝΑΛΟΓΑ ΠΟΙΟ ΚΟΥΜΠΙ ΠΟΥ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ ΤΟΝ ΟΔΗΓΕΙ ΣΤΗΝ ΑΝΤΙΣΤΟΙΧΗ ΣΕΛΙΔΑ
                            if (okoumpi[3] == e.getSource()) {//Η ΕΝΤΟΛΗ getSource() ΜΑΣ ΔΙΝΕΙ ΠΛΗΡΟΦΟΡΙΕΣ ΓΙΑ ΤΟ ΠΙΟ ΚΟΥΜΠΙ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ
                                Menu antikeimeno1 = new Menu(); //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΓΙΑ ΤΗΝ ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΜΕΝΟΥ
                                antikeimeno1.Arxh();
                            }
                            
                        }
                    }
                );
                periballon.add(okoumpi[thesho]);
                katakoryfa += 50;
                thesho++;
            }
    
    periballon.setSize(1500, 1000);//ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
    periballon.setLayout(null);
    periballon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ΓΙΑ ΤΟ ΚΛΕΙΣΙΜΟ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
    periballon.setVisible(true);//ΕΜΦΑΝΙΣΗ ΠΑΡΑΘΥΡΟΥ
}
}
