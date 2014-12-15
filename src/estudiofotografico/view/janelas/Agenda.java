/*
 * EstudioFotografico 1.0 - Gerenciador de Estudio Fotografico
 * Copyright (C) 2014 Rogério Eduardo Pereira
 * 
 * This file is part of EstudioFotografico 1.0.
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU 
 * General Public License as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiofotografico.view.janelas;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author farofa
 */
public class Agenda extends javax.swing.JFrame implements KeyListener, ContainerListener{

    /**
     * Creates new form cadastroMarcas
     */
    public Agenda() {
        initComponents();
        addKeyAndContainerListenerRecursively(this);
        this.setLocationRelativeTo(null);
        radioNenhumaPessoa.setVisible(false);
        radioNenhumaPessoa.doClick();
        tabelaContatos.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabelaContatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaContatos.getColumnModel().getColumn(2).setPreferredWidth(130);
        tabelaContatos.getColumnModel().getColumn(3).setPreferredWidth(130);
        tabelaContatos.getColumnModel().getColumn(4).setPreferredWidth(400);
    }
    
    //BOTAO ESC E ENTER
    //LISTENERS DO FRAME
    //KEYLISTENER RECURSIVO (COLOCA EM TODOS OS COMPONENTES)
    private void addKeyAndContainerListenerRecursively(Component c) 
    {  
        try 
        {  
            c.addKeyListener(this);  
            if (c instanceof Container) 
            {  
                Container cont = (Container) c;  
                cont.addContainerListener(this);  
                Component[] children = cont.getComponents();  
                for (int i = 0; i < children.length; i++) 
                {  
                    addKeyAndContainerListenerRecursively(children[i]);  
                }  
            }  
        } catch (Exception e) {  
            //Anuncie Aqui  
        }  
    }  
    
    //EVENTOS KEYLISTENER
    public void keyTyped(KeyEvent e) {}  
    public void keyReleased(KeyEvent e) {}  
    public void componentAdded(ContainerEvent e) {}  
    public void componentRemoved(ContainerEvent e) {}  
    public void keyPressed(KeyEvent e) 
    {
        //TECLA ENTER
        if(e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            
        }
        
        //TECLA ESC
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        grupoPessoa = new javax.swing.ButtonGroup();
        painelPesquisa = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        radioPessoaFisica = new javax.swing.JRadioButton();
        radioPessoaJuridica = new javax.swing.JRadioButton();
        radioNenhumaPessoa = new javax.swing.JRadioButton();
        painelPessoaFisica = new javax.swing.JPanel();
        labelCPF = new javax.swing.JLabel();
        textoCPF = new javax.swing.JFormattedTextField();
        painelPessoaJuridica = new javax.swing.JPanel();
        labelCNPJ = new javax.swing.JLabel();
        textoCNPJ = new javax.swing.JFormattedTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        painelTabela = new javax.swing.JScrollPane();
        tabelaContatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda");
        setBounds(new java.awt.Rectangle(250, 230, 0, 0));

        painelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(95, 133, 169), null), "Pesquisa", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        labelNome.setText("Nome");

