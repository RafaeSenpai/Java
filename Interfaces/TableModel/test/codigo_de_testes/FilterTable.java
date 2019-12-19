package codigo_de_testes;

import javax.swing.*;
   import javax.swing.table.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.util.regex.*;

   public class FilterTable {


     public static void main(String args[]) {
       Runnable runner = new Runnable() {

         public void run() {
                                                                              
                                                                                //CRIAÇÃO DE TODA A INORMAÇÃO QUE SERÁ APRESENTADA NAS LINHAS DA TABELA
                                                                                Object rows[][] = {
                                                                                  {"AMZNnn", "Amazon", 41.28},
                                                                                  {"EBAY", "eBay", 41.57},
                                                                                  {"GOOG", "Google", 388.33},
                                                                                  {"MSFT", "Microsoft", 26.56},
                                                                                  {"NOK", "Nokia Corp", 17.13},
                                                                                  {"ORCL", "Oracle Corp.", 12.52},
                                                                                  {"SUNW", "Sun Microsystems", 3.86},
                                                                                  {"TWX",  "Time Warner", 17.66},
                                                                                  {"VOD",  "Vodafone Group", 26.02},
                                                                                  {"YHOO", "Yahoo!", 37.69}
                                                                                };


                                                                                //INUMERAÇÃO DO NOME DAS COLUNAS DA TABELA, IDENTIFICAM O CONTEUDO DE CADA LINHA
                                                                                Object columns[] = {"Sigra", "Nome", "Preco"};
                                                                                //INICIALIZAÇÃO DA ESTRUTURA TABELA
                                                                                TableModel model = new DefaultTableModel(rows, columns) {
            
            public Class getColumnClass(int column) {
               Class returnValue;
               if ((column >= 0) && (column < getColumnCount())) {
                 returnValue = getValueAt(0, column).getClass();
               } else {
                 returnValue = Object.class;
               }
               return returnValue;
             }
           };
                                                                                //CRIAÇÃO DA JANELA(FRAME) APRESENTADA AO UTILIZADOR QUE IRÁ CONTER TODAS AS LABELS NECESSÁRIAS
                                                                                JFrame frame = new JFrame("Ordenando JTable");
                                                                                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                                                
                                                                                //É CRIADA A TABELA                                                                          
                                                                                JTable table = new JTable(model);
                                                                                //CRIAÇÃO DO MODELO DE ORDENAÇÃP PARA A TABELA ANTERIORMENTE CRIADA COM BASE NO "SORTER" POSTERIORMENTE DEFINIDO
                                                                                final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
                                                                                //APLICAR O MODELO DE ORDENAÇÃO ANTERIORMENTE CRIADO Á TABELA CRIADA NO PASSO ANTERIOR
                                                                                table.setRowSorter(sorter);
                                                                                //FORMATAÇÕES RELATIVAS A SCROLL PARA A LISTA COM AS LINHAS DE INFORMAÇÃO
                                                                                JScrollPane pane = new JScrollPane(table);
                                                                                //ADICIONAR PANE AO CENTRO 
                                                                                frame.add(pane, BorderLayout.CENTER);
                                                                                //CRIAÇÃO DO PAINEL QUE VAI CONTER TODOS OS OBJECTOS VISIVEIS AO UTILIZADOR (A label, O BOTÃO e o textbox)
                                                                                JPanel panel = new JPanel(new BorderLayout());
                                                                                //CRIAÇÃO DO BOTÃO FILTRAR
                                                                                JLabel label = new JLabel("FiltraR");
                                                                                //ADICIONAR A LABEL (texto antes da caixa de texto) AO PAINEL
                                                                                panel.add(label, BorderLayout.WEST);
                                                                                //CRIAÇÃO DA TEXTFIELD ONDE SERÁ ESCRITO O VALOR A SER FILTRADO
                                                                                final JTextField filterText = new JTextField("SUUN");
                                                                                //ADICIONAR A TEXTFIELD AO PAINEL
                                                                                panel.add(filterText, BorderLayout.CENTER);
                                                                                //ADICIONAR  Á JANELA(FRAME) O PANEL QUE CONTEM O TEXTO(label) ANTES DA caixa de texto (TXTFIELD) ONDE SE ESCREVE O VALOR A SER FILTRADO
                                                                                frame.add(panel, BorderLayout.NORTH);

                                                                                //CRIAÇÃO DO BOTÃO
                                                                                JButton button = new JButton("Filtro");
                                                                                //ATRIBUIÇÃO DA TAREFA AO BOTÃO
                                                                                button.addActionListener(new ActionListener() {
                                                                                    //TAREFA EXECUTADA AO CLICAR NO BOTÃO
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                    //GUARDAR NUMA STRING O QUE VALOR ESCRITO NA textField 
                                                                                    String text = filterText.getText();
                                                                                    //verifica se o mesmo textfield se encontra vazio
                                                                                    if (text.length() == 0) {
                                                                                      //caso esteja vazio não aplica filtro nenhum, logo a lista não altera
                                                                                      sorter.setRowFilter(null);
                                                                                     } else {
                                                                                        //caso a textfield tenha algum parametro
                                                                                         try{
                                                                                             /*DEFINIÇÃO DE COMO VAI SER FEITA A FILTRAGEM, TRAVEZ DE REGEX, EM QUE A PROCURA PELO TERMO 
                                                                                             INSERIDO NA TEXTFIELD É FEITA EM TODAS AS COLUNAS DA TABELA (PODE-SE AFINAR A PROCURA PARA 
                                                                                             UMA COLUNA EXPECIFICA)*/
                                                                                            sorter.setRowFilter(RowFilter.regexFilter(text));
                                                                                         }catch(PatternSyntaxException pse) {
                                                                                            System.err.println("Erro");
                                                                                         }
                                                                                     }
                                                                                    }
                                                                                });
                                                                                
                                                                                //ADICIONAR O BOTÃO Á JANELA(frame) QUE É APRESENTADA AO UTILIZADOR                                                                      
                                                                                frame.add(button, BorderLayout.SOUTH);
                                                                                //DEFINIR O TAMANHO DA JANELA(frame) APRESENTADA AO UTILIZADOR
                                                                                frame.setSize(400, 350);
                                                                                //DEFINIR SE A JANELA É OU NÃO VISIVEL AO UTLIZADOR
                                                                                frame.setVisible(true);
                            }
        };


        EventQueue.invokeLater(runner);
      }
    }