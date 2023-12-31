
package view;

import controller.database.ConnectionDb;
import controller.database.PacienteComparator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import model.Paciente;
import org.bson.Document;

/**
 *
 * @author Alexandre Gonçalves
 */
public class PainelGeral extends javax.swing.JFrame {
    
    private PriorityQueue<Paciente> filaPrioritaria;

    Paciente paciente = new Paciente();
    public PainelGeral() {
        initComponents();
        filaPrioritaria = new PriorityQueue<>(new PacienteComparator());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldPrioridade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonAgendar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrar = new javax.swing.JTextArea();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonFila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar paciente/consulta");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });

        jTextFieldPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrioridadeActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("1- Alta");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("2- Media");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("3- Baixa");

        jButtonAgendar.setText("Agendar");
        jButtonAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextAreaMostrar.setColumns(20);
        jTextAreaMostrar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMostrar);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("nome:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Idade");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nível prioridade");

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CPF:");

        jButtonFila.setText("Fila");
        jButtonFila.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonAgendar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuscar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonAtualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDeletar))
                                    .addComponent(jButtonFila, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(2, 2, 2)))
                                .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jTextFieldId))))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgendar)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFila)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    private void jTextFieldPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrioridadeActionPerformed

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
       ConnectionDb db = new ConnectionDb();

    // Obtenha os valores dos campos de texto
    String CpfPaciente = jTextFieldId.getText();
    String nomePaciente = jTextFieldNome.getText();
    int idadePaciente = Integer.parseInt(jTextFieldIdade.getText());
    int prioridadePaciente = Integer.parseInt(jTextFieldPrioridade.getText());

    // Crie um novo objeto de Paciente com os valores obtidos
    Paciente novoPaciente = new Paciente();
    novoPaciente.setNome(nomePaciente);
    novoPaciente.setIdade(idadePaciente);
    novoPaciente.setPrioridade(prioridadePaciente);
    novoPaciente.setId(CpfPaciente);

    // Converta o novo paciente em um documento para inserção no banco de dados
    Document documentoPaciente = new Document(novoPaciente.toMap());

    try {
        db.Conexao("mongodb://localhost:27017", "AgendaDeConsultas", "pacientes");
        db.Insert(documentoPaciente);
        jTextAreaMostrar.setText("Paciente inserido com sucesso!");

        // Adicione o paciente à fila prioritária
        filaPrioritaria.offer(novoPaciente);
    } catch (Exception e) {
        System.out.println("Erro ao Conectar ou Inserir no banco: " + e);
    } finally {
        db.Close();
    }
    }//GEN-LAST:event_jButtonAgendarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
      ConnectionDb db = new ConnectionDb();
