package com.arief.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name="pageController",eager = true)
@RequestScoped
public class PageControllerJSF{


    public String hal1(){
        return "pages/Halaman1";
    }

    public String hal2(){
        return "pages/Halaman2";
    }


    @ManagedProperty(value = "#{param.hal}")
    private String hal;

    public String getHal() {
        return hal;
    }
    public void setHal(String hal) {
        this.hal = hal;
    }

    public String showPage(){
        if(hal.equals("3")){
            return "pages/Halaman3";
        }else if(hal.equals("1")){
            return hal1();
        }else if(hal.equals("2")){
            return hal2();
        }
        return null;
    }
}
