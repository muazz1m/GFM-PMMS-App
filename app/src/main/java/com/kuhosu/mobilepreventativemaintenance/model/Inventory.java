package com.kuhosu.mobilepreventativemaintenance.model;

import java.util.Date;

/**
 * Created by muazz1m on 26/01/18.
 */

public class Inventory {

    private String mi_item_number;
    private String mi_item_name;
    private String mi_item_category;

    private String mi_active_flag;
    private Date mi_active_date;
    private Date mi_deactive_date;
    private Date mi_date_created;

    public String getMi_item_number() {
        return mi_item_number;
    }

    public void setMi_item_number(String mi_item_number) {
        this.mi_item_number = mi_item_number;
    }

    public String getMi_item_name() {
        return mi_item_name;
    }

    public void setMi_item_name(String mi_item_name) {
        this.mi_item_name = mi_item_name;
    }

    public String getMi_item_category() {
        return mi_item_category;
    }

    public void setMi_item_category(String mi_item_category) {
        this.mi_item_category = mi_item_category;
    }

    public String getMi_active_flag() {
        return mi_active_flag;
    }

    public void setMi_active_flag(String mi_active_flag) {
        this.mi_active_flag = mi_active_flag;
    }

    public Date getMi_active_date() {
        return mi_active_date;
    }

    public void setMi_active_date(Date mi_active_date) {
        this.mi_active_date = mi_active_date;
    }

    public Date getMi_deactive_date() {
        return mi_deactive_date;
    }

    public void setMi_deactive_date(Date mi_deactive_date) {
        this.mi_deactive_date = mi_deactive_date;
    }

    public Date getMi_date_created() {
        return mi_date_created;
    }

    public void setMi_date_created(Date mi_date_created) {
        this.mi_date_created = mi_date_created;
    }
}
