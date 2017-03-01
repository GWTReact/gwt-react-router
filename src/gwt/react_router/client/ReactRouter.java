package gwt.react_router.client;

import gwt.react.client.components.ComponentConstructorFn;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "ReactRouter")
public class ReactRouter {

    public static HistoryMechanism browserHistory;
    public static HistoryMechanism hashHistory;

    public static ComponentConstructorFn<RouterProps> Router;
    public static ComponentConstructorFn<RouteProps> Route;
    public static ComponentConstructorFn<RouteProps> IndexRoute;
    public static ComponentConstructorFn<RedirectProps> Redirect;
    public static ComponentConstructorFn<RedirectProps> IndexRedirect;
}
