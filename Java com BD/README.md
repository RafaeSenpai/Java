<h1><strong>Java com Base de Dados</strong></h1>

<p>&nbsp;</p>

<table border="0" cellpadding="0" cellspacing="0.3" style="width:500px">
	<tbody>
		<tr>
			<td>
			<h2><span style="font-size:18px"><strong>Abordagem:</strong></span></h2>
			</td>
			<td>
			<h2><span style="font-size:10px">- Criar liga&ccedil;&atilde;o &aacute; base de dados</span></h2>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>
			<h2><span style="font-size:10px">- Cria&ccedil;&atilde;o da camada de persist&ecirc;ncia - PATTERN DAO</span></h2>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>
			<h2><span style="font-size:10px">- Recorrer a composi&ccedil;&atilde;o para relacionar objectos</span></h2>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>
			<h2><span style="font-size:10px">- Registo de FK&#39;s (chaves estrangeiras)</span></h2>
			</td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p>
<hr />
<p>&nbsp;</p>

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
<p>Na arvore da estrutura de ficheiros do projecto, bot&atilde;o direito sobre <strong>"Bibliotecas" </strong>--&gt; <strong>"Driver JDBC do mySql" </strong>=&gt; <strong>"mysql-connector-java5.1.23-bin.jar"</strong> --&gt; <strong>Adicionar Biblioteca&nbsp;</strong></p>
<p>&nbsp;</p>
<p><img src="https://i.imgur.com/rnJ9p9W.png" alt="" width="364" height="320" /></p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<hr />
<p>&nbsp;</p>
