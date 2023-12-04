/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VeccCliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u10549640177
 */
public class ControleCliente extends AbstractTableModel {
   private List lista = new ArrayList();


   public void setList(List lista) {
       this.lista = lista;
       this.fireTableDataChanged();
       }
   
public VeccCliente getbean(int linha){
return (VeccCliente) lista.get(linha);
}
   
    @Override
    public int getRowCount() {
       return lista.size();  
    }

    @Override
    public int getColumnCount() {
     return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         VeccCliente cliente = (VeccCliente) lista.get(rowIndex);
      if (columnIndex == 0) {
             return cliente.getVeccEndereco();
        }
        if (columnIndex == 1) {
             return cliente.getVeccNome();
        }
        if (columnIndex == 2) {
              return cliente.getVeccApelido();
        }
        if (columnIndex == 3) {
              return cliente.getVeccTelefone();
        
        }
       return "";
    }  
    
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "Endereco";
        }
        if (columnIndex == 1) {
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Apelido";
        }
        if (columnIndex == 3) {
             return "Telefone";
        }
       
    return "";
    }

    
}
