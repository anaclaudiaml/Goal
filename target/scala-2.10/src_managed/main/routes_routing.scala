// @SOURCE:C:/Users/Ana-PC/Documents/GitHub/Goal/conf/routes
// @HASH:d99b893df48ab2716437c8aedba5f01337bb6f75
// @DATE:Fri Jun 13 19:23:01 BRT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_list1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posicoes"))))
        

// @LINE:11
private[this] lazy val controllers_Application_create2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posicoes/new"))))
        

// @LINE:12
private[this] lazy val controllers_Application_save3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posicoes"))))
        

// @LINE:15
private[this] lazy val controllers_Application_edit4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posicoes/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_Application_update5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posicoes/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Application_delete6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("posicoes/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:22
private[this] lazy val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posicoes""","""controllers.Application.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posicoes/new""","""controllers.Application.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posicoes""","""controllers.Application.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posicoes/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posicoes/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """posicoes/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Default path will just redirect to the posicoes list""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_list1(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """posicoes"""))
   }
}
        

// @LINE:11
case controllers_Application_create2(params) => {
   call { 
        invokeHandler(controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil,"GET", """ Add jogagor""", Routes.prefix + """posicoes/new"""))
   }
}
        

// @LINE:12
case controllers_Application_save3(params) => {
   call { 
        invokeHandler(controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil,"POST", """""", Routes.prefix + """posicoes"""))
   }
}
        

// @LINE:15
case controllers_Application_edit4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]),"GET", """ Edit position""", Routes.prefix + """posicoes/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_Application_update5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """posicoes/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Application_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]),"POST", """ Delete a position""", Routes.prefix + """posicoes/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:22
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     