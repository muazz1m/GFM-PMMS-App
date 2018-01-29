package com.kuhosu.mobilepreventativemaintenance.model;

import java.util.Date;

/**
 * Created by muazz1m on 26/01/18.
 */

public class WorkOrder {

    private String mo_work_order_no;
    private String mo_task_no;
    private Date mo_date_task_schedule;
    private Date mo_date_task_to_be_completed;
    private String mo_standard_duration;
    private String mo_technician_id;
    private String mo_assigned_team;
    private String mo_status;
    private Date mo_task_start_datetime;
    private Date mo_task_end_datetime;

    private Float mo_performance_kpi;
    private String mo_l1_approval;
    private Date mo_l1_approoval_datetime;
    private String mo_l2_approval;
    private Date mo_l2_approoval_datetime;
    private String mo_l3_approval;
    private Date mo_l3_approoval_datetime;

    private String mo_additional_report_flag;
    private String mo_report_no;
    private String mo_comments;
    private String mo_spare_parts_flag;

    private int mo_submission_counter;
    private int mo_delayed_days;
    private String mo_reject_flag;
    private String mo_reject_comment;
    private String mo_who_reject;
    private Date mo_reject_datetime;
    private String mo_pdf_file_link;

    private String mo_active_flag;
    private Date mo_active_date;
    private Date mo_deactive_date;
    private Date mo_date_created;

    public String getMo_work_order_no() {
        return mo_work_order_no;
    }

    public void setMo_work_order_no(String mo_work_order_no) {
        this.mo_work_order_no = mo_work_order_no;
    }

    public String getMo_task_no() {
        return mo_task_no;
    }

    public void setMo_task_no(String mo_task_no) {
        this.mo_task_no = mo_task_no;
    }

    public Date getMo_date_task_schedule() {
        return mo_date_task_schedule;
    }

    public void setMo_date_task_schedule(Date mo_date_task_schedule) {
        this.mo_date_task_schedule = mo_date_task_schedule;
    }

    public Date getMo_date_task_to_be_completed() {
        return mo_date_task_to_be_completed;
    }

    public void setMo_date_task_to_be_completed(Date mo_date_task_to_be_completed) {
        this.mo_date_task_to_be_completed = mo_date_task_to_be_completed;
    }

    public String getMo_standard_duration() {
        return mo_standard_duration;
    }

    public void setMo_standard_duration(String mo_standard_duration) {
        this.mo_standard_duration = mo_standard_duration;
    }

    public String getMo_technician_id() {
        return mo_technician_id;
    }

    public void setMo_technician_id(String mo_technician_id) {
        this.mo_technician_id = mo_technician_id;
    }

    public String getMo_assigned_team() {
        return mo_assigned_team;
    }

    public void setMo_assigned_team(String mo_assigned_team) {
        this.mo_assigned_team = mo_assigned_team;
    }

    public String getMo_status() {
        return mo_status;
    }

    public void setMo_status(String mo_status) {
        this.mo_status = mo_status;
    }

    public Date getMo_task_start_datetime() {
        return mo_task_start_datetime;
    }

    public void setMo_task_start_datetime(Date mo_task_start_datetime) {
        this.mo_task_start_datetime = mo_task_start_datetime;
    }

    public Date getMo_task_end_datetime() {
        return mo_task_end_datetime;
    }

    public void setMo_task_end_datetime(Date mo_task_end_datetime) {
        this.mo_task_end_datetime = mo_task_end_datetime;
    }

    public Float getMo_performance_kpi() {
        return mo_performance_kpi;
    }

    public void setMo_performance_kpi(Float mo_performance_kpi) {
        this.mo_performance_kpi = mo_performance_kpi;
    }

    public String getMo_l1_approval() {
        return mo_l1_approval;
    }

    public void setMo_l1_approval(String mo_l1_approval) {
        this.mo_l1_approval = mo_l1_approval;
    }

    public Date getMo_l1_approoval_datetime() {
        return mo_l1_approoval_datetime;
    }

