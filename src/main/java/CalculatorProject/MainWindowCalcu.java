package CalculatorProject;
import java.awt.event.*;    
import java.awt.*;
import java.util.ArrayList;

public class MainWindowCalcu extends javax.swing.JFrame {

    double firstNumbers;
    double secondNumbers;
    String operator; 
    String indicator;
    ArrayList<String> listt = new ArrayList<String>();
   
    
    
    public MainWindowCalcu() {
        initComponents();
        setLocationRelativeTo(null);
    }
  public void numbers(String numberClicked){ 
      if(indicator == "1"){ 
            indicator = null;
            TextField.setText(" ");       
        }       
        if(indicator == null){
             String clicked = TextField.getText() + numberClicked;
             TextField.setText(clicked);
        }     
     }
  
  public void equalsSomething(){
    
      
       
      
      
  }
  public void operator(String operate){
      ArrayList<String> numbers = new ArrayList<String>();
       //Takes the value from the TextField
        String s = TextField.getText();
        
        numbers.add(s);
        
        //Converst the value taken from string to a Double
        firstNumbers = Double.parseDouble(s);
        //Sets a type of operator for the if else in calculator
        //Deletes the first taken value
        operator = operate;
        TextField.setText(" ");    
  }
  public void equalsOperation(){
      
        
             if(operator == "*") {
            //takes the new value you typed
            String multiply = TextField.getText();
            //converts the value taken to double
            secondNumbers = Double.parseDouble(multiply);
            //solving the operation
            Double solveMultiplication = firstNumbers * secondNumbers;
            //converts the answer to a string so you can display it into a text field
            String displayMultiply = String.valueOf(solveMultiplication);           
            //displays the answer in the text field
            TextField.setText(displayMultiply);  
            indicator ="1";
        }
        if(operator == "+"){
            String addition = TextField.getText();
            secondNumbers = Double.parseDouble(addition);
            Double solveAdd = firstNumbers + secondNumbers;
            String displayAdd = String.valueOf(solveAdd);
            TextField.setText(displayAdd);
            indicator ="1";
        }
        if(operator == "-"){  
            String subtraction = TextField.getText();
            secondNumbers = Double.parseDouble(subtraction);
            Double solveAdd = firstNumbers + secondNumbers;
            String displayAdd = String.valueOf(solveAdd);
            TextField.setText(displayAdd);
            indicator ="1";
        }
        if(operator == "/"){
            String division = TextField.getText();
            secondNumbers = Double.parseDouble(division);
            Double solveAdd = firstNumbers / secondNumbers;
            String displayAdd = String.valueOf(solveAdd);
            TextField.setText(displayAdd);
            indicator ="1";          
        }   
        
        if (operator == "%"){
            String division = TextField.getText();
            secondNumbers = Double.parseDouble(division);
            Double solveAdd = firstNumbers % secondNumbers;
            String displayAdd = String.valueOf(solveAdd);
            TextField.setText(displayAdd);
            indicator ="1";
        }           
  }
  
  public void BackSpace(){

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        TextField = new javax.swing.JTextField();
        ButtonsPanel = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bdivide = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        bequals = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bMultiply = new javax.swing.JButton();
        backSpace = new javax.swing.JButton();
        Parenthesis = new javax.swing.JButton();
        bdivide1 = new javax.swing.JButton();
        ControlTab = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setName("CALCULATOR"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        TextField.setBackground(new java.awt.Color(35, 35, 35));
        TextField.setBorder(null);
        TextField.setEnabled(false);

        ButtonsPanel.setBackground(new java.awt.Color(0, 0, 0));

        b7.setBackground(new java.awt.Color(47, 16, 0));
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.setBorder(null);
        b7.setFocusable(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(47, 16, 0));
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.setBorder(null);
        b8.setFocusable(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(47, 16, 0));
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.setBorder(null);
        b9.setFocusable(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bdivide.setBackground(new java.awt.Color(199, 80, 0));
        bdivide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bdivide.setForeground(new java.awt.Color(255, 255, 255));
        bdivide.setText("/");
        bdivide.setBorder(null);
        bdivide.setFocusable(false);
        bdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivideActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(47, 16, 0));
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.setBorder(null);
        b4.setFocusable(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(47, 16, 0));
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.setBorder(null);
        b5.setFocusable(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(47, 16, 0));
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.setToolTipText("");
        b6.setBorder(null);
        b6.setFocusable(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bminus.setBackground(new java.awt.Color(199, 80, 0));
        bminus.setForeground(new java.awt.Color(255, 255, 255));
        bminus.setText("-");
        bminus.setBorder(null);
        bminus.setFocusable(false);
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        bplus.setBackground(new java.awt.Color(47, 16, 0));
        bplus.setForeground(new java.awt.Color(255, 255, 255));
        bplus.setText("+");
        bplus.setBorder(null);
        bplus.setFocusable(false);
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(47, 16, 0));
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.setBorder(null);
        b1.setFocusable(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(47, 16, 0));
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.setBorder(null);
        b3.setFocusable(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(47, 16, 0));
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.setBorder(null);
        b2.setFocusable(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        bequals.setBackground(new java.awt.Color(148, 86, 0));
        bequals.setForeground(new java.awt.Color(255, 255, 255));
        bequals.setText("=");
        bequals.setBorder(null);
        bequals.setFocusable(false);
        bequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalsActionPerformed(evt);
            }
        });

