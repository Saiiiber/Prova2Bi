/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VeccVendaProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u10549640177
 */
public class VendaProdutoControle extends AbstractTableModel {

   private List lista = new ArrayList();

   public void setList(List lista){
        this.lista=lista;
        this.fireTableDataChanged();
    }
   
public VeccVendaProduto getbean(int linha){
return (VeccVendaProduto) lista.get(linha);
}

public void addBean(VeccVendaProduto veccVendaProduto){
    lista.add(veccVendaProduto);
    this.fireTableDataChanged();
}
   
public void removeBean(int index){
    lista.remove(index);
    this.fireTableDataChanged();
}

public void updateBean(int index, VeccVendaProduto veccVendaProduto){
    lista.set(index, veccVendaProduto );
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
    public Object getValueAt(int rowIndex, int columnIndex) {
         VeccVendaProduto vendaProduto = (VeccVendaProduto) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vendaProduto.getVeccIdvendaProduto();
        }
        if (columnIndex == 1) {
             return vendaProduto.getVeccProduto();
        }
        if (columnIndex == 2) {
              return vendaProduto.getVeccQuantidade();
        }
        if (columnIndex == 3) {
              return vendaProduto.getVeccValor();
        
        }
       return "";
    }

    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Produto";
        }
        if (columnIndex == 2) {
             return "Quantidade";
        }
        if (columnIndex == 3) {
             return "Valor";
        }
       
    return "";
    }

}

