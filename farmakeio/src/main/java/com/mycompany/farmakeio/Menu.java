package com.mycompany.farmakeio;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


//ΜΕΝΟΥ ΤΗΣ ΕΦΑΡΜΟΓΗΣ
public class Menu{

        void Arxh(){ //ΣΥΝΑΡΤΗΣΗ ΓΙΑ ΤΗΝ ΑΡΧΗ ΤΗΣ ΕΦΑΡΜΟΓΗΣ
        JFrame periballon = new JFrame("ΕΦΑΡΜΟΓΗ ΓΙΑ ΦΑΡΜΑΚΕΙΟ\n(ΥΛΟΠΟΙΗΣΗ ΕΡΩΤΗΣΕΩΝ ΣΕ USER INTERFACE)"); //ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ ΠΑΡΑΘΥΡΟΥ ΓΙΑ ΤΟ ΜΕΝΟΥ
        JButton[] mkoumpi = new JButton[4]; //ΔΗΜΙΟΥΡΓΙΑ 4 ΚΟΥΜΠΙΩΝ ΤΟΥ ΜΕΝΟΥ
        
        
        int theshm=0;
        int katakoryfa = 50;
        
        
        mkoumpi[0] = new JButton("ΑΠΑΝΤΗΣΕΙΣ ΣΤΙΣ ΕΡΩΤΗΣΕΙΣ");
        mkoumpi[1] = new JButton("ΟΔΗΓΙΕΣ");  //ΠΕΡΙΕΧΟΜΕΝΑ ΤΟΥ ΜΕΝΟΥ
        mkoumpi[2] = new JButton("ΠΛΗΡΟΦΟΡΙΕΣ ΟΜΑΔΑΣ");
        mkoumpi[3] = new JButton("ΕΞΟΔΟΣ");
        
        for (int i = 0; i < 4; i++) {
                mkoumpi[theshm].setBounds(50, katakoryfa, 200, 40);  //ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΚΑΙ ΤΙΣ ΣΥΝΤΕΤΑΓΜΕΝΕΣ ΓΙΑ ΤΗΝ ΤΟΠΟΘΕΤΗΣΗ ΤΩΝ ΚΟΥΜΠΙΩΝ
                mkoumpi[theshm].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                          //ΑΝΑΛΟΓΑ ΠΟΙΟ ΚΟΥΜΠΙ ΠΟΥ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ ΤΟΝ ΟΔΗΓΕΙ ΣΤΗΝ ΑΝΤΙΣΤΟΙΧΗ ΣΕΛΙΔΑ
                            if (mkoumpi[0] == e.getSource()) {//Η ΕΝΤΟΛΗ getSource() ΜΑΣ ΔΙΝΕΙ ΠΛΗΡΟΦΟΡΙΕΣ ΓΙΑ ΤΟ ΠΙΟ ΚΟΥΜΠΙ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ
                                Erotiseis a = new Erotiseis();
                                a.Erotiseis();
                            }
                            else if(mkoumpi[1]==e.getSource()){
                                Odhgies o=new Odhgies();
                            }
                            else if(mkoumpi[2]==e.getSource()){
                                Plomadas p=new Plomadas();
                            }
                            else if(mkoumpi[3]==e.getSource()){
                                System.exit(0);
                            }
                        }
                    }
                );
                periballon.add(mkoumpi[theshm]);
                katakoryfa += 50;
                theshm++;
            }
        periballon.setSize(1500, 1000);//ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
        periballon.setLayout(null);
        periballon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ΓΙΑ ΤΟ ΚΛΕΙΣΙΜΟ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
        periballon.setVisible(true);//ΕΜΦΑΝΙΣΗ ΠΑΡΑΘΥΡΟΥ
        }
        
        
    }
