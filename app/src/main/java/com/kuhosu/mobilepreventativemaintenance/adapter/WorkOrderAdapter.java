package com.kuhosu.mobilepreventativemaintenance.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kuhosu.mobilepreventativemaintenance.R;
import com.kuhosu.mobilepreventativemaintenance.model.WorkOrder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by muazz1m on 26/01/18.
 */

public class WorkOrderAdapter extends RecyclerView.Adapter<WorkOrderAdapter.ViewHolder>{

    private List<WorkOrder> workOrderList;
    private OnItemClickListener mOnItemClickListener;
    private Context context;

    public WorkOrderAdapter(Context context, final List<WorkOrder> x,
                          final OnItemClickListener onItemClickListener) {
        this.context = context;
        workOrderList = x;
        mOnItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_work_order_list, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final WorkOrder workOrder = workOrderList.get(position);

        switch (workOrder.getMo_status()) {
            case "approve":
                holder.mTextBookingStatus.setBackground(ContextCompat.getDrawable(context, R.drawable.box_status_item));
                holder.mTextBookingStatus.setText("Approved");
                break;
            case "reject":
                holder.mTextBookingStatus.setBackground(ContextCompat.getDrawable(context, R.drawable.box_status_item));
                holder.mTextBookingStatus.setText("Rejected");
                break;
            case "Pending":
                holder.mTextBookingStatus.setBackground(ContextCompat.getDrawable(context, R.drawable.box_status_item));
                holder.mTextBookingStatus.setText("Pending");
                break;

        }

//        holder.mTextFacilityName.setText(workOrder.getFacility());
//        holder.mTextDurationDate.setText(workOrder.getStart_date() + " - " + booking.getEnd_date());
//        holder.mTextDurationTime.setText(workOrder.getStart_time() + " - " + booking.getEnd_time());

        holder.mCardBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(workOrder);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return workOrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.card_booking)
        CardView mCardBooking;
//        @BindView(R.id.text_facility_name)
//        TextView mTextFacilityName;
//        @BindView(R.id.text_duration_date) TextView mTextDurationDate;
//        @BindView(R.id.text_duration_time) TextView mTextDurationTime;
        @BindView(R.id.text_bookingstatus) TextView mTextBookingStatus;

        public ViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    public interface OnItemClickListener {
        void onItemClick(WorkOrder workorder);
    }
}
