package com.miaoying.generator.modulardb.goods.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:09:39
 * @describe 实体类
 */
@TableName("ma_location")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="MaLocation对象", description="")
public class MaLocation implements Serializable {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "库位编号")
                    @TableId(value = "mt_area", type = IdType.UUID)
                private String mtArea;

        @ApiModelProperty(value = "库位名称")
    @TableField("mt_areaName")
        private String mtAreaname;

        @ApiModelProperty(value = "操作人代号")
    @TableField("user_no")
        private Integer userNo;

        @ApiModelProperty(value = "操作日期")
    @TableField("operate_date")
        private String operateDate;

        @ApiModelProperty(value = "操作时间")
    @TableField("operate_time")
        private String operateTime;

        @ApiModelProperty(value = "是否可用")
    @TableField("lock_yn")
        private String lockYn;


    public String getMtArea() {
            return mtArea;
            }

        public MaLocation setMtArea(String mtArea) {
            this.mtArea = mtArea;
                return this;
            }

    public String getMtAreaname() {
            return mtAreaname;
            }

        public MaLocation setMtAreaname(String mtAreaname) {
            this.mtAreaname = mtAreaname;
                return this;
            }

    public Integer getUserNo() {
            return userNo;
            }

        public MaLocation setUserNo(Integer userNo) {
            this.userNo = userNo;
                return this;
            }

    public String getOperateDate() {
            return operateDate;
            }

        public MaLocation setOperateDate(String operateDate) {
            this.operateDate = operateDate;
                return this;
            }

    public String getOperateTime() {
            return operateTime;
            }

        public MaLocation setOperateTime(String operateTime) {
            this.operateTime = operateTime;
                return this;
            }

    public String getLockYn() {
            return lockYn;
            }

        public MaLocation setLockYn(String lockYn) {
            this.lockYn = lockYn;
                return this;
            }

@Override
public String toString() {
        return "MaLocation{" +
                "mtArea=" + mtArea +
                ", mtAreaname=" + mtAreaname +
                ", userNo=" + userNo +
                ", operateDate=" + operateDate +
                ", operateTime=" + operateTime +
                ", lockYn=" + lockYn +
        "}";
        }
        }
