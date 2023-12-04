/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VeccProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u13766540670
 */
public class ProdutoControle extends AbstractTableModel {
   private List lista;


   public void setLista(List lista){
       this.lista = lista;
   }
   public void setList(List lista){
this.lista=lista;
}
   
public VeccProduto getbean(int linha){
return (VeccProduto) lista.get(linha);
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
         VeccProduto produto = (VeccProduto) lista.get(rowIndex);
      if (columnIndex == 0) {
             return produto.getIdveccProduto();
        }
        if (columnIndex == 1) {
             return produto.getVeccVendedor();
        }
        if (columnIndex == 2) {
              return produto.getVeccCodigo();
        }
        if (columnIndex == 3) {
              return produto.getVeccNome();
        
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
             return "Código";
        }
        if (columnIndex == 3) {
             return "Nome";
        }
       
    return null;
    }
}
