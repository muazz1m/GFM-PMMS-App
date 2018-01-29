package com.kuhosu.mobilepreventativemaintenance.model;

import java.util.Date;

/**
 * Created by muazz1m on 26/01/18.
 */

public class SafetyRegulation {

    private String my_work_order_no;
    private String my_ty_th_id;
    private String my_ty_sequence_no;
    private int my_ty_indent;
    private String my_ty_safety_statements;

    private String my_ty_active_flag;
    private Date my_ty_active_date;
    private Date my_ty_deactive_date;
    private Date my_tY_date_created;

    public String getMy_work_order_no() {
        return my_work_order_no;
    }

    public void setMy_work_order_no(String my_work_order_no) {
        this.my_work_order_no = my_work_order_no;
    }

    public String getMy_ty_th_id() {
        return my_ty_th_id;
    }

    public void setMy_ty_th_id(String my_ty_th_id) {
        this.my_ty_th_id = my_ty_th_id;
    }

    public String getMy_ty_sequence_no() {
        return my_ty_sequence_no;
    }

    public void setMy_ty_sequence_no(String my_ty_sequence_no) {
        this.my_ty_sequence_no = my_ty_sequence_no;
    }

    public int getMy_ty_indent() {
        return my_ty_indent;
    }

    public void setMy_ty_indent(int my_ty_indent) {
        this.my_ty_indent = my_ty_indent;
    }

    public String getMy_ty_safety_statements() {
        return my_ty_safety_statements;
    }

    public void setMy_ty_safety_statements(String my_ty_safety_statements) {
        this.my_ty_safety_statements = my_ty_safety_statements;
    }

    public String getMy_ty_active_flag() {
        return my_ty_active_flag;
    }

    public void setMy_ty_active_flag(String my_ty_active_flag) {
        this.my_ty_active_flag = my_ty_active_flag;
    }

    public Date getMy_ty_active_date() {
        return my_ty_active_date;
    }

    public void setMy_ty_active_date(Date my_ty_active_date) {
        this.my_ty_active_date = my_ty_active_date;
    }

    public Date getMy_ty_deactive_date() {
        return my_ty_deactive_date;
    }

    public void setMy_ty_deactive_date(Date my_ty_deactive_date) {
        this.my_ty_deactive_date = my_ty_deactive_date;
    }

    public Date getMy_tY_date_created() {
        return my_tY_date_created;
    }

    public void setMy_tY_date_created(Date my_tY_date_created) {
        this.my_tY_date_created = my_tY_date_created;
    }
}
