
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab1/conf/routes
// @DATE:Tue Feb 27 10:09:33 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
