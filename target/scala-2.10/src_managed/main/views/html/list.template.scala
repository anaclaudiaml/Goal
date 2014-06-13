
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Posicoes.Page,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: Posicoes.Page, currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.98*/("""



"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
    <div style='position:relative; top:55px;'>
		<img src=""""),_display_(Seq[Any](/*7.14*/routes/*7.20*/.Assets.at("imagens/campo.jpg"))),format.raw/*7.51*/(""""" width=980px height=500px>
		
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*9.48*/routes/*9.54*/.Application.create())),format.raw/*9.75*/("""">Adicionar Jogador</a>
        
    </div>

    
    """),_display_(Seq[Any](/*14.6*/if(currentPage.getTotalRowCount == 0)/*14.43*/ {_display_(Seq[Any](format.raw/*14.45*/("""
        
        <div class="well">
            <em>Nada para mostrar</em>
        </div>
        
    """)))}/*20.7*/else/*20.12*/{_display_(Seq[Any](format.raw/*20.13*/("""
        
       
                """),_display_(Seq[Any](/*23.18*/for(posicoes <- currentPage.getList) yield /*23.54*/ {_display_(Seq[Any](format.raw/*23.56*/("""
                    <tr>
                    """),_display_(Seq[Any](/*25.22*/if(posicoes.id ==1)/*25.41*/ {_display_(Seq[Any](format.raw/*25.43*/("""
						<div style='position:absolute; top:345px; left:65px;'>							
						<a href=""""),_display_(Seq[Any](/*27.17*/routes/*27.23*/.Application.edit(posicoes.id))),format.raw/*27.53*/("""">
						"""),_display_(Seq[Any](/*28.8*/if(posicoes.jogador ==null)/*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""
							<img src=""""),_display_(Seq[Any](/*29.19*/routes/*29.25*/.Assets.at(posicoes.name))),format.raw/*29.50*/("""" width=50px><br>
							
						""")))}/*31.8*/else/*31.12*/{_display_(Seq[Any](format.raw/*31.13*/("""
							<img src=""""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*32.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*34.9*/posicoes/*34.17*/.jogador.name)),format.raw/*34.30*/("""
						""")))})),format.raw/*35.8*/("""
							</div>
					""")))})),format.raw/*37.7*/("""
					"""),_display_(Seq[Any](/*38.7*/if(posicoes.id ==2)/*38.26*/ {_display_(Seq[Any](format.raw/*38.28*/("""
						<div style='position:absolute; top:150px; left:250px;'>
						<a href=""""),_display_(Seq[Any](/*40.17*/routes/*40.23*/.Application.edit(posicoes.id))),format.raw/*40.53*/("""">
						"""),_display_(Seq[Any](/*41.8*/if(posicoes.jogador ==null)/*41.35*/{_display_(Seq[Any](format.raw/*41.36*/("""
							<img src=""""),_display_(Seq[Any](/*42.19*/routes/*42.25*/.Assets.at(posicoes.name))),format.raw/*42.50*/("""" width=50px><br>
							
						""")))}/*44.8*/else/*44.12*/{_display_(Seq[Any](format.raw/*44.13*/("""
							<img src=""""),_display_(Seq[Any](/*45.19*/routes/*45.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*45.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*47.9*/posicoes/*47.17*/.jogador.name)),format.raw/*47.30*/("""
						""")))})),format.raw/*48.8*/("""
							</div>
					""")))})),format.raw/*50.7*/("""
					"""),_display_(Seq[Any](/*51.7*/if(posicoes.id ==3)/*51.26*/ {_display_(Seq[Any](format.raw/*51.28*/("""
						<div style='position:absolute; top:280px; left:210px;'>
						<a href=""""),_display_(Seq[Any](/*53.17*/routes/*53.23*/.Application.edit(posicoes.id))),format.raw/*53.53*/("""">
						"""),_display_(Seq[Any](/*54.8*/if(posicoes.jogador ==null)/*54.35*/{_display_(Seq[Any](format.raw/*54.36*/("""
							<img src=""""),_display_(Seq[Any](/*55.19*/routes/*55.25*/.Assets.at(posicoes.name))),format.raw/*55.50*/("""" width=50px><br>
							
						""")))}/*57.8*/else/*57.12*/{_display_(Seq[Any](format.raw/*57.13*/("""
							<img src=""""),_display_(Seq[Any](/*58.19*/routes/*58.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*58.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*60.9*/posicoes/*60.17*/.jogador.name)),format.raw/*60.30*/("""
						""")))})),format.raw/*61.8*/("""
							</div>
					""")))})),format.raw/*63.7*/("""
					"""),_display_(Seq[Any](/*64.7*/if(posicoes.id ==4)/*64.26*/ {_display_(Seq[Any](format.raw/*64.28*/("""
						<div style='position:absolute; top:380px; left:210px;'>
						<a href=""""),_display_(Seq[Any](/*66.17*/routes/*66.23*/.Application.edit(posicoes.id))),format.raw/*66.53*/("""">
						"""),_display_(Seq[Any](/*67.8*/if(posicoes.jogador ==null)/*67.35*/{_display_(Seq[Any](format.raw/*67.36*/("""
							<img src=""""),_display_(Seq[Any](/*68.19*/routes/*68.25*/.Assets.at(posicoes.name))),format.raw/*68.50*/("""" width=50px><br>
							
						""")))}/*70.8*/else/*70.12*/{_display_(Seq[Any](format.raw/*70.13*/("""
							<img src=""""),_display_(Seq[Any](/*71.19*/routes/*71.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*71.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*73.9*/posicoes/*73.17*/.jogador.name)),format.raw/*73.30*/("""
						""")))})),format.raw/*74.8*/("""
							</div>
					""")))})),format.raw/*76.7*/("""
					"""),_display_(Seq[Any](/*77.7*/if(posicoes.id == 5)/*77.27*/ {_display_(Seq[Any](format.raw/*77.29*/("""
						<div style='position:absolute; top:520px; left:250px;'>
						<a href=""""),_display_(Seq[Any](/*79.17*/routes/*79.23*/.Application.edit(posicoes.id))),format.raw/*79.53*/("""">
						"""),_display_(Seq[Any](/*80.8*/if(posicoes.jogador ==null)/*80.35*/{_display_(Seq[Any](format.raw/*80.36*/("""
							<img src=""""),_display_(Seq[Any](/*81.19*/routes/*81.25*/.Assets.at(posicoes.name))),format.raw/*81.50*/("""" width=50px><br>
							
						""")))}/*83.8*/else/*83.12*/{_display_(Seq[Any](format.raw/*83.13*/("""
							<img src=""""),_display_(Seq[Any](/*84.19*/routes/*84.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*84.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*86.9*/posicoes/*86.17*/.jogador.name)),format.raw/*86.30*/("""
						""")))})),format.raw/*87.8*/("""
							</div>
					""")))})),format.raw/*89.7*/("""
					"""),_display_(Seq[Any](/*90.7*/if(posicoes.id == 6)/*90.27*/ {_display_(Seq[Any](format.raw/*90.29*/("""
						<div style='position:absolute; top:400px; left:360px;'>
						<a href=""""),_display_(Seq[Any](/*92.17*/routes/*92.23*/.Application.edit(posicoes.id))),format.raw/*92.53*/("""">
						"""),_display_(Seq[Any](/*93.8*/if(posicoes.jogador ==null)/*93.35*/{_display_(Seq[Any](format.raw/*93.36*/("""
							<img src=""""),_display_(Seq[Any](/*94.19*/routes/*94.25*/.Assets.at(posicoes.name))),format.raw/*94.50*/("""" width=50px><br>
							
						""")))}/*96.8*/else/*96.12*/{_display_(Seq[Any](format.raw/*96.13*/("""
							<img src=""""),_display_(Seq[Any](/*97.19*/routes/*97.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*97.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*99.9*/posicoes/*99.17*/.jogador.name)),format.raw/*99.30*/("""
						""")))})),format.raw/*100.8*/("""
							</div>
					""")))})),format.raw/*102.7*/("""
					"""),_display_(Seq[Any](/*103.7*/if(posicoes.id == 7)/*103.27*/ {_display_(Seq[Any](format.raw/*103.29*/("""
						<div style='position:absolute; top:260px; left:440px;'>
						<a href=""""),_display_(Seq[Any](/*105.17*/routes/*105.23*/.Application.edit(posicoes.id))),format.raw/*105.53*/("""">
						"""),_display_(Seq[Any](/*106.8*/if(posicoes.jogador ==null)/*106.35*/{_display_(Seq[Any](format.raw/*106.36*/("""
							<img src=""""),_display_(Seq[Any](/*107.19*/routes/*107.25*/.Assets.at(posicoes.name))),format.raw/*107.50*/("""" width=50px><br>
							
						""")))}/*109.8*/else/*109.12*/{_display_(Seq[Any](format.raw/*109.13*/("""
							<img src=""""),_display_(Seq[Any](/*110.19*/routes/*110.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*110.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*112.9*/posicoes/*112.17*/.jogador.name)),format.raw/*112.30*/("""
						""")))})),format.raw/*113.8*/("""
							</div>
					""")))})),format.raw/*115.7*/("""			
					"""),_display_(Seq[Any](/*116.7*/if(posicoes.id == 8)/*116.27*/ {_display_(Seq[Any](format.raw/*116.29*/("""
						<div style='position:absolute; top:520px; left:560px;'>
						<a href=""""),_display_(Seq[Any](/*118.17*/routes/*118.23*/.Application.edit(posicoes.id))),format.raw/*118.53*/("""">
						"""),_display_(Seq[Any](/*119.8*/if(posicoes.jogador ==null)/*119.35*/{_display_(Seq[Any](format.raw/*119.36*/("""
							<img src=""""),_display_(Seq[Any](/*120.19*/routes/*120.25*/.Assets.at(posicoes.name))),format.raw/*120.50*/("""" width=50px><br>
							
						""")))}/*122.8*/else/*122.12*/{_display_(Seq[Any](format.raw/*122.13*/("""
							<img src=""""),_display_(Seq[Any](/*123.19*/routes/*123.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*123.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*125.9*/posicoes/*125.17*/.jogador.name)),format.raw/*125.30*/("""
						""")))})),format.raw/*126.8*/("""
							</div>
					""")))})),format.raw/*128.7*/("""				
					"""),_display_(Seq[Any](/*129.7*/if(posicoes.id == 9)/*129.27*/ {_display_(Seq[Any](format.raw/*129.29*/("""
						<div style='position:absolute; top:360px; left:640px;'>
						<a href=""""),_display_(Seq[Any](/*131.17*/routes/*131.23*/.Application.edit(posicoes.id))),format.raw/*131.53*/("""">
						"""),_display_(Seq[Any](/*132.8*/if(posicoes.jogador ==null)/*132.35*/{_display_(Seq[Any](format.raw/*132.36*/("""
							<img src=""""),_display_(Seq[Any](/*133.19*/routes/*133.25*/.Assets.at(posicoes.name))),format.raw/*133.50*/("""" width=50px><br>
							
						""")))}/*135.8*/else/*135.12*/{_display_(Seq[Any](format.raw/*135.13*/("""
							<img src=""""),_display_(Seq[Any](/*136.19*/routes/*136.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*136.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*138.9*/posicoes/*138.17*/.jogador.name)),format.raw/*138.30*/("""
						""")))})),format.raw/*139.8*/("""
							</div>
					""")))})),format.raw/*141.7*/("""
					"""),_display_(Seq[Any](/*142.7*/if(posicoes.id == 10)/*142.28*/ {_display_(Seq[Any](format.raw/*142.30*/("""
						<div style='position:absolute; top:200px; left:610px;'>
						<a href=""""),_display_(Seq[Any](/*144.17*/routes/*144.23*/.Application.edit(posicoes.id))),format.raw/*144.53*/("""">
						"""),_display_(Seq[Any](/*145.8*/if(posicoes.jogador ==null)/*145.35*/{_display_(Seq[Any](format.raw/*145.36*/("""
							<img src=""""),_display_(Seq[Any](/*146.19*/routes/*146.25*/.Assets.at(posicoes.name))),format.raw/*146.50*/("""" width=50px><br>
							
						""")))}/*148.8*/else/*148.12*/{_display_(Seq[Any](format.raw/*148.13*/("""
							<img src=""""),_display_(Seq[Any](/*149.19*/routes/*149.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*149.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*151.9*/posicoes/*151.17*/.jogador.name)),format.raw/*151.30*/("""
						""")))})),format.raw/*152.8*/("""
							</div>
					""")))})),format.raw/*154.7*/("""
					"""),_display_(Seq[Any](/*155.7*/if(posicoes.id == 11)/*155.28*/ {_display_(Seq[Any](format.raw/*155.30*/("""
						<div style='position:absolute; top:360px; left:800px;'>
						<a href=""""),_display_(Seq[Any](/*157.17*/routes/*157.23*/.Application.edit(posicoes.id))),format.raw/*157.53*/("""">
						"""),_display_(Seq[Any](/*158.8*/if(posicoes.jogador ==null)/*158.35*/{_display_(Seq[Any](format.raw/*158.36*/("""
							<img src=""""),_display_(Seq[Any](/*159.19*/routes/*159.25*/.Assets.at(posicoes.name))),format.raw/*159.50*/("""" width=50px><br>
							
						""")))}/*161.8*/else/*161.12*/{_display_(Seq[Any](format.raw/*161.13*/("""
							<img src=""""),_display_(Seq[Any](/*162.19*/routes/*162.25*/.Assets.at(posicoes.jogador.caminho))),format.raw/*162.61*/("""" width=50px><br>
							</a>
							"""),_display_(Seq[Any](/*164.9*/posicoes/*164.17*/.jogador.name)),format.raw/*164.30*/("""
						""")))})),format.raw/*165.8*/("""
							</div>
					""")))})),format.raw/*167.7*/("""
					
                """)))})),format.raw/*169.18*/("""

            

        
        
    """)))})),format.raw/*175.6*/("""
        
""")))})),format.raw/*177.2*/("""

            """))}
    }
    
    def render(currentPage:Posicoes.Page,currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Posicoes.Page,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 13 19:23:05 BRT 2014
                    SOURCE: C:/Users/Ana-PC/Documents/GitHub/Goal/app/views/list.scala.html
                    HASH: 4999dcde9f1d77ab818d9634dcc72be4ecc0391c
                    MATRIX: 801->1|991->97|1030->102|1041->106|1079->108|1175->169|1189->175|1241->206|1355->285|1369->291|1411->312|1501->367|1547->404|1587->406|1710->512|1723->517|1762->518|1833->553|1885->589|1925->591|2008->638|2036->657|2076->659|2197->744|2212->750|2264->780|2309->790|2345->817|2384->818|2439->837|2454->843|2501->868|2552->901|2565->905|2604->906|2659->925|2674->931|2732->967|2805->1005|2822->1013|2857->1026|2896->1034|2948->1055|2990->1062|3018->1081|3058->1083|3173->1162|3188->1168|3240->1198|3285->1208|3321->1235|3360->1236|3415->1255|3430->1261|3477->1286|3528->1319|3541->1323|3580->1324|3635->1343|3650->1349|3708->1385|3781->1423|3798->1431|3833->1444|3872->1452|3924->1473|3966->1480|3994->1499|4034->1501|4149->1580|4164->1586|4216->1616|4261->1626|4297->1653|4336->1654|4391->1673|4406->1679|4453->1704|4504->1737|4517->1741|4556->1742|4611->1761|4626->1767|4684->1803|4757->1841|4774->1849|4809->1862|4848->1870|4900->1891|4942->1898|4970->1917|5010->1919|5125->1998|5140->2004|5192->2034|5237->2044|5273->2071|5312->2072|5367->2091|5382->2097|5429->2122|5480->2155|5493->2159|5532->2160|5587->2179|5602->2185|5660->2221|5733->2259|5750->2267|5785->2280|5824->2288|5876->2309|5918->2316|5947->2336|5987->2338|6102->2417|6117->2423|6169->2453|6214->2463|6250->2490|6289->2491|6344->2510|6359->2516|6406->2541|6457->2574|6470->2578|6509->2579|6564->2598|6579->2604|6637->2640|6710->2678|6727->2686|6762->2699|6801->2707|6853->2728|6895->2735|6924->2755|6964->2757|7079->2836|7094->2842|7146->2872|7191->2882|7227->2909|7266->2910|7321->2929|7336->2935|7383->2960|7434->2993|7447->2997|7486->2998|7541->3017|7556->3023|7614->3059|7687->3097|7704->3105|7739->3118|7779->3126|7832->3147|7875->3154|7905->3174|7946->3176|8062->3255|8078->3261|8131->3291|8177->3301|8214->3328|8254->3329|8310->3348|8326->3354|8374->3379|8426->3412|8440->3416|8480->3417|8536->3436|8552->3442|8611->3478|8685->3516|8703->3524|8739->3537|8779->3545|8832->3566|8878->3576|8908->3596|8949->3598|9065->3677|9081->3683|9134->3713|9180->3723|9217->3750|9257->3751|9313->3770|9329->3776|9377->3801|9429->3834|9443->3838|9483->3839|9539->3858|9555->3864|9614->3900|9688->3938|9706->3946|9742->3959|9782->3967|9835->3988|9882->3999|9912->4019|9953->4021|10069->4100|10085->4106|10138->4136|10184->4146|10221->4173|10261->4174|10317->4193|10333->4199|10381->4224|10433->4257|10447->4261|10487->4262|10543->4281|10559->4287|10618->4323|10692->4361|10710->4369|10746->4382|10786->4390|10839->4411|10882->4418|10913->4439|10954->4441|11070->4520|11086->4526|11139->4556|11185->4566|11222->4593|11262->4594|11318->4613|11334->4619|11382->4644|11434->4677|11448->4681|11488->4682|11544->4701|11560->4707|11619->4743|11693->4781|11711->4789|11747->4802|11787->4810|11840->4831|11883->4838|11914->4859|11955->4861|12071->4940|12087->4946|12140->4976|12186->4986|12223->5013|12263->5014|12319->5033|12335->5039|12383->5064|12435->5097|12449->5101|12489->5102|12545->5121|12561->5127|12620->5163|12694->5201|12712->5209|12748->5222|12788->5230|12841->5251|12898->5275|12969->5314|13012->5325
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|37->9|42->14|42->14|42->14|48->20|48->20|48->20|51->23|51->23|51->23|53->25|53->25|53->25|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|63->35|65->37|66->38|66->38|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|72->44|72->44|72->44|73->45|73->45|73->45|75->47|75->47|75->47|76->48|78->50|79->51|79->51|79->51|81->53|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|85->57|85->57|85->57|86->58|86->58|86->58|88->60|88->60|88->60|89->61|91->63|92->64|92->64|92->64|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|98->70|98->70|98->70|99->71|99->71|99->71|101->73|101->73|101->73|102->74|104->76|105->77|105->77|105->77|107->79|107->79|107->79|108->80|108->80|108->80|109->81|109->81|109->81|111->83|111->83|111->83|112->84|112->84|112->84|114->86|114->86|114->86|115->87|117->89|118->90|118->90|118->90|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|124->96|124->96|124->96|125->97|125->97|125->97|127->99|127->99|127->99|128->100|130->102|131->103|131->103|131->103|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|137->109|137->109|137->109|138->110|138->110|138->110|140->112|140->112|140->112|141->113|143->115|144->116|144->116|144->116|146->118|146->118|146->118|147->119|147->119|147->119|148->120|148->120|148->120|150->122|150->122|150->122|151->123|151->123|151->123|153->125|153->125|153->125|154->126|156->128|157->129|157->129|157->129|159->131|159->131|159->131|160->132|160->132|160->132|161->133|161->133|161->133|163->135|163->135|163->135|164->136|164->136|164->136|166->138|166->138|166->138|167->139|169->141|170->142|170->142|170->142|172->144|172->144|172->144|173->145|173->145|173->145|174->146|174->146|174->146|176->148|176->148|176->148|177->149|177->149|177->149|179->151|179->151|179->151|180->152|182->154|183->155|183->155|183->155|185->157|185->157|185->157|186->158|186->158|186->158|187->159|187->159|187->159|189->161|189->161|189->161|190->162|190->162|190->162|192->164|192->164|192->164|193->165|195->167|197->169|203->175|205->177
                    -- GENERATED --
                */
            