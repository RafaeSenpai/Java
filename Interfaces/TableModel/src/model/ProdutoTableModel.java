/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael
 * 
 * Modelo da tabela existente na ViewProduto
 */


/* Com o extends AbstractTableModel somos obrigados a definir os seguintes metodos, o netbeans sugere a construção automática deles, getRowCount(), getColumnCount() e getValueAt(int, int) */
public class ProdutoTableModel extends AbstractTableModel{

    //Conforme está descrito em titulo na view, vamos usar um array para armazenar a informação que será apresentada na tabela
    
    /*Array que irá conter toda a informação a ser apresentada na tabela*/
    List<Produto> dados = new ArrayList<>();
    
    /*Lista com as identificações das respetivas colunas apresentadas na tabela*/
    private String[] nomeDasColunas = {"Descrição","Quantidade","Valor"};
    
    
    @Override
    //Numero de linhas da tabela
    public int getRowCount() {
        return dados.size();
    }

    @Override
    //Numero de colunas da tabela
    public int getColumnCount() {
        return nomeDasColunas.length;
    }

    @Override
    //Usado para ir buscar valores da tabela.
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                    return dados.get(linha).getDescricao();
            case 1:
                    return dados.get(linha).getQtd();
            case 2:
                    return dados.get(linha).getValor();
        }
        return null;//  <<--- snão vai dar erro por estar á espera de retornar object
    }
        
    /*
    Atualizar a informação da tabela, selecionando previamente a linha a ser alterada.
    Nesta função são passados como parametro o novo valor que se quer atualizar, o numero da linha a ser atualizada e a coluna onde se encontra os dados a alterar
    */
    public void atualizaInformação(Object valor, int linha, int coluna){
      switch(coluna){
            case 0:
                    dados.get(linha).setDescricao((String) valor);
                    break;//para parar todo o processo após alteração da linha
            case 1:
                    dados.get(linha).setQtd(Integer.parseInt((String) valor));
                    break;
            case 2:
                    dados.get(linha).setValor(Double.parseDouble((String) valor));
                    break;
        }
      this.fireTableRowsUpdated(linha, linha);
    }
    /*
    * O seguinte metodo é facultativo. O objetivo do mesmmo é renomear o nome de cada coluna(sem este metodo, as colunas ficaram identificadas com as letras A,B,C,etc), da tabela para os nomes 
    * existentes no array de strings definido no inicio desta class, nomeadamente o array "nomeDasColunas".
    * O metodo em questão já possui um prototipo do mesmo,no netbeans, apenas CTRL + SPACE, getcolumnName() 
    */
    @Override
    public String getColumnName(int i) {
        return nomeDasColunas[i]; 
    }
    
    /*
    * Metodo utilizado para guardar a informação no array "dados"
    */        
    public void adicionarInformacao(Produto p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    /*
    * Metodo utilizado para remover, na tabela(e na estrutura de dados) a informação contida numa linha
    */
    public void removeInformacao(int linha){
        //Remover a informação da estrutura de dados
        this.dados.remove(linha);
        //Atualizar da tableModel (modeloDeTabela) de forma a mostrar a tabela já sem a informação eliminada
        this.fireTableRowsDeleted(linha, linha);
    }
}