        grupoPessoa.add(radioPessoaFisica);
        radioPessoaFisica.setText("Pessoa Fisica");
        radioPessoaFisica.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioPessoaFisicaActionPerformed(evt);
            }
        });

        grupoPessoa.add(radioPessoaJuridica);
        radioPessoaJuridica.setText("Pessoa Juridica");
        radioPessoaJuridica.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioPessoaJuridicaActionPerformed(evt);
            }
        });

        grupoPessoa.add(radioNenhumaPessoa);
        radioNenhumaPessoa.setSelected(true);
        radioNenhumaPessoa.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioNenhumaPessoaActionPerformed(evt);
            }
        });

        painelPessoaFisica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(95, 133, 169), null), "Pessoa Fisica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andale Mono", 0, 12))); // NOI18N

        labelCPF.setText("CPF");

        try
        {
            textoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelPessoaFisicaLayout = new javax.swing.GroupLayout(painelPessoaFisica);
        painelPessoaFisica.setLayout(painelPessoaFisicaLayout);
        painelPessoaFisicaLayout.setHorizontalGroup(
            painelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPessoaFisicaLayout.createSequentialGroup()
                        .addComponent(labelCPF)
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addComponent(textoCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPessoaFisicaLayout.setVerticalGroup(
            painelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPessoaJuridica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(95, 133, 169), null), "Pessoa Juridica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andale Mono", 0, 12))); // NOI18N

        labelCNPJ.setText("CNPJ");

        try
        {
            textoCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelPessoaJuridicaLayout = new javax.swing.GroupLayout(painelPessoaJuridica);
        painelPessoaJuridica.setLayout(painelPessoaJuridicaLayout);
        painelPessoaJuridicaLayout.setHorizontalGroup(
            painelPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPessoaJuridicaLayout.createSequentialGroup()
                        .addComponent(labelCNPJ)
                        .addGap(0, 138, Short.MAX_VALUE))
                    .addComponent(textoCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPessoaJuridicaLayout.setVerticalGroup(
            painelPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCNPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPesquisaLayout = new javax.swing.GroupLayout(painelPesquisa);
        painelPesquisa.setLayout(painelPesquisaLayout);
        painelPesquisaLayout.setHorizontalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPesquisaLayout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addGap(3, 3, 3)
                        .addComponent(textoNome))
                    .addGroup(painelPesquisaLayout.createSequentialGroup()
                        .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPesquisaLayout.createSequentialGroup()
                                .addComponent(radioPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioNenhumaPessoa))
                            .addComponent(painelPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioPessoaJuridica)
                            .addComponent(painelPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPesquisaLayout.setVerticalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(radioPessoaJuridica, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(radioPessoaFisica))
                    .addComponent(radioNenhumaPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estudiofotografico/view/img/magnifier.png"))); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estudiofotografico/view/img/delete.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estudiofotografico/view/img/cancel.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botaoCancelarActionPerformed(evt);
            }
        });

        tabelaContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Nome", "CPF/CNPJ", "Telefone 1", "Telefone 2", "E-Mail"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabelaContatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        painelTabela.setViewportView(tabelaContatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(botaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioNenhumaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNenhumaPessoaActionPerformed
        //DESABILITA PAINEL PESSOA FISICA E JURIDICA
            //PESSOA FISICA
            painelPessoaFisica.setEnabled(false);
            labelCPF.setEnabled(false);
            textoCPF.setEnabled(false);

            //PESSOA JURIDICA
            painelPessoaJuridica.setEnabled(false);
            labelCNPJ.setEnabled(false);
            textoCNPJ.setEnabled(false);
    }//GEN-LAST:event_radioNenhumaPessoaActionPerformed

    private void radioPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPessoaFisicaActionPerformed
        //HABILITA PAINEL PESSOA FISICA E DESABILITA PAINEL PESSOA JURIDICA
            //PESSOA FISICA
            painelPessoaFisica.setEnabled(true);
            labelCPF.setEnabled(true);
            textoCPF.setEnabled(true);

            //PESSOA JURIDICA
            painelPessoaJuridica.setEnabled(false);
            labelCNPJ.setEnabled(false);
            textoCNPJ.setEnabled(false);
    }//GEN-LAST:event_radioPessoaFisicaActionPerformed

    private void radioPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPessoaJuridicaActionPerformed
        //HABILITA PAINEL PESSOA JURIDICA E DESABILITA PAINEL PESSOA FISICA
            //PESSOA FISICA
            painelPessoaFisica.setEnabled(false);
            labelCPF.setEnabled(false);
            textoCPF.setEnabled(false);

            //PESSOA JURIDICA
            painelPessoaJuridica.setEnabled(true);
            labelCNPJ.setEnabled(true);
            textoCNPJ.setEnabled(true);
    }//GEN-LAST:event_radioPessoaJuridicaActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoPesquisarActionPerformed
    {//GEN-HEADEREND:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoLimparActionPerformed
    {//GEN-HEADEREND:event_botaoLimparActionPerformed
		textoNome.setText("");
		radioNenhumaPessoa.doClick();
		textoCPF.setText("");
		textoCNPJ.setText("");
		
		DefaultTableModel modelo = (DefaultTableModel) tabelaContatos.getModel();
		while(tabelaContatos.getRowCount() > 0)
			modelo.removeRow(0);
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoCancelarActionPerformed
    {//GEN-HEADEREND:event_botaoCancelarActionPerformed
		this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.ButtonGroup grupoPessoa;
    private javax.swing.JLabel labelCNPJ;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JPanel painelPessoaFisica;
    private javax.swing.JPanel painelPessoaJuridica;
    private javax.swing.JScrollPane painelTabela;
    private javax.swing.JRadioButton radioNenhumaPessoa;
    private javax.swing.JRadioButton radioPessoaFisica;
    private javax.swing.JRadioButton radioPessoaJuridica;
    private javax.swing.JTable tabelaContatos;
    private javax.swing.JFormattedTextField textoCNPJ;
    private javax.swing.JFormattedTextField textoCPF;
    private javax.swing.JTextField textoNome;
    // End of variables declaration//GEN-END:variables
}
