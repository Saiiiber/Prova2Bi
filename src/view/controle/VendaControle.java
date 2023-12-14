/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VeccVenda;
import bean.VeccVendaProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u10549640177
 */
public class VendaControle extends AbstractTableModel {

   private List lista;


public void setList(List lista) {
         this.lista = lista;
       this.fireTableDataChanged();
    }
   
public VeccVenda getbean(int linha){
return (VeccVenda) lista.get(linha);
}
   public void addBean(VeccVenda veccVenda){
    lista.add(veccVenda);
    this.fireTableDataChanged();
}
   
public void removeBean(int index){
    lista.remove(index);
    this.fireTableDataChanged();
}

public void updateBean(int index, VeccVenda veccVenda){
    lista.set(index, veccVenda );
    this.fireTableDataChanged();
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
    public Object getValueAt(int row, int column) {
         VeccVenda venda= (VeccVenda) lista.get(row);
      if (column == 0) {
             return venda.getVeccIdvenda();
        }
        if (column == 1) {
             return venda.getVeccVendedor();
        }
        if (column == 2) {
              return venda.getVeccCliente();
        }
        if (column == 3) {
              return venda.getVeccEndereco();
        
        }
       return "";
    }

    @Override
    public String getColumnName(int column){
        if (column == 0) {
             return "ID";
        }
        if (column == 1) {
             return "Vendedor";
        }
        if (column == 2) {
             return "Cliente";
        }
        if (column == 3) {
             return "Endereco";
        }
       
    return "";
    }

   
}

