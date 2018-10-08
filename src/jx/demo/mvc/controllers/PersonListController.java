package jx.demo.mvc.controllers;

import java.util.List;
import jx.demo.mvc.App;
import jx.demo.mvc.models.Person;
import jx.demo.mvc.models.dao.PersonDao;
import jx.demo.mvc.models.swing.PersonTableModel;
import jx.demo.mvc.views.PersonListPanel;

public class PersonListController {

  PersonTableModel _model = new PersonTableModel();
  PersonListPanel _view;

  public void setView(PersonListPanel view) {
    _view = view;
    _view.personTableView.setModel(_model);
  }
  
  public void onInit() {
    // Llenamos la tabla con registros.
    List<Person> persons = PersonDao.getInstance().findAll();
    _model.setItems(persons);
  }

  /**
   * Evento de boton 'add'. Abre el formulario para agregar un nuevo registro.
   */
  public void onAdd() {
    // Obtenemos la instancia de la aplicacion principal.
    // Agregamos el parametro person.
    // Mostramos la vista para agregar.
    App.getInstance()
            .putExtra("person", new Person())
            .gotoPersonAddEdit();
  }

  /**
   * Evento del menu de la Tabla 'edit'. Abre el formulario para editar el registro
   * seleccionado.
   */
  public void onEdit() {
    int viewRow = _view.personTableView.getSelectedRow();
    if (viewRow != -1) {
      int modelRow =  _view.personTableView.convertRowIndexToModel(viewRow);
      Person person = _model.getItem(modelRow);
      // Obtenemos la instancia de la aplicacion principal.
      // Agregamos el parametro person.
      // Mostramos la vista para editar.
      App.getInstance()
              .putExtra("person", person)
              .gotoPersonAddEdit();
    }
  }

  /**
   * Evento del menu de la Tabla 'delete'. Elimina registro.
   */
  public void onDelete() {
    int viewRow = _view.personTableView.getSelectedRow();
    if (viewRow != -1) {
      int modelRow =  _view.personTableView.convertRowIndexToModel(viewRow);
      Person person = _model.getItem(modelRow);
      // Eliminamos el registro del origen de datos.
      // Y Eliminamos el registro de la tabla.
      if (PersonDao.getInstance().delete(person)) {
        _model.removeItem(modelRow);
      }
    }
  } 
}
