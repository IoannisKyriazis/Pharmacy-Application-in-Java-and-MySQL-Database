package com.mycompany.farmakeio;
import javax.swing.*;
import java.awt.event.*;



//ΚΟΥΜΠΙΑ ΓΙΑ ΤΗΝ ΕΠΙΛΟΓΗ ΤΟΥ ΧΡΗΣΤΗ ΠΟΙΑ ΕΡΩΤΗΣΗ ΘΕΛΕΙ ΝΑ ΤΟΥ ΕΜΦΑΝΙΣΕΙ
public class Erotiseis extends JFrame {

    void Erotiseis(){
        JFrame periballon = new JFrame("ΕΡΩΤΗΣΕΙΣ"); //ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ ΠΑΡΑΘΥΡΟΥ ΓΙΑ ΤΟ ΜΕΝΟΥ
        JButton[] mkoumpi = new JButton[12]; //ΔΗΜΙΟΥΡΓΙΑ 12 ΚΟΥΜΠΙΩΝ ΤΟΥ ΜΕΝΟΥ
        
        
        int theshm=0;
        int katakoryfa = 10;
        
        
        mkoumpi[0] = new JButton("ΕΡΩΤΗΣΗ 1. ΕΜΦΑΝΙΣΗ ΠΕΛΑΤΟΛΟΓΙΟΥ");
        mkoumpi[1] = new JButton("ΕΡΩΤΗΣΗ 2. ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ");
        mkoumpi[2] = new JButton("ΕΡΩΤΗΣΗ 3. ΕΜΦΑΝΙΣΗ ΠΡΟΜΗΘΕΥΤΩΝ");
        mkoumpi[3] = new JButton("ΕΡΩΤΗΣΗ 4. ΕΜΦΑΝΙΣΗ ΑΓΟΡΩΝ");
        mkoumpi[4] = new JButton("ΕΡΩΤΗΣΗ 5. ΕΜΦΑΝΙΣΗ ΑΠΟΘΗΚΩΝ ΠΟΥ ΒΡΙΣΚΟΝΤΑΙ ΣΤΟΝ ΔΙΑΔΡΟΜΟ 4");
        mkoumpi[5] = new JButton("ΕΡΩΤΗΣΗ 6. ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ ΚΑΤΑ ΑΥΞΟΥΣΑ ΤΙΜΗ");
        mkoumpi[6] = new JButton("ΕΡΩΤΗΣΗ 7. ΕΜΦΑΝΙΣΗ ΠΕΛΑΤΩΝ ΠΟΥ ΕΙΝΑΙ ΑΠΟ ΤΟΝ ΕΥΟΣΜΟ Ή ΤΗΝ ΘΕΣΣΑΛΟΝΙΚΗ");
        mkoumpi[7] = new JButton("ΕΡΩΤΗΣΗ 8. ΕΜΦΑΝΙΣΗ ΠΡΟΜΗΘΕΥΤΩΝ ΠΟΥ ΔΕΝ ΕΧΟΥΝ ΕΔΡΑ ΤΗΝ ΘΕΣΣΑΛΟΝΙΚΗ");
        mkoumpi[8] = new JButton("ΕΡΩΤΗΣΗ 9. ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ ΜΕ ΑΠΟΘΕΜΑ ΛΙΓΟΤΕΡΟ ΑΠΟ 4");
        mkoumpi[9] = new JButton("ΕΡΩΤΗΣΗ 10. ΕΜΦΑΝΙΣΗ ΠΡΟΪΟΝΤΩΝ ΠΟΥ ΕΙΝΑΙ ΟΡΘΟΠΕΔΙΚΑ");
        mkoumpi[10] = new JButton("ΕΠΙΠΛΕΟΝ ΕΡΩΤΗΣΗ. ΠΟΣΟΙ ΕΙΝΑΙ ΟΙ ΠΕΛΑΤΕΣ ΑΠΟ ΚΑΘΕ ΠΟΛΗ");
        mkoumpi[11] = new JButton("ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΜΕΝΟΥ");
        
        for (int i = 0; i < 12; i++) {
                mkoumpi[theshm].setBounds(50, katakoryfa, 600, 35);  //ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΚΑΙ ΤΙΣ ΣΥΝΤΕΤΑΓΜΕΝΕΣ ΓΙΑ ΤΗΝ ΤΟΠΟΘΕΤΗΣΗ ΤΩΝ ΚΟΥΜΠΙΩΝ
                mkoumpi[theshm].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                          //ΑΝΑΛΟΓΑ ΠΟΙΟ ΚΟΥΜΠΙ ΠΟΥ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ ΤΟΝ ΟΔΗΓΕΙ ΣΤΗΝ ΑΝΤΙΣΤΟΙΧΗ ΣΕΛΙΔΑ
                            if (mkoumpi[0] == e.getSource()) {//Η ΕΝΤΟΛΗ getSource() ΜΑΣ ΔΙΝΕΙ ΠΛΗΡΟΦΟΡΙΕΣ ΓΙΑ ΤΟ ΠΙΟ ΚΟΥΜΠΙ ΠΑΤΗΣΕ Ο ΧΡΗΣΤΗΣ
                                Apanthseis a1 = new Apanthseis();
                                a1.erotisi1();
                            }
                            else if(mkoumpi[1]==e.getSource()){
                                Apanthseis a2 = new Apanthseis();
                                a2.erotisi2();
                            }
                            else if(mkoumpi[2]==e.getSource()){
                                Apanthseis a3 = new Apanthseis();
                                a3.erotisi3();
                            }
                            else if(mkoumpi[3]==e.getSource()){
                                Apanthseis a4 = new Apanthseis();
                                a4.erotisi4();
                            }
                            else if(mkoumpi[4]==e.getSource()){
                                Apanthseis a5 = new Apanthseis();
                                a5.erotisi5();
                            }
                            else if(mkoumpi[5]==e.getSource()){
                                Apanthseis a6 = new Apanthseis();
                                a6.erotisi6();
                            }
                            else if(mkoumpi[6]==e.getSource()){
                                Apanthseis a7 = new Apanthseis();
                                a7.erotisi7();
                            }
                            else if(mkoumpi[7]==e.getSource()){
                                Apanthseis a8 = new Apanthseis();
                                a8.erotisi8();
                            }
                            else if(mkoumpi[8]==e.getSource()){
                                Apanthseis a9 = new Apanthseis();
                                a9.erotisi9();
                            }
                            else if(mkoumpi[9]==e.getSource()){
                                Apanthseis a10 = new Apanthseis();
                                a10.erotisi10();
                            }
                            else if(mkoumpi[10]==e.getSource()){
                                Apanthseis aepipleon = new Apanthseis();
                                aepipleon.erotisiepipleon();
                            }
                            else if(mkoumpi[11]==e.getSource()){
                                Menu antikeimeno1 = new Menu(); //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΓΙΑ ΤΗΝ ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΜΕΝΟΥ
                                antikeimeno1.Arxh();
                            }
                        }
                    }
                );
                periballon.add(mkoumpi[theshm]);
                katakoryfa += 40;
                theshm++;
            }
        periballon.setSize(1500, 1000);//ΔΙΝΟΥΜΕ ΤΙΣ ΔΙΑΣΤΑΣΕΙΣ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
        periballon.setLayout(null);
        periballon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ΓΙΑ ΤΟ ΚΛΕΙΣΙΜΟ ΤΟΥ ΠΑΡΑΘΥΡΟΥ
        periballon.setVisible(true);//ΕΜΦΑΝΙΣΗ ΠΑΡΑΘΥΡΟΥ
        }

}