try {
    db.Conexao("mongodb://localhost:27017", "AgendaDeConsultas", "pacientes");

    // Obtenha o nome e o CPF do paciente a ser buscado a partir dos campos de texto
    
    String termoBuscaNome = jTextFieldNome.getText();
    String termoBuscaCPF = jTextFieldId.getText();

    // Verifique se ambos os campos foram preenchidos
    if (!termoBuscaNome.isEmpty() && !termoBuscaCPF.isEmpty()) {

        // Crie uma consulta para buscar os pacientes pelo nome e CPF
        Document query = new Document("$and", Arrays.asList(
            new Document("nome", termoBuscaNome),
            new Document("id", termoBuscaCPF)
        ));

        // Execute a consulta no banco de dados para encontrar todos os documentos que atendam aos critérios
        List<Document> pacientesEncontrados = db.findCadastros(query);

        // Verifique se algum paciente foi encontrado
        if (!pacientesEncontrados.isEmpty()) {
            // Parte importante: aqui estou usando a biblioteca map para pegar o dado do tipo JSON e transformá-lo em uma string
            StringBuilder detalhesPacientes = new StringBuilder();
            detalhesPacientes.append("Pacientes Encontrados:\n");
            for (Document paciente : pacientesEncontrados) {
                detalhesPacientes.append("Paciente:\n");
                for (Map.Entry<String, Object> entry : paciente.entrySet()) {
                    detalhesPacientes.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
                }
                detalhesPacientes.append("\n");
            }

            // Exiba os detalhes dos pacientes encontrados, formatados como uma string
            jTextAreaMostrar.setText(detalhesPacientes.toString());
        } else {
            jTextAreaMostrar.setText("Nenhum paciente encontrado no banco de dados!");
        }
    } else {
        jTextAreaMostrar.setText("Ambos os campos 'Nome' e 'CPF' devem estar preenchidos para buscar.");
    }
} catch (Exception e) {
    System.out.println("Erro ao buscar pacientes: " + e);
    jTextAreaMostrar.setText("Erro ao buscar pacientes!");
} finally {
    db.Close(); // Fechar a conexão após a operação.
}


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
       ConnectionDb db = new ConnectionDb();
    try {
        db.Conexao("mongodb://localhost:27017", "AgendaDeConsultas", "pacientes");

        // Obtendo o nome e CPF do paciente a ser atualizado a partir dos campos de texto
        String nomePaciente = jTextFieldNome.getText();
        String cpfPaciente = jTextFieldId.getText();

        // Criando uma consulta para buscar o paciente pelo nome e CPF
        Document query = new Document();
        query.append("nome", nomePaciente);
        query.append("cpf", cpfPaciente);

        // Criando um documento com os novos dados do paciente (atualize os campos conforme necessário)
        Document novoPaciente = new Document();
        novoPaciente.append("idade", Integer.parseInt(jTextFieldIdade.getText()));
        novoPaciente.append("nome", jTextFieldNome.getText());
        novoPaciente.append("cpf", jTextFieldId.getText());

        // Executando a operação de atualização no banco de dados
        db.Update(query, novoPaciente);

        jTextAreaMostrar.setText("Dados do paciente atualizados com sucesso!");
    } catch (Exception e) {
        System.out.println("Erro ao atualizar dados do paciente: " + e);
    } finally {
        db.Close(); // Fechar a conexão após a operação.
    }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
         ConnectionDb db = new ConnectionDb();
    try {
        db.Conexao("mongodb://localhost:27017", "AgendaDeConsultas", "pacientes");

        // Obtenha o nome do paciente a ser excluído a partir do campo de texto
        String nomePaciente = jTextFieldNome.getText();

        // Crie uma consulta para buscar o paciente pelo nome
        Document query = new Document("nome", nomePaciente);

        // Execute a operação de exclusão no banco de dados
        db.Delete(query);

        jTextAreaMostrar.setText("Paciente excluído com sucesso!");
    } catch (Exception e) {
        System.out.println("Erro ao excluir paciente: " + e);
    } finally {
        db.Close(); //  fechar a conexão após a operação.
    }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jButtonFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilaActionPerformed
          if (!filaPrioritaria.isEmpty()) {
        // Exibir o próximo paciente da fila prioritária
        Paciente proximoPaciente = filaPrioritaria.poll(); // Remove o paciente atual

        // Exiba o próximo paciente na jTextAreaMostrar
        jTextAreaMostrar.setText("Próximo paciente na fila:\n" + proximoPaciente.toString());

        // Se desejar exibir os próximos pacientes da fila, pode fazer um loop
        // e exibi-los da mesma maneira
        if (!filaPrioritaria.isEmpty()) {
            StringBuilder pacientesFuturos = new StringBuilder("Próximos pacientes na fila:\n");
            for (Paciente paciente : filaPrioritaria) {
                pacientesFuturos.append(paciente.toString()).append("\n");
            }
            jTextAreaMostrar.append("\n" + pacientesFuturos.toString());
        }
    } else {
        jTextAreaMostrar.setText("Nenhum paciente na fila.");
    }
    }//GEN-LAST:event_jButtonFilaActionPerformed

  
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
            java.util.logging.Logger.getLogger(PainelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonFila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMostrar;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPrioridade;
    // End of variables declaration//GEN-END:variables
}
