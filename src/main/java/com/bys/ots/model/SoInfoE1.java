package com.bys.ots.model;

public class SoInfoE1 extends SoInfoE1Key {
    /**
     * @param so
     * @param soItem
     */
    public SoInfoE1(String so, String soItem)
    {
        super(so, soItem);
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
  

    /**
     * 
     */
  

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Po_Number
     *
     * @mbg.generated
     */
    private String poNumber;

    /**
     * 
     */
    public SoInfoE1()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Sold_To
     *
     * @mbg.generated
     */
    private String soldTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Sale_Org
     *
     * @mbg.generated
     */
    private String saleOrg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Sale_Office
     *
     * @mbg.generated
     */
    private String saleOffice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Dis_C
     *
     * @mbg.generated
     */
    private String disC;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.SKU
     *
     * @mbg.generated
     */
    private Integer sku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.SO_status
     *
     * @mbg.generated
     */
    private Integer soStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Qty
     *
     * @mbg.generated
     */
    private Integer qty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_e1.Unit
     *
     * @mbg.generated
     */
    private String unit;
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Po_Number
     *
     * @return the value of so_info_e1.Po_Number
     *
     * @mbg.generated
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Po_Number
     *
     * @param poNumber the value for so_info_e1.Po_Number
     *
     * @mbg.generated
     */
    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber == null ? null : poNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Sold_To
     *
     * @return the value of so_info_e1.Sold_To
     *
     * @mbg.generated
     */
    public String getSoldTo() {
        return soldTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Sold_To
     *
     * @param soldTo the value for so_info_e1.Sold_To
     *
     * @mbg.generated
     */
    public void setSoldTo(String soldTo) {
        this.soldTo = soldTo == null ? null : soldTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Sale_Org
     *
     * @return the value of so_info_e1.Sale_Org
     *
     * @mbg.generated
     */
    public String getSaleOrg() {
        return saleOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Sale_Org
     *
     * @param saleOrg the value for so_info_e1.Sale_Org
     *
     * @mbg.generated
     */
    public void setSaleOrg(String saleOrg) {
        this.saleOrg = saleOrg == null ? null : saleOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Sale_Office
     *
     * @return the value of so_info_e1.Sale_Office
     *
     * @mbg.generated
     */
    public String getSaleOffice() {
        return saleOffice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Sale_Office
     *
     * @param saleOffice the value for so_info_e1.Sale_Office
     *
     * @mbg.generated
     */
    public void setSaleOffice(String saleOffice) {
        this.saleOffice = saleOffice == null ? null : saleOffice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Dis_C
     *
     * @return the value of so_info_e1.Dis_C
     *
     * @mbg.generated
     */
    public String getDisC() {
        return disC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Dis_C
     *
     * @param disC the value for so_info_e1.Dis_C
     *
     * @mbg.generated
     */
    public void setDisC(String disC) {
        this.disC = disC == null ? null : disC.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.SKU
     *
     * @return the value of so_info_e1.SKU
     *
     * @mbg.generated
     */
    public Integer getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.SKU
     *
     * @param sku the value for so_info_e1.SKU
     *
     * @mbg.generated
     */
    public void setSku(Integer sku) {
        this.sku = sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.SO_status
     *
     * @return the value of so_info_e1.SO_status
     *
     * @mbg.generated
     */
    public Integer getSoStatus() {
        return soStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.SO_status
     *
     * @param soStatus the value for so_info_e1.SO_status
     *
     * @mbg.generated
     */
    public void setSoStatus(Integer soStatus) {
        this.soStatus = soStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Description
     *
     * @return the value of so_info_e1.Description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Description
     *
     * @param description the value for so_info_e1.Description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Qty
     *
     * @return the value of so_info_e1.Qty
     *
     * @mbg.generated
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Qty
     *
     * @param qty the value for so_info_e1.Qty
     *
     * @mbg.generated
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_e1.Unit
     *
     * @return the value of so_info_e1.Unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_e1.Unit
     *
     * @param unit the value for so_info_e1.Unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
}