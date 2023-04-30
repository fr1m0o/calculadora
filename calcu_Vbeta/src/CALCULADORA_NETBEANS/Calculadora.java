
package CALCULADORA_NETBEANS;

import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Calculadora extends javax.swing.JFrame {
////ACA PONEMOS LAS VARIABLES///
    private String cadenas_numeros="";
    private String operaciones="nula";
    private double primernumero,resultado;
    private boolean Activado= true;
    private boolean punto= true;
    ////FIN DE ATRIBUTOS///
    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
            
    }

    /**
     * Se llama a este método desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_calculadora = new javax.swing.JPanel();
        Boton_c = new javax.swing.JButton();
        Boton_raiz = new javax.swing.JButton();
        Boton_dividir = new javax.swing.JButton();
        Boton_CE = new javax.swing.JButton();
        Boton_7 = new javax.swing.JButton();
        Boton_8 = new javax.swing.JButton();
        Boton_9 = new javax.swing.JButton();
        Boton_multiplicar = new javax.swing.JButton();
        Boton_4 = new javax.swing.JButton();
        Boton_cinco = new javax.swing.JButton();
        Boton_6 = new javax.swing.JButton();
        Boton_mas = new javax.swing.JButton();
        Boton_1 = new javax.swing.JButton();
        Boton_2 = new javax.swing.JButton();
        Boton_3 = new javax.swing.JButton();
        Boton_menos = new javax.swing.JButton();
        Boton_mas_menos = new javax.swing.JButton();
        Boton_0 = new javax.swing.JButton();
        Boton_punto = new javax.swing.JButton();
        Boton_igual = new javax.swing.JButton();
        Etiqueta_Numeros = new javax.swing.JLabel();
        etiqueta2_numeros = new javax.swing.JLabel();
        boton_modos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_calculadora.setLayout(new java.awt.GridLayout(5, 4));

        Boton_c.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_c.setText("C");
        Boton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_c);

        Boton_raiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_raiz.setText("raiz");
        Boton_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_raizActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_raiz);

        Boton_dividir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_dividir.setText("/");
        Boton_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_dividirActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_dividir);

        Boton_CE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_CE.setText("CE");
        Boton_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CEActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_CE);

        Boton_7.setBackground(new java.awt.Color(204, 204, 204));
        Boton_7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_7.setText("7");
        Boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_7ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_7);

        Boton_8.setBackground(new java.awt.Color(204, 204, 204));
        Boton_8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_8.setText("8");
        Boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_8ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_8);

        Boton_9.setBackground(new java.awt.Color(204, 204, 204));
        Boton_9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_9.setText("9");
        Boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_9ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_9);

        Boton_multiplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_multiplicar.setText("x");
        Boton_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_multiplicarActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_multiplicar);

        Boton_4.setBackground(new java.awt.Color(204, 204, 204));
        Boton_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_4.setText("4");
        Boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_4ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_4);

        Boton_cinco.setBackground(new java.awt.Color(204, 204, 204));
        Boton_cinco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_cinco.setText("5");
        Boton_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cincoActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_cinco);

        Boton_6.setBackground(new java.awt.Color(204, 204, 204));
        Boton_6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_6.setText("6");
        Boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_6ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_6);

        Boton_mas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_mas.setText("+");
        Boton_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_masActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_mas);

        Boton_1.setBackground(new java.awt.Color(204, 204, 204));
        Boton_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_1.setText("1");
        Boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_1ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_1);

        Boton_2.setBackground(new java.awt.Color(204, 204, 204));
        Boton_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_2.setText("2");
        Boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_2ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_2);

        Boton_3.setBackground(new java.awt.Color(204, 204, 204));
        Boton_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_3.setText("3");
        Boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_3ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_3);

        Boton_menos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_menos.setText("-");
        Boton_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_menosActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_menos);

        Boton_mas_menos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_mas_menos.setText("+/-");
        Boton_mas_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_mas_menosActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_mas_menos);

        Boton_0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_0.setText("0");
        Boton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_0ActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_0);

        Boton_punto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_punto.setText(".");
        Boton_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_puntoActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_punto);

        Boton_igual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_igual.setText("=");
        Boton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_igualActionPerformed(evt);
            }
        });
        Panel_calculadora.add(Boton_igual);

        Etiqueta_Numeros.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Etiqueta_Numeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Etiqueta_Numeros.setText("0");

        etiqueta2_numeros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiqueta2_numeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiqueta2_numeros.setText("0");

        boton_modos.setText("modos");
        boton_modos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_modosMouseClicked(evt);
            }
        });
        boton_modos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta2_numeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Etiqueta_Numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_modos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(boton_modos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiqueta2_numeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Etiqueta_Numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_raizActionPerformed
        primernumero= Double.parseDouble(cadenas_numeros);
        etiqueta2_numeros.setText("sqrt("+cadenas_numeros+")");
        resultado= Math.sqrt(primernumero);
        Etiqueta_Numeros.setText(String.format("%.2f",resultado));
        cadenas_numeros= String.valueOf(resultado);
         punto=true;
    }//GEN-LAST:event_Boton_raizActionPerformed
//////BOTON7///
    private void Boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_7ActionPerformed
     if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="7";
     }else{
     cadenas_numeros +="7";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
    }//GEN-LAST:event_Boton_7ActionPerformed
///////BOTON8////
    private void Boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_8ActionPerformed
        if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="8";
     }else{
     cadenas_numeros +="8";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
                 
    }//GEN-LAST:event_Boton_8ActionPerformed
//////BOTON9////
    private void Boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_9ActionPerformed
        if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="9";
     }else{
     cadenas_numeros +="9";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
                 
                                          
    }//GEN-LAST:event_Boton_9ActionPerformed

    private void Boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_4ActionPerformed
        if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="4";
     }else{
     cadenas_numeros +="4";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
                 
                                           
    }//GEN-LAST:event_Boton_4ActionPerformed

    private void Boton_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cincoActionPerformed
       if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="5";
     }else{
     cadenas_numeros +="5";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
                 
                                        
    }//GEN-LAST:event_Boton_cincoActionPerformed

    private void Boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_6ActionPerformed
        if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="6";
     }else{
     cadenas_numeros +="6";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
    }//GEN-LAST:event_Boton_6ActionPerformed

    private void Boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_1ActionPerformed
        if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="1";
     }else{
     cadenas_numeros +="1";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
    }//GEN-LAST:event_Boton_1ActionPerformed

    private void Boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_2ActionPerformed
          if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="2";
     }else{
     cadenas_numeros +="2";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
    }//GEN-LAST:event_Boton_2ActionPerformed

    private void Boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_3ActionPerformed
          if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="3";
     }else{
     cadenas_numeros +="3";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
    }//GEN-LAST:event_Boton_3ActionPerformed

    private void Boton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_0ActionPerformed
         if(Etiqueta_Numeros.getText().equals("0")){
     cadenas_numeros="0";
     }else{
     cadenas_numeros +="0";
     }
     Etiqueta_Numeros.setText(cadenas_numeros);
     Activado= true;
    }//GEN-LAST:event_Boton_0ActionPerformed
/////BOTON SUMAR CON SUS OPERACIONES////
    private void Boton_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_masActionPerformed
       if(Activado==true){
           primernumero= Double.parseDouble(cadenas_numeros);
           etiqueta2_numeros.setText(cadenas_numeros +"+");
       cadenas_numeros="";
       operaciones= "sumar";
       Activado= false;
       punto=true;
       }
    }//GEN-LAST:event_Boton_masActionPerformed
/////////////FIN DEL BOTON SUMAR///
    private void Boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_igualActionPerformed
       Double Segundo_numero;
       if(operaciones.equals("sumar")){
       Segundo_numero= Double.parseDouble(cadenas_numeros);
       resultado= primernumero + Segundo_numero;
       Etiqueta_Numeros.setText(String.format("%.2f", resultado));
       cadenas_numeros= String.valueOf(resultado);/////el value of convierte una variable x en String
       operaciones="nula";
       }
       etiqueta2_numeros.setText("");
       Activado=true;
       if(operaciones.equals("restar")){
       Segundo_numero= Double.parseDouble(cadenas_numeros);
       resultado= primernumero - Segundo_numero;
       Etiqueta_Numeros.setText(String.format("%.2f", resultado));
       cadenas_numeros= String.valueOf(resultado);/////el value of convierte una variable x en String
       operaciones="nula";
       }
       etiqueta2_numeros.setText("");
       Activado=true;
       if(operaciones.equals("multiplicar")){
       Segundo_numero= Double.parseDouble(cadenas_numeros);
       resultado= primernumero * Segundo_numero;
       Etiqueta_Numeros.setText(String.format("%.2f", resultado));
       cadenas_numeros= String.valueOf(resultado);/////el value of convierte una variable x en String
       operaciones="nula";
       }
       etiqueta2_numeros.setText("");
       Activado=true;
       if(operaciones.equals("dividir")){
       Segundo_numero= Double.parseDouble(cadenas_numeros);
       if(Segundo_numero==0){
       Etiqueta_Numeros.setText("SYNTAX ERROR ");
       }else{
      resultado= primernumero / Segundo_numero;
       Etiqueta_Numeros.setText(String.format("%.2f", resultado));
       cadenas_numeros= String.valueOf(resultado);/////el value of convierte una variable x en String
       operaciones="nula";
       }
       etiqueta2_numeros.setText("");
       Activado=true;
       }
       
       

////FIN DEL BOTON IGUAL///
       
    }//GEN-LAST:event_Boton_igualActionPerformed
/////BOTON MULTIPLICAR///
    private void Boton_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_multiplicarActionPerformed
       if(Activado==true){
           primernumero= Double.parseDouble(cadenas_numeros);
           etiqueta2_numeros.setText(cadenas_numeros +"x");
       cadenas_numeros="";
       operaciones= "multiplicar";
       Activado= false;
        punto=true;
       }
    }//GEN-LAST:event_Boton_multiplicarActionPerformed
////BOTON MENOS///
    private void Boton_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_menosActionPerformed
        if(Activado==true){
           primernumero= Double.parseDouble(cadenas_numeros);
           etiqueta2_numeros.setText(cadenas_numeros +"-");
       cadenas_numeros="";
       operaciones= "restar";
       Activado= false;
         punto=true;
        }
    }//GEN-LAST:event_Boton_menosActionPerformed
//////BOTON DIVIDIR///
    private void Boton_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_dividirActionPerformed
         if(Activado==true){
           primernumero= Double.parseDouble(cadenas_numeros);
           etiqueta2_numeros.setText(cadenas_numeros +"/");
       cadenas_numeros="";
       operaciones= "dividir";
       Activado= false;
          punto=true;
         }
    }//GEN-LAST:event_Boton_dividirActionPerformed

    private void Boton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_puntoActionPerformed
        if(punto==true){
        if(cadenas_numeros.equals("")){
        cadenas_numeros="0.";
        }else{
        cadenas_numeros+=".";
        }
        }
        Etiqueta_Numeros.setText(cadenas_numeros);
        punto=false;
        
    }//GEN-LAST:event_Boton_puntoActionPerformed

    private void Boton_mas_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_mas_menosActionPerformed
        if(cadenas_numeros.charAt(0)!='-'){
        cadenas_numeros="-"+ cadenas_numeros;
        }else{
        cadenas_numeros= cadenas_numeros.substring(1,cadenas_numeros.length());
        }
        Etiqueta_Numeros.setText(cadenas_numeros);
    }//GEN-LAST:event_Boton_mas_menosActionPerformed

    private void Boton_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cActionPerformed
        etiqueta2_numeros.setText("");
        Etiqueta_Numeros.setText("0");
        operaciones="nula";
       Activado=true;
       punto=true;
        
    }//GEN-LAST:event_Boton_cActionPerformed

    private void Boton_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CEActionPerformed
        int tamaño= cadenas_numeros.length();
        if(tamaño>0){
        if(tamaño==1){
        cadenas_numeros="0";
        }else{
        cadenas_numeros=cadenas_numeros.substring(0,cadenas_numeros.length()-1);
        }
        }
        Etiqueta_Numeros.setText(cadenas_numeros);
    }//GEN-LAST:event_Boton_CEActionPerformed

    private void boton_modosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modosActionPerformed
        // 
    }//GEN-LAST:event_boton_modosActionPerformed

    private void boton_modosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_modosMouseClicked
 vistas vistas= new vistas();
 vistas.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_boton_modosMouseClicked

    
   
    public static void main(String args[]) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>////aca ponemos nosotros las cosas no cambies nada de lo que esta abajo o arriba
        UIManager.setLookAndFeel( "com.jtattoo.plaf.hifi.HiFiLookAndFeel");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_0;
    private javax.swing.JButton Boton_1;
    private javax.swing.JButton Boton_2;
    private javax.swing.JButton Boton_3;
    private javax.swing.JButton Boton_4;
    private javax.swing.JButton Boton_6;
    private javax.swing.JButton Boton_7;
    private javax.swing.JButton Boton_8;
    private javax.swing.JButton Boton_9;
    private javax.swing.JButton Boton_CE;
    private javax.swing.JButton Boton_c;
    private javax.swing.JButton Boton_cinco;
    private javax.swing.JButton Boton_dividir;
    private javax.swing.JButton Boton_igual;
    private javax.swing.JButton Boton_mas;
    private javax.swing.JButton Boton_mas_menos;
    private javax.swing.JButton Boton_menos;
    private javax.swing.JButton Boton_multiplicar;
    private javax.swing.JButton Boton_punto;
    private javax.swing.JButton Boton_raiz;
    private javax.swing.JLabel Etiqueta_Numeros;
    private javax.swing.JPanel Panel_calculadora;
    private javax.swing.JButton boton_modos;
    private javax.swing.JLabel etiqueta2_numeros;
    // End of variables declaration//GEN-END:variables
}
