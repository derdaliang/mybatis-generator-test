package com.miaoying.generator.modulardb.goods.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:06:18
 * @describe 实体类
 */
@TableName("md_goods")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="MdGoods对象", description="")
public class MdGoods implements Serializable {

private static final long serialVersionUID = 1L;

                    @TableId(value = "id", type = IdType.UUID)
                private String id;

        @ApiModelProperty(value = "创建人名称")
    @TableField("create_name")
        private String createName;

        @ApiModelProperty(value = "创建人登录名称")
    @TableField("create_by")
        private String createBy;

        @ApiModelProperty(value = "创建日期")
    @TableField("create_date")
        private Date createDate;

        @ApiModelProperty(value = "更新人名称")
    @TableField("update_name")
        private String updateName;

        @ApiModelProperty(value = "更新人登录名称")
    @TableField("update_by")
        private String updateBy;

        @ApiModelProperty(value = "更新日期")
    @TableField("update_date")
        private Date updateDate;

        @ApiModelProperty(value = "所属部门")
    @TableField("sys_org_code")
        private String sysOrgCode;

        @ApiModelProperty(value = "所属公司")
    @TableField("sys_company_code")
        private String sysCompanyCode;

        @ApiModelProperty(value = "所属客户")
    @TableField("suo_shu_ke_hu")
        private String suoShuKeHu;

        @ApiModelProperty(value = "商品名称")
    @TableField("shp_ming_cheng")
        private String shpMingCheng;

        @ApiModelProperty(value = "商品简称")
    @TableField("shp_jian_cheng")
        private String shpJianCheng;

        @ApiModelProperty(value = "商品编码")
    @TableField("shp_bian_ma")
        private String shpBianMa;

        @ApiModelProperty(value = "商品型号")
    @TableField("shp_xing_hao")
        private String shpXingHao;

        @ApiModelProperty(value = "商品规格")
    @TableField("shp_gui_ge")
        private String shpGuiGe;

        @ApiModelProperty(value = "商品颜色")
    @TableField("shp_yan_se")
        private String shpYanSe;

        @ApiModelProperty(value = "产品属性")
    @TableField("chp_shu_xing")
        private String chpShuXing;

        @ApiModelProperty(value = "存放温层")
    @TableField("cf_wen_ceng")
        private String cfWenCeng;

        @ApiModelProperty(value = "拆零控制")
    @TableField("chl_kong_zhi")
        private String chlKongZhi;

        @ApiModelProperty(value = "码盘单层数量")
    @TableField("mp_dan_ceng")
        private String mpDanCeng;

        @ApiModelProperty(value = "码盘层高")
    @TableField("mp_ceng_gao")
        private String mpCengGao;

        @ApiModelProperty(value = "计费商品类")
    @TableField("jf_shp_lei")
        private String jfShpLei;

        @ApiModelProperty(value = "商品品牌")
    @TableField("shp_pin_pai")
        private String shpPinPai;

        @ApiModelProperty(value = "商品条码")
    @TableField("shp_tiao_ma")
        private String shpTiaoMa;

        @ApiModelProperty(value = "品牌图片")
    @TableField("pp_tu_pian")
        private String ppTuPian;

        @ApiModelProperty(value = "保质期")
    @TableField("bzhi_qi")
        private String bzhiQi;

        @ApiModelProperty(value = "单位")
    @TableField("shl_dan_wei")
        private String shlDanWei;

        @ApiModelProperty(value = "拆零单位")
    @TableField("jsh_dan_wei")
        private String jshDanWei;

        @ApiModelProperty(value = "体积")
    @TableField("ti_ji_cm")
        private String tiJiCm;

        @ApiModelProperty(value = "净重")
    @TableField("zhl_kg")
        private String zhlKg;

        @ApiModelProperty(value = "拆零数量")
    @TableField("chl_shl")
        private String chlShl;

        @ApiModelProperty(value = "件数与体积比")
    @TableField("jti_ji_bi")
        private String jtiJiBi;

        @ApiModelProperty(value = "件数与毛重比")
    @TableField("jm_zhong_bi")
        private String jmZhongBi;

        @ApiModelProperty(value = "件数与净重比")
    @TableField("jj_zhong_bi")
        private String jjZhongBi;

        @ApiModelProperty(value = "尺寸单位")
    @TableField("chc_dan_wei")
        private String chcDanWei;

        @ApiModelProperty(value = "长单品")
    @TableField("ch_dan_pin")
        private String chDanPin;

        @ApiModelProperty(value = "宽单品")
    @TableField("ku_dan_pin")
        private String kuDanPin;

