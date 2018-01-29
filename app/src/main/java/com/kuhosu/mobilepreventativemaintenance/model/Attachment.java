package com.kuhosu.mobilepreventativemaintenance.model;

import java.util.Date;

/**
 * Created by muazz1m on 26/01/18.
 */

public class Attachment {

    private String mm_work_order_no;
    private String mm_tm_th_id;
    private int mm_tm_sequence_no;
    private String mm_tm_header_statements;
    private String mm_tm_attatchment_statements;
    private String mm_tm_picture_flag;
    private String mm_tm_picture_link;

    private String mm_tm_active_flag;
    private Date mm_tm_active_date;
    private Date mm_tm_deactive_date;
    private Date mm_tm_date_created;

    public String getMm_work_order_no() {
        return mm_work_order_no;
    }

    public void setMm_work_order_no(String mm_work_order_no) {
        this.mm_work_order_no = mm_work_order_no;
    }

    public String getMm_tm_th_id() {
        return mm_tm_th_id;
    }

    public void setMm_tm_th_id(String mm_tm_th_id) {
        this.mm_tm_th_id = mm_tm_th_id;
    }

    public int getMm_tm_sequence_no() {
        return mm_tm_sequence_no;
    }

    public void setMm_tm_sequence_no(int mm_tm_sequence_no) {
        this.mm_tm_sequence_no = mm_tm_sequence_no;
    }

    public String getMm_tm_header_statements() {
        return mm_tm_header_statements;
    }

    public void setMm_tm_header_statements(String mm_tm_header_statements) {
        this.mm_tm_header_statements = mm_tm_header_statements;
    }

    public String getMm_tm_attatchment_statements() {
        return mm_tm_attatchment_statements;
    }

    public void setMm_tm_attatchment_statements(String mm_tm_attatchment_statements) {
        this.mm_tm_attatchment_statements = mm_tm_attatchment_statements;
    }

    public String getMm_tm_picture_flag() {
        return mm_tm_picture_flag;
    }

    public void setMm_tm_picture_flag(String mm_tm_picture_flag) {
        this.mm_tm_picture_flag = mm_tm_picture_flag;
    }

    public String getMm_tm_picture_link() {
        return mm_tm_picture_link;
    }

    public void setMm_tm_picture_link(String mm_tm_picture_link) {
        this.mm_tm_picture_link = mm_tm_picture_link;
    }

    public String getMm_tm_active_flag() {
        return mm_tm_active_flag;
    }

    public void setMm_tm_active_flag(String mm_tm_active_flag) {
        this.mm_tm_active_flag = mm_tm_active_flag;
    }

    public Date getMm_tm_active_date() {
        return mm_tm_active_date;
    }

    public void setMm_tm_active_date(Date mm_tm_active_date) {
        this.mm_tm_active_date = mm_tm_active_date;
    }

    public Date getMm_tm_deactive_date() {
        return mm_tm_deactive_date;
    }

    public void setMm_tm_deactive_date(Date mm_tm_deactive_date) {
        this.mm_tm_deactive_date = mm_tm_deactive_date;
    }

    public Date getMm_tm_date_created() {
        return mm_tm_date_created;
    }

    public void setMm_tm_date_created(Date mm_tm_date_created) {
        this.mm_tm_date_created = mm_tm_date_created;
    }
}
