<h1 align = "center"><strong>Java com Base de Dados</strong></h1>
<p align = "center"><img src="https://www.learn2free.com/wp-content/uploads/2016/04/Java-Database-Connectivity-Tutorial-in-Urdu.jpg" alt="" width="600" height="300" /></p>
<p align="center">&nbsp;</p>
<p align="center">&nbsp;</p>
<table style="width: 500px;" border="0" cellspacing="0.3" cellpadding="0">
<tbody>
<tr>
<td>
<h2><span style="font-size: 18px;"><strong>Sumário:</strong></span></h2>
</td>
<td>
<h2><span style="font-size: 10px;">- Estabelecer conex&atilde;o &aacute; base de dados</p></span></h2>
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<h2><span style="font-size: 10px;">- Cria&ccedil;&atilde;o da camada de persist&ecirc;ncia - PATTERN DAO</span></h2>
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<h2><span style="font-size: 10px;">- Recorrer &agrave; composi&ccedil;&atilde;o para relacionar objectos</span></h2>
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<h2><span style="font-size: 10px;">- Registo de FK's (chaves estrangeiras)</span></h2>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>

<p align = "center"><img style="display: block; margin-left: auto; margin-right: auto;" src="https://static.javatpoint.com/java/new/images/java-database-connectivity-steps.jpg" alt="" width="392" height="398" /></p>
<hr />
<h2>1&ordm; Etapa - Importar bibliotecas de liga&ccedil;&atilde;o &agrave; base de dados</h2>
<table style="width: 421px;" border="0" cellspacing="1" cellpadding="1">
<tbody>
<tr style="height: 46px;">
<td style="height: 46px; width: 334px;">
<h3 style="text-align: center;"><span style="font-size: 14px;"><strong>No IntelliJ</strong></span></h3>
</td>
<td style="height: 46px; width: 316px; text-align: center;">
<h3><strong>&nbsp;No NetBeans</strong></h3>
</td>
</tr>
<tr style="height: 59.8438px;">
<td style="height: 59.8438px; width: 334px;">
<p><span style="font-size: 12px;"><em><strong>File </strong>--&gt;<strong> Project Structure</strong> --&gt;<strong> '+'</strong> --&gt; <strong>From Maven </strong>=&gt; <strong>"mysql:mysql-connector-java:5.1.4.0"</strong> --&gt; <strong>OK</strong> --&gt; <strong>Applay</strong> --&gt; <strong>OK</strong></em></span></p>
<p>&nbsp;</p>
<p><span style="font-size: 12px;"><em><strong><img src="https://i.imgur.com/6koQEBG.png" alt="" width="361" height="242" /></strong></em></span></p>
<p><span style="font-size: 12px;"><em><strong><img src="https://i.imgur.com/RrcIszs.png" alt="" width="360" height="244" /></strong></em></span></p>
</td>
<td style="height: 100px; width: 316px;">
<p>Na estrutura de ficheiros do projecto, bot&atilde;o direito sobre <strong>"Bibliotecas" </strong>--&gt; <strong>"Driver JDBC do mySql" </strong>=&gt; <strong>"mysql-connector-java5.1.23-bin.jar"</strong> --&gt; <strong>Adicionar Biblioteca&nbsp;</strong></p>
<p>&nbsp;</p>
<p><img src="https://i.imgur.com/rnJ9p9W.png" alt="" width="364" height="320" /></p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<hr />
<h2>2&ordm; Etapa - Cria&ccedil;&atilde;o dos objectos "<em>Categoria</em>" e "<em>Produto</em>"&nbsp;</h2>
<p>&nbsp;</p>
<hr />
<h2>3&ordm; Etapa - Criar camada de persist&ecirc;ncia</h2>
<h3>&nbsp; &nbsp; &nbsp; DAO - Data Access Object</h3>
<h3>&nbsp; &nbsp; &nbsp; CRUD - Create | Read | Update | Delete</h3>
<table>
<tbody>
<tr>
<td>&nbsp; &nbsp;&nbsp;<strong>Ficheiros:</strong></td>
<td>categoriaDAO.java</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>produtoDAO.java</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<hr />
<h2>4&ordm; Etapa - JUnit - Testando a liga&ccedil;&atilde;o &aacute; base de dados</h2>
<h3>JUnit - Testes no Java</h3>
<table>
<tbody>
<tr>
<td><strong>Ficheiros:</strong></td>
<td>categoriaDAOTest.java**</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>produtoDAOTeste.java**</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<p><strong>Nota: </strong>No NetBeans para fazer testes a uma dada conex&atilde;o, tem 1&ordm; que selecionar o respetivo ficheiro de testes(**), <strong>bot&atilde;o direito</strong> --&gt;<strong> Ferramentas</strong> --&gt;<strong> Criar/Atualizar Testes</strong></p>
<p><strong><img src="https://i.imgur.com/G0BzblG.png" alt="" width="407" height="509" /></strong></p>
<p>... desta forma o NetBeans importa autom&aacute;ticamente as bibliotecas necess&aacute;rias do JUnit inclusive cria alguns metodos de teste.</p>
<p>&nbsp;</p>