        @ApiModelProperty(value = "高单品")
    @TableField("gao_dan_pin")
        private String gaoDanPin;

        @ApiModelProperty(value = "长整箱")
    @TableField("ch_zh_xiang")
        private String chZhXiang;

        @ApiModelProperty(value = "宽整箱")
    @TableField("ku_zh_xiang")
        private String kuZhXiang;

        @ApiModelProperty(value = "高整箱")
    @TableField("gao_zh_xiang")
        private String gaoZhXiang;

        @ApiModelProperty(value = "商品描述")
    @TableField("shp_miao_shu")
        private String shpMiaoShu;

        @ApiModelProperty(value = "停用")
    @TableField("zhuang_tai")
        private String zhuangTai;

        @ApiModelProperty(value = "毛重")
    @TableField("zhl_kgm")
        private String zhlKgm;

        @ApiModelProperty(value = "商品客户编码")
    @TableField("SHP_BIAN_MAKH")
        private String shpBianMakh;

        @ApiModelProperty(value = "基准温度")
    @TableField("JIZHUN_WENDU")
        private String jizhunWendu;

    @TableField("yw_ming_cheng")
        private String ywMingCheng;

    @TableField("rw_ming_cheng")
        private String rwMingCheng;

    @TableField("cus_name")
        private String cusName;

    @TableField("peisongdian")
        private String peisongdian;


    public String getId() {
            return id;
            }

        public MdGoods setId(String id) {
            this.id = id;
                return this;
            }

    public String getCreateName() {
            return createName;
            }

        public MdGoods setCreateName(String createName) {
            this.createName = createName;
                return this;
            }

    public String getCreateBy() {
            return createBy;
            }

        public MdGoods setCreateBy(String createBy) {
            this.createBy = createBy;
                return this;
            }

    public Date getCreateDate() {
            return createDate;
            }

        public MdGoods setCreateDate(Date createDate) {
            this.createDate = createDate;
                return this;
            }

    public String getUpdateName() {
            return updateName;
            }

        public MdGoods setUpdateName(String updateName) {
            this.updateName = updateName;
                return this;
            }

    public String getUpdateBy() {
            return updateBy;
            }

        public MdGoods setUpdateBy(String updateBy) {
            this.updateBy = updateBy;
                return this;
            }

    public Date getUpdateDate() {
            return updateDate;
            }

        public MdGoods setUpdateDate(Date updateDate) {
            this.updateDate = updateDate;
                return this;
            }

    public String getSysOrgCode() {
            return sysOrgCode;
            }

        public MdGoods setSysOrgCode(String sysOrgCode) {
            this.sysOrgCode = sysOrgCode;
                return this;
            }

    public String getSysCompanyCode() {
            return sysCompanyCode;
            }

        public MdGoods setSysCompanyCode(String sysCompanyCode) {
            this.sysCompanyCode = sysCompanyCode;
                return this;
            }

    public String getSuoShuKeHu() {
            return suoShuKeHu;
            }

        public MdGoods setSuoShuKeHu(String suoShuKeHu) {
            this.suoShuKeHu = suoShuKeHu;
                return this;
            }

    public String getShpMingCheng() {
            return shpMingCheng;
            }

        public MdGoods setShpMingCheng(String shpMingCheng) {
            this.shpMingCheng = shpMingCheng;
                return this;
            }

    public String getShpJianCheng() {
            return shpJianCheng;
            }

        public MdGoods setShpJianCheng(String shpJianCheng) {
            this.shpJianCheng = shpJianCheng;
                return this;
            }

    public String getShpBianMa() {
            return shpBianMa;
            }

        public MdGoods setShpBianMa(String shpBianMa) {
            this.shpBianMa = shpBianMa;
                return this;
            }

    public String getShpXingHao() {
            return shpXingHao;
            }

        public MdGoods setShpXingHao(String shpXingHao) {
            this.shpXingHao = shpXingHao;
                return this;
            }

    public String getShpGuiGe() {
            return shpGuiGe;
            }

        public MdGoods setShpGuiGe(String shpGuiGe) {
            this.shpGuiGe = shpGuiGe;
                return this;
            }

    public String getShpYanSe() {
            return shpYanSe;
            }

        public MdGoods setShpYanSe(String shpYanSe) {
            this.shpYanSe = shpYanSe;
                return this;
            }

    public String getChpShuXing() {
            return chpShuXing;
            }

        public MdGoods setChpShuXing(String chpShuXing) {
            this.chpShuXing = chpShuXing;
                return this;
            }

