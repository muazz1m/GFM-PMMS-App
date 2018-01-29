package com.kuhosu.mobilepreventativemaintenance.model;

import java.util.Date;

/**
 * Created by muazz1m on 26/01/18.
 */

public class Employee {

    private String me_employee_id;
    private String me_employee_dp_id;

    private String me_dp_name;
    private String me_employee_first_name;
    private String me_employee_last_name;
    private String me_employee_email_address;
    private String me_employee_position;
    private String me_employee_team;
    private String me_employee_photo;

    private String me_active_flag;
    private Date me_active_date;
    private Date me_deactive_date;
    private Date me_created_date;

    public String getMe_employee_id() {
        return me_employee_id;
    }

    public void setMe_employee_id(String me_employee_id) {
        this.me_employee_id = me_employee_id;
    }

    public String getMe_employee_dp_id() {
        return me_employee_dp_id;
    }

    public void setMe_employee_dp_id(String me_employee_dp_id) {
        this.me_employee_dp_id = me_employee_dp_id;
    }

    public String getMe_dp_name() {
        return me_dp_name;
    }

    public void setMe_dp_name(String me_dp_name) {
        this.me_dp_name = me_dp_name;
    }

    public String getMe_employee_first_name() {
        return me_employee_first_name;
    }

    public void setMe_employee_first_name(String me_employee_first_name) {
        this.me_employee_first_name = me_employee_first_name;
    }

    public String getMe_employee_last_name() {
        return me_employee_last_name;
    }

    public void setMe_employee_last_name(String me_employee_last_name) {
        this.me_employee_last_name = me_employee_last_name;
    }

    public String getMe_employee_email_address() {
        return me_employee_email_address;
    }

    public void setMe_employee_email_address(String me_employee_email_address) {
        this.me_employee_email_address = me_employee_email_address;
    }

    public String getMe_employee_position() {
        return me_employee_position;
    }

    public void setMe_employee_position(String me_employee_position) {
        this.me_employee_position = me_employee_position;
    }

    public String getMe_employee_team() {
        return me_employee_team;
    }

    public void setMe_employee_team(String me_employee_team) {
        this.me_employee_team = me_employee_team;
    }

    public String getMe_employee_photo() {
        return me_employee_photo;
    }

    public void setMe_employee_photo(String me_employee_photo) {
        this.me_employee_photo = me_employee_photo;
    }

    public String getMe_active_flag() {
        return me_active_flag;
    }

    public void setMe_active_flag(String me_active_flag) {
        this.me_active_flag = me_active_flag;
    }

    public Date getMe_active_date() {
        return me_active_date;
    }

    public void setMe_active_date(Date me_active_date) {
        this.me_active_date = me_active_date;
    }

    public Date getMe_deactive_date() {
        return me_deactive_date;
    }

    public void setMe_deactive_date(Date me_deactive_date) {
        this.me_deactive_date = me_deactive_date;
    }

    public Date getMe_created_date() {
        return me_created_date;
    }

    public void setMe_created_date(Date me_created_date) {
        this.me_created_date = me_created_date;
    }
}