    public void setMo_l1_approoval_datetime(Date mo_l1_approoval_datetime) {
        this.mo_l1_approoval_datetime = mo_l1_approoval_datetime;
    }

    public String getMo_l2_approval() {
        return mo_l2_approval;
    }

    public void setMo_l2_approval(String mo_l2_approval) {
        this.mo_l2_approval = mo_l2_approval;
    }

    public Date getMo_l2_approoval_datetime() {
        return mo_l2_approoval_datetime;
    }

    public void setMo_l2_approoval_datetime(Date mo_l2_approoval_datetime) {
        this.mo_l2_approoval_datetime = mo_l2_approoval_datetime;
    }

    public String getMo_l3_approval() {
        return mo_l3_approval;
    }

    public void setMo_l3_approval(String mo_l3_approval) {
        this.mo_l3_approval = mo_l3_approval;
    }

    public Date getMo_l3_approoval_datetime() {
        return mo_l3_approoval_datetime;
    }

    public void setMo_l3_approoval_datetime(Date mo_l3_approoval_datetime) {
        this.mo_l3_approoval_datetime = mo_l3_approoval_datetime;
    }

    public String getMo_additional_report_flag() {
        return mo_additional_report_flag;
    }

    public void setMo_additional_report_flag(String mo_additional_report_flag) {
        this.mo_additional_report_flag = mo_additional_report_flag;
    }

    public String getMo_report_no() {
        return mo_report_no;
    }

    public void setMo_report_no(String mo_report_no) {
        this.mo_report_no = mo_report_no;
    }

    public String getMo_comments() {
        return mo_comments;
    }

    public void setMo_comments(String mo_comments) {
        this.mo_comments = mo_comments;
    }

    public String getMo_spare_parts_flag() {
        return mo_spare_parts_flag;
    }

    public void setMo_spare_parts_flag(String mo_spare_parts_flag) {
        this.mo_spare_parts_flag = mo_spare_parts_flag;
    }

    public int getMo_submission_counter() {
        return mo_submission_counter;
    }

    public void setMo_submission_counter(int mo_submission_counter) {
        this.mo_submission_counter = mo_submission_counter;
    }

    public int getMo_delayed_days() {
        return mo_delayed_days;
    }

    public void setMo_delayed_days(int mo_delayed_days) {
        this.mo_delayed_days = mo_delayed_days;
    }

    public String getMo_reject_flag() {
        return mo_reject_flag;
    }

    public void setMo_reject_flag(String mo_reject_flag) {
        this.mo_reject_flag = mo_reject_flag;
    }

    public String getMo_reject_comment() {
        return mo_reject_comment;
    }

    public void setMo_reject_comment(String mo_reject_comment) {
        this.mo_reject_comment = mo_reject_comment;
    }

    public String getMo_who_reject() {
        return mo_who_reject;
    }

    public void setMo_who_reject(String mo_who_reject) {
        this.mo_who_reject = mo_who_reject;
    }

    public Date getMo_reject_datetime() {
        return mo_reject_datetime;
    }

    public void setMo_reject_datetime(Date mo_reject_datetime) {
        this.mo_reject_datetime = mo_reject_datetime;
    }

    public String getMo_pdf_file_link() {
        return mo_pdf_file_link;
    }

    public void setMo_pdf_file_link(String mo_pdf_file_link) {
        this.mo_pdf_file_link = mo_pdf_file_link;
    }

    public String getMo_active_flag() {
        return mo_active_flag;
    }

    public void setMo_active_flag(String mo_active_flag) {
        this.mo_active_flag = mo_active_flag;
    }

    public Date getMo_active_date() {
        return mo_active_date;
    }

    public void setMo_active_date(Date mo_active_date) {
        this.mo_active_date = mo_active_date;
    }

    public Date getMo_deactive_date() {
        return mo_deactive_date;
    }

    public void setMo_deactive_date(Date mo_deactive_date) {
        this.mo_deactive_date = mo_deactive_date;
    }

    public Date getMo_date_created() {
        return mo_date_created;
    }

    public void setMo_date_created(Date mo_date_created) {
        this.mo_date_created = mo_date_created;
    }
}
