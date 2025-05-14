package Interface;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import telecineflix.Filme;
import telecineflix.FilmeDAO;
import java.sql.Date;

/**
 * Interface gráfica para gerenciamento de filmes no sistema Cenaflix. Permite
 * cadastrar, consultar, atualizar, excluir e filtrar filmes por categoria,
 * exibindo-os em uma JTable.
 *
 * @author Carlos Eduardo Henrique Garibaldi
 * @version 2.0
 */
public class CadastroTeleFlix extends javax.swing.JFrame {

    private FilmeDAO filmeDAO;
    private DefaultTableModel tableModel;

    /**
     * Construtor padrão. Inicializa a interface, configura a JTable e o filtro
     * de categoria.
     */
    public CadastroTeleFlix() {
        filmeDAO = new FilmeDAO();
        initComponents();
        configurarTabela();
        atualizarTabela(null);
    }

    /**
     * Configura o modelo da JTable para exibir os filmes.
     */
    private void configurarTabela() {
        tableModel = new DefaultTableModel(
                new Object[]{"ID", "Nome", "Data de Lançamento", "Categoria"},
                0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Impede edição direta na tabela
            }
        };
        jTable1.setModel(tableModel);
    }

    /**
     * Atualiza a JTable com todos os filmes do banco de dados.
     */
    private void atualizarTabela(String categoria) {
        try {
            tableModel.setRowCount(0); // Limpa a tabela
            List<Filme> filmes = (categoria == null || categoria.trim().isEmpty())
                    ? filmeDAO.listarTodos()
                    : filmeDAO.listarPorCategoria(categoria);
            for (Filme filme : filmes) {
                tableModel.addRow(new Object[]{
                    filme.getId(),
                    filme.getNome(),
                    filme.getDataLancamento().toString(),
                    filme.getCategoria()
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar filmes: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Categoria inválida: " + e.getMessage());
            atualizarTabela(null); // Restaura todos os filmes
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLan = new javax.swing.JTextField();
        btnLimp = new javax.swing.JButton();
        btnCad = new javax.swing.JButton();
        cbCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUp = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        txtPesquisa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(16, 16, 16));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cenaflix");

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Nome do Filme");

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Categoria");

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Data de Lançamento");

        txtLan.setBackground(new java.awt.Color(102, 102, 102));
        txtLan.setForeground(new java.awt.Color(255, 255, 255));
        txtLan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(255, 0, 0)));
        txtLan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLan.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        btnLimp.setBackground(new java.awt.Color(255, 0, 0));
        btnLimp.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLimp.setForeground(new java.awt.Color(255, 255, 255));
        btnLimp.setText("Limpar");
        btnLimp.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });

        btnCad.setBackground(new java.awt.Color(255, 0, 0));
        btnCad.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCad.setForeground(new java.awt.Color(255, 255, 255));
        btnCad.setText("Cadastrar");
        btnCad.setBorder(new javax.swing.border.MatteBorder(null));
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        cbCat.setBackground(new java.awt.Color(51, 51, 51));
        cbCat.setForeground(new java.awt.Color(255, 255, 255));
        cbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um...", "Terror", "Comédia", "Romance", "Slacher", "Retro", "Suspense", "Documentário", "Psicológico", "Família ", "Ação" }));
        cbCat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(255, 0, 0)));

        jTable1.setBackground(new java.awt.Color(16, 16, 16));
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        btnUp.setBackground(new java.awt.Color(255, 0, 0));
        btnUp.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnUp.setForeground(new java.awt.Color(255, 255, 255));
        btnUp.setText("Atualizar");
        btnUp.setBorder(new javax.swing.border.MatteBorder(null));
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.MatteBorder(null));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtNom.setBackground(new java.awt.Color(102, 102, 102));
        txtNom.setForeground(new java.awt.Color(255, 255, 255));
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(255, 0, 0)));
        txtNom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNom.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtPesquisa.setBackground(new java.awt.Color(51, 51, 51));
        txtPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(255, 0, 0)));
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Pesquisar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLan)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        txtNom.setText("");
        txtLan.setText("");
        cbCat.setSelectedIndex(0);
        txtPesquisa.setText("");
        atualizarTabela(null);
    }//GEN-LAST:event_btnLimpActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        String nome = txtNom.getText().trim();
        String data = txtLan.getText().trim();
        String categoria = cbCat.getSelectedItem().toString();

        // Validação de campos
        if (nome.isEmpty() || data.isEmpty() || categoria.equals("Escolha um...")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!");
            return;
        }

        // Validação do formato da data
        if (!data.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Data deve estar no formato AAAA-MM-DD!");
            return;
        }

        try {
            Filme filme = new Filme();
            filme.setNome(nome);
            filme.setDataLancamento(Date.valueOf(data));
            filme.setCategoria(categoria);
            filmeDAO.inserir(filme);
            JOptionPane.showMessageDialog(this, "Filme cadastrado com sucesso!");
            btnLimpActionPerformed(evt); // Limpa os campos
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível cadastrar o filme: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Erro no formato da data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um filme na tabela para atualizar!");
            return;
        }

        String nome = txtNom.getText().trim();
        String data = txtLan.getText().trim();
        String categoria = cbCat.getSelectedItem().toString();

        // Validação de campos
        if (nome.isEmpty() || data.isEmpty() || categoria.equals("Escolha um...")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!");
            return;
        }

        // Validação do formato da data
        if (!data.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Data deve estar no formato AAAA-MM-DD!");
            return;
        }

        try {
            int id = (Integer) tableModel.getValueAt(selectedRow, 0);
            Filme filme = new Filme();
            filme.setId(id);
            filme.setNome(nome);
            filme.setDataLancamento(Date.valueOf(data));
            filme.setCategoria(categoria);
            filmeDAO.atualizar(filme);
            JOptionPane.showMessageDialog(this, "Filme atualizado com sucesso!");
            btnLimpActionPerformed(evt); // Limpa os campos
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível atualizar o filme: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Erro no formato da data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um filme na tabela para excluir!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este filme?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                int id = (Integer) tableModel.getValueAt(selectedRow, 0);
                filmeDAO.excluir(id);
                JOptionPane.showMessageDialog(this, "Filme excluído com sucesso!");
                atualizarTabela(null); // Atualiza a tabela
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir o filme: " + e.getMessage());
            }
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            txtNom.setText((String) tableModel.getValueAt(selectedRow, 1));
            txtLan.setText((String) tableModel.getValueAt(selectedRow, 2));
            cbCat.setSelectedItem((String) tableModel.getValueAt(selectedRow, 3));
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        String categoria = txtPesquisa.getText().trim();
        atualizarTabela(categoria);
    }//GEN-LAST:event_txtPesquisaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTeleFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroTeleFlix().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimp;
    private javax.swing.JButton btnUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtLan;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
