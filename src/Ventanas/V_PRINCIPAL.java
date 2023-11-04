package Ventanas;


import Entidades.Procesar;



public class V_PRINCIPAL extends javax.swing.JFrame {

    public V_PRINCIPAL() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        num = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nota2 = new javax.swing.JLabel();
        nota1 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sum = new javax.swing.JLabel();
        resta = new javax.swing.JLabel();
        por = new javax.swing.JLabel();
        div = new javax.swing.JLabel();
        num3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nota3 = new javax.swing.JLabel();
        lista_historial = new javax.swing.JList<>();
        txtresultado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        lblOperation = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setForeground(new java.awt.Color(102, 255, 51));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        num.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        num.setText("NUMERO 1");

        num1.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        num1.setText("NUMERO 2");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nota2.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jPanel2.add(nota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 330, 20));

        nota1.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jPanel2.add(nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 20));

        txtNum1.setBorder(null);
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum1KeyReleased(evt);
            }
        });
        jPanel2.add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, -1));

        txtNum2.setBorder(null);
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum2KeyReleased(evt);
            }
        });
        jPanel2.add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num1 (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num1 (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sum.png"))); // NOI18N
        sum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumMouseClicked(evt);
            }
        });

        resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/min.png"))); // NOI18N
        resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaMouseClicked(evt);
            }
        });

        por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/por.png"))); // NOI18N
        por.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                porMouseClicked(evt);
            }
        });

        div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/div.png"))); // NOI18N
        div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divMouseClicked(evt);
            }
        });

        num3.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num3.setText("VALIDADOR DE NUMEROS");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nota3.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        nota3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(nota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 320, 20));

        lista_historial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel3.add(lista_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 70));

        txtresultado.setEditable(false);
        txtresultado.setBackground(new java.awt.Color(255, 255, 255));
        txtresultado.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtresultado.setBorder(null);
        jPanel3.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/textResult.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        num2.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        num2.setText("RESULTADO");

        lblOperation.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        lblOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperation.setText("OPERACION");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("SET CARLOS LOPEZ QUISPE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(div)
                                            .addGap(18, 18, 18)
                                            .addComponent(por))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(sum)
                                            .addGap(18, 18, 18)
                                            .addComponent(resta)))
                                    .addGap(20, 20, 20))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(lblOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(num)
                        .addGap(42, 42, 42)
                        .addComponent(num1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sum)
                            .addComponent(resta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(div)
                            .addComponent(por))
                        .addGap(22, 22, 22)
                        .addComponent(lblOperation))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Procesar procesar = new Procesar();
    int operacion_actual;     
    float resultado;
    public void RespuestaEnTiempoReal(){
        switch (operacion_actual) {
            case 1:
                
                suma();
                break;
            case 2:
                
                resta();
                break;
            case 3:
                
                division();
                break;
            case 4:
                
                multiplicacion();
                break;
        }
    }
    public void suma(){
        
        operacion_actual = 1;
        nota3.setText("");
        procesar.ValidarNumero1(txtNum1, nota1);
        procesar.ValidarNumero2(txtNum2, nota2);
        procesar.OperacionSuma(lista_historial,txtresultado);
        lblOperation.setText("SUMA");
    }
    public void resta(){
        operacion_actual = 2;
        
        nota3.setText("");
        procesar.ValidarNumero1(txtNum1, nota1);
        procesar.ValidarNumero2(txtNum2, nota2);
        procesar.OperacionResta(lista_historial,txtresultado);
        lblOperation.setText("RESTA");
    }
    public void division(){
        operacion_actual = 3;
        nota3.setText("");
        procesar.ValidarNumero1(txtNum1, nota1);
        procesar.ValidarNumero2(txtNum2, nota2);
        procesar.OperacionDiv(lista_historial,txtresultado, nota3);
        lblOperation.setText("DIVISION");
        
    }
    public void multiplicacion(){
        operacion_actual = 4;
        nota3.setText("");
        procesar.ValidarNumero1(txtNum1, nota1);
        procesar.ValidarNumero2(txtNum2, nota2);
        procesar.OperacionMulti(lista_historial,txtresultado);
        lblOperation.setText("MULTIPLICACION");
    }
    
    
    private void sumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumMouseClicked
        // SUMA
        suma();
        
    }//GEN-LAST:event_sumMouseClicked

    private void restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaMouseClicked
        // RESTA
        resta();
    }//GEN-LAST:event_restaMouseClicked

    private void divMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divMouseClicked
        // DIV
        division();
    }//GEN-LAST:event_divMouseClicked

    private void porMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porMouseClicked
        // POR
        multiplicacion();
    }//GEN-LAST:event_porMouseClicked

    private void txtNum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyReleased
        // TODO add your handling code here:
        RespuestaEnTiempoReal();
    }//GEN-LAST:event_txtNum1KeyReleased

    private void txtNum2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyReleased
        RespuestaEnTiempoReal();
    }//GEN-LAST:event_txtNum2KeyReleased

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel div;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblOperation;
    private javax.swing.JList<String> lista_historial;
    private javax.swing.JLabel nota1;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota3;
    private javax.swing.JLabel num;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel por;
    private javax.swing.JLabel resta;
    private javax.swing.JLabel sum;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
