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
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estudiofotografico.view.janelas;

import estudiofotografico.control.ControladorFornecedores;
import estudiofotografico.control.ControladorProdutos;
import estudiofotografico.model.Fornecedores;
import estudiofotografico.model.Produtos;
import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rogério Eduardo Pereira
 * Data Criação: Feb 26, 2014
 */
public class ProcuraProduto extends javax.swing.JDialog implements KeyListener, ContainerListener{

    /** Creates new form ProcuraProduto */
    public ProcuraProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //Adiciona Listeners de Botões
        addKeyAndContainerListenerRecursively(this);
		
		this.setLocationRelativeTo(null);
		
		this.configuraTabela();
		
		this.getCategoria();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        comboMarca = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        textoFornecedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoSelecionar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procura Produtos");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/estudiofotografico/view/img/camera-photo-5.png")));
        setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(95, 133, 169), null), "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jLabel3.setText("Categoria");

        comboMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jLabel5.setText("Fornecedor");

        textoFornecedor.setEditable(false);
        textoFornecedor.setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estudiofotografico/view/img/procurarFornecedor.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textoNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, 233, Short.MAX_VALUE)
                            .addComponent(textoCodigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(95, 133, 169), null), "Controle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estudiofotografico/view/img/magnifier.png"))); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estudiofotografico/view/img/accept.png"))); // NOI18N
        botaoSelecionar.setText("Selecionar");
        botaoSelecionar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botaoSelecionarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
            .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(botaoPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSelecionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "", "Codigo", "Nome", "Categoria", "Tipo"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Boolean.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoPesquisarActionPerformed
    {//GEN-HEADEREND:event_botaoPesquisarActionPerformed
        this.apagaTabela();

        control = new ControladorProdutos();
        List<Produtos> lista = control.getProdutosBusca	(
            this.getCodigo(),
            this.getNome(),
            this.categoriaCombo(),
			this.getFornecedor()
        );
        this.insereDados(lista);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoSelecionarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoSelecionarActionPerformed
    {//GEN-HEADEREND:event_botaoSelecionarActionPerformed
        if(tabelaProdutos.getSelectedRow() != -1)
        {
            JFrame janela = (JFrame) this.getParent();
            if(janela.getTitle() == "Cadastro de Produtos")
            {
                janelaCadastroProdutos = (CadastroProdutos) this.getParent();
                janelaCadastroProdutos.codigo = Long.parseLong(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
                janelaCadastroProdutos.limpaTela();
                janelaCadastroProdutos.getProdutoByCodigo();
            }
			else if(janela.getTitle() == "Vendas")
			{
				for(int i=0; i<tabelaProdutos.getRowCount(); i++)
				{
					if(tabelaProdutos.getValueAt(i, 0).equals(true))
					{
						janelaVendas = (Vendas) this.getParent();
						janelaVendas.insertProduto(Long.parseLong(tabelaProdutos.getValueAt(i, 1).toString()));
					}
				}
			}

            this.dispose();
        }
    }//GEN-LAST:event_botaoSelecionarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoLimparActionPerformed
    {//GEN-HEADEREND:event_botaoLimparActionPerformed
        this.textoCodigo.setText("");
        this.textoNome.setText("");
        this.comboMarca.setSelectedIndex(-1);
        this.apagaTabela();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoCancelarActionPerformed
    {//GEN-HEADEREND:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        janelaPesquisaFornecedor = new ProcuraFornecedores((JFrame) this.getParent(), true);
        janelaPesquisaFornecedor.setJanelaProcuraProduto(this);
        janelaPesquisaFornecedor.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
	 * Método setTamanhoTabela
	 * Define o tamanho das colunas da tabela
	 */
	private void configuraTabela()
	{
		JFrame janela = (JFrame) this.getParent();
		
		if(janela.getTitle() == "Vendas")
		{
			DefaultTableCellRenderer alinhamento = new DefaultTableCellRenderer();
			alinhamento.setHorizontalAlignment(SwingConstants.LEFT);
			tabelaProdutos.getColumnModel().getColumn(1).setCellRenderer(alinhamento);

			tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(20); 
			tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(80); 
			tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(130); 
			tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100); 
			tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(100); 
		}
		else
		{
			DefaultTableCellRenderer alinhamento = new DefaultTableCellRenderer();
			alinhamento.setHorizontalAlignment(SwingConstants.LEFT);
			tabelaProdutos.getColumnModel().getColumn(1).setCellRenderer(alinhamento);

			tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(80); 
			tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(150); 
			tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100); 
			tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(100); 
			
			tabelaProdutos.getColumnModel().removeColumn( tabelaProdutos.getColumnModel().getColumn(0)); 
		}
	}
	
    /*
	 * Método apagaTabela
	 * Apaga a tabela
	 */
	public void apagaTabela()
	{
		DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
		while(tabelaProdutos.getRowCount() > 0)
			modelo.removeRow(0);
	}
	
	/*
	 * Método insereDados
	 * insere os dados da busca na tabela
	 */
	public void insereDados(List<Produtos> lista)
	{
		DecimalFormat fmt = new DecimalFormat("#,##0.00");   //limita o número de casas decimais
		
		for(Produtos produto: lista)
		{
			DefaultTableModel modelo = (DefaultTableModel) this.tabelaProdutos.getModel();
			modelo.addRow(new String[]	{
											null,
											produto.getCodigo().toString(),
											produto.getProduto(),
											produto.getCategoria().getCategoria(),
											"R$ "+fmt.format(produto.getValor())
										});
		}
	}
	
	/*
	 * Método getCategoria
	 * Obtem todos as marcas de equipamentos e insere nos combobox
	 */
	private void getCategoria()
	{
		control = new ControladorProdutos();
		List<String> lista = control.getCategorias();
		
		for(String item: lista)
		{
			comboMarca.addItem(item);
			comboMarca.setSelectedIndex(-1);
		}
		control = null;
	}
	
    /*
     * Métodos da Classe
     */
    
    //METODOS KEYLISTENER
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
			this.botaoPesquisar.doClick();
        }

        //TECLA ESC
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            this.Fechar();
        }
    }
    
    
    /*
     * Método Fechar()
     * Fecha Janela
     */
    private void Fechar()
    {
        this.dispose();
    }

	public Long getCodigo ()
	{
		if(this.textoCodigo.getText().isEmpty())
			return null;
		else
			return Long.parseLong(this.textoCodigo.getText());
	}


	public String getNome ()
	{
		if(this.textoNome.getText().isEmpty())
			return null;
		else
			return this.textoNome.getText();
	}


	public String categoriaCombo ()
	{
		if((this.comboMarca.getSelectedIndex() == -1) || (this.comboMarca.getSelectedIndex() == 0))
			return null;
		else
			return this.comboMarca.getSelectedItem().toString();
	}
	
	public Long getFornecedor()
	{
		if(this.textoFornecedor.getText().isEmpty())
			return null;
		else
			return this.fornecedor.getCodigo();
	}
	
	/*
	 * Método getFornecedorByCod
	 * Obtem o fornecedor pelo codigo
	 */
	public void getFornecedorByCod(long codigo)
	{
		this.controladorFornecedor	= new ControladorFornecedores();
		this.fornecedor				= this.controladorFornecedor.getFornecedorByCodigo(codigo);
		this.textoFornecedor.setText(this.fornecedor.getNome());
		this.controladorFornecedor	= null;
	}
	
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
            java.util.logging.Logger.getLogger(ProcuraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcuraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcuraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcuraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProcuraProduto dialog = new ProcuraProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSelecionar;
    private javax.swing.JComboBox comboMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoFornecedor;
    private javax.swing.JTextField textoNome;
    // End of variables declaration//GEN-END:variables
	private ControladorProdutos			control;
	private Long						codigo;
	private String						nome;
	private String						categoriaCombo;
	
	private CadastroProdutos			janelaCadastroProdutos;
	private Vendas						janelaVendas;
	
	private ProcuraFornecedores			janelaPesquisaFornecedor;
	private ControladorFornecedores		controladorFornecedor;
	private Fornecedores				fornecedor;
}
