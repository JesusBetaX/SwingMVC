package jx.demo.mvc.views;

import jx.demo.mvc.controllers.PersonAddEditController;

public class PersonAddEditPanel extends javax.swing.JPanel {

  public PersonAddEditController controller;

  public PersonAddEditPanel() {
    controller = new PersonAddEditController();
    initComponents();
    controller.setView(this);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    headerPanel = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    bodyPanel = new javax.swing.JPanel();
    cancelButton = new javax.swing.JButton();
    saveButton = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    firstNameText = new javax.swing.JFormattedTextField();
    lastNameText = new javax.swing.JFormattedTextField();
    streetText = new javax.swing.JFormattedTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    cityText = new javax.swing.JTextField();
    postalCodeFormatText = new javax.swing.JFormattedTextField();

    headerPanel.setBackground(new java.awt.Color(255, 255, 255));
    headerPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.lightGray));

    jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jLabel1.setText("Person");

    javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
    headerPanel.setLayout(headerPanelLayout);
    headerPanelLayout.setHorizontalGroup(
      headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(headerPanelLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    headerPanelLayout.setVerticalGroup(
      headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(headerPanelLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(jLabel1)
        .addGap(16, 16, 16))
    );

    bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

    cancelButton.setText("Cancel");
    cancelButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cancelButtonActionPerformed(evt);
      }
    });

    saveButton.setText("Save");
    saveButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveButtonActionPerformed(evt);
      }
    });

    jLabel2.setText("First Name");

    jLabel3.setText("Last Name");

    jLabel4.setText("Street");

    jLabel5.setText("Postal Code");

    jLabel6.setText("City");

    try {
      postalCodeFormatText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
    bodyPanel.setLayout(bodyPanelLayout);
    bodyPanelLayout.setHorizontalGroup(
      bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(bodyPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
            .addGap(0, 353, Short.MAX_VALUE)
            .addComponent(saveButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cancelButton))
          .addGroup(bodyPanelLayout.createSequentialGroup()
            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(jLabel3)
              .addComponent(jLabel5)
              .addComponent(jLabel2)
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(29, 29, 29)
            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(postalCodeFormatText, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(streetText, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cityText)
              .addComponent(firstNameText, javax.swing.GroupLayout.Alignment.LEADING))))
        .addContainerGap())
    );
    bodyPanelLayout.setVerticalGroup(
      bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(streetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(postalCodeFormatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cancelButton)
          .addComponent(saveButton))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    controller.onCancel();
  }//GEN-LAST:event_cancelButtonActionPerformed

  private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    controller.onSave();
  }//GEN-LAST:event_saveButtonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bodyPanel;
  private javax.swing.JButton cancelButton;
  public javax.swing.JTextField cityText;
  public javax.swing.JFormattedTextField firstNameText;
  private javax.swing.JPanel headerPanel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  public javax.swing.JFormattedTextField lastNameText;
  public javax.swing.JFormattedTextField postalCodeFormatText;
  private javax.swing.JButton saveButton;
  public javax.swing.JFormattedTextField streetText;
  // End of variables declaration//GEN-END:variables
}
