// @GENERATOR:play-routes-compiler
// @SOURCE:D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/conf/routes
// @DATE:Sun Dec 19 00:43:14 CET 2021


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
