package Java.proxy_pattern.Internet;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {
    private static final Set<String> bannedSites;
    private Internet realInternet;

    static {
        bannedSites = new HashSet<>();
        bannedSites.add("banned.com");
    }

    @Override
    public void connectTo(String host) {

        if (bannedSites.contains(host)) {
            System.out.println("Access to this site is banned!");
            return;
        }

        if (realInternet == null) {
            realInternet = new RealInternet();
        }

        realInternet.connectTo(host);
    }
}