    public String getCfWenCeng() {
            return cfWenCeng;
            }

        public MdGoods setCfWenCeng(String cfWenCeng) {
            this.cfWenCeng = cfWenCeng;
                return this;
            }

    public String getChlKongZhi() {
            return chlKongZhi;
            }

        public MdGoods setChlKongZhi(String chlKongZhi) {
            this.chlKongZhi = chlKongZhi;
                return this;
            }

    public String getMpDanCeng() {
            return mpDanCeng;
            }

        public MdGoods setMpDanCeng(String mpDanCeng) {
            this.mpDanCeng = mpDanCeng;
                return this;
            }

    public String getMpCengGao() {
            return mpCengGao;
            }

        public MdGoods setMpCengGao(String mpCengGao) {
            this.mpCengGao = mpCengGao;
                return this;
            }

    public String getJfShpLei() {
            return jfShpLei;
            }

        public MdGoods setJfShpLei(String jfShpLei) {
            this.jfShpLei = jfShpLei;
                return this;
            }

    public String getShpPinPai() {
            return shpPinPai;
            }

        public MdGoods setShpPinPai(String shpPinPai) {
            this.shpPinPai = shpPinPai;
                return this;
            }

    public String getShpTiaoMa() {
            return shpTiaoMa;
            }

        public MdGoods setShpTiaoMa(String shpTiaoMa) {
            this.shpTiaoMa = shpTiaoMa;
                return this;
            }

    public String getPpTuPian() {
            return ppTuPian;
            }

        public MdGoods setPpTuPian(String ppTuPian) {
            this.ppTuPian = ppTuPian;
                return this;
            }

    public String getBzhiQi() {
            return bzhiQi;
            }

        public MdGoods setBzhiQi(String bzhiQi) {
            this.bzhiQi = bzhiQi;
                return this;
            }

    public String getShlDanWei() {
            return shlDanWei;
            }

        public MdGoods setShlDanWei(String shlDanWei) {
            this.shlDanWei = shlDanWei;
                return this;
            }

    public String getJshDanWei() {
            return jshDanWei;
            }

        public MdGoods setJshDanWei(String jshDanWei) {
            this.jshDanWei = jshDanWei;
                return this;
            }

    public String getTiJiCm() {
            return tiJiCm;
            }

        public MdGoods setTiJiCm(String tiJiCm) {
            this.tiJiCm = tiJiCm;
                return this;
            }

    public String getZhlKg() {
            return zhlKg;
            }

        public MdGoods setZhlKg(String zhlKg) {
            this.zhlKg = zhlKg;
                return this;
            }

    public String getChlShl() {
            return chlShl;
            }

        public MdGoods setChlShl(String chlShl) {
            this.chlShl = chlShl;
                return this;
            }

    public String getJtiJiBi() {
            return jtiJiBi;
            }

        public MdGoods setJtiJiBi(String jtiJiBi) {
            this.jtiJiBi = jtiJiBi;
                return this;
            }

    public String getJmZhongBi() {
            return jmZhongBi;
            }

        public MdGoods setJmZhongBi(String jmZhongBi) {
            this.jmZhongBi = jmZhongBi;
                return this;
            }

    public String getJjZhongBi() {
            return jjZhongBi;
            }

        public MdGoods setJjZhongBi(String jjZhongBi) {
            this.jjZhongBi = jjZhongBi;
                return this;
            }

    public String getChcDanWei() {
            return chcDanWei;
            }

        public MdGoods setChcDanWei(String chcDanWei) {
            this.chcDanWei = chcDanWei;
                return this;
            }

    public String getChDanPin() {
            return chDanPin;
            }

        public MdGoods setChDanPin(String chDanPin) {
            this.chDanPin = chDanPin;
                return this;
            }

    public String getKuDanPin() {
            return kuDanPin;
            }

        public MdGoods setKuDanPin(String kuDanPin) {
            this.kuDanPin = kuDanPin;
                return this;
            }

    public String getGaoDanPin() {
            return gaoDanPin;
            }

        public MdGoods setGaoDanPin(String gaoDanPin) {
            this.gaoDanPin = gaoDanPin;
                return this;
            }

    public String getChZhXiang() {
            return chZhXiang;
            }

        public MdGoods setChZhXiang(String chZhXiang) {
            this.chZhXiang = chZhXiang;
                return this;
            }

    public String getKuZhXiang() {
            return kuZhXiang;
            }

        public MdGoods setKuZhXiang(String kuZhXiang) {
            this.kuZhXiang = kuZhXiang;
                return this;
            }

