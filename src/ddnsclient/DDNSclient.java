/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddnsclient;

import tk.egsf.ddns.janela;
import tk.egsf.ddns.login;

/**
 *
 * @author fosa
 */
public class DDNSclient {

    /**
     * @param args the command line arguments
     */
    private login lg;
    private janela j;
    private String basicAuth;

    public static void main(String[] args) {
        // TODO code application logic here

        ddnsclient.DDNSclient ddns = new DDNSclient();
        ddns.setJ(new janela(ddns));
        ddns.setLg(new login(ddns));

        ddns.getLg().setVisible(true);

    }

    /**
     * @return the lg
     */
    public login getLg() {
        return lg;
    }

    /**
     * @param aLg the lg to set
     */
    public void setLg(login aLg) {
        lg = aLg;
    }

    /**
     * @return the j
     */
    public janela getJ() {
        return j;
    }

    /**
     * @param aJ the j to set
     */
    public void setJ(janela aJ) {
        j = aJ;
    }

    /**
     * @return the basicAuth
     */
    public String getBasicAuth() {
        return basicAuth;
    }

    /**
     * @param basicAuth the basicAuth to set
     */
    public void setBasicAuth(String basicAuth) {
        this.basicAuth = basicAuth;
    }

}
