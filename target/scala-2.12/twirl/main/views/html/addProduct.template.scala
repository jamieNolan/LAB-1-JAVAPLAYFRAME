
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>

    """),_display_(/*7.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*7.140*/ {_display_(Seq[Any](format.raw/*7.142*/("""
        """),format.raw/*8.37*/("""
        """),_display_(/*9.10*/CSRF/*9.14*/.formField),format.raw/*9.24*/("""
    """),format.raw/*10.5*/("""<form action="/addProductSubmit" method="POST" enctype="multipart/form-data">
        """),_display_(/*11.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*11.85*/("""
        """),_display_(/*12.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*17.10*/("""
        """),_display_(/*18.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*18.99*/("""
        """),_display_(/*19.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*19.87*/("""
        """),_display_(/*20.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*20.87*/("""

        """),_display_(/*22.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.74*/("""

        """),format.raw/*24.9*/("""<!-- Image upload input -->
        <label>Image Upload</label>
        <input class = "btn-sm btn-default" type="file" name="upload">
        <br><br>

    


        <div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*34.23*/routes/*34.29*/.HomeController.index(0)),format.raw/*34.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*39.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 09:53:09 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/addProduct.scala.html
                  HASH: 6f478dd286a470b87b817dbf7b99202adb98e9d1
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1388->156|1531->290|1571->292|1607->329|1643->339|1655->343|1685->353|1717->358|1831->445|1927->520|1964->530|2221->766|2258->776|2368->865|2405->875|2503->952|2540->962|2638->1039|2676->1050|2761->1114|2798->1124|3122->1421|3137->1427|3182->1451|3331->1570
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|44->12|49->17|50->18|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|66->34|66->34|66->34|71->39
                  -- GENERATED --
              */
          