    public String getGaoZhXiang() {
            return gaoZhXiang;
            }

        public MdGoods setGaoZhXiang(String gaoZhXiang) {
            this.gaoZhXiang = gaoZhXiang;
                return this;
            }

    public String getShpMiaoShu() {
            return shpMiaoShu;
            }

        public MdGoods setShpMiaoShu(String shpMiaoShu) {
            this.shpMiaoShu = shpMiaoShu;
                return this;
            }

    public String getZhuangTai() {
            return zhuangTai;
            }

        public MdGoods setZhuangTai(String zhuangTai) {
            this.zhuangTai = zhuangTai;
                return this;
            }

    public String getZhlKgm() {
            return zhlKgm;
            }

        public MdGoods setZhlKgm(String zhlKgm) {
            this.zhlKgm = zhlKgm;
                return this;
            }

    public String getShpBianMakh() {
            return shpBianMakh;
            }

        public MdGoods setShpBianMakh(String shpBianMakh) {
            this.shpBianMakh = shpBianMakh;
                return this;
            }

    public String getJizhunWendu() {
            return jizhunWendu;
            }

        public MdGoods setJizhunWendu(String jizhunWendu) {
            this.jizhunWendu = jizhunWendu;
                return this;
            }

    public String getYwMingCheng() {
            return ywMingCheng;
            }

        public MdGoods setYwMingCheng(String ywMingCheng) {
            this.ywMingCheng = ywMingCheng;
                return this;
            }

    public String getRwMingCheng() {
            return rwMingCheng;
            }

        public MdGoods setRwMingCheng(String rwMingCheng) {
            this.rwMingCheng = rwMingCheng;
                return this;
            }

    public String getCusName() {
            return cusName;
            }

        public MdGoods setCusName(String cusName) {
            this.cusName = cusName;
                return this;
            }

    public String getPeisongdian() {
            return peisongdian;
            }

        public MdGoods setPeisongdian(String peisongdian) {
            this.peisongdian = peisongdian;
                return this;
            }

@Override
public String toString() {
        return "MdGoods{" +
                "id=" + id +
                ", createName=" + createName +
                ", createBy=" + createBy +
                ", createDate=" + createDate +
                ", updateName=" + updateName +
                ", updateBy=" + updateBy +
                ", updateDate=" + updateDate +
                ", sysOrgCode=" + sysOrgCode +
                ", sysCompanyCode=" + sysCompanyCode +
                ", suoShuKeHu=" + suoShuKeHu +
                ", shpMingCheng=" + shpMingCheng +
                ", shpJianCheng=" + shpJianCheng +
                ", shpBianMa=" + shpBianMa +
                ", shpXingHao=" + shpXingHao +
                ", shpGuiGe=" + shpGuiGe +
                ", shpYanSe=" + shpYanSe +
                ", chpShuXing=" + chpShuXing +
                ", cfWenCeng=" + cfWenCeng +
                ", chlKongZhi=" + chlKongZhi +
                ", mpDanCeng=" + mpDanCeng +
                ", mpCengGao=" + mpCengGao +
                ", jfShpLei=" + jfShpLei +
                ", shpPinPai=" + shpPinPai +
                ", shpTiaoMa=" + shpTiaoMa +
                ", ppTuPian=" + ppTuPian +
                ", bzhiQi=" + bzhiQi +
                ", shlDanWei=" + shlDanWei +
                ", jshDanWei=" + jshDanWei +
                ", tiJiCm=" + tiJiCm +
                ", zhlKg=" + zhlKg +
                ", chlShl=" + chlShl +
                ", jtiJiBi=" + jtiJiBi +
                ", jmZhongBi=" + jmZhongBi +
                ", jjZhongBi=" + jjZhongBi +
                ", chcDanWei=" + chcDanWei +
                ", chDanPin=" + chDanPin +
                ", kuDanPin=" + kuDanPin +
                ", gaoDanPin=" + gaoDanPin +
                ", chZhXiang=" + chZhXiang +
                ", kuZhXiang=" + kuZhXiang +
                ", gaoZhXiang=" + gaoZhXiang +
                ", shpMiaoShu=" + shpMiaoShu +
                ", zhuangTai=" + zhuangTai +
                ", zhlKgm=" + zhlKgm +
                ", shpBianMakh=" + shpBianMakh +
                ", jizhunWendu=" + jizhunWendu +
                ", ywMingCheng=" + ywMingCheng +
                ", rwMingCheng=" + rwMingCheng +
                ", cusName=" + cusName +
                ", peisongdian=" + peisongdian +
        "}";
        }
        }
