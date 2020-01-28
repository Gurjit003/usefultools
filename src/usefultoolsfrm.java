/*
 * Gurjit Singh
 * Friday December 27th - 2019
 * This program displays the useful tools
 */

import java.awt.Color; 
import javax.swing.JOptionPane; 

/**
 *
 * @author gusin5788
 */
public class usefultoolsfrm extends javax.swing.JFrame {
    
    // TIC TAC TOE Declarations
    private String startGame = "X"; 
    private int xCount = 0;
    private int oCount = 0;
    
    /**
     * Creates new form usefultoolsfrm
     */
    public usefultoolsfrm() {
        initComponents();
    }
    
    // TIC TAC TOE Methods for switching between player X and O
    private void choose_a_Player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        }
        else {
            startGame = "X";
        }
    }
    
    // TIC TAC TOE Method for determining the winner
    private void winningGame() {
        String b1 = btn31.getText();
        String b2 = btn32.getText();
        String b3 = btn33.getText();
        
        String b4 = btn34.getText();
        String b5 = btn35.getText();
        String b6 = btn36.getText();
        
        String b7 = btn37.getText();
        String b8 = btn38.getText();
        String b9 = btn39.getText();
        
        // Winning ways for player X
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn31.setBackground(Color.CYAN);
            btn32.setBackground(Color.CYAN);
            btn33.setBackground(Color.CYAN);
        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn34.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn36.setBackground(Color.CYAN);
        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn37.setBackground(Color.CYAN);
            btn38.setBackground(Color.CYAN);
            btn39.setBackground(Color.CYAN);
        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn31.setBackground(Color.CYAN);
            btn34.setBackground(Color.CYAN);
            btn37.setBackground(Color.CYAN);
        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn32.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn38.setBackground(Color.CYAN);
        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn33.setBackground(Color.CYAN);
            btn36.setBackground(Color.CYAN);
            btn39.setBackground(Color.CYAN);
        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn31.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn39.setBackground(Color.CYAN);
        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn33.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn37.setBackground(Color.CYAN);
        }
        
        // Winning ways for player O
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn31.setBackground(Color.CYAN);
            btn32.setBackground(Color.CYAN);
            btn33.setBackground(Color.CYAN);
        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn34.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn36.setBackground(Color.CYAN);
        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn37.setBackground(Color.CYAN);
            btn38.setBackground(Color.CYAN);
            btn39.setBackground(Color.CYAN);
        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn31.setBackground(Color.CYAN);
            btn34.setBackground(Color.CYAN);
            btn37.setBackground(Color.CYAN);
        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn32.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn38.setBackground(Color.CYAN);
        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn33.setBackground(Color.CYAN);
            btn36.setBackground(Color.CYAN);
            btn39.setBackground(Color.CYAN);
        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn31.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn39.setBackground(Color.CYAN);
        }
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            btn33.setBackground(Color.CYAN);
            btn35.setBackground(Color.CYAN);
            btn37.setBackground(Color.CYAN);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsPanel = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        pnlFirst = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        btn30 = new javax.swing.JButton();
        pnlSecond = new javax.swing.JPanel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        btn10 = new javax.swing.JButton();
        pnlThird = new javax.swing.JPanel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        pnlFourth = new javax.swing.JPanel();
        lbl29 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lbl36 = new javax.swing.JLabel();
        lbl37 = new javax.swing.JLabel();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        pnlFifth = new javax.swing.JPanel();
        lbl38 = new javax.swing.JLabel();
        lbl39 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        pnlSixth = new javax.swing.JPanel();
        lbl45 = new javax.swing.JLabel();
        lbl46 = new javax.swing.JLabel();
        lbl47 = new javax.swing.JLabel();
        lbl48 = new javax.swing.JLabel();
        lbl49 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        lbl55 = new javax.swing.JLabel();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        pnlSeventh = new javax.swing.JPanel();
        lbl56 = new javax.swing.JLabel();
        lbl57 = new javax.swing.JLabel();
        lbl58 = new javax.swing.JLabel();
        lbl59 = new javax.swing.JLabel();
        lbl60 = new javax.swing.JLabel();
        lbl61 = new javax.swing.JLabel();
        lbl62 = new javax.swing.JLabel();
        lbl63 = new javax.swing.JLabel();
        lbl64 = new javax.swing.JLabel();
        lbl65 = new javax.swing.JLabel();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        btn26 = new javax.swing.JButton();
        pnlEighth = new javax.swing.JPanel();
        lbl66 = new javax.swing.JLabel();
        lbl67 = new javax.swing.JLabel();
        lbl68 = new javax.swing.JLabel();
        lbl69 = new javax.swing.JLabel();
        lbl70 = new javax.swing.JLabel();
        lbl71 = new javax.swing.JLabel();
        lbl72 = new javax.swing.JLabel();
        lbl73 = new javax.swing.JLabel();
        lbl74 = new javax.swing.JLabel();
        lbl75 = new javax.swing.JLabel();
        lbl76 = new javax.swing.JLabel();
        lbl77 = new javax.swing.JLabel();
        lbl78 = new javax.swing.JLabel();
        lbl79 = new javax.swing.JLabel();
        txt24 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        txt28 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt34 = new javax.swing.JTextField();
        btn27 = new javax.swing.JButton();
        pnlNinth = new javax.swing.JPanel();
        lbl80 = new javax.swing.JLabel();
        lbl81 = new javax.swing.JLabel();
        lbl82 = new javax.swing.JLabel();
        lbl83 = new javax.swing.JLabel();
        lbl84 = new javax.swing.JLabel();
        txt35 = new javax.swing.JTextField();
        txt36 = new javax.swing.JTextField();
        txt37 = new javax.swing.JTextField();
        txt38 = new javax.swing.JTextField();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        pnlTenth = new javax.swing.JPanel();
        lbl85 = new javax.swing.JLabel();
        pnlTenth1 = new javax.swing.JPanel();
        pnlTenth2 = new javax.swing.JPanel();
        btn31 = new javax.swing.JButton();
        pnlTenth3 = new javax.swing.JPanel();
        btn32 = new javax.swing.JButton();
        pnlTenth4 = new javax.swing.JPanel();
        btn33 = new javax.swing.JButton();
        pnlTenth5 = new javax.swing.JPanel();
        lbl86 = new javax.swing.JLabel();
        pnlTenth6 = new javax.swing.JPanel();
        btn34 = new javax.swing.JButton();
        pnlTenth7 = new javax.swing.JPanel();
        btn35 = new javax.swing.JButton();
        pnlTenth8 = new javax.swing.JPanel();
        btn36 = new javax.swing.JButton();
        pnlTenth9 = new javax.swing.JPanel();
        lbl87 = new javax.swing.JLabel();
        pnlTenth10 = new javax.swing.JPanel();
        btn37 = new javax.swing.JButton();
        pnlTenth11 = new javax.swing.JPanel();
        btn38 = new javax.swing.JButton();
        pnlTenth12 = new javax.swing.JPanel();
        btn39 = new javax.swing.JButton();
        pnlTenth13 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        optionsPanel.setBackground(new java.awt.Color(153, 153, 255));
        optionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lbl1.setText("Everyday Useful Tools");
        optionsPanel.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black-and-white-rose-png-13.png"))); // NOI18N
        optionsPanel.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 250, 210));

        btn1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn1.setText("MENU");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btn2.setBackground(new java.awt.Color(255, 0, 51));
        btn2.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn2.setText("Option 1");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btn3.setBackground(new java.awt.Color(255, 102, 0));
        btn3.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn3.setText("Option 2");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btn4.setBackground(new java.awt.Color(255, 204, 0));
        btn4.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn4.setText("Option 3");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        btn5.setBackground(new java.awt.Color(0, 153, 0));
        btn5.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn5.setText("Option 4");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        btn6.setBackground(new java.awt.Color(0, 102, 204));
        btn6.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn6.setText("Option 5");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        btn7.setBackground(new java.awt.Color(153, 0, 153));
        btn7.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn7.setText("Option 6");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        btn8.setBackground(new java.awt.Color(204, 0, 153));
        btn8.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn8.setText("Option 7");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        btn9.setBackground(new java.awt.Color(255, 102, 153));
        btn9.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn9.setText("Option 8");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        optionsPanel.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        parentPanel.setBackground(new java.awt.Color(0, 0, 255));
        parentPanel.setLayout(new java.awt.CardLayout());

        pnlFirst.setBackground(new java.awt.Color(153, 153, 255));
        pnlFirst.setMinimumSize(new java.awt.Dimension(860, 350));

        lbl3.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl3.setText("Menu Index");

        lbl4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl4.setText("Option 1 - Course Average Calculator");

        lbl5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl5.setText("Option 2 - Math Methods");

        lbl6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl6.setText("Option 3 - Squares, Cubes, And Powers");

        lbl7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl7.setText("Option 4 - Factorial, Prime, And Fibonacci");

        lbl8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl8.setText("Option 5 - Binary And Hexadecimal");

        lbl9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl9.setText("Option 6 - Discounts");

        lbl10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl10.setText("Option 7 - Money Splitter");

        lbl11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl11.setText("Option 8 - Encryption And Decryption");

        btn30.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn30.setText("SURPRISE!");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFirstLayout = new javax.swing.GroupLayout(pnlFirst);
        pnlFirst.setLayout(pnlFirstLayout);
        pnlFirstLayout.setHorizontalGroup(
            pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFirstLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFirstLayout.createSequentialGroup()
                        .addComponent(lbl5)
                        .addGap(198, 198, 198)
                        .addComponent(lbl9))
                    .addGroup(pnlFirstLayout.createSequentialGroup()
                        .addComponent(lbl6)
                        .addGap(89, 89, 89)
                        .addComponent(lbl10))
                    .addGroup(pnlFirstLayout.createSequentialGroup()
                        .addComponent(lbl7)
                        .addGap(66, 66, 66)
                        .addComponent(lbl11))
                    .addGroup(pnlFirstLayout.createSequentialGroup()
                        .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFirstLayout.createSequentialGroup()
                                .addComponent(lbl4)
                                .addGap(107, 107, 107)
                                .addComponent(lbl8)
                                .addGap(56, 56, 56))
                            .addGroup(pnlFirstLayout.createSequentialGroup()
                                .addComponent(lbl3)
                                .addGap(140, 140, 140)
                                .addComponent(btn30)
                                .addGap(46, 46, 46)))
                        .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlFirstLayout.setVerticalGroup(
            pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFirstLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl3)
                        .addComponent(btn30))
                    .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl4)
                    .addComponent(lbl8))
                .addGap(49, 49, 49)
                .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl5)
                    .addComponent(lbl9))
                .addGap(49, 49, 49)
                .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl6)
                    .addComponent(lbl10))
                .addGap(49, 49, 49)
                .addGroup(pnlFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl7)
                    .addComponent(lbl11)))
        );

        parentPanel.add(pnlFirst, "card4");

        pnlSecond.setBackground(new java.awt.Color(255, 0, 51));

        lbl13.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl13.setText("Course Average Calculator");

        lbl14.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl14.setText("Enter in your four course marks and click Calculate Average");

        lbl15.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl15.setText("Course Mark 1:");

        lbl16.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl16.setText("Course Mark 2:");

        lbl17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl17.setText("Course Mark 3:");

        lbl18.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl18.setText("Course Mark 4:");

        lbl19.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btn10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn10.setText("Calculate Average");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSecondLayout = new javax.swing.GroupLayout(pnlSecond);
        pnlSecond.setLayout(pnlSecondLayout);
        pnlSecondLayout.setHorizontalGroup(
            pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecondLayout.createSequentialGroup()
                .addGroup(pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSecondLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lbl13))
                    .addGroup(pnlSecondLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lbl14))
                    .addGroup(pnlSecondLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btn10))
                    .addGroup(pnlSecondLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(lbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSecondLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl16)
                            .addComponent(lbl15)
                            .addComponent(lbl17)
                            .addComponent(lbl18))
                        .addGap(136, 136, 136)
                        .addGroup(pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(215, 215, 215))
        );
        pnlSecondLayout.setVerticalGroup(
            pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecondLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl13)
                .addGap(15, 15, 15)
                .addComponent(lbl14)
                .addGap(16, 16, 16)
                .addGroup(pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl15)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl16)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl17)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl18)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btn10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        parentPanel.add(pnlSecond, "card3");

        pnlThird.setBackground(new java.awt.Color(255, 102, 0));

        lbl20.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl20.setText("Math Methods");

        lbl21.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl21.setText("Enter the length of two sides of a right triangle. The program will display the hypotenuse of the triangle.");

        lbl22.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl22.setText("..............");

        lbl23.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl23.setText("Enter a decimal value. The program will display the value rounded up to the nearest integer.");

        lbl24.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl24.setText("..............");

        lbl25.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl25.setText("Enter a decimal value. The program will display the value rounded down to the nearest integer.");

        lbl26.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl26.setText("..............");

        lbl27.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl27.setText("Enter an angle in degrees. The program will display the angle in radians.");

        lbl28.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl28.setText("..............");

        txt5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btn11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn11.setText("Hypotenuse");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn12.setText("Rounded Up");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn13.setText("Rounded Down");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn14.setText("In Radians");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlThirdLayout = new javax.swing.GroupLayout(pnlThird);
        pnlThird.setLayout(pnlThirdLayout);
        pnlThirdLayout.setHorizontalGroup(
            pnlThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThirdLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lbl20))
                    .addComponent(lbl21)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btn11)
                        .addGap(89, 89, 89)
                        .addComponent(lbl22))
                    .addComponent(lbl23)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(btn12)
                        .addGap(85, 85, 85)
                        .addComponent(lbl24))
                    .addComponent(lbl25)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(btn13)
                        .addGap(73, 73, 73)
                        .addComponent(lbl26))
                    .addComponent(lbl27)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(btn14)
                        .addGap(91, 91, 91)
                        .addComponent(lbl28)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlThirdLayout.setVerticalGroup(
            pnlThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThirdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl20)
                .addGap(13, 13, 13)
                .addComponent(lbl21)
                .addGap(19, 19, 19)
                .addGroup(pnlThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl22)))
                .addGap(9, 9, 9)
                .addComponent(lbl23)
                .addGap(19, 19, 19)
                .addGroup(pnlThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl24)))
                .addGap(19, 19, 19)
                .addComponent(lbl25)
                .addGap(19, 19, 19)
                .addGroup(pnlThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl26)))
                .addGap(19, 19, 19)
                .addComponent(lbl27)
                .addGap(9, 9, 9)
                .addGroup(pnlThirdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14)
                    .addGroup(pnlThirdLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl28)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        parentPanel.add(pnlThird, "card2");

        pnlFourth.setBackground(new java.awt.Color(255, 204, 0));

        lbl29.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl29.setText("Squares, Cubes, And Powers");

        lbl30.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl30.setText("Enter an number. The program will display the number squared.");

        lbl31.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl31.setText("..............");

        lbl32.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl32.setText("Enter an number. The program will display the number cubed.");

        lbl33.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl33.setText("..............");

        lbl34.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl34.setText("Enter the base and the exponent. The program will display the first number to the power of the second.");

        lbl35.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl35.setText("..............");

        lbl36.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl36.setText("Enter an number. The program will display the square root of the number.");

        lbl37.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl37.setText("..............");

        txt10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt13.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt14.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btn15.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn15.setText("Square");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn16.setText("Cube");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn17.setText("Power");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn18.setText("Square Root");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFourthLayout = new javax.swing.GroupLayout(pnlFourth);
        pnlFourth.setLayout(pnlFourthLayout);
        pnlFourthLayout.setHorizontalGroup(
            pnlFourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(lbl29))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl30))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(btn15)
                .addGap(141, 141, 141)
                .addComponent(lbl31))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl32))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(btn16)
                .addGap(145, 145, 145)
                .addComponent(lbl33))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl34))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btn17)
                .addGap(137, 137, 137)
                .addComponent(lbl35))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl36))
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btn18)
                .addGap(119, 119, 119)
                .addComponent(lbl37))
        );
        pnlFourthLayout.setVerticalGroup(
            pnlFourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFourthLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl29)
                .addGap(15, 15, 15)
                .addComponent(lbl30)
                .addGap(19, 19, 19)
                .addGroup(pnlFourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15)
                    .addGroup(pnlFourthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl31)))
                .addGap(9, 9, 9)
                .addComponent(lbl32)
                .addGap(19, 19, 19)
                .addGroup(pnlFourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16)
                    .addGroup(pnlFourthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl33)))
                .addGap(19, 19, 19)
                .addComponent(lbl34)
                .addGap(19, 19, 19)
                .addGroup(pnlFourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17)
                    .addGroup(pnlFourthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl35)))
                .addGap(19, 19, 19)
                .addComponent(lbl36)
                .addGap(9, 9, 9)
                .addGroup(pnlFourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18)
                    .addGroup(pnlFourthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl37))))
        );

        parentPanel.add(pnlFourth, "card5");

        pnlFifth.setBackground(new java.awt.Color(0, 153, 0));

        lbl38.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl38.setText("Factorial, Prime, And Fibonacci");

        lbl39.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl39.setText("Enter a number and click the button to find the factorial.");

        lbl40.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl40.setText("..............");

        lbl41.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl41.setText("Enter a number and click the button to determine whether or not it is a prime number.");

        lbl42.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl42.setText("..............");

        lbl43.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl43.setText("Enter a number and click the button to see the corresponding Fibonacci number.");

        lbl44.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl44.setText("..............");

        txt15.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt16.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btn19.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn19.setText("Factorial");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn20.setText("Prime");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn21.setText("Fibonacci");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFifthLayout = new javax.swing.GroupLayout(pnlFifth);
        pnlFifth.setLayout(pnlFifthLayout);
        pnlFifthLayout.setHorizontalGroup(
            pnlFifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(lbl38))
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl39))
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(btn19)
                .addGap(117, 117, 117)
                .addComponent(lbl40))
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl41))
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btn20)
                .addGap(129, 129, 129)
                .addComponent(lbl42))
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl43))
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(btn21)
                .addGap(111, 111, 111)
                .addComponent(lbl44))
        );
        pnlFifthLayout.setVerticalGroup(
            pnlFifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFifthLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl38)
                .addGap(25, 25, 25)
                .addComponent(lbl39)
                .addGap(19, 19, 19)
                .addGroup(pnlFifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19)
                    .addGroup(pnlFifthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl40)))
                .addGap(29, 29, 29)
                .addComponent(lbl41)
                .addGap(29, 29, 29)
                .addGroup(pnlFifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20)
                    .addGroup(pnlFifthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl42)))
                .addGap(29, 29, 29)
                .addComponent(lbl43)
                .addGap(29, 29, 29)
                .addGroup(pnlFifthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21)
                    .addGroup(pnlFifthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl44))))
        );

        parentPanel.add(pnlFifth, "card6");

        pnlSixth.setBackground(new java.awt.Color(0, 102, 204));

        lbl45.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl45.setText("Binary And Hexadecimal");

        lbl46.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl46.setText("Decimal And Binary");

        lbl47.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl47.setText("Enter a decimal number:");

        lbl48.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl48.setText("Enter a binary number:");

        lbl49.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl49.setText("..............");

        lbl50.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl50.setText("..............");

        lbl51.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl51.setText("Decimal And Hexadecimal");

        lbl52.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl52.setText("Enter a decimal number:");

        lbl53.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl53.setText("Enter a hexadecimal number:");

        lbl54.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl54.setText("..............");

        lbl55.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl55.setText("..............");

        txt18.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt19.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt20.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt21.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btn22.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn22.setText("Decimal to Binary");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn23.setText("Binary to Decimal");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn24.setText("Decimal to Hexadecimal");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn25.setText("Hexadecimal to Decimal");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSixthLayout = new javax.swing.GroupLayout(pnlSixth);
        pnlSixth.setLayout(pnlSixthLayout);
        pnlSixthLayout.setHorizontalGroup(
            pnlSixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(lbl45))
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(lbl46))
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl47)
                .addGap(62, 62, 62)
                .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn22)
                .addGap(65, 65, 65)
                .addComponent(lbl49))
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl48)
                .addGap(73, 73, 73)
                .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn23)
                .addGap(65, 65, 65)
                .addComponent(lbl50))
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lbl51))
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl52)
                .addGap(62, 62, 62)
                .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn24)
                .addGap(55, 55, 55)
                .addComponent(lbl54))
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl53)
                .addGap(24, 24, 24)
                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn25)
                .addGap(55, 55, 55)
                .addComponent(lbl55))
        );
        pnlSixthLayout.setVerticalGroup(
            pnlSixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSixthLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl45)
                .addGap(16, 16, 16)
                .addComponent(lbl46)
                .addGap(29, 29, 29)
                .addGroup(pnlSixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl47)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22)
                    .addGroup(pnlSixthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl49)))
                .addGap(19, 19, 19)
                .addGroup(pnlSixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl48)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23)
                    .addGroup(pnlSixthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl50)))
                .addGap(19, 19, 19)
                .addComponent(lbl51)
                .addGap(29, 29, 29)
                .addGroup(pnlSixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl52)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24)
                    .addGroup(pnlSixthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl54)))
                .addGap(29, 29, 29)
                .addGroup(pnlSixthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl53)
                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25)
                    .addGroup(pnlSixthLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl55))))
        );

        parentPanel.add(pnlSixth, "card7");

        pnlSeventh.setBackground(new java.awt.Color(153, 0, 153));

        lbl56.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl56.setText("Discounts");

        lbl57.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl57.setText("To calculate the price of something after the discount, enter the following");

        lbl58.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl58.setText("Enter the amount spent:");

        lbl59.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl59.setText("Enter the discount as a percentage:");

        lbl60.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl60.setText("...................................");

        lbl61.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl61.setText("...................................");

        lbl62.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl62.setText("...................................");

        lbl63.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl63.setText("...................................");

        lbl64.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl64.setText("$");

        lbl65.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl65.setText("%");

        txt22.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt23.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btn26.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn26.setText("Total Spent After Discount");
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSeventhLayout = new javax.swing.GroupLayout(pnlSeventh);
        pnlSeventh.setLayout(pnlSeventhLayout);
        pnlSeventhLayout.setHorizontalGroup(
            pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeventhLayout.createSequentialGroup()
                .addGroup(pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSeventhLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(lbl56))
                    .addGroup(pnlSeventhLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbl57))
                    .addGroup(pnlSeventhLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lbl58)
                        .addGap(144, 144, 144)
                        .addComponent(lbl64)
                        .addGap(5, 5, 5)
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSeventhLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lbl59)
                        .addGap(81, 81, 81)
                        .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbl65))
                    .addGroup(pnlSeventhLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btn26))
                    .addGroup(pnlSeventhLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl60, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl61))
                        .addGap(100, 100, 100)
                        .addGroup(pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl63)
                            .addComponent(lbl62))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        pnlSeventhLayout.setVerticalGroup(
            pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeventhLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl56)
                .addGap(5, 5, 5)
                .addComponent(lbl57)
                .addGap(19, 19, 19)
                .addGroup(pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl58)
                    .addComponent(lbl64)
                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl59)
                    .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl65))
                .addGap(32, 32, 32)
                .addComponent(btn26)
                .addGap(31, 31, 31)
                .addGroup(pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSeventhLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl62)))
                .addGap(29, 29, 29)
                .addGroup(pnlSeventhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl61)
                    .addComponent(lbl63)))
        );

        parentPanel.add(pnlSeventh, "card8");

        pnlEighth.setBackground(new java.awt.Color(204, 0, 153));

        lbl66.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl66.setText("Money Splitter");

        lbl67.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl67.setText("Enter the amount of money to convert.");

        lbl68.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl68.setText("Amount of money:");

        lbl69.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl69.setText("$");

        lbl70.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl70.setText("$100 Bills:");

        lbl71.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl71.setText("$50 Bills:");

        lbl72.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl72.setText("$20 Bills:");

        lbl73.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl73.setText("$10 Bills:");

        lbl74.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl74.setText("$5 Bills:");

        lbl75.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl75.setText("$2 Coins:");

        lbl76.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl76.setText("$1 Coins:");

        lbl77.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl77.setText("$0.25 Coins:");

        lbl78.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl78.setText("$0.10 Coins:");

        lbl79.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl79.setText("$0.05 Coins:");

        txt24.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt25.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt26.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt27.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt28.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt29.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt30.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt31.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt32.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt33.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt34.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btn27.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn27.setText("Convert");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEighthLayout = new javax.swing.GroupLayout(pnlEighth);
        pnlEighth.setLayout(pnlEighthLayout);
        pnlEighthLayout.setHorizontalGroup(
            pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEighthLayout.createSequentialGroup()
                .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(lbl66))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lbl67))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(lbl68)
                        .addGap(18, 18, 18)
                        .addComponent(lbl69)
                        .addGap(5, 5, 5)
                        .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbl70)
                        .addGap(74, 74, 74)
                        .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lbl75)
                        .addGap(83, 83, 83)
                        .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbl71)
                        .addGap(83, 83, 83)
                        .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lbl76)
                        .addGap(85, 85, 85)
                        .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbl72)
                        .addGap(83, 83, 83)
                        .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lbl77)
                        .addGap(57, 57, 57)
                        .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbl73)
                        .addGap(85, 85, 85)
                        .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lbl78)
                        .addGap(58, 58, 58)
                        .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbl74)
                        .addGap(94, 94, 94)
                        .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lbl79)
                        .addGap(56, 56, 56)
                        .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(btn27)))
                .addGap(139, 139, 139))
        );
        pnlEighthLayout.setVerticalGroup(
            pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEighthLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl66)
                .addGap(5, 5, 5)
                .addComponent(lbl67)
                .addGap(9, 9, 9)
                .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl69)
                        .addComponent(lbl68))
                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEighthLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlEighthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addComponent(btn27)
                .addContainerGap())
        );

        parentPanel.add(pnlEighth, "card9");

        pnlNinth.setBackground(new java.awt.Color(255, 102, 153));

        lbl80.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl80.setText("Encryption And Decryption");

        lbl81.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl81.setText("Enter a decrypted message and it will encrypted:");

        lbl82.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl82.setText("-------------------------------------------------------");

        lbl83.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl83.setText("Enter an encrypted message and it will decrypted:");

        lbl84.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lbl84.setText("------------------------------------------------------");

        txt35.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt36.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txt36.setText("Encrypted message will be displayed here:");

        txt37.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txt38.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txt38.setText("Decrypted message will be displayed here:");

        btn28.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn28.setText("Encrypt");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn29.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn29.setText("Decrypt");
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNinthLayout = new javax.swing.GroupLayout(pnlNinth);
        pnlNinth.setLayout(pnlNinthLayout);
        pnlNinthLayout.setHorizontalGroup(
            pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNinthLayout.createSequentialGroup()
                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNinthLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNinthLayout.createSequentialGroup()
                                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl82, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl84)))
                            .addGroup(pnlNinthLayout.createSequentialGroup()
                                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl81)
                                    .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl83)
                                    .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlNinthLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(lbl80)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(pnlNinthLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btn28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn29)
                .addGap(171, 171, 171))
        );
        pnlNinthLayout.setVerticalGroup(
            pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNinthLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl80)
                .addGap(27, 27, 27)
                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl81)
                    .addComponent(lbl83))
                .addGap(31, 31, 31)
                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn28)
                    .addComponent(btn29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(pnlNinthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl82)
                    .addComponent(lbl84))
                .addGap(44, 44, 44))
        );

        parentPanel.add(pnlNinth, "card10");

        pnlTenth.setLayout(new java.awt.BorderLayout());

        lbl85.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        lbl85.setText("                                                                       TIC TAC TOE");
        pnlTenth.add(lbl85, java.awt.BorderLayout.PAGE_START);

        pnlTenth1.setBackground(new java.awt.Color(0, 0, 0));
        pnlTenth1.setLayout(new java.awt.GridLayout(3, 4, 2, 2));

        pnlTenth2.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth2.setLayout(new java.awt.BorderLayout());

        btn31.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });
        pnlTenth2.add(btn31, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth2);

        pnlTenth3.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth3.setLayout(new java.awt.BorderLayout());

        btn32.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        pnlTenth3.add(btn32, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth3);

        pnlTenth4.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth4.setLayout(new java.awt.BorderLayout());

        btn33.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });
        pnlTenth4.add(btn33, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth4);

        pnlTenth5.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth5.setLayout(new java.awt.BorderLayout());

        lbl86.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        lbl86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl86.setText("Player X");
        pnlTenth5.add(lbl86, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth5);

        pnlTenth6.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth6.setLayout(new java.awt.BorderLayout());

        btn34.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });
        pnlTenth6.add(btn34, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth6);

        pnlTenth7.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth7.setLayout(new java.awt.BorderLayout());

        btn35.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });
        pnlTenth7.add(btn35, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth7);

        pnlTenth8.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth8.setLayout(new java.awt.BorderLayout());

        btn36.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });
        pnlTenth8.add(btn36, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth8);

        pnlTenth9.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth9.setLayout(new java.awt.BorderLayout());

        lbl87.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        lbl87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl87.setText("Player O");
        pnlTenth9.add(lbl87, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth9);

        pnlTenth10.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth10.setLayout(new java.awt.BorderLayout());

        btn37.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });
        pnlTenth10.add(btn37, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth10);

        pnlTenth11.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth11.setLayout(new java.awt.BorderLayout());

        btn38.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });
        pnlTenth11.add(btn38, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth11);

        pnlTenth12.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth12.setLayout(new java.awt.BorderLayout());

        btn39.setFont(new java.awt.Font("Georgia", 1, 96)); // NOI18N
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });
        pnlTenth12.add(btn39, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth12);

        pnlTenth13.setBackground(new java.awt.Color(255, 255, 255));
        pnlTenth13.setLayout(new java.awt.BorderLayout());

        btnReset.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        pnlTenth13.add(btnReset, java.awt.BorderLayout.CENTER);

        pnlTenth1.add(pnlTenth13);

        pnlTenth.add(pnlTenth1, java.awt.BorderLayout.CENTER);

        parentPanel.add(pnlTenth, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // This will switch to the menu panel when 'Menu' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlFirst);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // This will switch to the red panel when 'Option 1' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlSecond);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // This will switch to the orange panel when 'Option 2' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlThird);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // This will switch to the yellow panel when 'Option 3' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlFourth);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // This will switch to the green panel when 'Option 4' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlFifth);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // This will switch to the blue panel when 'Option 5' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlSixth);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // This will switch to the purple panel when 'Option 6' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlSeventh);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // This will switch to the magenta panel when 'Option 7' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlEighth);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // This will switch to the pink panel when 'Option 8' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlNinth);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn9ActionPerformed
    
    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // Variable declaration
        double mark1, mark2, mark3, mark4, average;
        
        // The user will write a mark in these text fields and store the data 
        mark1 = Double.parseDouble(txt1.getText()); 
        mark2 = Double.parseDouble(txt2.getText()); 
        mark3 = Double.parseDouble(txt3.getText()); 
        mark4 = Double.parseDouble(txt4.getText()); 
        
        // This will calculate the average of the marks 
        average = (mark1 + mark2 + mark3 + mark4) / 4; 
        average = average * 100; 
        average = Math.round(average); 
        average = average / 100; 
        lbl19.setText(average + "%"); 
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // Variable declaration
        double length1, length2, hypotenuse;
        String hypotenuse1;
        
        // The user will write the lengths in these text fields and store the data 
        length1 = Double.parseDouble(txt5.getText());
        length2 = Double.parseDouble(txt6.getText());
        
        // This will calculate the hypotenuse
        hypotenuse = (Math.hypot(length1, length2));
        hypotenuse = hypotenuse * 100;
        hypotenuse = Math.round(hypotenuse);
        hypotenuse = hypotenuse / 100;
        hypotenuse1 = String.valueOf(hypotenuse);
        lbl22.setText(hypotenuse1);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // Variable declaration
        double num, roundedUp;
        String roundedUp1;
        
        // The user will write a number in this text field and store the data 
        num = Double.parseDouble(txt7.getText());
        
        // This will round up the value to the nearest integer
        roundedUp = (Math.ceil(num));
        roundedUp1 = String.valueOf(roundedUp);
        lbl24.setText(roundedUp1);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // Variable declaration
        double num, roundedDown;
        String roundedDown1;
        
        // The user will write a number in this text field and store the data  
        num = Double.parseDouble(txt8.getText());
        
        // This will round down the value to the nearest integer
        roundedDown = (Math.floor(num));
        roundedDown1 = String.valueOf(roundedDown);
        lbl26.setText(roundedDown1);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // Variable declaration
        double angle, radians;
        String radians1;
        
        // The user will write an angle in this text field and store the data 
        angle = Double.parseDouble(txt9.getText());
        
        // This will calculate the angle in radians 
        radians = (Math.toRadians(angle));
        radians = radians * 100;
        radians = Math.round(radians);
        radians = radians / 100;
        radians1 = String.valueOf(radians);
        lbl28.setText(radians1);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        // Variable declaration
        double num, numSquare;
        
        // The user will write a number in this text field and store the data        
        num = Double.parseDouble(txt10.getText());
        
        // This will calculate the square of the number 
        numSquare = num * num;
        lbl31.setText(numSquare + "");
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // Variable declaration
        double num, numCube;
        
        // The user will write a number in this text field and store the data              
        num = Double.parseDouble(txt11.getText());
        
        // This will calculate the cube of the number
        numCube = num * num * num;
        lbl33.setText(numCube + "");
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        // Variable declaration
        double num1, num2, power;
        String power1;
        
        // The user will write numbers in these text fields and store the data 
        num1 = Double.parseDouble(txt12.getText());
        num2 = Double.parseDouble(txt13.getText());
        
        // This will calculate the power of the two numbers
        power = (Math.pow(num1, num2));
        power = power * 100;
        power = Math.round(power);
        power = power / 100;
        power1 = String.valueOf(power);
        lbl35.setText(power1);
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        // Variable declaration
        double num, squareRoot;
        String squareRoot1;
        
        // The user will write a number in this text field and store the data 
        num = Double.parseDouble(txt14.getText());
        
        // This will calculate the square root of the number
        squareRoot = (Math.sqrt(num));
        squareRoot = squareRoot * 100;
        squareRoot = Math.round(squareRoot);
        squareRoot = squareRoot / 100;
        squareRoot1 = String.valueOf(squareRoot);
        lbl37.setText(squareRoot1);
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        // Variable declaration
        int num, result;
        
        // The user will write a number in this text field and store the data
        num = Integer.parseInt(txt15.getText());
        
        // This will calculate the factorial of the number
        result = factorial(num);
        lbl40.setText(result + "");
    }
        public static int factorial(int number) {
            // Variable declaration
            int result = 1;
            
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // Variable declaration
        int num, temp;
        boolean isPrime = true;
        
        // The user will write a number in this text field and store the data
        num = Integer.parseInt(txt16.getText());
        
        // This will determine if the number is prime or not 
        for (int i = 2; i <= num / 2; i = i + 1) {
            temp = num % i;
            
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) 
            lbl42.setText(num + " is a prime number");
        else
            lbl42.setText(num + " is not a prime number");
        if (num < 0)
            lbl42.setText("Invalid Input");
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // Variable declaration
        int num, sum;
        int temp1 = 0, temp2 = 1;
        
        // The user will write a number in this text field and store the data        
        num = Integer.parseInt(txt17.getText());
        
        // This will calculate the fibonacci of the number
        for (int i = 1; i <= num; i++)
        {
            lbl44.setText(temp1 + "");
            sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }    
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // Variable declaration
        int decimal;
        String binary;
        
        // The user will write a decimal in this text field and store the data        
        decimal = Integer.parseInt(txt18.getText());
        
        // This will convert the decimal to binary 
        binary = Integer.toBinaryString(decimal);
        lbl49.setText(binary);
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // Variable declaration
        String binary;
        int decimal;
        
        // The user will write a binary in this text field and store the data
        binary = txt19.getText();
        
        // This will convert the binary to decimal
        decimal = Integer.parseInt(binary, 2);
        lbl50.setText(decimal + "");
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        // Variable declaration
        int decimal;
        String hexadecimal;
        
        // The user will write a decimal in this text field and store the data
        decimal = Integer.parseInt(txt20.getText());
        
        // This will convert the decimal to hexadecimal
        hexadecimal = Integer.toHexString(decimal); 
        lbl54.setText(hexadecimal);
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        // Variable declaration
        String hexadecimal;
        int decimal;
        
        // The user will write a hexadecimal in this text field and store the data        
        hexadecimal = txt21.getText();
        
        // This will convert the hexadecimal to decimal
        decimal = Integer.parseInt(hexadecimal, 16);
        lbl55.setText(decimal + "");
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        // Variable declaration
        double spent, percDiscount, decDiscount, discount, total;
        
        // The user will write the amount spent and the discount as a percentage in these text fields and store the data
        spent = Double.parseDouble(txt22.getText());
        percDiscount = Double.parseDouble(txt23.getText());
        
        // This will calculate the the total price after the discount
        decDiscount = percDiscount / 100;
        discount = spent * decDiscount;
        total = spent - discount;
        
        discount = discount * 100;
        discount = Math.round(discount);
        discount = discount / 100;
        total = total * 100;
        total = Math.round(total);
        total = total / 100;
        
        lbl60.setText("Amount Spent: $" + spent);
        lbl61.setText("Percentage Discount: " + percDiscount + "%");
        lbl62.setText("Discount: $" + discount);
        lbl63.setText("Total After Discount: $" + total);
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        // Variable declaration
        double money, rmMoney, rmMoney2, rmMoney3, rmMoney4, rmMoney5, rmMoney6, rmMoney7, rmMoney8, rmMoney9;
        double hundreds, fifties, twenties, tens, fives, twos, ones, twentyfiveCents, tenCents, fiveCents;
        
        // The user will write the amount of money in this text field and store the data
        money = Double.parseDouble(txt24.getText()); 
        
        // This will split the money into the specif bills and coins
        hundreds = money / 100;
        hundreds = hundreds * 1; 
        hundreds = Math.floor(hundreds);
        hundreds = hundreds / 1;
        rmMoney = money % 100;
        
        fifties = rmMoney / 50;
        fifties = fifties * 1; 
        fifties = Math.floor(fifties);
        fifties = fifties / 1;
        rmMoney2 = rmMoney % 50;
        
        twenties = rmMoney2 / 20;
        twenties = twenties * 1; 
        twenties = Math.floor(twenties);
        twenties = twenties / 1;
        rmMoney3 = rmMoney2 % 20;
        
        tens = rmMoney3 / 10;
        tens = tens * 1; 
        tens = Math.floor(tens);
        tens = tens / 1;
        rmMoney4 = rmMoney3 % 10;
        
        fives = rmMoney4 / 5;
        fives = fives * 1; 
        fives = Math.floor(fives);
        fives = fives / 1;
        rmMoney5 = rmMoney4 % 5;
        
        twos = rmMoney5 / 2;
        twos = twos * 1; 
        twos = Math.floor(twos);
        twos = twos / 1;
        rmMoney6 = rmMoney5 % 2;
        
        ones = rmMoney6 / 1;
        ones = ones * 1; 
        ones = Math.floor(ones);
        ones = ones / 1;
        rmMoney7 = rmMoney6 % 1;
         
        twentyfiveCents = rmMoney7 / 0.25;
        twentyfiveCents = twentyfiveCents * 1; 
        twentyfiveCents = Math.floor(twentyfiveCents);
        twentyfiveCents = twentyfiveCents / 1;
        rmMoney8 = rmMoney7 % 0.25;
        
        tenCents = rmMoney8 / 0.10;
        tenCents = tenCents * 1; 
        tenCents = Math.floor(tenCents);
        tenCents = tenCents / 1;
        rmMoney9 = rmMoney8 % 0.10;

        fiveCents = rmMoney9 / 0.05;
        fiveCents = fiveCents * 1; 
        fiveCents = Math.floor(fiveCents);
        fiveCents = fiveCents / 1;
        
        txt25.setText(hundreds + "");
        txt26.setText(fifties + "");
        txt27.setText(twenties + "");
        txt28.setText(tens + "");
        txt29.setText(fives + "");
        txt30.setText(twos + "");
        txt31.setText(ones + "");
        txt32.setText(twentyfiveCents + "");
        txt33.setText(tenCents + "");
        txt34.setText(fiveCents + "");
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        // Variable declaration
        String decMessage, encMessage = "";
        char tempChar;
        int tempASCII;

        // The user will write the decrypted message in this text field and store the data
        decMessage = txt35.getText();

        // This will convert the decrypted message into the encrypted message
        do {
            for (int i = 0; i < decMessage.length(); i = i + 1) {
                tempChar = decMessage.charAt(i);

                tempASCII = (int)tempChar;

                tempASCII = tempASCII + 3;

                tempChar = (char)tempASCII;

                encMessage = encMessage + tempChar;
            }
        } while (decMessage.length() > 31);

        txt36.setText(encMessage);
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        // Variable declaration
        String encMessage, decMessage = "";
        char tempChar;
        int tempASCII;

        // The user will write the encrypted message in this text field and store the data
        encMessage = txt37.getText();

        // This will convert the encrypted message into the decrypted message
        do {
            for (int i = 0; i < encMessage.length(); i = i + 1) {
                tempChar = encMessage.charAt(i);

                tempASCII = (int)tempChar;

                tempASCII = tempASCII - 3;

                tempChar = (char)tempASCII;

                decMessage = decMessage + tempChar;
            }
        } while (encMessage.length() > 31);

        txt38.setText(decMessage);
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        // This will switch to the TIC TAC TOE panel when 'SURPRISE!' is clicked
        parentPanel.removeAll();
        parentPanel.add(pnlTenth);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btn30ActionPerformed
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // This button will reset all the boxes to the starting stage of TIC TAC TOE
        btn31.setText(null);
        btn32.setText(null);
        btn33.setText(null);
        
        btn34.setText(null);
        btn35.setText(null);
        btn36.setText(null);
        
        btn37.setText(null);
        btn38.setText(null);
        btn39.setText(null);
        
        btn31.setBackground(Color.LIGHT_GRAY);
        btn32.setBackground(Color.LIGHT_GRAY);
        btn33.setBackground(Color.LIGHT_GRAY);
        
        btn34.setBackground(Color.LIGHT_GRAY);
        btn35.setBackground(Color.LIGHT_GRAY);
        btn36.setBackground(Color.LIGHT_GRAY);
        
        btn37.setBackground(Color.LIGHT_GRAY);
        btn38.setBackground(Color.LIGHT_GRAY);
        btn39.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // This will enable the user to choose the 1st box
        btn31.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn31.setForeground(Color.GREEN);
        }
        else {
            btn31.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // This will enable the user to choose the 2nd box
        btn32.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn32.setForeground(Color.GREEN);
        }
        else {
            btn32.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // This will enable the user to choose the 3rd box
        btn33.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn33.setForeground(Color.GREEN);
        }
        else {
            btn33.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        // This will enable the user to choose the 4th box
        btn34.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn34.setForeground(Color.GREEN);
        }
        else {
            btn34.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        // This will enable the user to choose the 5th box
        btn35.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn35.setForeground(Color.GREEN);
        }
        else {
            btn35.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        // This will enable the user to choose the 6th box
        btn36.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn36.setForeground(Color.GREEN);
        }
        else {
            btn36.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        // This will enable the user to choose the 7th box
        btn37.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn37.setForeground(Color.GREEN);
        }
        else {
            btn37.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        // This will enable the user to choose the 8th box
        btn38.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn38.setForeground(Color.GREEN);
        }
        else {
            btn38.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        // This will enable the user to choose the 9th box
        btn39.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")) {
            btn39.setForeground(Color.GREEN);
        }
        else {
            btn39.setForeground(Color.BLUE);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btn39ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(usefultoolsfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usefultoolsfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usefultoolsfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usefultoolsfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usefultoolsfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl36;
    private javax.swing.JLabel lbl37;
    private javax.swing.JLabel lbl38;
    private javax.swing.JLabel lbl39;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl46;
    private javax.swing.JLabel lbl47;
    private javax.swing.JLabel lbl48;
    private javax.swing.JLabel lbl49;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
    private javax.swing.JLabel lbl56;
    private javax.swing.JLabel lbl57;
    private javax.swing.JLabel lbl58;
    private javax.swing.JLabel lbl59;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl60;
    private javax.swing.JLabel lbl61;
    private javax.swing.JLabel lbl62;
    private javax.swing.JLabel lbl63;
    private javax.swing.JLabel lbl64;
    private javax.swing.JLabel lbl65;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lbl67;
    private javax.swing.JLabel lbl68;
    private javax.swing.JLabel lbl69;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl70;
    private javax.swing.JLabel lbl71;
    private javax.swing.JLabel lbl72;
    private javax.swing.JLabel lbl73;
    private javax.swing.JLabel lbl74;
    private javax.swing.JLabel lbl75;
    private javax.swing.JLabel lbl76;
    private javax.swing.JLabel lbl77;
    private javax.swing.JLabel lbl78;
    private javax.swing.JLabel lbl79;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl80;
    private javax.swing.JLabel lbl81;
    private javax.swing.JLabel lbl82;
    private javax.swing.JLabel lbl83;
    private javax.swing.JLabel lbl84;
    private javax.swing.JLabel lbl85;
    private javax.swing.JLabel lbl86;
    private javax.swing.JLabel lbl87;
    private javax.swing.JLabel lbl9;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel pnlEighth;
    private javax.swing.JPanel pnlFifth;
    private javax.swing.JPanel pnlFirst;
    private javax.swing.JPanel pnlFourth;
    private javax.swing.JPanel pnlNinth;
    private javax.swing.JPanel pnlSecond;
    private javax.swing.JPanel pnlSeventh;
    private javax.swing.JPanel pnlSixth;
    private javax.swing.JPanel pnlTenth;
    private javax.swing.JPanel pnlTenth1;
    private javax.swing.JPanel pnlTenth10;
    private javax.swing.JPanel pnlTenth11;
    private javax.swing.JPanel pnlTenth12;
    private javax.swing.JPanel pnlTenth13;
    private javax.swing.JPanel pnlTenth2;
    private javax.swing.JPanel pnlTenth3;
    private javax.swing.JPanel pnlTenth4;
    private javax.swing.JPanel pnlTenth5;
    private javax.swing.JPanel pnlTenth6;
    private javax.swing.JPanel pnlTenth7;
    private javax.swing.JPanel pnlTenth8;
    private javax.swing.JPanel pnlTenth9;
    private javax.swing.JPanel pnlThird;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
