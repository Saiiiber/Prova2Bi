/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VeccVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u10549640177
 */
public class VendaControle extends AbstractTableModel {

   private List lista;


   public void setLista(List lista){
       this.lista = lista;
   }
   public void setList(List lista){
this.lista=lista;
}
   
public VeccVenda getbean(int linha){
return (VeccVenda) lista.get(linha);
}
   
    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
      return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         VeccVenda venda= (VeccVenda) lista.get(rowIndex);
      if (columnIndex == 0) {
             return venda.getVeccIdvenda();
        }
        if (columnIndex == 1) {
             return venda.getVeccVendedor();
        }
        if (columnIndex == 2) {
              return venda.getVeccDestinatario();
        }
        if (columnIndex == 3) {
              return venda.getVeccEndereco();
        
        }
       return null;
    }

    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Vendedor";
        }
        if (columnIndex == 2) {
             return "Destinatario";
        }
        if (columnIndex == 3) {
             return "Endereco";
        }
       
    return null;
    }
}

