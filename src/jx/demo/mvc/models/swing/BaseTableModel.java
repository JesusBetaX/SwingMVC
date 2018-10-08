package jx.demo.mvc.models.swing;

import java.util.Collection;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 * Modelo base para una JTable.
 * @author jesus
 * @param <T> Tipo de fila
 */
public abstract class BaseTableModel<T> extends AbstractTableModel {
  /** Filas de nuestra tabla. */
  protected final Vector<T> items = new Vector<T>();
  /** Columna de nuestra tabla. */
  protected final Vector<String> columns;
  
  /**
   * TODO: Costructor
   * @param columns de la tabla.
   */
  public BaseTableModel(String... columns) {
    this.columns = convertToVector(columns);
  }
  
  public static <V> Vector<V> convertToVector(V... anArray) {
    if (anArray == null) return new Vector<V>();
    Vector<V> v = new Vector<V>(anArray.length);
    for (V o : anArray) v.addElement(o);
    return v;
  }
  
  /**
   * @return Numero de columnas que tiene la tabla.
   */
  @Override public int getColumnCount() {
    return columns.size();
  }

  /**
   * Obtiene el nombre de la columna segunn la posción.
   *
   * @param columnIndex posicion de la columna.
   * @return 
   */
  @Override public String getColumnName(int columnIndex) {
    return columns.get(columnIndex);
  }
  
  /**
   * Agrega una nueva columna a la tabla.
   * 
   * @param columnName 
   */
  public void addColumn(String columnName) {
    columns.addElement(columnName);
    fireTableStructureChanged();
  }
  
  /**
   * Limpia las columnas y asigna una nueva serie de columnas a la tabla.
   * 
   * @param columns lisa de columnas a agregar
   */
  public void setColumns(Collection<String> columns) {
    this.columns.clear();
    this.columns.addAll(columns);
    fireTableDataChanged();
  }
  public void setColumns(String... columns) {
    setColumns(convertToVector(columns));
  }
  
  /**
   * @return Numero de filas que tiene la tabla.
   */
  @Override public int getRowCount() {
    return items.size();
  }

  /**
   * Obtiene el item(fila) de la tabla.
   * 
   * @param rowIndex fila donde se encuenta el item
   * @return 
   */
  public T getItem(int rowIndex) {
    return items.get(rowIndex);
  }

  /**
   * Agrega un nuevo item(fila) a la tabla.
   *
   * @param item 
   */
  public void addItem(T item) {
    int row = getRowCount();
    items.insertElementAt(item, row);
    fireTableRowsInserted(row, row);
  }

  /**
   * Quita el item(fila) de la tabla.
   * 
   * @param item 
   */
  public boolean removeItem(T item) {
    T oldItem = removeItem(items.indexOf(item));
    return oldItem != null;
  }
  public T removeItem(int rowIndex) {
    T item = items.remove(rowIndex);
    if (item != null) fireTableRowsDeleted(rowIndex, rowIndex);
    return item;
  }

  /**
   * Limpia las filas y asigna una nueva serie de filas a la tabla.
   *
   * @param items lisa de filas a agregar
   */
  public void setItems(Collection<T> items) {
    this.items.clear();
    this.items.addAll(items);
    fireTableDataChanged();
  }
  public void setItems(T... items) {
    setItems(convertToVector(items));
  }
  
  /**
   * Retorna el tipo de clase del valor de la celsa segun la columna.
   * 
   * @param columnIndex columna
   * @return el Object.class
   */
  @Override public Class<?> getColumnClass(int columnIndex) {
    if (getRowCount() > 0) {
      Object value = getValueAt(0, columnIndex);
      if (value != null) return value.getClass();
    }
    return super.getColumnClass(columnIndex);
  }
}
