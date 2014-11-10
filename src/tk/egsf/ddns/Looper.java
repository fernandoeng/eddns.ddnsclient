/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.egsf.ddns;

import org.json.JSONObject;

/**
 *
 * @author fosa
 */
public class Looper implements Runnable {

    private long notifyWaitTime = 20000;

    janela j;

    public Looper(janela jl) {
        this.j = jl;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String getipjson = JSON_helper.getJsonUrl("https://ddns.egsf.tk/webservice/getip");

                JSONObject js = new JSONObject(getipjson);

                String ip = js.getString("ip");

                this.j.setip(ip);
//                this.j.atualizarHosts();

            } catch (Exception e) {
            }

            try {
                Thread.sleep(notifyWaitTime);
            } catch (InterruptedException e) {
            }
        }
    }

}
