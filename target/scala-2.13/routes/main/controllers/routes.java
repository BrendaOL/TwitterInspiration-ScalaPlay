// @GENERATOR:play-routes-compiler
// @SOURCE:D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/conf/routes
// @DATE:Sun Dec 19 00:43:14 CET 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthenticatedUserController AuthenticatedUserController = new controllers.ReverseAuthenticatedUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseShareThoughtController ShareThoughtController = new controllers.ReverseShareThoughtController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProfileController ProfileController = new controllers.ReverseProfileController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseConfigureController ConfigureController = new controllers.ReverseConfigureController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignUpController SignUpController = new controllers.ReverseSignUpController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthenticatedUserController AuthenticatedUserController = new controllers.javascript.ReverseAuthenticatedUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseShareThoughtController ShareThoughtController = new controllers.javascript.ReverseShareThoughtController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProfileController ProfileController = new controllers.javascript.ReverseProfileController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseConfigureController ConfigureController = new controllers.javascript.ReverseConfigureController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignUpController SignUpController = new controllers.javascript.ReverseSignUpController(RoutesPrefix.byNamePrefix());
  }

}
