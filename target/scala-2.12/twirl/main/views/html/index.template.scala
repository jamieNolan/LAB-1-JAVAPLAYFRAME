
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-products) yield /*39.26*/ {_display_(Seq[Any](format.raw/*39.28*/("""
          """),format.raw/*40.11*/("""<tr>
                  """),_display_(/*41.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*41.108*/ {_display_(Seq[Any](format.raw/*41.110*/("""
                    """),format.raw/*42.21*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*42.76*/(p.getId + ".jpg")),format.raw/*42.94*/(""""/></td>             
                      """)))}/*43.25*/else/*43.30*/{_display_(Seq[Any](format.raw/*43.31*/("""
                    """),format.raw/*44.21*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
                """)))}),format.raw/*45.18*/("""
            """),format.raw/*46.13*/("""<td class="numeric">"""),_display_(/*46.34*/p/*46.35*/.getId),format.raw/*46.41*/("""</td>
            <td><a href=""""),_display_(/*47.27*/routes/*47.33*/.HomeController.productDetails(p.getId)),format.raw/*47.72*/("""">
              
            """),_display_(/*49.14*/p/*49.15*/.getName),format.raw/*49.23*/("""</td>
            </a>
            <td>"""),_display_(/*51.18*/p/*51.19*/.getCategory.getName),format.raw/*51.39*/("""</td>        
            <td>"""),_display_(/*52.18*/p/*52.19*/.getDescription),format.raw/*52.34*/("""</td>
            <td  class="numeric">"""),_display_(/*53.35*/p/*53.36*/.getStock),format.raw/*53.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*54.37*/("%.2f".format(p.getPrice))),format.raw/*54.64*/("""</td>
            <td>
              <a href=""""),_display_(/*56.25*/routes/*56.31*/.HomeController.updateProduct(p.getId)),format.raw/*56.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*60.25*/routes/*60.31*/.HomeController.deleteProduct(p.getId)),format.raw/*60.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*65.10*/("""
      """),format.raw/*66.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*71.17*/routes/*71.23*/.HomeController.addProduct()),format.raw/*71.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 10:07:20 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/index.scala.html
                  HASH: 52be22856a27b265eb2b8ea76378d0982cfc03fd
                  MATRIX: 1023->1|1238->120|1266->123|1295->144|1334->146|1362->148|1544->303|1559->309|1604->333|1682->385|1718->405|1758->407|1794->416|1831->426|1846->432|1897->462|1951->489|1961->490|1990->498|2029->509|2077->530|2087->531|2127->550|2185->578|2217->583|2361->701|2402->733|2442->735|2478->744|2550->789|2564->794|2600->809|2636->818|2680->832|2714->839|3008->1106|3040->1122|3080->1124|3119->1135|3170->1159|3268->1247|3309->1249|3358->1270|3440->1325|3479->1343|3543->1389|3556->1394|3595->1395|3644->1416|3766->1507|3807->1520|3855->1541|3865->1542|3892->1548|3951->1580|3966->1586|4026->1625|4084->1656|4094->1657|4123->1665|4190->1705|4200->1706|4241->1726|4299->1757|4309->1758|4345->1773|4412->1813|4422->1814|4452->1823|4521->1865|4569->1892|4643->1939|4658->1945|4717->1983|4914->2153|4929->2159|4988->2197|5208->2386|5242->2393|5317->2441|5332->2447|5381->2475|5514->2578
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|78->46|78->46|78->46|78->46|79->47|79->47|79->47|81->49|81->49|81->49|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|88->56|88->56|88->56|92->60|92->60|92->60|97->65|98->66|103->71|103->71|103->71|109->77
                  -- GENERATED --
              */
          