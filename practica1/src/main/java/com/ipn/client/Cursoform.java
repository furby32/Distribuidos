package com.ipn.client;


import com.ipn.server.Server;
import com.ipn.vo.Curso;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.net.Socket;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alopeze
 */
public class Cursoform extends javax.swing.JFrame {

    /**
     * Creates new form Applicationform
     * @param dao
     */
    public Cursoform(int mode) {
        this.mode = mode;

        initComponents();
        
    }

    public Curso getCurso() {
        
        String name = this.nombreTextField.getText();
        Date inicio = Date.valueOf(this.inicioTextField.getText());
        Date fin = Date.valueOf(this.finTextField.getText());
        BigDecimal couta = new BigDecimal(this.cuotaTextField.getText());
        this.curso = new Curso(0, name, inicio, fin, couta);
        return curso;
    }

    public void setCurso(Curso c) {
        this.id_curso = c.getIdCurso();
        this.nombreTextField.setText(c.getNombre());
        this.inicioTextField.setText(c.getInicio().toString());
        this.finTextField.setText(c.getFin().toString());
        this.cuotaTextField.setText(c.getCoutaDeRecuperacion().toString());
        this.curso = c;
    }

   

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        cuotaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inicioTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        finTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Formulario Alumno");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel2.setText("Couta");

        jLabel6.setText("Fecha Inicio");

        inicioTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioTextFieldMouseClicked(evt);
            }
        });

        jLabel10.setText("Fecha fin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(cuotaTextField))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(inicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(finTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        Curso aux = this.getCurso();
        if(this.validateDate(this.inicioTextField.getText()) && 
                this.validateDate(this.finTextField.getText())){
                 if(this.mode == Cursoform.CREATE){
            this.operationCreate(aux);
        }else{
            aux.setIdCurso(id_curso);
            this.operationUpdate(aux);
        }
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "formato de fecha AAAA-MM-DD", "formato de fecha invalido",0);
        }
            
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validateDate(String input) {
        boolean checkFormat;

        if (input.matches("(20[0-9]{2})-(0[0-9]{1}|1([0-2]))-([0-2]{1}[0-9]{1}|30|31)")) {
            checkFormat = true;
        } else {
            checkFormat = false;
        }
        return checkFormat;
    }
    
    private void inicioTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioTextFieldMouseClicked
        // TODO add your handling code here:
        JFrame date = new JFrame("Booking");
        JCalendar calendario = new JCalendar();
        date.getContentPane().add(calendario);
        date.pack();
        date.setVisible(true);
        
    }//GEN-LAST:event_inicioTextFieldMouseClicked

    private boolean operationCreate(Curso a){
        boolean succesful = true;
            System.out.println("creando Alumno: ");
           
            try (Socket socket = new Socket("127.0.0.1", Server.PORT)) {
                ObjectOutputStream dos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
                
                dos.writeInt(Server.CURSO);
                dos.writeInt(Server.CREATE);
                dos.writeObject(a);
                dos.flush();
                dos.close();
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                System.out.println(ex.getClass());
                System.out.println(ex.getCause());
                succesful = false;
            } 
        
        return succesful;
    }
    
    private boolean operationUpdate(Curso a){
        boolean succesful = true;
            System.out.println("creando Alumno: ");
            
            try (Socket socket = new Socket("127.0.0.1", Server.PORT)) {
                ObjectOutputStream dos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
                
                dos.writeInt(Server.CURSO);
                dos.writeInt(Server.UPDATE);
                dos.writeObject(a);
                dos.flush();
                dos.close();
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                System.out.println(ex.getClass());
                System.out.println(ex.getCause());
                succesful = false;
            } 
        
        return succesful;
    }
    
    public static int CREATE = 1;
    public static int UPDATE = 2;
    private int mode;
    private int id_curso;
    private Curso curso;
    private JDateChooser chooser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuotaTextField;
    private javax.swing.JTextField finTextField;
    private javax.swing.JTextField inicioTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTextField;
    // End of variables declaration//GEN-END:variables
}
