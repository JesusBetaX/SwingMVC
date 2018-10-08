package jx.demo.mvc;

import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import jx.demo.mvc.views.PersonAddEditPanel;
import jx.demo.mvc.views.PersonListPanel;

public class App {

  private static App instance;
  
  private App() {
    instance = this;
    createUI();
  }
  
  public static App getInstance() {
    return instance;
  }

  //<editor-fold defaultstate="collapsed" desc="UI">
  private JFrame frame;
  
  private void createUI() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(600, 450);
    frame.setTitle("Java MVC");
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  public void replacePanel(JPanel panel) {
    frame.setContentPane(panel);
    frame.revalidate();
    frame.repaint();
  }

  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Bundle"> 
  private HashMap<String, Object> mBundle = new HashMap<String, Object>();
  
  public App putExtra(String name, Object value) {
    mBundle.put(name, value);
    return this;
  }
  
  public <T> T getExtra(String name)  {
    return (T) mBundle.get(name);
  }
  //</editor-fold>
  
  PersonAddEditPanel personAddEdit = new PersonAddEditPanel();
  public PersonAddEditPanel gotoPersonAddEdit() {
    replacePanel(personAddEdit);
    personAddEdit.controller.onInit();
    return personAddEdit;
  }
  
  PersonListPanel personList = new PersonListPanel();
  public PersonListPanel gotoPersonList() {
    replacePanel(personList);
    personList.controller.onInit();
    return personList;
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
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        App app = new App();
        app.gotoPersonList();
      }
    });
  }
}
