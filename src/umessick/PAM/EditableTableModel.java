/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umessick.PAM;
// http://www.java2s.com/Tutorial/Java/0240__Swing/DemonstratestheeditablepropertyofSwingtables.htm
// http://stackoverflow.com/questions/12348932/change-background-color-of-one-cell-in-jtable/12352838#12352838

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author uam65345
 */
class EditableTableModel extends AbstractTableModel {
  private List<Object[]> rows =new ArrayList<Object[]>();
    
  String[] columnTitles;
  //Object[][] dataEntries;
  int rowCount;

//  public EditableTableModel(String[] columnTitles, Object[][] dataEntries) {
//    this.columnTitles = columnTitles;
//    this.dataEntries = dataEntries;
//  }
  
  public EditableTableModel(String[] columnTitles) {
    this.columnTitles = columnTitles;
  }

  public int getRowCount() {
    return rows.size();
  }

  public int getColumnCount() {
    return columnTitles.length;
  }

  public Object getValueAt(int row, int column) {
    return rows.get(row)[column];
  }

  public String getColumnName(int column) {
    return columnTitles[column];
  }

  public Class getColumnClass(int column) {
    return getValueAt(0, column).getClass();
  }

  public boolean isCellEditable(int row, int column) {
    return true;
  }

  public void setValueAt(Object value, int row, int column) {
    rows.get(row)[column] = value;
  }
  
  public void insertRow(Object[] rec) {
      rows.add(rec);
      this.fireTableDataChanged();
  }
 
}