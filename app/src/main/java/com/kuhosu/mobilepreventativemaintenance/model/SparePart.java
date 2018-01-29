package com.kuhosu.mobilepreventativemaintenance.model;

import java.util.Date;

/**
 * Created by muazz1m on 26/01/18.
 */

public class SparePart {

    private String ms_work_order_no;
    private String ms_th_id;
    private String ms_spare_part_no;
    private String ms_spare_part_qty;
    private Date ms_spare_part_issue_date;

    private String ms_active_flag;
    private Date ms_active_date;
    private Date ms_deactive_date;
    private Date ms_date_created;

    public String getMs_work_order_no() {
        return ms_work_order_no;
    }

    public void setMs_work_order_no(String ms_work_order_no) {
        this.ms_work_order_no = ms_work_order_no;
    }

    public String getMs_th_id() {
        return ms_th_id;
    }

    public void setMs_th_id(String ms_th_id) {
        this.ms_th_id = ms_th_id;
    }

    public String getMs_spare_part_no() {
        return ms_spare_part_no;
    }

    public void setMs_spare_part_no(String ms_spare_part_no) {
        this.ms_spare_part_no = ms_spare_part_no;
    }

    public String getMs_spare_part_qty() {
        return ms_spare_part_qty;
    }

    public void setMs_spare_part_qty(String ms_spare_part_qty) {
        this.ms_spare_part_qty = ms_spare_part_qty;
    }

    public Date getMs_spare_part_issue_date() {
        return ms_spare_part_issue_date;
    }

    public void setMs_spare_part_issue_date(Date ms_spare_part_issue_date) {
        this.ms_spare_part_issue_date = ms_spare_part_issue_date;
    }

    public String getMs_active_flag() {
        return ms_active_flag;
    }

    public void setMs_active_flag(String ms_active_flag) {
        this.ms_active_flag = ms_active_flag;
    }

    public Date getMs_active_date() {
        return ms_active_date;
    }

    public void setMs_active_date(Date ms_active_date) {
        this.ms_active_date = ms_active_date;
    }

    public Date getMs_deactive_date() {
        return ms_deactive_date;
    }

    public void setMs_deactive_date(Date ms_deactive_date) {
        this.ms_deactive_date = ms_deactive_date;
    }

    public Date getMs_date_created() {
        return ms_date_created;
    }

    public void setMs_date_created(Date ms_date_created) {
        this.ms_date_created = ms_date_created;
    }
}
