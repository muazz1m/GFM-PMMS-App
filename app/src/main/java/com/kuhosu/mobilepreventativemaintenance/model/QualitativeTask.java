package com.kuhosu.mobilepreventativemaintenance.model;

import java.util.Date;

/**
 * Created by muazz1m on 26/01/18.
 */

public class QualitativeTask {

    private String ml_work_order;
    private String ml_tl_th_id;
    private String ml_tl_sequence_no;
    private int ml_tl_indent;

    private String ml_tl_qualitative_statements;
    private String ml_tl_statement_type;
    private String ml_tl_maintenance_frequency;
    private String ml_passfailna_flag;
    private String ml_remarks_action;

    private String ml_tl_active_flag;
    private Date ml_tl_active_date;
    private Date ml_tl_deactive_date;
    private Date ml_tl_date_created;

    public String getMl_work_order() {
        return ml_work_order;
    }

    public void setMl_work_order(String ml_work_order) {
        this.ml_work_order = ml_work_order;
    }

    public String getMl_tl_th_id() {
        return ml_tl_th_id;
    }

    public void setMl_tl_th_id(String ml_tl_th_id) {
        this.ml_tl_th_id = ml_tl_th_id;
    }

    public String getMl_tl_sequence_no() {
        return ml_tl_sequence_no;
    }

    public void setMl_tl_sequence_no(String ml_tl_sequence_no) {
        this.ml_tl_sequence_no = ml_tl_sequence_no;
    }

    public int getMl_tl_indent() {
        return ml_tl_indent;
    }

    public void setMl_tl_indent(int ml_tl_indent) {
        this.ml_tl_indent = ml_tl_indent;
    }

    public String getMl_tl_qualitative_statements() {
        return ml_tl_qualitative_statements;
    }

    public void setMl_tl_qualitative_statements(String ml_tl_qualitative_statements) {
        this.ml_tl_qualitative_statements = ml_tl_qualitative_statements;
    }

    public String getMl_tl_statement_tyoe() {
        return ml_tl_statement_type;
    }

    public void setMl_tl_statement_type(String ml_tl_statement_type) {
        this.ml_tl_statement_type = ml_tl_statement_type;
    }

    public String getMl_tl_maintenance_frequency() {
        return ml_tl_maintenance_frequency;
    }

    public void setMl_tl_maintenance_frequency(String ml_tl_maintenance_frequency) {
        this.ml_tl_maintenance_frequency = ml_tl_maintenance_frequency;
    }

    public String getMl_passfailna_flag() {
        return ml_passfailna_flag;
    }

    public void setMl_passfailna_flag(String ml_passfailna_flag) {
        this.ml_passfailna_flag = ml_passfailna_flag;
    }

    public String getMl_remarks_action() {
        return ml_remarks_action;
    }

    public void setMl_remarks_action(String ml_remarks_action) {
        this.ml_remarks_action = ml_remarks_action;
    }

    public String getMl_tl_active_flag() {
        return ml_tl_active_flag;
    }

    public void setMl_tl_active_flag(String ml_tl_active_flag) {
        this.ml_tl_active_flag = ml_tl_active_flag;
    }

    public Date getMl_tl_active_date() {
        return ml_tl_active_date;
    }

    public void setMl_tl_active_date(Date ml_tl_active_date) {
        this.ml_tl_active_date = ml_tl_active_date;
    }

    public Date getMl_tl_deactive_date() {
        return ml_tl_deactive_date;
    }

    public void setMl_tl_deactive_date(Date ml_tl_deactive_date) {
        this.ml_tl_deactive_date = ml_tl_deactive_date;
    }

    public Date getMl_tl_date_created() {
        return ml_tl_date_created;
    }

    public void setMl_tl_date_created(Date ml_tl_date_created) {
        this.ml_tl_date_created = ml_tl_date_created;
    }
}
