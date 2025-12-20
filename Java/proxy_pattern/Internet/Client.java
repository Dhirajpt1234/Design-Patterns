package Java.proxy_pattern.Internet;

public class Client {

    public static void main(String args[]) {
        Internet proxyInternet = new ProxyInternet();

        proxyInternet.connectTo("Google.com");
        proxyInternet.connectTo("banned.com");
        proxyInternet.connectTo("Dhiraj.com");
    }

}