        bclear.setBackground(new java.awt.Color(199, 80, 0));
        bclear.setForeground(new java.awt.Color(255, 255, 255));
        bclear.setText("C");
        bclear.setBorder(null);
        bclear.setFocusable(false);
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        bdot.setBackground(new java.awt.Color(47, 16, 0));
        bdot.setForeground(new java.awt.Color(255, 255, 255));
        bdot.setText(".");
        bdot.setBorder(null);
        bdot.setFocusable(false);
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(47, 16, 0));
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setText("0");
        b0.setBorder(null);
        b0.setFocusable(false);
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bMultiply.setBackground(new java.awt.Color(199, 80, 0));
        bMultiply.setForeground(new java.awt.Color(255, 255, 255));
        bMultiply.setText("x");
        bMultiply.setBorder(null);
        bMultiply.setFocusable(false);
        bMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplyActionPerformed(evt);
            }
        });

        backSpace.setBackground(new java.awt.Color(98, 27, 0));
        backSpace.setForeground(new java.awt.Color(255, 255, 255));
        backSpace.setText("←");
        backSpace.setBorder(null);
        backSpace.setFocusable(false);
        backSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpaceActionPerformed(evt);
            }
        });

        Parenthesis.setBackground(new java.awt.Color(98, 27, 0));
        Parenthesis.setForeground(new java.awt.Color(255, 255, 255));
        Parenthesis.setText("( )");
        Parenthesis.setBorder(null);
        Parenthesis.setFocusable(false);
        Parenthesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParenthesisActionPerformed(evt);
            }
        });

        bdivide1.setBackground(new java.awt.Color(98, 27, 0));
        bdivide1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bdivide1.setForeground(new java.awt.Color(255, 255, 255));
        bdivide1.setText("%");
        bdivide1.setToolTipText("");
        bdivide1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bdivide1.setFocusable(false);
        bdivide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivide1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsPanelLayout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonsPanelLayout.createSequentialGroup()
                        .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addComponent(bdivide1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Parenthesis, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bdivide, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bplus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bequals, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdivide1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdivide, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Parenthesis, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bequals, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
        );

        ControlTab.setBackground(new java.awt.Color(30, 30, 36));
        ControlTab.setForeground(new java.awt.Color(51, 51, 51));

        ExitButton.setBackground(new java.awt.Color(30, 30, 36));
        ExitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEPI\\OneDrive\\Desktop\\Resources\\Calculator\\Exit.png")); // NOI18N
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlTabLayout = new javax.swing.GroupLayout(ControlTab);
        ControlTab.setLayout(ControlTabLayout);
        ControlTabLayout.setHorizontalGroup(
            ControlTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitButton))
        );
        ControlTabLayout.setVerticalGroup(
            ControlTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextField)
                .addContainerGap())
            .addComponent(ControlTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ControlTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        
      numbers("0");
    }//GEN-LAST:event_b0ActionPerformed
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      numbers("1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
      numbers("2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
      numbers("3");
    }//GEN-LAST:event_b3ActionPerformed

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusActionPerformed
       operator("+");
    }//GEN-LAST:event_bplusActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        numbers("4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        numbers("5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        numbers("6");
    }//GEN-LAST:event_b6ActionPerformed

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminusActionPerformed
       operator("-");
    }//GEN-LAST:event_bminusActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        numbers("7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
         numbers("8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        numbers("9");
    }//GEN-LAST:event_b9ActionPerformed

    private void bdivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivideActionPerformed
       operator("/");
    }//GEN-LAST:event_bdivideActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        numbers(".");
    }//GEN-LAST:event_bdotActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        TextField.setText(" ");
        indicator = null;
        operator = null;
    }//GEN-LAST:event_bclearActionPerformed

    private void bequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalsActionPerformed
        equalsOperation();
    }//GEN-LAST:event_bequalsActionPerformed

    private void bMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplyActionPerformed
        //Takes the value from the TextField
       operator("*");     
    }//GEN-LAST:event_bMultiplyActionPerformed

    private void backSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSpaceActionPerformed
     
    }//GEN-LAST:event_backSpaceActionPerformed

    private void ParenthesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParenthesisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ParenthesisActionPerformed

    private void bdivide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivide1ActionPerformed
        operator("%");
    }//GEN-LAST:event_bdivide1ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindowCalcu().setVisible(true);
            }
        });
    }
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel ControlTab;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Parenthesis;
    private javax.swing.JTextField TextField;
    public javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    public javax.swing.JButton bMultiply;
    private javax.swing.JButton backSpace;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdivide;
    private javax.swing.JButton bdivide1;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequals;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bplus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
