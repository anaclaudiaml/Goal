
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Jogador],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(jogadorForm: Form[Jogador]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Adicionar Jogadores</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq[Any](format.raw/*11.39*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(jogadorForm("name"), '_label -> "Nome do Jogador"))),format.raw/*15.74*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(jogadorForm("caminho"), '_label -> "Caminho da imagem"))),format.raw/*16.79*/("""
            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Adicionar Jogador" class="btn primary"> ou 
            <a href=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Application.list())),format.raw/*23.48*/("""" class="btn">Cancelar</a> 
        </div>
        
    """)))})),format.raw/*26.6*/("""
    
""")))})))}
    }
    
    def render(jogadorForm:Form[Jogador]): play.api.templates.HtmlFormat.Appendable = apply(jogadorForm)
    
    def f:((Form[Jogador]) => play.api.templates.HtmlFormat.Appendable) = (jogadorForm) => apply(jogadorForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 13 19:23:03 BRT 2014
                    SOURCE: C:/Users/Ana-PC/Documents/GitHub/Goal/app/views/createForm.scala.html
                    HASH: 3460e33353c401c004529a8fb377dac95c410764
                    MATRIX: 786->1|916->50|948->74|1032->29|1060->48|1088->128|1126->132|1137->136|1175->138|1259->187|1299->218|1339->220|1426->271|1508->331|1558->345|1645->410|1861->590|1876->596|1917->615|2005->672
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|51->23|51->23|51->23|54->26
                    -- GENERATED --
                */
            