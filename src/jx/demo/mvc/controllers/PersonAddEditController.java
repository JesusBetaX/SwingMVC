package jx.demo.mvc.controllers;

import javax.swing.JOptionPane;
import jx.demo.mvc.App;
import jx.demo.mvc.models.Person;
import jx.demo.mvc.models.dao.PersonDao;
import jx.demo.mvc.views.PersonAddEditPanel;

public class PersonAddEditController {

  PersonAddEditPanel _view;
  Person _model;

  public void setView(PersonAddEditPanel view) {
    _view = view;
  }
  
  public void onInit() {
    // Recupera el registro selecionado anteriormente en PersonList.
    _model = App.getInstance().getExtra("person");
    
    _view.firstNameText.setText(_model.getFirstName());
    _view.lastNameText.setText(_model.getLastName());
    _view.streetText.setText(_model.getStreet());
    _view.postalCodeFormatText.setText(Integer.toString(_model.getPostalCode()));
    _view.cityText.setText(_model.getCity());
  }

  /**
   * Evento del boton 'cancel'. Regresamos a la lista.
   */
  public void onCancel() {
    App.getInstance().gotoPersonList();
  }

  /**
   * Evento de boton 'save'. Agrega o edita el registro.
   */
  public void onSave() {
    if (isInputValid()) {
      _model.setFirstName(_view.firstNameText.getText());
      _model.setLastName(_view.lastNameText.getText());
      _model.setStreet(_view.streetText.getText());
      _model.setPostalCode(Integer.parseInt(_view.postalCodeFormatText.getText()));
      _model.setCity(_view.cityText.getText());

      PersonDao.getInstance().save(_model);
      App.getInstance().gotoPersonList();
    }
  }
  
  /**
   * Valida los textos.
   *
   * @return true if the input is valid
   */
  private boolean isInputValid() {
    String errorMessage = "";
    
    if (_view.firstNameText.getText().isEmpty()) {
      errorMessage += "No valid first name!\n";
    }
    if (_view.lastNameText.getText().isEmpty()) {
      errorMessage += "No valid last name!\n";
    }
    if (_view.streetText.getText().isEmpty()) {
      errorMessage += "No valid street!\n";
    }

    if (_view.postalCodeFormatText.getText().isEmpty()) {
      errorMessage += "No valid postal code!\n";
    } else {
      // try to parse the postal code into an int.
      try {
        Integer.parseInt(_view.postalCodeFormatText.getText());
      } catch (NumberFormatException e) {
        errorMessage += "No valid postal code (must be an integer)!\n";
      }
    }

    if (_view.cityText.getText().isEmpty()) {
      errorMessage += "No valid city!\n";
    }
    
    if (errorMessage.length() == 0) {
      return true;
    } else {
      // Show the error message.
      JOptionPane.showMessageDialog(_view, 
              "Please correct invalid fields:\n"+errorMessage, 
              "Invalid Fields",
              JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }
}
