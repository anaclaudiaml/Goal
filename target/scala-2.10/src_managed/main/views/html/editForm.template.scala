
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Posicoes],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, posicoesForm: Form[Posicoes]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Editar Posição</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
        <fieldset>
        
            
            """),_display_(Seq[Any](/*16.14*/inputText(posicoesForm("name"),'_label -> "",'style -> "display: none"))),format.raw/*16.85*/("""
			"""),_display_(Seq[Any](/*17.5*/select(posicoesForm("jogador.id"),options(Jogador.options), '_label -> "Jogador", '_default -> "-- Escolher Jogador --", '_showConstraints -> false ))),format.raw/*17.154*/("""
			
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Salvar Posição" class="btn primary"> ou 
            <a href=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Application.list())),format.raw/*23.48*/("""" class="btn">Cancelar</a> 

		</div>
        
    """)))})),format.raw/*27.6*/("""
    
    """),_display_(Seq[Any](/*29.6*/form(routes.Application.delete(id), 'class -> "topRight")/*29.63*/ {_display_(Seq[Any](format.raw/*29.65*/("""
        <input type="submit" value="Excluir Jogador" class="btn danger">
    """)))})),format.raw/*31.6*/("""
    
""")))})),format.raw/*33.2*/("""
"""))}
    }
    
    def render(id:Long,posicoesForm:Form[Posicoes]): play.api.templates.HtmlFormat.Appendable = apply(id,posicoesForm)
    
    def f:((Long,Form[Posicoes]) => play.api.templates.HtmlFormat.Appendable) = (id,posicoesForm) => apply(id,posicoesForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 13 19:23:04 BRT 2014
                    SOURCE: C:/Users/Ana-PC/Documents/GitHub/Goal/app/views/editForm.scala.html
                    HASH: 4125db0d3ce996f504f8d0bc33a1f230b8b07c79
                    MATRIX: 790->1|932->62|964->86|1048->41|1076->60|1104->140|1142->144|1153->148|1191->150|1270->194|1314->229|1354->231|1454->295|1547->366|1587->371|1759->520|1962->687|1977->693|2018->712|2101->764|2147->775|2213->832|2253->834|2363->913|2401->920
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|44->16|44->16|45->17|45->17|51->23|51->23|51->23|55->27|57->29|57->29|57->29|59->31|61->33
                    -- GENERATED --
                */
            