/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import Back.PlanificadorEnvejecimiento;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class VistaPlanificador extends javax.swing.JFrame {

    /**
     * Creates new form VistaPlanificador
     */
    PlanificadorEnvejecimiento P;
    PlanificadorEnvejecimiento ant;
    boolean s=true;
    boolean rf=false;
    int cantColas=1;
    int[]CantProcs = new int[10];
    
    public VistaPlanificador() {
        initComponents();
        ColorFondo mcolor = new ColorFondo();
        
        setLocationRelativeTo(null);
        fabrica();
        jButton4.setVisible(!s);
        MItemReset.setVisible(rf);
        jButton2.setEnabled(false);
        
        /*Estilos*/
        ColorFondo colorFondo = new ColorFondo();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(colorFondo, BorderLayout.CENTER);
        
    } 

    private void fabrica(){
        P=new PlanificadorEnvejecimiento();
        P.predeterminado();
        ant=P.Copia();
        PRUN.setText("");
        fn.setText("");
        rf=false;
        MItemReset.setVisible(rf);
        actualizar();
        actualizarFlechaCola();
    }
    
    private void reset(){
        P = new PlanificadorEnvejecimiento();
        P=ant.Copia();
        actualizar();
        actualizarFlechaCola();
    }
    
    private void DarPRUN(){
        
        if(P.getCantPRUN()!=0){
            fn.setText( P.getFN());
            PRUN.setText(P.getPRUN());
            actualizar();
            actualizarFlechaCola();
        }else{
            JOptionPane.showMessageDialog(null, "No hay Procesos en la cola");
        }
    }
    private void DarQuantum(){
        
        P.darQuantum();
        PRUN.setText("");
        fn.setText("");
        actualizar();
        actualizarFlechaCola();
    }
    private void actualizarFlechaCola(){
        actualizar();
        int k = P.getK();
        switch (k) {
            case 0:
                jLabel1.setText("Q[1]<--");
                break;
            case 1:
                jLabel3.setText("Q[2]<--");
                break;
            case 2:
                jLabel4.setText("Q[3]<--");
                break;
            case 3:
                jLabel5.setText("Q[4]<--");
                break;
            case 4:
                jLabel6.setText("Q[5]<--");
                break;
            case 5:
                jLabel7.setText("Q[6]<--");
                break;
            case 6:
                jLabel8.setText("Q[7]<--");
                break;
            case 7:
                jLabel9.setText("Q[8]<--");
                break;
            case 8:
                jLabel10.setText("Q[9]<--");
                break;
            case 9:
                jLabel11.setText("Q[10]<--");
                break;
            default:
                throw new AssertionError();
        }
    }
    private void actualizar(){
        Q1.setText("");
        Q2.setText("");
        Q3.setText("");
        Q4.setText("");
        Q5.setText("");
        Q6.setText("");
        Q7.setText("");
        Q8.setText("");
        Q9.setText("");
        Q10.setText("");
        jLabel1.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        for (int i = 0; i < P.getCantColas(); i++) {
                switch (i) {
                    case 0:
                        Q1.setText(P.MostrarPocesoCola(i));
                        jLabel1.setText("Q[1]");
                        break;
                    case 1:
                        Q2.setText(P.MostrarPocesoCola(i));
                        jLabel3.setText("Q[2]");
                        break;
                    case 2:
                        Q3.setText(P.MostrarPocesoCola(i));
                        jLabel4.setText("Q[3]");
                        break;
                    case 3:
                        Q4.setText(P.MostrarPocesoCola(i));
                        jLabel5.setText("Q[4]");
                        break;
                    case 4:
                        Q5.setText(P.MostrarPocesoCola(i));
                        jLabel6.setText("Q[5]");
                        break;
                    case 5:
                        Q6.setText(P.MostrarPocesoCola(i));
                        jLabel7.setText("Q[6]");
                        break;
                    case 6:
                        Q7.setText(P.MostrarPocesoCola(i));
                        jLabel8.setText("Q[7]");
                        break;
                    case 7:
                        Q8.setText(P.MostrarPocesoCola(i));
                        jLabel9.setText("Q[8]");
                        break;
                    case 8:
                        Q9.setText(P.MostrarPocesoCola(i));
                        jLabel10.setText("Q[9]");
                        break;
                    case 9:
                        Q10.setText(P.MostrarPocesoCola(i));
                        jLabel11.setText("Q[10]");
                        break;
                    default:
                        throw new AssertionError();
                }
            }
    }
    
    public void setConfig(int cantColas,int[]CantProcs){
        this.cantColas=cantColas;
        this.CantProcs=CantProcs;
        P=new PlanificadorEnvejecimiento();
        P.addColas(cantColas);
        for (int i = 0; i < cantColas; i++) {
            P.LlenarColaIndiv(i, CantProcs[i]);
        }
        actualizar();
        actualizarFlechaCola();

        ant=P.Copia();
        rf=true;
        MItemReset.setVisible(rf);
    }
    public void setPlanificador(PlanificadorEnvejecimiento n,PlanificadorEnvejecimiento nant){
        this.P=n.Copia();
        this.ant=nant;
        actualizar();
        actualizarFlechaCola();
        ant = nant.Copia();
        rf=true;
        MItemReset.setVisible(rf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Q1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PRUN = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        Q6 = new javax.swing.JLabel();
        Q7 = new javax.swing.JLabel();
        Q8 = new javax.swing.JLabel();
        Q9 = new javax.swing.JLabel();
        Q10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        fn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MItemReset = new javax.swing.JMenuItem();
        MItemFabrica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planificador Por Envejecimiento");

        Q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q1.setForeground(new java.awt.Color(255, 255, 255));
        Q1.setText("Q[1]");

        jButton1.setForeground(new java.awt.Color(51, 0, 153));
        jButton1.setText("Cargar PRUN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(51, 0, 153));
        jButton2.setText("Dar Quantum");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(51, 0, 153));
        jButton3.setText("Automatico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRUN");

        PRUN.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        PRUN.setForeground(new java.awt.Color(255, 255, 255));

        Q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q2.setForeground(new java.awt.Color(255, 255, 255));
        Q2.setText("Q[2]");

        Q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q3.setForeground(new java.awt.Color(255, 255, 255));
        Q3.setText("Q[3]");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Q[1]");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Q[2]");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Q[3]");

        Q4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q4.setForeground(new java.awt.Color(255, 255, 255));
        Q4.setText("Q[4]");

        Q5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q5.setForeground(new java.awt.Color(255, 255, 255));
        Q5.setText("Q[5]");

        Q6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q6.setForeground(new java.awt.Color(255, 255, 255));
        Q6.setText("Q[6]");

        Q7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q7.setForeground(new java.awt.Color(255, 255, 255));
        Q7.setText("Q[7]");

        Q8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q8.setForeground(new java.awt.Color(255, 255, 255));
        Q8.setText("Q[8]");

        Q9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q9.setForeground(new java.awt.Color(255, 255, 255));
        Q9.setText("Q[9]");

        Q10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q10.setForeground(new java.awt.Color(255, 255, 255));
        Q10.setText("Q[10]");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Q[4]");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Q[5]");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Q[6]");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Q[7]");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Q[8]");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Q[9]");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Q[10]");

        jButton4.setForeground(new java.awt.Color(51, 0, 153));
        jButton4.setText("Detener");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        fn.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        fn.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PLANIFICADOR POR ENVEJECIMIENTO");

        jButton5.setForeground(new java.awt.Color(51, 0, 153));
        jButton5.setText("Cargar \"G\"");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jMenu1.setText("Configuracion");

        jMenuItem1.setText("Configurar Colas y Procesos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Configurar Final de Procesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        MItemReset.setText("Reset");
        MItemReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemResetActionPerformed(evt);
            }
        });
        jMenu1.add(MItemReset);

        MItemFabrica.setText("Fabrica");
        MItemFabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemFabricaActionPerformed(evt);
            }
        });
        jMenu1.add(MItemFabrica);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PRUN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Q8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Q10, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(Q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel12)
                        .addContainerGap(286, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(PRUN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Q3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Q4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Q5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Q6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Q7, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DarQuantum();
        jButton2.setEnabled(false);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    s=true;
    jButton4.setVisible(s);
    jButton5.setEnabled(false);
    jButton1.setEnabled(!s);
    jButton2.setEnabled(!s);
    jButton3.setEnabled(!s);
    // Crear un nuevo hilo para ejecutar el bucle infinito
    Thread Bucle = new Thread(new Runnable() {
        @Override
        public void run() {
            while (s) {
                DarPRUN();
                try {
                    Thread.sleep(1 * 1000); // 1 segundo
                } catch (InterruptedException ex) {
                    Logger.getLogger(VistaPlanificador.class.getName()).log(Level.SEVERE, null, ex);
                }
                DarQuantum();
                try {
                    Thread.sleep(1 * 1000); // 1 segundo
                } catch (InterruptedException ex) {
                    Logger.getLogger(VistaPlanificador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    Bucle.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DarPRUN();
        jButton2.setEnabled(true);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        s=false;
        jButton5.setEnabled(true);
        jButton4.setVisible(s);
        jButton1.setEnabled(!s);
        jButton2.setEnabled(!s);
        jButton3.setEnabled(!s);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        configuracion conf=new configuracion();
        conf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MItemResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemResetActionPerformed
        reset();
    }//GEN-LAST:event_MItemResetActionPerformed

    private void MItemFabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemFabricaActionPerformed
        fabrica();
    }//GEN-LAST:event_MItemFabricaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        confProcesos confPr = new confProcesos();
        confPr.setVisible(true);
        this.setVisible(false);
        confPr.SetDatos(this.P,this.ant);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        P.CargarG();
        actualizar();
        actualizarFlechaCola();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPlanificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPlanificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPlanificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPlanificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPlanificador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MItemFabrica;
    private javax.swing.JMenuItem MItemReset;
    private javax.swing.JLabel PRUN;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q10;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel Q6;
    private javax.swing.JLabel Q7;
    private javax.swing.JLabel Q8;
    private javax.swing.JLabel Q9;
    private javax.swing.JLabel fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
