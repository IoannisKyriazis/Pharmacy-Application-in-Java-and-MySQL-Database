package com.mycompany.farmakeio;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//ΠΛΗΡΟΦΟΡΙΕΣ ΟΜΑΔΑΣ ΥΛΟΠΟΙΗΣΗΣ ΤΗΣ ΕΦΑΡΜΟΓΗΣ
public class Plomadas extends JFrame{
    
    JLabel po;
    
    Plomadas(){
    JFrame periballon = new JFrame("ΠΛΗΡΟΦΟΡΙΕΣ ΟΜΑΔΑΣ"); //ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ ΠΑΡΑΘΥΡΟΥ ΓΙΑ ΤΟ ΜΕΝΟΥ
    JButton[] pkoumpi = new JButton[5]; //ΔΗΜΙΟΥΡΓΙΑ 5 ΚΟΥΜΠΙΩΝ ΤΟΥ ΜΕΝΟΥ
    
    int theshp=0;
    int katakoryfa = 50;
    
    pkoumpi[0] = new JButton("ΚΥΡΙΑΖΗΣ ΙΩΑΝΝΗΣ 3212018107");
    pkoumpi[1] = new JButton("ΠΑΠΑΔΟΠΟΥΛΟΣ ΠΑΝΑΓΙΩΤΗΣ 3212018161");
    pkoumpi[2] = new JButton("ΜΑΜΟΥΛΕΛΛΗΣ ΑΠΟΣΤΟΛΟΣ 3212017108");
    pkoumpi[3] = new JButton("© Copyright 2020 - All Rights Reserved");
    pkoumpi[4] = new JButton("ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΜΕΝΟΥ");
    
    
    for (int i = 0; i < 5; i++) {
                pkoumpi[theshp].setBounds(100, katakoryfa, 1200, 50);  //ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΚΑΙ ΤΙΣ ΣΥΝΤΕΤΑΓΜΕΝΕΣ ΓΙΑ ΤΗΝ ΤΟΠΟΘΕΤΗΣΗ ΤΩΝ ΚΟΥΜΠΙΩΝ
                pkoumpi[theshp].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                          //ΑΝΑΛΟΓΑ ΠΟΙΟ ΚΟΥΜΠΙ ΠΟΥ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ ΤΟΝ ΟΔΗΓΕΙ ΣΤΗΝ ΑΝΤΙΣΤΟΙΧΗ ΣΕΛΙΔΑ
                            if (pkoumpi[4] == e.getSource()) {//Η ΕΝΤΟΛΗ getSource() ΜΑΣ ΔΙΝΕΙ ΠΛΗΡΟΦΟΡΙΕΣ ΓΙΑ ΤΟ ΠΙΟ ΚΟΥΜΠΙ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ
                                Menu antikeimeno1 = new Menu();  //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΓΙΑ ΤΗΝ ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΜΕΝΟΥ
                                antikeimeno1.Arxh();
                            }
                            
                        }
                    }
                );
                periballon.add(pkoumpi[theshp]);
                katakoryfa += 50;
                theshp++;
            }
    
    periballon.setSize(1500, 1000);//ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
    periballon.setLayout(null);
    periballon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ΓΙΑ ΤΟ ΚΛΕΙΣΙΜΟ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
    periballon.setVisible(true);//ΕΜΦΑΝΙΣΗ ΠΑΡΑΘΥΡΟΥ
}
}
