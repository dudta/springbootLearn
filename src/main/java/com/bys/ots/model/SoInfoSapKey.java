package com.bys.ots.model;

public class SoInfoSapKey
{
    public SoInfoSapKey()
    {
    }

    public SoInfoSapKey(String so, String soItem)
    {
        this.so = so;
        this.soItem = soItem;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_sap.so
     *
     * @mbg.generated
     */
    private String so;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column so_info_sap.so_item
     *
     * @mbg.generated
     */
    private String soItem;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_sap.so
     *
     * @return the value of so_info_sap.so
     * @mbg.generated
     */
    public String getSo()
    {
        return so;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_sap.so
     *
     * @param so the value for so_info_sap.so
     * @mbg.generated
     */
    public void setSo(String so)
    {
        this.so = so == null ? null : so.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column so_info_sap.so_item
     *
     * @return the value of so_info_sap.so_item
     * @mbg.generated
     */
    public String getSoItem()
    {
        return soItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column so_info_sap.so_item
     *
     * @param soItem the value for so_info_sap.so_item
     * @mbg.generated
     */
    public void setSoItem(String soItem)
    {
        this.soItem = soItem == null ? null : soItem.trim();
    }
}